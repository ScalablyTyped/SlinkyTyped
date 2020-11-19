package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APNSVoipSandboxChannelRequest extends js.Object {
  
  /**
    * The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
    */
  var BundleId: js.UndefOr[string] = js.native
  
  /**
    * The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with the APNs sandbox environment by using an APNs certificate.
    */
  var Certificate: js.UndefOr[string] = js.native
  
  /**
    * The default authentication method that you want Amazon Pinpoint to use when authenticating with the APNs sandbox environment for this channel, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the APNs VoIP sandbox channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  
  /**
    * The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with the APNs sandbox environment.
    */
  var PrivateKey: js.UndefOr[string] = js.native
  
  /**
    * The identifier that's assigned to your Apple developer account team. This identifier is used for APNs tokens.
    */
  var TeamId: js.UndefOr[string] = js.native
  
  /**
    * The authentication key to use for APNs tokens.
    */
  var TokenKey: js.UndefOr[string] = js.native
  
  /**
    * The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate with the APNs sandbox environment by using APNs tokens.
    */
  var TokenKeyId: js.UndefOr[string] = js.native
}
object APNSVoipSandboxChannelRequest {
  
  @scala.inline
  def apply(): APNSVoipSandboxChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APNSVoipSandboxChannelRequest]
  }
  
  @scala.inline
  implicit class APNSVoipSandboxChannelRequestOps[Self <: APNSVoipSandboxChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBundleId(value: string): Self = this.set("BundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("BundleId", js.undefined)
    
    @scala.inline
    def setCertificate(value: string): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("Certificate", js.undefined)
    
    @scala.inline
    def setDefaultAuthenticationMethod(value: string): Self = this.set("DefaultAuthenticationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAuthenticationMethod: Self = this.set("DefaultAuthenticationMethod", js.undefined)
    
    @scala.inline
    def setEnabled(value: boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: string): Self = this.set("PrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("PrivateKey", js.undefined)
    
    @scala.inline
    def setTeamId(value: string): Self = this.set("TeamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamId: Self = this.set("TeamId", js.undefined)
    
    @scala.inline
    def setTokenKey(value: string): Self = this.set("TokenKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenKey: Self = this.set("TokenKey", js.undefined)
    
    @scala.inline
    def setTokenKeyId(value: string): Self = this.set("TokenKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenKeyId: Self = this.set("TokenKeyId", js.undefined)
  }
}
