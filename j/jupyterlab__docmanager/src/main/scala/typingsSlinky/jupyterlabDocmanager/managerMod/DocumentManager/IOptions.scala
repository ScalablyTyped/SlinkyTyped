package typingsSlinky.jupyterlabDocmanager.managerMod.DocumentManager

import typingsSlinky.jupyterlabDocregistry.mod.DocumentRegistry
import typingsSlinky.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typingsSlinky.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a document manager.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * A service manager instance.
    */
  var manager: IManager = js.native
  /**
    * A widget opener for sibling widgets.
    */
  var opener: IWidgetOpener = js.native
  /**
    * A document registry instance.
    */
  var registry: DocumentRegistry = js.native
  /**
    * A function called when a kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.native
  /**
    * A promise for when to start using the manager.
    */
  var when: js.UndefOr[js.Promise[Unit]] = js.native
}

object IOptions {
  @scala.inline
  def apply(manager: IManager, opener: IWidgetOpener, registry: DocumentRegistry): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any], opener = opener.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManager(value: IManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpener(value: IWidgetOpener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistry(value: DocumentRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBusy(value: () => IDisposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBusy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetBusy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBusy")(js.undefined)
        ret
    }
    @scala.inline
    def withWhen(value: js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(js.undefined)
        ret
    }
  }
  
}

