package typingsSlinky.babelTypes

import typingsSlinky.babelTypes.mod.JSXElement_
import typingsSlinky.babelTypes.mod.JSXEmptyExpression_
import typingsSlinky.babelTypes.mod.JSXExpressionContainer_
import typingsSlinky.babelTypes.mod.JSXFragment_
import typingsSlinky.babelTypes.mod.JSXSpreadChild_
import typingsSlinky.babelTypes.mod.JSXText_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildren extends js.Object {
  var children: js.Array[
    JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
  ] = js.native
}

object AnonChildren {
  @scala.inline
  def apply(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
    ]
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
  @scala.inline
  implicit class AnonChildrenOps[Self <: AnonChildren] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(
      value: js.Array[
          JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

