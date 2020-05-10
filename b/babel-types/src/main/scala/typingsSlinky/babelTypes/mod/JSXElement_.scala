package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.JSXElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXElement_
  extends Node
     with Expression
     with Immutable
     with JSX {
  var children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_] = js.native
  var closingElement: JSXClosingElement_ = js.native
  var openingElement: JSXOpeningElement_ = js.native
  var selfClosing: js.UndefOr[Boolean] = js.native
  @JSName("type")
  var type_JSXElement_ : JSXElement = js.native
}

object JSXElement_ {
  @scala.inline
  def apply(
    children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
    closingElement: JSXClosingElement_,
    end: Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement_,
    start: Double,
    `type`: JSXElement
  ): JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement_]
  }
  @scala.inline
  implicit class JSXElement_Ops[Self <: JSXElement_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosingElement(value: JSXClosingElement_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpeningElement(value: JSXOpeningElement_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openingElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: JSXElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfClosing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosing")(js.undefined)
        ret
    }
  }
  
}

