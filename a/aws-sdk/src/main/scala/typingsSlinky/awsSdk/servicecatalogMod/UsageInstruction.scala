package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageInstruction extends js.Object {
  
  /**
    * The usage instruction type for the value.
    */
  var Type: js.UndefOr[InstructionType] = js.native
  
  /**
    * The usage instruction value for this type.
    */
  var Value: js.UndefOr[InstructionValue] = js.native
}
object UsageInstruction {
  
  @scala.inline
  def apply(): UsageInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageInstruction]
  }
  
  @scala.inline
  implicit class UsageInstructionOps[Self <: UsageInstruction] (val x: Self) extends AnyVal {
    
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
    def setType(value: InstructionType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setValue(value: InstructionValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
