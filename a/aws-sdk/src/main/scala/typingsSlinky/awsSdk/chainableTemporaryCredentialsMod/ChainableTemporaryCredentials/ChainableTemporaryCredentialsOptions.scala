package typingsSlinky.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials

import typingsSlinky.awsSdk.credentialsMod.Credentials
import typingsSlinky.awsSdk.stsMod.AssumeRoleRequest
import typingsSlinky.awsSdk.stsMod.ClientConfiguration
import typingsSlinky.awsSdk.stsMod.GetSessionTokenRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableTemporaryCredentialsOptions extends js.Object {
  var masterCredentials: js.UndefOr[Credentials] = js.native
  var params: js.UndefOr[AssumeRoleRequest | GetSessionTokenRequest] = js.native
  var stsConfig: js.UndefOr[ClientConfiguration] = js.native
  var tokenCodeFn: js.UndefOr[
    js.Function2[
      /* serialNumber */ String, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.native
}

object ChainableTemporaryCredentialsOptions {
  @scala.inline
  def apply(): ChainableTemporaryCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChainableTemporaryCredentialsOptions]
  }
  @scala.inline
  implicit class ChainableTemporaryCredentialsOptionsOps[Self <: ChainableTemporaryCredentialsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMasterCredentials(value: Credentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: AssumeRoleRequest | GetSessionTokenRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withStsConfig(value: ClientConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenCodeFn(
      value: (/* serialNumber */ String, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenCodeFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTokenCodeFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenCodeFn")(js.undefined)
        ret
    }
  }
  
}

