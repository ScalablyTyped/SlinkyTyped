package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProfileResponse extends StObject {
  
  /**
    * The ARN of the newly created room profile in the response.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
}
object CreateProfileResponse {
  
  @scala.inline
  def apply(): CreateProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProfileResponse]
  }
  
  @scala.inline
  implicit class CreateProfileResponseMutableBuilder[Self <: CreateProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
  }
}
