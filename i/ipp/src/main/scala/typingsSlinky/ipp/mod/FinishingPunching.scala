package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishingPunching extends js.Object {
  var `punching-locations`: js.UndefOr[js.Array[Double]] = js.native
  var `punching-offset`: js.UndefOr[Double] = js.native
  var `punching-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
}

object FinishingPunching {
  @scala.inline
  def apply(): FinishingPunching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingPunching]
  }
  @scala.inline
  implicit class FinishingPunchingOps[Self <: FinishingPunching] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withPunching-locations`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punching-locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPunching-locations`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punching-locations")(js.undefined)
        ret
    }
    @scala.inline
    def `withPunching-offset`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punching-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPunching-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punching-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withPunching-reference-edge`(value: ReferenceEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punching-reference-edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPunching-reference-edge`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punching-reference-edge")(js.undefined)
        ret
    }
  }
  
}

