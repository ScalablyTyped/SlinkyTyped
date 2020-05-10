package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionInfo extends js.Object {
  def getRemainingCreateQuota(): Double = js.native
  def getRemainingGetQuota(): Double = js.native
  def getRemainingTime(): Double = js.native
  def isPreview(): Boolean = js.native
}

object ExecutionInfo {
  @scala.inline
  def apply(
    getRemainingCreateQuota: () => Double,
    getRemainingGetQuota: () => Double,
    getRemainingTime: () => Double,
    isPreview: () => Boolean
  ): ExecutionInfo = {
    val __obj = js.Dynamic.literal(getRemainingCreateQuota = js.Any.fromFunction0(getRemainingCreateQuota), getRemainingGetQuota = js.Any.fromFunction0(getRemainingGetQuota), getRemainingTime = js.Any.fromFunction0(getRemainingTime), isPreview = js.Any.fromFunction0(isPreview))
    __obj.asInstanceOf[ExecutionInfo]
  }
  @scala.inline
  implicit class ExecutionInfoOps[Self <: ExecutionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRemainingCreateQuota(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemainingCreateQuota")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRemainingGetQuota(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemainingGetQuota")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRemainingTime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemainingTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPreview(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreview")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

