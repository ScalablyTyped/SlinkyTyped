package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoRollbackConfiguration extends js.Object {
  /**
    * Indicates whether a defined automatic rollback configuration is currently enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The event type or types that trigger a rollback.
    */
  var events: js.UndefOr[AutoRollbackEventsList] = js.native
}

object AutoRollbackConfiguration {
  @scala.inline
  def apply(): AutoRollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRollbackConfiguration]
  }
  @scala.inline
  implicit class AutoRollbackConfigurationOps[Self <: AutoRollbackConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: AutoRollbackEventsList): Self = {
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

