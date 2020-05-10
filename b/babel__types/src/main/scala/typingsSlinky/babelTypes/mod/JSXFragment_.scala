package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.JSXFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait JSXFragment_
  extends Expression
     with BaseNode
     with Immutable
     with JSX {
  var children: js.Array[
    JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
  ] = js.native
  var closingFragment: JSXClosingFragment_ = js.native
  var openingFragment: JSXOpeningFragment_ = js.native
  @JSName("type")
  var type_JSXFragment_ : JSXFragment = js.native
}

object JSXFragment_ {
  @scala.inline
  def apply(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_,
    `type`: JSXFragment
  ): JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXFragment_]
  }
  @scala.inline
  implicit class JSXFragment_Ops[Self <: JSXFragment_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(
      value: js.Array[
          JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosingFragment(value: JSXClosingFragment_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpeningFragment(value: JSXOpeningFragment_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openingFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: JSXFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

