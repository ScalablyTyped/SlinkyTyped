package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageFallback[TLength] extends js.Object {
  var bleed: js.UndefOr[PageBleedProperty[TLength] | js.Array[PageBleedProperty[TLength]]] = js.undefined
  var marks: js.UndefOr[PageMarksProperty | js.Array[PageMarksProperty]] = js.undefined
}

object PageFallback {
  @scala.inline
  def apply[TLength](): PageFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageFallback[TLength]]
  }
  @scala.inline
  implicit class PageFallbackOps[Self <: PageFallback[_], TLength] (val x: Self with PageFallback[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBleedVarargs(value: PageBleedProperty[TLength]*): Self = this.set("bleed", js.Array(value :_*))
    @scala.inline
    def setBleed(value: PageBleedProperty[TLength] | js.Array[PageBleedProperty[TLength]]): Self = this.set("bleed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBleed: Self = this.set("bleed", js.undefined)
    @scala.inline
    def setMarksVarargs(value: PageMarksProperty*): Self = this.set("marks", js.Array(value :_*))
    @scala.inline
    def setMarks(value: PageMarksProperty | js.Array[PageMarksProperty]): Self = this.set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
  }
  
}

