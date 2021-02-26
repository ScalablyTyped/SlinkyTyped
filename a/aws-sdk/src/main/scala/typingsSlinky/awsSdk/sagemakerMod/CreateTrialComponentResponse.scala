package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrialComponentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialComponentArn] = js.native
}
object CreateTrialComponentResponse {
  
  @scala.inline
  def apply(): CreateTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrialComponentResponse]
  }
  
  @scala.inline
  implicit class CreateTrialComponentResponseMutableBuilder[Self <: CreateTrialComponentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialComponentArn(value: TrialComponentArn): Self = StObject.set(x, "TrialComponentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialComponentArnUndefined: Self = StObject.set(x, "TrialComponentArn", js.undefined)
  }
}
