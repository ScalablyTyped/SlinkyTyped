package typingsSlinky.reactImageCrop.mod

import typingsSlinky.reactImageCrop.reactImageCropStrings.Percentsign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PercentCrop extends Crop {
  @JSName("unit")
  var unit_PercentCrop: js.UndefOr[Percentsign] = js.native
}

object PercentCrop {
  @scala.inline
  def apply(): PercentCrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PercentCrop]
  }
  @scala.inline
  implicit class PercentCropOps[Self <: PercentCrop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnit(value: Percentsign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

