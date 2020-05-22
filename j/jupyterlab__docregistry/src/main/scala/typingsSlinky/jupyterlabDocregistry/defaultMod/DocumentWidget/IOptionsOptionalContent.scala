package typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabApputils.toolbarMod.Toolbar
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionsOptionalContent[T /* <: Widget */, U /* <: IModel */]
  extends typingsSlinky.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptionsOptionalContent[T] {
  var context: IContext[U]
}

object IOptionsOptionalContent {
  @scala.inline
  def apply[T, U](
    context: IContext[U],
    content: T = null,
    node: HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: Toolbar[Widget] = null
  ): IOptionsOptionalContent[T, U] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (reveal != null) __obj.updateDynamic("reveal")(reveal.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptionsOptionalContent[T, U]]
  }
}

