package typingsSlinky.baseui.inputMod

import typingsSlinky.baseui.baseuiStrings.textarea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CUSTOM_INPUT_TYPE extends StObject {
  
  var textarea: typingsSlinky.baseui.baseuiStrings.textarea = js.native
}
object CUSTOM_INPUT_TYPE {
  
  @JSImport("baseui/input", "CUSTOM_INPUT_TYPE")
  @js.native
  val ^ : CUSTOM_INPUT_TYPE = js.native
  
  @scala.inline
  implicit class CUSTOM_INPUT_TYPEMutableBuilder[Self <: CUSTOM_INPUT_TYPE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextarea(value: textarea): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
  }
}
