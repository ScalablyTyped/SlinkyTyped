package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveViolation extends js.Object {
  /**
    * The behavior which is being violated.
    */
  var behavior: js.UndefOr[Behavior] = js.native
  /**
    * The time the most recent violation occurred.
    */
  var lastViolationTime: js.UndefOr[js.Date] = js.native
  /**
    * The value of the metric (the measurement) which caused the most recent violation.
    */
  var lastViolationValue: js.UndefOr[MetricValue] = js.native
  /**
    * The security profile whose behavior is in violation.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
  /**
    * The name of the thing responsible for the active violation.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.native
  /**
    * The ID of the active violation.
    */
  var violationId: js.UndefOr[ViolationId] = js.native
  /**
    * The time the violation started.
    */
  var violationStartTime: js.UndefOr[js.Date] = js.native
}

object ActiveViolation {
  @scala.inline
  def apply(): ActiveViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveViolation]
  }
  @scala.inline
  implicit class ActiveViolationOps[Self <: ActiveViolation] (val x: Self) extends AnyVal {
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
    def withLastViolationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastViolationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastViolationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastViolationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastViolationValue(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastViolationValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastViolationValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastViolationValue")(js.undefined)
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
    @scala.inline
    def withViolationStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violationStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolationStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violationStartTime")(js.undefined)
        ret
    }
  }
  
}

