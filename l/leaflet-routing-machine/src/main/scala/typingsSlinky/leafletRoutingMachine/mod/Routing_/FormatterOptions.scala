package typingsSlinky.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatterOptions extends js.Object {
  var language: js.UndefOr[String] = js.native
  var roundingSensitivity: js.UndefOr[Double] = js.native
  var unitNames: js.UndefOr[js.Object] = js.native
  var units: js.UndefOr[String] = js.native
}

object FormatterOptions {
  @scala.inline
  def apply(): FormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatterOptions]
  }
  @scala.inline
  implicit class FormatterOptionsOps[Self <: FormatterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundingSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundingSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitNames(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitNames")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

