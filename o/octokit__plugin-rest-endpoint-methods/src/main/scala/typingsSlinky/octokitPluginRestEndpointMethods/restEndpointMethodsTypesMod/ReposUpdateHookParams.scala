package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateHookParams extends js.Object {
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Determines a list of events to be added to the list of events that the Hook triggers for.
    */
  var add_events: js.UndefOr[js.Array[String]] = js.native
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/repos/hooks/#create-hook-config-params).
    */
  var config: js.UndefOr[ReposUpdateHookParamsConfig] = js.native
  /**
    * Determines what [events](https://developer.github.com/v3/activity/events/types/) the hook is triggered for. This replaces the entire array of events.
    */
  var events: js.UndefOr[js.Array[String]] = js.native
  var hook_id: Double = js.native
  var owner: String = js.native
  /**
    * Determines a list of events to be removed from the list of events that the Hook triggers for.
    */
  var remove_events: js.UndefOr[js.Array[String]] = js.native
  var repo: String = js.native
}

object ReposUpdateHookParams {
  @scala.inline
  def apply(hook_id: Double, owner: String, repo: String): ReposUpdateHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateHookParams]
  }
  @scala.inline
  implicit class ReposUpdateHookParamsOps[Self <: ReposUpdateHookParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHook_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAdd_events(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd_events: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_events")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: ReposUpdateHookParamsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove_events(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove_events: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_events")(js.undefined)
        ret
    }
  }
  
}

