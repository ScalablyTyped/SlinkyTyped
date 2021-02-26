package typingsSlinky.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionLambda extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var functionArn: String = js.native
}
object TopicRuleErrorActionLambda {
  
  @scala.inline
  def apply(functionArn: String): TopicRuleErrorActionLambda = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionLambda]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionLambdaMutableBuilder[Self <: TopicRuleErrorActionLambda] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionArn(value: String): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
  }
}
