package typingsSlinky.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentDialogCodeHook extends StObject {
  
  /**
    * The version of the request-response that you want Amazon Lex to use
    * to invoke your Lambda function. For more information, see
    * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
    */
  var messageVersion: String = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function.
    */
  var uri: String = js.native
}
object IntentDialogCodeHook {
  
  @scala.inline
  def apply(messageVersion: String, uri: String): IntentDialogCodeHook = {
    val __obj = js.Dynamic.literal(messageVersion = messageVersion.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentDialogCodeHook]
  }
  
  @scala.inline
  implicit class IntentDialogCodeHookMutableBuilder[Self <: IntentDialogCodeHook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageVersion(value: String): Self = StObject.set(x, "messageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
