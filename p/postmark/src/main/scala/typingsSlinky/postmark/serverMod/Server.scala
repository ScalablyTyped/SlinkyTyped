package typingsSlinky.postmark.serverMod

import typingsSlinky.postmark.messageSupportingTypesMod.LinkTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var ApiTokens: js.Array[String] = js.native
  var BounceHookUrl: js.UndefOr[String] = js.native
  var ClickHookUrl: js.UndefOr[String] = js.native
  var Color: String = js.native
  var DeliveryHookUrl: js.UndefOr[String] = js.native
  var EnableSmtpApiErrorHooks: Boolean = js.native
  var ID: Double = js.native
  var InboundAddress: String = js.native
  var InboundDomain: js.UndefOr[String] = js.native
  var InboundHash: String = js.native
  var InboundHookUrl: js.UndefOr[String] = js.native
  var InboundSpamThreshold: Double = js.native
  var IncludeBounceContentInHook: Boolean = js.native
  var Name: String = js.native
  var OpenHookUrl: js.UndefOr[String] = js.native
  var PostFirstOpenOnly: Boolean = js.native
  var RawEmailEnabled: Boolean = js.native
  var ServerLink: String = js.native
  var SmtpApiActivated: Boolean = js.native
  var TrackLinks: LinkTrackingOptions = js.native
  var TrackOpens: js.UndefOr[Boolean] = js.native
}

object Server {
  @scala.inline
  def apply(
    ApiTokens: js.Array[String],
    Color: String,
    EnableSmtpApiErrorHooks: Boolean,
    ID: Double,
    InboundAddress: String,
    InboundHash: String,
    InboundSpamThreshold: Double,
    IncludeBounceContentInHook: Boolean,
    Name: String,
    PostFirstOpenOnly: Boolean,
    RawEmailEnabled: Boolean,
    ServerLink: String,
    SmtpApiActivated: Boolean,
    TrackLinks: LinkTrackingOptions
  ): Server = {
    val __obj = js.Dynamic.literal(ApiTokens = ApiTokens.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], EnableSmtpApiErrorHooks = EnableSmtpApiErrorHooks.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InboundAddress = InboundAddress.asInstanceOf[js.Any], InboundHash = InboundHash.asInstanceOf[js.Any], InboundSpamThreshold = InboundSpamThreshold.asInstanceOf[js.Any], IncludeBounceContentInHook = IncludeBounceContentInHook.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PostFirstOpenOnly = PostFirstOpenOnly.asInstanceOf[js.Any], RawEmailEnabled = RawEmailEnabled.asInstanceOf[js.Any], ServerLink = ServerLink.asInstanceOf[js.Any], SmtpApiActivated = SmtpApiActivated.asInstanceOf[js.Any], TrackLinks = TrackLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
  @scala.inline
  implicit class ServerOps[Self <: Server] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiTokens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableSmtpApiErrorHooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableSmtpApiErrorHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInboundAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInboundHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInboundSpamThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundSpamThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeBounceContentInHook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeBounceContentInHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostFirstOpenOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostFirstOpenOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawEmailEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawEmailEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmtpApiActivated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmtpApiActivated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackLinks(value: LinkTrackingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounceHookUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BounceHookUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceHookUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BounceHookUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withClickHookUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClickHookUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickHookUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClickHookUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryHookUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryHookUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryHookUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryHookUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withInboundDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withInboundHookUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundHookUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundHookUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundHookUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenHookUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenHookUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenHookUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenHookUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackOpens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackOpens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackOpens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackOpens")(js.undefined)
        ret
    }
  }
  
}

