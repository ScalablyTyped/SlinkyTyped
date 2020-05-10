package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceHealthSummary extends js.Object {
  /**
    *  Red. The health agent is reporting a high number of request failures or other issues for an instance or environment.
    */
  var Degraded: js.UndefOr[NullableInteger] = js.native
  /**
    *  Green. An operation is in progress on an instance.
    */
  var Info: js.UndefOr[NullableInteger] = js.native
  /**
    *  Grey. AWS Elastic Beanstalk and the health agent are reporting no data on an instance.
    */
  var NoData: js.UndefOr[NullableInteger] = js.native
  /**
    *  Green. An instance is passing health checks and the health agent is not reporting any problems.
    */
  var Ok: js.UndefOr[NullableInteger] = js.native
  /**
    *  Grey. An operation is in progress on an instance within the command timeout.
    */
  var Pending: js.UndefOr[NullableInteger] = js.native
  /**
    *  Red. The health agent is reporting a very high number of request failures or other issues for an instance or environment.
    */
  var Severe: js.UndefOr[NullableInteger] = js.native
  /**
    *  Grey. AWS Elastic Beanstalk and the health agent are reporting an insufficient amount of data on an instance.
    */
  var Unknown: js.UndefOr[NullableInteger] = js.native
  /**
    *  Yellow. The health agent is reporting a moderate number of request failures or other issues for an instance or environment.
    */
  var Warning: js.UndefOr[NullableInteger] = js.native
}

object InstanceHealthSummary {
  @scala.inline
  def apply(): InstanceHealthSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceHealthSummary]
  }
  @scala.inline
  implicit class InstanceHealthSummaryOps[Self <: InstanceHealthSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDegraded(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Degraded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDegraded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Degraded")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Info")(js.undefined)
        ret
    }
    @scala.inline
    def withNoData(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoData")(js.undefined)
        ret
    }
    @scala.inline
    def withOk(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ok")(js.undefined)
        ret
    }
    @scala.inline
    def withPending(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(js.undefined)
        ret
    }
    @scala.inline
    def withSevere(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSevere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severe")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknown(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warning")(js.undefined)
        ret
    }
  }
  
}

