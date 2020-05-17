package typingsSlinky.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statistics extends js.Object {
  var passed: Boolean = js.native
  var statistics: Double = js.native
}

object Statistics {
  @scala.inline
  def apply(passed: Boolean, statistics: Double): Statistics = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistics]
  }
  @scala.inline
  implicit class StatisticsOps[Self <: Statistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistics(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

