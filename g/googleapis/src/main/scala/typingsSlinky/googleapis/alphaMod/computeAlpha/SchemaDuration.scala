package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Duration represents a fixed-length span of time represented as a count of
  * seconds and fractions of seconds at nanosecond resolution. It is
  * independent of any calendar and concepts like &quot;day&quot; or
  * &quot;month&quot;. Range is approximately 10,000 years.
  */
@js.native
trait SchemaDuration extends js.Object {
  /**
    * Span of time that&#39;s a fraction of a second at nanosecond resolution.
    * Durations less than one second are represented with a 0 `seconds` field
    * and a positive `nanos` field. Must be from 0 to 999,999,999 inclusive.
    */
  var nanos: js.UndefOr[Double] = js.native
  /**
    * Span of time at a resolution of a second. Must be from 0 to
    * 315,576,000,000 inclusive. Note: these bounds are computed from: 60
    * sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
    */
  var seconds: js.UndefOr[String] = js.native
}

object SchemaDuration {
  @scala.inline
  def apply(): SchemaDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuration]
  }
  @scala.inline
  implicit class SchemaDurationOps[Self <: SchemaDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNanos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(js.undefined)
        ret
    }
    @scala.inline
    def withSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(js.undefined)
        ret
    }
  }
  
}

