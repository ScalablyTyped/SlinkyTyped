package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the app instance request.
    */
  var AppInstanceArn: ChimeArn = js.native
  
  /**
    * The user ID of the app instance.
    */
  var AppInstanceUserId: UserId = js.native
  
  /**
    * The token assigned to the user requesting an app instance.
    */
  var ClientRequestToken: typingsSlinky.awsSdk.chimeMod.ClientRequestToken = js.native
  
  /**
    * The request's metadata. Limited to a 1KB string in UTF-8.
    */
  var Metadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * The user's name.
    */
  var Name: UserName = js.native
}
object CreateAppInstanceUserRequest {
  
  @scala.inline
  def apply(
    AppInstanceArn: ChimeArn,
    AppInstanceUserId: UserId,
    ClientRequestToken: ClientRequestToken,
    Name: UserName
  ): CreateAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], AppInstanceUserId = AppInstanceUserId.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit class CreateAppInstanceUserRequestMutableBuilder[Self <: CreateAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceUserId(value: UserId): Self = StObject.set(x, "AppInstanceUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setName(value: UserName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
