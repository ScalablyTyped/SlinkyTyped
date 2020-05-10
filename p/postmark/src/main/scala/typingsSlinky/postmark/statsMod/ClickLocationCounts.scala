package typingsSlinky.postmark.statsMod

import typingsSlinky.postmark.AnonHTML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickLocationCounts extends js.Object {
  var Days: js.Array[AnonHTML] = js.native
  var HTML: Double = js.native
  var Text: Double = js.native
}

object ClickLocationCounts {
  @scala.inline
  def apply(Days: js.Array[AnonHTML], HTML: Double, Text: Double): ClickLocationCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], HTML = HTML.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickLocationCounts]
  }
  @scala.inline
  implicit class ClickLocationCountsOps[Self <: ClickLocationCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[AnonHTML]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTML(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

