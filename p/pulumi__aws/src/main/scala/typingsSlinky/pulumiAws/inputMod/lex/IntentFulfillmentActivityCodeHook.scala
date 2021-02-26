package typingsSlinky.pulumiAws.inputMod.lex

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentFulfillmentActivityCodeHook extends StObject {
  
  /**
    * The version of the request-response that you want Amazon Lex to use
    * to invoke your Lambda function. For more information, see
    * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
    */
  var messageVersion: Input[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function.
    */
  var uri: Input[String] = js.native
}
object IntentFulfillmentActivityCodeHook {
  
  @scala.inline
  def apply(messageVersion: Input[String], uri: Input[String]): IntentFulfillmentActivityCodeHook = {
    val __obj = js.Dynamic.literal(messageVersion = messageVersion.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentFulfillmentActivityCodeHook]
  }
  
  @scala.inline
  implicit class IntentFulfillmentActivityCodeHookMutableBuilder[Self <: IntentFulfillmentActivityCodeHook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageVersion(value: Input[String]): Self = StObject.set(x, "messageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Input[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
