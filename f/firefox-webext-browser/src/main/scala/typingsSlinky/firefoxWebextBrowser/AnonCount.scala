package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCount extends js.Object {
  var count: Double = js.native
  var rangeData: js.UndefOr[js.Array[AnonEndOffset]] = js.native
  var rectData: js.UndefOr[js.Array[AnonRectsAndTexts]] = js.native
}

object AnonCount {
  @scala.inline
  def apply(count: Double): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
  @scala.inline
  implicit class AnonCountOps[Self <: AnonCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeData(value: js.Array[AnonEndOffset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeData")(js.undefined)
        ret
    }
    @scala.inline
    def withRectData(value: js.Array[AnonRectsAndTexts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectData")(js.undefined)
        ret
    }
  }
  
}

