package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxHighlightRanges extends js.Object {
  var qRanges: js.Array[CharRange] = js.native
}

object NxHighlightRanges {
  @scala.inline
  def apply(qRanges: js.Array[CharRange]): NxHighlightRanges = {
    val __obj = js.Dynamic.literal(qRanges = qRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxHighlightRanges]
  }
  @scala.inline
  implicit class NxHighlightRangesOps[Self <: NxHighlightRanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQRanges(value: js.Array[CharRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRanges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

