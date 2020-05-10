package typingsSlinky.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityPoolConfigurationResponse extends js.Object {
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

object GetIdentityPoolConfigurationResponse {
  @scala.inline
  def apply(): GetIdentityPoolConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdentityPoolConfigurationResponse]
  }
  @scala.inline
  implicit class GetIdentityPoolConfigurationResponseOps[Self <: GetIdentityPoolConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCognitoStreams(value: CognitoStreams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CognitoStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitoStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CognitoStreams")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityPoolId(value: IdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withPushSync(value: PushSync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PushSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PushSync")(js.undefined)
        ret
    }
  }
  
}

