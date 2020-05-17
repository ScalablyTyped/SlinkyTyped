package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count extends js.Object {
  var count: Double = js.native
  var rangeData: js.UndefOr[js.Array[EndOffset]] = js.native
  var rectData: js.UndefOr[js.Array[RectsAndTexts]] = js.native
}

object Count {
  @scala.inline
  def apply(count: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
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
    def withRangeData(value: js.Array[EndOffset]): Self = {
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
    def withRectData(value: js.Array[RectsAndTexts]): Self = {
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

