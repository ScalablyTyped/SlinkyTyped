package typingsSlinky.bytes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BytesOptions extends js.Object {
  var decimalPlaces: js.UndefOr[Double] = js.native
  var fixedDecimals: js.UndefOr[Boolean] = js.native
  var thousandsSeparator: js.UndefOr[String] = js.native
  var unit: js.UndefOr[Unit] = js.native
  var unitSeparator: js.UndefOr[String] = js.native
}

object BytesOptions {
  @scala.inline
  def apply(): BytesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BytesOptions]
  }
  @scala.inline
  implicit class BytesOptionsOps[Self <: BytesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedDecimals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withThousandsSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousandsSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: Unit): Self = {
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
    @scala.inline
    def withUnitSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitSeparator")(js.undefined)
        ret
    }
  }
  
}

