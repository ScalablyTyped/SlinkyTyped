package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.anon.Comparator
import typingsSlinky.reactBootstrapTable.anon.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFilter extends Filter {
  /**
  	 * Default value for the filter.
  	 */
  var defaultValue: js.UndefOr[Comparator] = js.native
  /**
  	 * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
  	 */
  var delay: js.UndefOr[Double] = js.native
  /**
  	 * Number filter comparators
  	 */
  var numberComparators: js.UndefOr[js.Array[FilterComparator]] = js.native
  /**
  	 * List of number options that can be selected, if the number field is a select dropdown instead of a text edit.
  	 */
  var options: js.UndefOr[js.Array[Double]] = js.native
  /**
  	 * Placeholder text to show in the filter.
  	 */
  var placeholder: js.UndefOr[String] = js.native
  /**
  	 * CSS Style to use for the select filter.
  	 */
  var style: js.UndefOr[Number] = js.native
  /**
  	 * Filter type must be 'NumberFilter'
  	 */
  var `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter = js.native
  /**
  	 * Specify that the comparator field MUST have a comparator selected.
  	 */
  var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.native
  /**
  	 * Specify that the value field MUST have a number value specified.
  	 */
  var withoutEmptyNumberOption: js.UndefOr[Boolean] = js.native
  /**
  	 * If this is a select number field, disable the empty option in the dropdown.
  	 */
  var withoutEmptyOption: js.UndefOr[Boolean] = js.native
}

object NumberFilter {
  @scala.inline
  def apply(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter): NumberFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFilter]
  }
  @scala.inline
  implicit class NumberFilterOps[Self <: NumberFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: Comparator): Self = {
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
    def withNumberComparators(value: js.Array[FilterComparator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberComparators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberComparators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberComparators")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Number): Self = {
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
    @scala.inline
    def withWithoutEmptyComparatorOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEmptyComparatorOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutEmptyComparatorOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEmptyComparatorOption")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutEmptyNumberOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEmptyNumberOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutEmptyNumberOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEmptyNumberOption")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutEmptyOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEmptyOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutEmptyOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEmptyOption")(js.undefined)
        ret
    }
  }
  
}

