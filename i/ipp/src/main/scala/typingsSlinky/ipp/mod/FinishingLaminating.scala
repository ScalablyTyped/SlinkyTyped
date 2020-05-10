package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishingLaminating extends js.Object {
  var `laminating-sides`: js.UndefOr[FinishingSides] = js.native
  var `laminating-type`: js.UndefOr[LaminatingType] = js.native
}

object FinishingLaminating {
  @scala.inline
  def apply(): FinishingLaminating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingLaminating]
  }
  @scala.inline
  implicit class FinishingLaminatingOps[Self <: FinishingLaminating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withLaminating-sides`(value: FinishingSides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laminating-sides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLaminating-sides`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laminating-sides")(js.undefined)
        ret
    }
    @scala.inline
    def `withLaminating-type`(value: LaminatingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laminating-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLaminating-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laminating-type")(js.undefined)
        ret
    }
  }
  
}

