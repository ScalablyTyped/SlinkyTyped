package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishingCoating extends js.Object {
  var `coating-sides`: js.UndefOr[FinishingSides] = js.native
  var `coating-type`: js.UndefOr[CoatingType] = js.native
}

object FinishingCoating {
  @scala.inline
  def apply(): FinishingCoating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingCoating]
  }
  @scala.inline
  implicit class FinishingCoatingOps[Self <: FinishingCoating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCoating-sides`(value: FinishingSides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coating-sides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCoating-sides`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coating-sides")(js.undefined)
        ret
    }
    @scala.inline
    def `withCoating-type`(value: CoatingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coating-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCoating-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coating-type")(js.undefined)
        ret
    }
  }
  
}

