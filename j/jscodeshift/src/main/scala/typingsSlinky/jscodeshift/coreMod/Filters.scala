package typingsSlinky.jscodeshift.coreMod

import typingsSlinky.jscodeshift.jsxelementMod.FilterMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends js.Object {
  var JSXElement: FilterMethods = js.native
  var VariableDeclarator: typingsSlinky.jscodeshift.variableDeclaratorMod.FilterMethods = js.native
}

object Filters {
  @scala.inline
  def apply(
    JSXElement: FilterMethods,
    VariableDeclarator: typingsSlinky.jscodeshift.variableDeclaratorMod.FilterMethods
  ): Filters = {
    val __obj = js.Dynamic.literal(JSXElement = JSXElement.asInstanceOf[js.Any], VariableDeclarator = VariableDeclarator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
  @scala.inline
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJSXElement(value: FilterMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableDeclarator(value: typingsSlinky.jscodeshift.variableDeclaratorMod.FilterMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclarator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

