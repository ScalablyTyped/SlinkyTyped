package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  var app: String = js.native
  var appArgs: js.UndefOr[String] = js.native
  var channelId: js.UndefOr[String] = js.native
  var endpoint: String = js.native
  var formats: js.UndefOr[String] = js.native
  var originator: js.UndefOr[String] = js.native
  var otherChannelId: js.UndefOr[String] = js.native
}

object Endpoint {
  @scala.inline
  def apply(app: String, endpoint: String): Endpoint = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppArgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withFormats(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originator")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherChannelId")(js.undefined)
        ret
    }
  }
  
}

