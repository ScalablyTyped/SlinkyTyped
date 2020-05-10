package typingsSlinky.pulumiAws.openIdConnectProviderMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenIdConnectProviderState extends js.Object {
  /**
    * The ARN assigned by AWS for this provider.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the clientId parameter on OAuth requests.)
    */
  val clientIdLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
    */
  val thumbprintLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The URL of the identity provider. Corresponds to the _iss_ claim.
    */
  val url: js.UndefOr[Input[String]] = js.native
}

object OpenIdConnectProviderState {
  @scala.inline
  def apply(): OpenIdConnectProviderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenIdConnectProviderState]
  }
  @scala.inline
  implicit class OpenIdConnectProviderStateOps[Self <: OpenIdConnectProviderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withClientIdLists(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIdLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientIdLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIdLists")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbprintLists(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbprintLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbprintLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbprintLists")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

