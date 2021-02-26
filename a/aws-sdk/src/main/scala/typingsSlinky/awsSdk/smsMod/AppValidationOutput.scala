package typingsSlinky.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppValidationOutput extends StObject {
  
  /**
    * Output from using SSM to validate the application.
    */
  var ssmOutput: js.UndefOr[SSMOutput] = js.native
}
object AppValidationOutput {
  
  @scala.inline
  def apply(): AppValidationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppValidationOutput]
  }
  
  @scala.inline
  implicit class AppValidationOutputMutableBuilder[Self <: AppValidationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSsmOutput(value: SSMOutput): Self = StObject.set(x, "ssmOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmOutputUndefined: Self = StObject.set(x, "ssmOutput", js.undefined)
  }
}
