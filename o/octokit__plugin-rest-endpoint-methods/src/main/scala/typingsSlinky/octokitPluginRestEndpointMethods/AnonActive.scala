package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActive extends js.Object {
  var active: AnonType = js.native
  var config: AnonRequired = js.native
  @JSName("config.content_type")
  var configDotcontent_type: AnonType = js.native
  @JSName("config.insecure_ssl")
  var configDotinsecure_ssl: AnonType = js.native
  @JSName("config.secret")
  var configDotsecret: AnonType = js.native
  @JSName("config.url")
  var configDoturl: AnonRequired = js.native
  var events: AnonType = js.native
  var name: AnonRequired = js.native
  var org: AnonRequired = js.native
}

object AnonActive {
  @scala.inline
  def apply(
    active: AnonType,
    config: AnonRequired,
    configDotcontent_type: AnonType,
    configDotinsecure_ssl: AnonType,
    configDotsecret: AnonType,
    configDoturl: AnonRequired,
    events: AnonType,
    name: AnonRequired,
    org: AnonRequired
  ): AnonActive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    __obj.updateDynamic("config.content_type")(configDotcontent_type.asInstanceOf[js.Any])
    __obj.updateDynamic("config.insecure_ssl")(configDotinsecure_ssl.asInstanceOf[js.Any])
    __obj.updateDynamic("config.secret")(configDotsecret.asInstanceOf[js.Any])
    __obj.updateDynamic("config.url")(configDoturl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
  @scala.inline
  implicit class AnonActiveOps[Self <: AnonActive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigDotcontent_type(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config.content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigDotinsecure_ssl(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config.insecure_ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigDotsecret(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config.secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigDoturl(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config.url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

