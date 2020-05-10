package typingsSlinky.hapiCatbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratedResult[T] extends js.Object {
  var cached: PolicyGetCachedOptions[T] = js.native
  var report: PolicyGetReportLog = js.native
  var value: T = js.native
}

object DecoratedResult {
  @scala.inline
  def apply[T](cached: PolicyGetCachedOptions[T], report: PolicyGetReportLog, value: T): DecoratedResult[T] = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratedResult[T]]
  }
  @scala.inline
  implicit class DecoratedResultOps[Self[t] <: DecoratedResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCached(value: PolicyGetCachedOptions[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport(value: PolicyGetReportLog): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

