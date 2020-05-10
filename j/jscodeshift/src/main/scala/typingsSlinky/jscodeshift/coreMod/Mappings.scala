package typingsSlinky.jscodeshift.coreMod

import typingsSlinky.jscodeshift.jsxelementMod.MappingMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mappings extends js.Object {
  var JSXElement: MappingMethods = js.native
}

object Mappings {
  @scala.inline
  def apply(JSXElement: MappingMethods): Mappings = {
    val __obj = js.Dynamic.literal(JSXElement = JSXElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mappings]
  }
  @scala.inline
  implicit class MappingsOps[Self <: Mappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJSXElement(value: MappingMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

