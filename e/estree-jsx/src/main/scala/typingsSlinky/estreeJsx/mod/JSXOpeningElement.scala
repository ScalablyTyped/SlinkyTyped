package typingsSlinky.estreeJsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXOpeningElement
  extends JSXBoundaryElement
     with _Node {
  var attributes: js.Array[JSXAttribute | JSXSpreadAttribute] = js.native
  var selfClosing: Boolean = js.native
  @JSName("type")
  var type_JSXOpeningElement: typingsSlinky.estreeJsx.estreeJsxStrings.JSXOpeningElement = js.native
}

object JSXOpeningElement {
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    selfClosing: Boolean,
    `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXOpeningElement
  ): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXOpeningElement]
  }
  @scala.inline
  implicit class JSXOpeningElementOps[Self <: JSXOpeningElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[JSXAttribute | JSXSpreadAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfClosing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXOpeningElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

