package typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget

import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptionsOptionalContent[T /* <: Widget */, U /* <: IModel */]
  extends typingsSlinky.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptionsOptionalContent[T] {
  var context: IContext[U] = js.native
}

object IOptionsOptionalContent {
  @scala.inline
  def apply[T, U](context: IContext[U]): IOptionsOptionalContent[T, U] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptionsOptionalContent[T, U]]
  }
  @scala.inline
  implicit class IOptionsOptionalContentOps[Self[t, u] <: IOptionsOptionalContent[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withContext(value: IContext[U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

