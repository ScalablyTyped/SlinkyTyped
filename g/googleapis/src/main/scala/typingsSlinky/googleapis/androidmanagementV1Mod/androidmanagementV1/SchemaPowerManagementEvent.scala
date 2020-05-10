package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A power management event.
  */
@js.native
trait SchemaPowerManagementEvent extends js.Object {
  /**
    * For BATTERY_LEVEL_COLLECTED events, the battery level as a percentage.
    */
  var batteryLevel: js.UndefOr[Double] = js.native
  /**
    * The creation time of the event.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Event type.
    */
  var eventType: js.UndefOr[String] = js.native
}

object SchemaPowerManagementEvent {
  @scala.inline
  def apply(): SchemaPowerManagementEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPowerManagementEvent]
  }
  @scala.inline
  implicit class SchemaPowerManagementEventOps[Self <: SchemaPowerManagementEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatteryLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batteryLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatteryLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batteryLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(js.undefined)
        ret
    }
  }
  
}

