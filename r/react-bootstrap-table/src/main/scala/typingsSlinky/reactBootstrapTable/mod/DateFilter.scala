package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.AnonComparatorDate
import typingsSlinky.reactBootstrapTable.AnonDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFilter extends _Filter {
  /**
  	 * Date filter comparators
  	 */
  var dateComparators: js.UndefOr[js.Array[FilterComparator]] = js.native
  /**
  	 * Default value for the filter.
  	 */
  var defaultValue: js.UndefOr[AnonDate] = js.native
  /**
  	 * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
  	 */
  var delay: js.UndefOr[Double] = js.native
  /**
  	 * CSS Style to use for the select filter.
  	 */
  var style: js.UndefOr[AnonComparatorDate] = js.native
  /**
  	 * Filter type must be 'DateFilter'
  	 */
  var `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter = js.native
}

object DateFilter {
  @scala.inline
  def apply(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilter]
  }
  @scala.inline
  implicit class DateFilterOps[Self <: DateFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateComparators(value: js.Array[FilterComparator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateComparators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateComparators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateComparators")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: AnonDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: AnonComparatorDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

