package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorkforceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the workforce.
    */
  var WorkforceArn: typingsSlinky.awsSdk.sagemakerMod.WorkforceArn = js.native
}
object CreateWorkforceResponse {
  
  @scala.inline
  def apply(WorkforceArn: WorkforceArn): CreateWorkforceResponse = {
    val __obj = js.Dynamic.literal(WorkforceArn = WorkforceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkforceResponse]
  }
  
  @scala.inline
  implicit class CreateWorkforceResponseMutableBuilder[Self <: CreateWorkforceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkforceArn(value: WorkforceArn): Self = StObject.set(x, "WorkforceArn", value.asInstanceOf[js.Any])
  }
}
