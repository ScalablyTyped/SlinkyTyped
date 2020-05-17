package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsCreateHookParams extends js.Object {
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/orgs/hooks/#create-hook-config-params).
    */
  var config: OrgsCreateHookParamsConfig = js.native
  /**
    * Determines what [events](https://developer.github.com/v3/activity/events/types/) the hook is triggered for.
    */
  var events: js.UndefOr[js.Array[String]] = js.native
  /**
    * Must be passed as "web".
    */
  var name: String = js.native
  @JSName("org")
  var org_ : String = js.native
}

object OrgsCreateHookParams {
  @scala.inline
  def apply(config: OrgsCreateHookParamsConfig, name: String, org_ : String): OrgsCreateHookParams = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCreateHookParams]
  }
  @scala.inline
  implicit class OrgsCreateHookParamsOps[Self <: OrgsCreateHookParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: OrgsCreateHookParamsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
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
  }
  
}

