package typingsSlinky.rbx.sectionSectionMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/layout/section/section.SectionVariablesOverrides, rbx.rbx/layout/section/section.SectionVariablesDefaults> */
@js.native
trait SectionVariables extends js.Object {
  
  var sizes: medium | large = js.native
}
object SectionVariables {
  
  @scala.inline
  def apply(sizes: medium | large): SectionVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionVariables]
  }
  
  @scala.inline
  implicit class SectionVariablesOps[Self <: SectionVariables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSizes(value: medium | large): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
}
