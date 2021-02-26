package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSolutionRequest extends StObject {
  
  /**
    * The ARN of the solution to delete.
    */
  var solutionArn: Arn = js.native
}
object DeleteSolutionRequest {
  
  @scala.inline
  def apply(solutionArn: Arn): DeleteSolutionRequest = {
    val __obj = js.Dynamic.literal(solutionArn = solutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSolutionRequest]
  }
  
  @scala.inline
  implicit class DeleteSolutionRequestMutableBuilder[Self <: DeleteSolutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolutionArn(value: Arn): Self = StObject.set(x, "solutionArn", value.asInstanceOf[js.Any])
  }
}
