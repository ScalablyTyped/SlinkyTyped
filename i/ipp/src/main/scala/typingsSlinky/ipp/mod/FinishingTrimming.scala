package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishingTrimming extends js.Object {
  var `trimming-offset`: js.UndefOr[Double] = js.native
  var `trimming-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
  var `trimming-type`: js.UndefOr[TrimmingType] = js.native
  var `trimming-when`: js.UndefOr[String] = js.native
}

object FinishingTrimming {
  @scala.inline
  def apply(): FinishingTrimming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingTrimming]
  }
  @scala.inline
  implicit class FinishingTrimmingOps[Self <: FinishingTrimming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withTrimming-offset`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimming-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTrimming-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimming-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withTrimming-reference-edge`(value: ReferenceEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimming-reference-edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTrimming-reference-edge`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimming-reference-edge")(js.undefined)
        ret
    }
    @scala.inline
    def `withTrimming-type`(value: TrimmingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimming-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTrimming-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimming-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withTrimming-when`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimming-when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTrimming-when`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimming-when")(js.undefined)
        ret
    }
  }
  
}

