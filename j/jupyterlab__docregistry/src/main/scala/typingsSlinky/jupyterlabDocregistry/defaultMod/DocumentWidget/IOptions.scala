package typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget

import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions[T /* <: Widget */, U /* <: IModel */]
  extends typingsSlinky.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptions[T] {
  var context: IContext[U] = js.native
}

object IOptions {
  @scala.inline
  def apply[T, U](content: T, context: IContext[U]): IOptions[T, U] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T, U]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t, u] <: IOptions[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
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

