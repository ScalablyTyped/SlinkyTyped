package typingsSlinky.awsSdkCredentialProviderImds.remoteProviderInitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/build/remoteProvider/RemoteProviderInit.RemoteProviderConfig> */
@js.native
trait RemoteProviderInit extends js.Object {
  var maxRetries: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object RemoteProviderInit {
  @scala.inline
  def apply(): RemoteProviderInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteProviderInit]
  }
  @scala.inline
  implicit class RemoteProviderInitOps[Self <: RemoteProviderInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

