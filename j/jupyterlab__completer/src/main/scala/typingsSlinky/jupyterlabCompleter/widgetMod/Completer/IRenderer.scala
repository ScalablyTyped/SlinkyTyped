package typingsSlinky.jupyterlabCompleter.widgetMod.Completer

import org.scalajs.dom.raw.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for completer widget nodes.
  */
@js.native
trait IRenderer extends js.Object {
  /**
    * Create an item node (an `li` element) for a text completer menu.
    */
  def createItemNode(item: IItem, typeMap: TypeMap, orderedTypes: js.Array[String]): HTMLLIElement = js.native
}

object IRenderer {
  @scala.inline
  def apply(createItemNode: (IItem, TypeMap, js.Array[String]) => HTMLLIElement): IRenderer = {
    val __obj = js.Dynamic.literal(createItemNode = js.Any.fromFunction3(createItemNode))
    __obj.asInstanceOf[IRenderer]
  }
  @scala.inline
  implicit class IRendererOps[Self <: IRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateItemNode(value: (IItem, TypeMap, js.Array[String]) => HTMLLIElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createItemNode")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

