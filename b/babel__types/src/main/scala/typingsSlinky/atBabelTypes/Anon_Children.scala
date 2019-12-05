package typingsSlinky.atBabelTypes

import typingsSlinky.atBabelTypes.atBabelTypesMod.JSXElement
import typingsSlinky.atBabelTypes.atBabelTypesMod.JSXEmptyExpression
import typingsSlinky.atBabelTypes.atBabelTypesMod.JSXExpressionContainer
import typingsSlinky.atBabelTypes.atBabelTypesMod.JSXFragment
import typingsSlinky.atBabelTypes.atBabelTypesMod.JSXSpreadChild
import typingsSlinky.atBabelTypes.atBabelTypesMod.JSXText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.Array[
    JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment | JSXEmptyExpression
  ]
}

object Anon_Children {
  @scala.inline
  def apply(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment | JSXEmptyExpression
    ]
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Children]
  }
}

