package typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry

import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a widget factory.
  */
@js.native
trait IWidgetFactoryOptions[T /* <: Widget */] extends js.Object {
  /**
    * Whether the widgets can start a kernel when opened.
    */
  val canStartKernel: js.UndefOr[Boolean] = js.native
  /**
    * The file types for which the factory should be the default.
    */
  val defaultFor: js.UndefOr[js.Array[String]] = js.native
  /**
    * The file types for which the factory should be the default for rendering,
    * if that is different than the default factory (which may be for editing).
    * If undefined, then it will fall back on the default file type.
    */
  val defaultRendered: js.UndefOr[js.Array[String]] = js.native
  /**
    * The file types the widget can view.
    */
  val fileTypes: js.Array[String] = js.native
  /**
    * The registered name of the model type used to create the widgets.
    */
  val modelName: js.UndefOr[String] = js.native
  /**
    * The name of the widget to display in dialogs.
    */
  val name: String = js.native
  /**
    * Whether the widgets prefer having a kernel started.
    */
  val preferKernel: js.UndefOr[Boolean] = js.native
  /**
    * Whether the widget factory is read only.
    */
  val readOnly: js.UndefOr[Boolean] = js.native
  /**
    * Whether the kernel should be shutdown when the widget is closed.
    */
  val shutdownOnClose: js.UndefOr[Boolean] = js.native
  /**
    * A function producing toolbar widgets, overriding the default toolbar widgets.
    */
  val toolbarFactory: js.UndefOr[js.Function1[/* widget */ T, js.Array[IToolbarItem]]] = js.native
}

object IWidgetFactoryOptions {
  @scala.inline
  def apply[T](fileTypes: js.Array[String], name: String): IWidgetFactoryOptions[T] = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWidgetFactoryOptions[T]]
  }
  @scala.inline
  implicit class IWidgetFactoryOptionsOps[Self[t] <: IWidgetFactoryOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFileTypes(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanStartKernel(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStartKernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanStartKernel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStartKernel")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFor(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRendered(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRendered: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withModelName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferKernel(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferKernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferKernel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferKernel")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withShutdownOnClose(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutdownOnClose: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownOnClose")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarFactory(value: /* widget */ T => js.Array[IToolbarItem]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToolbarFactory: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarFactory")(js.undefined)
        ret
    }
  }
  
}

