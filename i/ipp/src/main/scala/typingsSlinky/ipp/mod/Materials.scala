package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Materials extends js.Object {
  var `material-amount`: js.UndefOr[Double] = js.native
  var `material-amount-units`: js.UndefOr[MaterialAmountUnits] = js.native
  var `material-color`: js.UndefOr[String] = js.native
  var `material-diameter`: js.UndefOr[Double] = js.native
  var `material-diameter-tolerance`: js.UndefOr[Double] = js.native
  var `material-fill-density`: js.UndefOr[Double] = js.native
  var `material-key`: js.UndefOr[String] = js.native
  var `material-name`: js.UndefOr[String] = js.native
  var `material-nozzle-diameter`: js.UndefOr[Double] = js.native
  var `material-purpose`: js.UndefOr[js.Array[MaterialPurpose]] = js.native
  var `material-rate`: js.UndefOr[Double] = js.native
  var `material-rate-units`: js.UndefOr[MaterialRateUnits] = js.native
  var `material-retraction`: js.UndefOr[Boolean] = js.native
  var `material-shell-thickness`: js.UndefOr[Double] = js.native
  var `material-temperature`: js.UndefOr[Double] = js.native
  var `material-type`: js.UndefOr[MaterialType] = js.native
}

object Materials {
  @scala.inline
  def apply(): Materials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Materials]
  }
  @scala.inline
  implicit class MaterialsOps[Self <: Materials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withMaterial-amount`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-amount`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-amount")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-amount-units`(value: MaterialAmountUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-amount-units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-amount-units`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-amount-units")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-diameter`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-diameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-diameter`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-diameter")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-diameter-tolerance`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-diameter-tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-diameter-tolerance`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-diameter-tolerance")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-fill-density`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-fill-density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-fill-density`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-fill-density")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-key")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-nozzle-diameter`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-nozzle-diameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-nozzle-diameter`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-nozzle-diameter")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-purpose`(value: js.Array[MaterialPurpose]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-purpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-purpose`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-purpose")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-rate`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-rate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-rate")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-rate-units`(value: MaterialRateUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-rate-units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-rate-units`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-rate-units")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-retraction`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-retraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-retraction`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-retraction")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-shell-thickness`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-shell-thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-shell-thickness`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-shell-thickness")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-temperature`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-temperature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-temperature`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-temperature")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterial-type`(value: MaterialType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterial-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material-type")(js.undefined)
        ret
    }
  }
  
}

