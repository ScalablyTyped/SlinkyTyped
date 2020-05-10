package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectFilter extends _Filter {
  /**
  	 * Condition. Can be 'eq' (exactly equal) or 'like' (contains the given string). Defaults to 'like'.
  	 */
  var condition: js.UndefOr[FilterCondition] = js.native
  /**
  	 * Default value for the select filter.
  	 */
  var defaultValue: js.UndefOr[String | Double | Boolean] = js.native
  /**
  	 * Options for the filter select.
  	 */
  var options: SelectFilterOptionsType = js.native
  /**
  	 * Placeholder text to show in the filter.
  	 */
  var selectText: js.UndefOr[String] = js.native
  /**
  	 * CSS Style to use for the select filter.
  	 */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
  	 * Filter type must be 'SelectFilter'
  	 */
  var `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter = js.native
  /**
  	 * Disable the empty option in the dropdown filter.
  	 */
  var withoutEmptyOption: js.UndefOr[Boolean] = js.native
}

object SelectFilter {
  @scala.inline
  def apply(
    options: SelectFilterOptionsType,
    `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter
  ): SelectFilter = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectFilter]
  }
  @scala.inline
  implicit class SelectFilterOps[Self <: SelectFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: SelectFilterOptionsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: FilterCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String | Double | Boolean): Self = {
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
    def withSelectText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectText")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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

