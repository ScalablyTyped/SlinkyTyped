package typingsSlinky.eonasdanBootstrapDatetimepicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions extends OptionsBase {
  /**
    * Disables selection of dates in the array, e.g. holidays
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
    * Default: false
    */
  var disabledDates: js.UndefOr[js.Array[DateComparable] | Boolean] = js.native
  /**
    * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
    * Default: false
    */
  var disabledHours: js.UndefOr[js.Array[Double] | Boolean] = js.native
  /**
    * Enables selection of dates NOT in the array, e.g. holidays
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
    * Default: false
    */
  var enabledDates: js.UndefOr[js.Array[DateComparable] | Boolean] = js.native
  /**
    * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
    * Default: false
    */
  var enabledHours: js.UndefOr[js.Array[Double] | Boolean] = js.native
}

object SetOptions {
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabledDates(value: js.Array[DateComparable] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledHours(value: js.Array[Double] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledHours")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledDates(value: js.Array[DateComparable] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledHours(value: js.Array[Double] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledHours")(js.undefined)
        ret
    }
  }
  
}

