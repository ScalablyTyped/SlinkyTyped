package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var active: Type = js.native
  var config: Type = js.native
  @JSName("config.content_type")
  var configDotcontent_type: Type = js.native
  @JSName("config.insecure_ssl")
  var configDotinsecure_ssl: Type = js.native
  @JSName("config.secret")
  var configDotsecret: Type = js.native
  @JSName("config.url")
  var configDoturl: Required = js.native
  var events: Type = js.native
  var hook_id: Required = js.native
  @JSName("org")
  var org_ : Required = js.native
}

object Config {
  @scala.inline
  def apply(
    active: Type,
    config: Type,
    configDotcontent_type: Type,
    configDotinsecure_ssl: Type,
    configDotsecret: Type,
    configDoturl: Required,
    events: Type,
    hook_id: Required,
    org_ : Required
  ): Config = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("config.content_type")(configDotcontent_type.asInstanceOf[js.Any])
    __obj.updateDynamic("config.insecure_ssl")(configDotinsecure_ssl.asInstanceOf[js.Any])
    __obj.updateDynamic("config.secret")(configDotsecret.asInstanceOf[js.Any])
    __obj.updateDynamic("config.url")(configDoturl.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigDotcontent_type(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config.content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigDotinsecure_ssl(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config.insecure_ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigDotsecret(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config.secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigDoturl(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config.url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHook_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

