package typingsSlinky.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogsPromptResult extends StObject {
  
  var buttonIndex: Double = js.native
  
  var input1: String = js.native
}
object IDialogsPromptResult {
  
  @scala.inline
  def apply(buttonIndex: Double, input1: String): IDialogsPromptResult = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any], input1 = input1.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogsPromptResult]
  }
  
  @scala.inline
  implicit class IDialogsPromptResultMutableBuilder[Self <: IDialogsPromptResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonIndex(value: Double): Self = StObject.set(x, "buttonIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput1(value: String): Self = StObject.set(x, "input1", value.asInstanceOf[js.Any])
  }
}
