package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEffectiveTime extends js.Object {
  var effectiveTime: js.UndefOr[String] = js.native
  var isLocked: js.UndefOr[Boolean] = js.native
  var retentionPeriod: js.UndefOr[String] = js.native
}

object AnonEffectiveTime {
  @scala.inline
  def apply(): AnonEffectiveTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEffectiveTime]
  }
  @scala.inline
  implicit class AnonEffectiveTimeOps[Self <: AnonEffectiveTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffectiveTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withRetentionPeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPeriod")(js.undefined)
        ret
    }
  }
  
}

