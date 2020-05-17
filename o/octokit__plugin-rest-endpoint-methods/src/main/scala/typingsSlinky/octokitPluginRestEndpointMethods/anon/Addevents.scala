package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addevents extends js.Object {
  var active: Type = js.native
  var add_events: Type = js.native
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
  var owner: Required = js.native
  var remove_events: Type = js.native
  var repo: Required = js.native
}

object Addevents {
  @scala.inline
  def apply(
    active: Type,
    add_events: Type,
    config: Type,
    configDotcontent_type: Type,
    configDotinsecure_ssl: Type,
    configDotsecret: Type,
    configDoturl: Required,
    events: Type,
    hook_id: Required,
    owner: Required,
    remove_events: Type,
    repo: Required
  ): Addevents = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add_events = add_events.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], remove_events = remove_events.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("config.content_type")(configDotcontent_type.asInstanceOf[js.Any])
    __obj.updateDynamic("config.insecure_ssl")(configDotinsecure_ssl.asInstanceOf[js.Any])
    __obj.updateDynamic("config.secret")(configDotsecret.asInstanceOf[js.Any])
    __obj.updateDynamic("config.url")(configDoturl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addevents]
  }
  @scala.inline
  implicit class AddeventsOps[Self <: Addevents] (val x: Self) extends AnyVal {
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
    def withAdd_events(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_events")(value.asInstanceOf[js.Any])
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
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove_events(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

