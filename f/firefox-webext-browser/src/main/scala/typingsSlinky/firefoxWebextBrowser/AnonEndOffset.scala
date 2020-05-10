package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndOffset extends js.Object {
  var endOffset: Double = js.native
  var endTextNodePos: Double = js.native
  var framePos: Double = js.native
  var startOffset: Double = js.native
  var startTextNodePos: Double = js.native
}

object AnonEndOffset {
  @scala.inline
  def apply(
    endOffset: Double,
    endTextNodePos: Double,
    framePos: Double,
    startOffset: Double,
    startTextNodePos: Double
  ): AnonEndOffset = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], endTextNodePos = endTextNodePos.asInstanceOf[js.Any], framePos = framePos.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startTextNodePos = startTextNodePos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndOffset]
  }
  @scala.inline
  implicit class AnonEndOffsetOps[Self <: AnonEndOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTextNodePos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTextNodePos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramePos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framePos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTextNodePos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTextNodePos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

