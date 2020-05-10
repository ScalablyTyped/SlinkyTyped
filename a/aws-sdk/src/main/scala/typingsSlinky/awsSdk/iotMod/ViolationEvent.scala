package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViolationEvent extends js.Object {
  /**
    * The behavior which was violated.
    */
  var behavior: js.UndefOr[Behavior] = js.native
  /**
    * The value of the metric (the measurement).
    */
  var metricValue: js.UndefOr[MetricValue] = js.native
  /**
    * The name of the security profile whose behavior was violated.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
  /**
    * The name of the thing responsible for the violation event.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.native
  /**
    * The time the violation event occurred.
    */
  var violationEventTime: js.UndefOr[js.Date] = js.native
  /**
    * The type of violation event.
    */
  var violationEventType: js.UndefOr[ViolationEventType] = js.native
  /**
    * The ID of the violation event.
    */
  var violationId: js.UndefOr[ViolationId] = js.native
}

object ViolationEvent {
  @scala.inline
  def apply(): ViolationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViolationEvent]
  }
  @scala.inline
  implicit class ViolationEventOps[Self <: ViolationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehavior(value: Behavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricValue(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityProfileName(value: SecurityProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileName")(js.undefined)
        ret
    }
    @scala.inline
    def withThingName(value: DeviceDefenderThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(js.undefined)
        ret
    }
    @scala.inline
    def withViolationEventTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violationEventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolationEventTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violationEventTime")(js.undefined)
        ret
    }
    @scala.inline
    def withViolationEventType(value: ViolationEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violationEventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolationEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violationEventType")(js.undefined)
        ret
    }
    @scala.inline
    def withViolationId(value: ViolationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violationId")(js.undefined)
        ret
    }
  }
  
}

