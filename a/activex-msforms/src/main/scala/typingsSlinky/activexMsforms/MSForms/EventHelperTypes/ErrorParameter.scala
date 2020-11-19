package typingsSlinky.activexMsforms.MSForms.EventHelperTypes

import typingsSlinky.activexMsforms.MSForms.ReturnBoolean
import typingsSlinky.activexMsforms.MSForms.ReturnString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorParameter extends js.Object {
  
  val CancelDisplay: ReturnBoolean = js.native
  
  val Description: ReturnString = js.native
  
  val HelpContext: Double = js.native
  
  val HelpFile: String = js.native
  
  val Number: Double = js.native
  
  val SCode: Double = js.native
  
  val Source: String = js.native
}
object ErrorParameter {
  
  @scala.inline
  def apply(
    CancelDisplay: ReturnBoolean,
    Description: ReturnString,
    HelpContext: Double,
    HelpFile: String,
    Number: Double,
    SCode: Double,
    Source: String
  ): ErrorParameter = {
    val __obj = js.Dynamic.literal(CancelDisplay = CancelDisplay.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], HelpContext = HelpContext.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], SCode = SCode.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorParameter]
  }
  
  @scala.inline
  implicit class ErrorParameterOps[Self <: ErrorParameter] (val x: Self) extends AnyVal {
    
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
    def setCancelDisplay(value: ReturnBoolean): Self = this.set("CancelDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ReturnString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpContext(value: Double): Self = this.set("HelpContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpFile(value: String): Self = this.set("HelpFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("Number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSCode(value: Double): Self = this.set("SCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
  }
}
