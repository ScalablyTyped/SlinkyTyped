package typingsSlinky.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogBucket extends js.Object {
  /** The destination bucket where the current bucket's logs should be placed. */
  var logBucket: js.UndefOr[String] = js.native
  /** A prefix for log object names. */
  var logObjectPrefix: js.UndefOr[String] = js.native
}

object LogBucket {
  @scala.inline
  def apply(): LogBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogBucket]
  }
  @scala.inline
  implicit class LogBucketOps[Self <: LogBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withLogObjectPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logObjectPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogObjectPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logObjectPrefix")(js.undefined)
        ret
    }
  }
  
}

