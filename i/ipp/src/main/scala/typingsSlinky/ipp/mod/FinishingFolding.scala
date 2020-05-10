package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishingFolding extends js.Object {
  var `folding-direction`: js.UndefOr[FoldingDirection] = js.native
  var `folding-offset`: js.UndefOr[Double] = js.native
  var `folding-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
}

object FinishingFolding {
  @scala.inline
  def apply(): FinishingFolding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingFolding]
  }
  @scala.inline
  implicit class FinishingFoldingOps[Self <: FinishingFolding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withFolding-direction`(value: FoldingDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding-direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFolding-direction`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding-direction")(js.undefined)
        ret
    }
    @scala.inline
    def `withFolding-offset`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFolding-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withFolding-reference-edge`(value: ReferenceEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding-reference-edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFolding-reference-edge`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding-reference-edge")(js.undefined)
        ret
    }
  }
  
}

