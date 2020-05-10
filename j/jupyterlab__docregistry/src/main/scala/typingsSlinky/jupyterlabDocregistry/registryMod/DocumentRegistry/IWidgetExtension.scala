package typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry

import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a widget extension.
  */
@js.native
trait IWidgetExtension[T /* <: Widget */, U /* <: IModel */] extends js.Object {
  /**
    * Create a new extension for a given widget.
    */
  def createNew(widget: T, context: IContext[U]): IDisposable = js.native
}

object IWidgetExtension {
  @scala.inline
  def apply[T, U](createNew: (T, IContext[U]) => IDisposable): IWidgetExtension[T, U] = {
    val __obj = js.Dynamic.literal(createNew = js.Any.fromFunction2(createNew))
    __obj.asInstanceOf[IWidgetExtension[T, U]]
  }
  @scala.inline
  implicit class IWidgetExtensionOps[Self[t, u] <: IWidgetExtension[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withCreateNew(value: (T, IContext[U]) => IDisposable): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNew")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

