package typingsSlinky.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetIdentityPoolConfigurationResponse extends StObject {
  
  /**
    * Options to apply to this identity pool for Amazon Cognito streams.
    */
  var CognitoStreams: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.CognitoStreams] = js.native
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito.
    */
  var IdentityPoolId: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.IdentityPoolId] = js.native
  
  /**
    * Options to apply to this identity pool for push synchronization.
    */
  var PushSync: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.PushSync] = js.native
}
object SetIdentityPoolConfigurationResponse {
  
  @scala.inline
  def apply(): SetIdentityPoolConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetIdentityPoolConfigurationResponse]
  }
  
  @scala.inline
  implicit class SetIdentityPoolConfigurationResponseMutableBuilder[Self <: SetIdentityPoolConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCognitoStreams(value: CognitoStreams): Self = StObject.set(x, "CognitoStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoStreamsUndefined: Self = StObject.set(x, "CognitoStreams", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setPushSync(value: PushSync): Self = StObject.set(x, "PushSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushSyncUndefined: Self = StObject.set(x, "PushSync", js.undefined)
  }
}
