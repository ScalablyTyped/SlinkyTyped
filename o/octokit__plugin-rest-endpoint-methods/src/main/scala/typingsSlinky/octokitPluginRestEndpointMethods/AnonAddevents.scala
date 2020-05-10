package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddevents extends js.Object {
  var active: AnonType = js.native
  var add_events: AnonType = js.native
  var config: AnonType = js.native
  @JSName("config.content_type")
  var configDotcontent_type: AnonType = js.native
  @JSName("config.insecure_ssl")
  var configDotinsecure_ssl: AnonType = js.native
  @JSName("config.secret")
  var configDotsecret: AnonType = js.native
  @JSName("config.url")
  var configDoturl: AnonRequired = js.native
  var events: AnonType = js.native
  var hook_id: AnonRequired = js.native
  var owner: AnonRequired = js.native
  var remove_events: AnonType = js.native
  var repo: AnonRequired = js.native
}

object AnonAddevents {
  @scala.inline
  def apply(
    active: AnonType,
    add_events: AnonType,
    config: AnonType,
    configDotcontent_type: AnonType,
    configDotinsecure_ssl: AnonType,
    configDotsecret: AnonType,
    configDoturl: AnonRequired,
    events: AnonType,
    hook_id: AnonRequired,
    owner: AnonRequired,
    remove_events: AnonType,
    repo: AnonRequired
  ): AnonAddevents = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add_events = add_events.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], remove_events = remove_events.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("config.content_type")(configDotcontent_type.asInstanceOf[js.Any])
    __obj.updateDynamic("config.insecure_ssl")(configDotinsecure_ssl.asInstanceOf[js.Any])
    __obj.updateDynamic("config.secret")(configDotsecret.asInstanceOf[js.Any])
    __obj.updateDynamic("config.url")(configDoturl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddevents]
  }
  @scala.inline
  implicit class AnonAddeventsOps[Self <: AnonAddevents] (val x: Self) extends AnyVal {
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
    def withAdd_events(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: AnonType): Self = {
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
    def withHook_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove_events(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

