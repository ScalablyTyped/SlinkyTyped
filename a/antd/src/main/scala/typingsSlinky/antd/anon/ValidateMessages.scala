package typingsSlinky.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateMessages extends StObject {
  
  var requiredMark: js.UndefOr[typingsSlinky.antd.formFormMod.RequiredMark] = js.native
  
  var validateMessages: js.UndefOr[typingsSlinky.rcFieldForm.interfaceMod.ValidateMessages] = js.native
}
object ValidateMessages {
  
  @scala.inline
  def apply(): ValidateMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateMessages]
  }
  
  @scala.inline
  implicit class ValidateMessagesMutableBuilder[Self <: ValidateMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequiredMark(value: typingsSlinky.antd.formFormMod.RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
    
    @scala.inline
    def setValidateMessages(value: typingsSlinky.rcFieldForm.interfaceMod.ValidateMessages): Self = StObject.set(x, "validateMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateMessagesUndefined: Self = StObject.set(x, "validateMessages", js.undefined)
  }
}
