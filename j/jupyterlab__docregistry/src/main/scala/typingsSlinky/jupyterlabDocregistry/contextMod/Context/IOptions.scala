package typingsSlinky.jupyterlabDocregistry.contextMod.Context

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession.IKernelPreference
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typingsSlinky.jupyterlabObservables.modeldbMod.ModelDB.IFactory
import typingsSlinky.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a context.
  */
@js.native
trait IOptions[T /* <: IModel */] extends js.Object {
  /**
    * The model factory used to create the model.
    */
  var factory: IModelFactory[T] = js.native
  /**
    * The kernel preference associated with the context.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.native
  /**
    * A service manager instance.
    */
  var manager: IManager = js.native
  /**
    * An IModelDB factory method which may be used for the document.
    */
  var modelDBFactory: js.UndefOr[IFactory] = js.native
  /**
    * An optional callback for opening sibling widgets.
    */
  var opener: js.UndefOr[js.Function1[/* widget */ Widget, Unit]] = js.native
  /**
    * The initial path of the file.
    */
  var path: String = js.native
  /**
    * A function to call when the kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.native
}

object IOptions {
  @scala.inline
  def apply[T](factory: IModelFactory[T], manager: IManager, path: String): IOptions[T] = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFactory(value: IModelFactory[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManager(value: IManager): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelPreference(value: IKernelPreference): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelPreference: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withModelDBFactory(value: IFactory): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDBFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelDBFactory: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDBFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withOpener(value: /* widget */ Widget => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpener: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opener")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBusy(value: () => IDisposable): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBusy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetBusy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBusy")(js.undefined)
        ret
    }
  }
  
}

