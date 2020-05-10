package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberColumn extends js.Object {
  // How many decimal places to display. See below for information about the possible values.
  var decimalPlaces: js.UndefOr[String] = js.native
  // How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number.
  var displayAs: js.UndefOr[String] = js.native
  // The maximum permitted value.
  var maximum: js.UndefOr[Double] = js.native
  // The minimum permitted value.
  var minimum: js.UndefOr[Double] = js.native
}

object NumberColumn {
  @scala.inline
  def apply(): NumberColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberColumn]
  }
  @scala.inline
  implicit class NumberColumnOps[Self <: NumberColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimalPlaces(value: String): Self = {
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
    def withDisplayAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
  }
  
}

