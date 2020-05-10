package typingsSlinky.hapiCatbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyGetReportLog extends js.Object {
  /** error - lookup error. */
  var error: js.UndefOr[js.Error] = js.native
  /** isStale - true if the item is stale. */
  var isStale: Boolean = js.native
  /** msec - the cache lookup time in milliseconds. */
  var msec: Double = js.native
  /** stored - the timestamp when the item was stored in the cache. */
  var stored: Double = js.native
  /** ttl - the cache ttl value for the record. */
  var ttl: Double = js.native
}

object PolicyGetReportLog {
  @scala.inline
  def apply(isStale: Boolean, msec: Double, stored: Double, ttl: Double): PolicyGetReportLog = {
    val __obj = js.Dynamic.literal(isStale = isStale.asInstanceOf[js.Any], msec = msec.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyGetReportLog]
  }
  @scala.inline
  implicit class PolicyGetReportLogOps[Self <: PolicyGetReportLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsStale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStored(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

