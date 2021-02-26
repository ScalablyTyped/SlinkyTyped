package typingsSlinky.pulumiAws.inputMod.lex

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentFulfillmentActivity extends StObject {
  
  /**
    * A description of the Lambda function that is run to fulfill the intent.
    * Required if type is CodeHook. Attributes are documented under code_hook.
    */
  var codeHook: js.UndefOr[Input[IntentFulfillmentActivityCodeHook]] = js.native
  
  /**
    * How the intent should be fulfilled, either by running a Lambda function or by
    * returning the slot data to the client application.
    */
  var `type`: Input[String] = js.native
}
object IntentFulfillmentActivity {
  
  @scala.inline
  def apply(`type`: Input[String]): IntentFulfillmentActivity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentFulfillmentActivity]
  }
  
  @scala.inline
  implicit class IntentFulfillmentActivityMutableBuilder[Self <: IntentFulfillmentActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeHook(value: Input[IntentFulfillmentActivityCodeHook]): Self = StObject.set(x, "codeHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeHookUndefined: Self = StObject.set(x, "codeHook", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
