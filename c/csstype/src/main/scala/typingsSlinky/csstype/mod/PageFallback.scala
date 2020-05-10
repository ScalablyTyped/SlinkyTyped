package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageFallback[TLength] extends js.Object {
  var bleed: js.UndefOr[PageBleedProperty[TLength] | js.Array[PageBleedProperty[TLength]]] = js.native
  var marks: js.UndefOr[PageMarksProperty | js.Array[PageMarksProperty]] = js.native
}

object PageFallback {
  @scala.inline
  def apply[TLength](): PageFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageFallback[TLength]]
  }
  @scala.inline
  implicit class PageFallbackOps[Self[tlength] <: PageFallback[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBleed(value: PageBleedProperty[TLength] | js.Array[PageBleedProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bleed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBleed: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bleed")(js.undefined)
        ret
    }
    @scala.inline
    def withMarks(value: PageMarksProperty | js.Array[PageMarksProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarks: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(js.undefined)
        ret
    }
  }
  
}

