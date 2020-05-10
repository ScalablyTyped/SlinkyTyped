package typingsSlinky.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaseInfo extends js.Object {
  var durationInSecs: js.UndefOr[Double] = js.native
  var evictionTimestamp: js.UndefOr[Double] = js.native
  var lastRenewalTimestamp: js.UndefOr[Double] = js.native
  var registrationTimestamp: js.UndefOr[Double] = js.native
  var renewalIntervalInSecs: js.UndefOr[Double] = js.native
  var serviceUpTimestamp: js.UndefOr[Double] = js.native
}

object LeaseInfo {
  @scala.inline
  def apply(): LeaseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseInfo]
  }
  @scala.inline
  implicit class LeaseInfoOps[Self <: LeaseInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationInSecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInSecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationInSecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInSecs")(js.undefined)
        ret
    }
    @scala.inline
    def withEvictionTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evictionTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvictionTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evictionTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRenewalTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRenewalTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRenewalTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRenewalTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withRenewalIntervalInSecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewalIntervalInSecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenewalIntervalInSecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewalIntervalInSecs")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUpTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUpTimestamp")(js.undefined)
        ret
    }
  }
  
}

