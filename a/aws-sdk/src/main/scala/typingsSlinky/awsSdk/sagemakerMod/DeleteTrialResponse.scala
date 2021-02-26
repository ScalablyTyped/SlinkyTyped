package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrialResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the trial that is being deleted.
    */
  var TrialArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialArn] = js.native
}
object DeleteTrialResponse {
  
  @scala.inline
  def apply(): DeleteTrialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrialResponse]
  }
  
  @scala.inline
  implicit class DeleteTrialResponseMutableBuilder[Self <: DeleteTrialResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialArn(value: TrialArn): Self = StObject.set(x, "TrialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialArnUndefined: Self = StObject.set(x, "TrialArn", js.undefined)
  }
}
