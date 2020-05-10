package typingsSlinky.chartmogulNode.mod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsNoInterval extends js.Object {
  var `end-date`: String = js.native
  var geo: js.UndefOr[String] = js.native
  var plans: js.UndefOr[String] = js.native
  var `start-date`: String = js.native
}

object ParamsNoInterval {
  @scala.inline
  def apply(`end-date`: String, `start-date`: String): ParamsNoInterval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsNoInterval]
  }
  @scala.inline
  implicit class ParamsNoIntervalOps[Self <: ParamsNoInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withEnd-date`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStart-date`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(js.undefined)
        ret
    }
    @scala.inline
    def withPlans(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plans")(js.undefined)
        ret
    }
  }
  
}

