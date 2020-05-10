package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.JSXMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXMemberExpression_
  extends Node
     with Expression
     with JSX {
  var `object`: JSXMemberExpression_ | JSXIdentifier_ = js.native
  var property: JSXIdentifier_ = js.native
  @JSName("type")
  var type_JSXMemberExpression_ : JSXMemberExpression = js.native
}

object JSXMemberExpression_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    `object`: JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    start: Double,
    `type`: JSXMemberExpression
  ): JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXMemberExpression_]
  }
  @scala.inline
  implicit class JSXMemberExpression_Ops[Self <: JSXMemberExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObject(value: JSXMemberExpression_ | JSXIdentifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: JSXIdentifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: JSXMemberExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

