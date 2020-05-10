package typingsSlinky.postmark.statsMod

import typingsSlinky.postmark.AnonOpens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenCounts extends js.Object {
  var Days: js.Array[AnonOpens] = js.native
  var Opens: Double = js.native
  var Unique: Double = js.native
}

object OpenCounts {
  @scala.inline
  def apply(Days: js.Array[AnonOpens], Opens: Double, Unique: Double): OpenCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Opens = Opens.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCounts]
  }
  @scala.inline
  implicit class OpenCountsOps[Self <: OpenCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[AnonOpens]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpens(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Opens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unique")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

