package typingsSlinky.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClicks extends js.Object {
  var Clicks: Double = js.native
  var Date: String = js.native
  var Unique: Double = js.native
}

object AnonClicks {
  @scala.inline
  def apply(Clicks: Double, Date: String, Unique: Double): AnonClicks = {
    val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClicks]
  }
  @scala.inline
  implicit class AnonClicksOps[Self <: AnonClicks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
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

