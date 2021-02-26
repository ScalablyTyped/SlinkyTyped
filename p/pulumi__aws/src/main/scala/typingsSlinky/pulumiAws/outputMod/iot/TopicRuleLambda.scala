package typingsSlinky.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleLambda extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var functionArn: String = js.native
}
object TopicRuleLambda {
  
  @scala.inline
  def apply(functionArn: String): TopicRuleLambda = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleLambda]
  }
  
  @scala.inline
  implicit class TopicRuleLambdaMutableBuilder[Self <: TopicRuleLambda] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionArn(value: String): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
  }
}
