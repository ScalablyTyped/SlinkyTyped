package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FulfillmentActivity extends StObject {
  
  /**
    *  A description of the Lambda function that is run to fulfill the intent. 
    */
  var codeHook: js.UndefOr[CodeHook] = js.native
  
  /**
    *  How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to the client application. 
    */
  var `type`: FulfillmentActivityType = js.native
}
object FulfillmentActivity {
  
  @scala.inline
  def apply(`type`: FulfillmentActivityType): FulfillmentActivity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillmentActivity]
  }
  
  @scala.inline
  implicit class FulfillmentActivityMutableBuilder[Self <: FulfillmentActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeHook(value: CodeHook): Self = StObject.set(x, "codeHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeHookUndefined: Self = StObject.set(x, "codeHook", js.undefined)
    
    @scala.inline
    def setType(value: FulfillmentActivityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
