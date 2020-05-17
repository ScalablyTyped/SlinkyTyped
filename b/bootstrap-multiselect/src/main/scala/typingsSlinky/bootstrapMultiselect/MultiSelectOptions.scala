package typingsSlinky.bootstrapMultiselect

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLOptionElement
import org.scalajs.dom.raw.HTMLSelectElement
import typingsSlinky.bootstrapMultiselect.bootstrapMultiselectStrings.both
import typingsSlinky.bootstrapMultiselect.bootstrapMultiselectStrings.text
import typingsSlinky.bootstrapMultiselect.bootstrapMultiselectStrings.value
import typingsSlinky.std.HTMLOptionsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSelectOptions extends js.Object {
  /**
    * allSelectedText is the text displayed if all options are selected. You can disable displaying the allSelectedText by setting it to false.
    */
  var allSelectedText: js.UndefOr[String | Boolean] = js.native
  /**
    * The class of the multiselect button.
    * @exampl.
    * $('#example-buttonClass').multiselect({
    *      buttonClass: 'btn btn-link'
    *   });
    */
  var buttonClass: js.UndefOr[String] = js.native
  /**
    * The container holding both the button as well as the dropdown.
    * @exampl.
    * $('#example-buttonContainer').multiselect({
    *       buttonContainer: '<div class="btn-group" />'
    *   });
    */
  var buttonContainer: js.UndefOr[String] = js.native
  /**
    * A callback specifying the text shown on the button dependent on the currently selected options.
    * The callback gets the currently selected options and the select as argument and returns the string shown as button text.
    * The default buttonText callback returns nonSelectedText in the case no option is selected,
    * {@link nSelectedText} in the case more than {@link numberDisplayed} options are selected
    * and the names of the selected options if less than {@link numberDisplayed} options are selected.
    * @param options
    * @param select
    */
  var buttonText: js.UndefOr[
    js.Function2[/* options */ HTMLOptionsCollection, /* select */ HTMLSelectElement, String]
  ] = js.native
  /**
    * A callback specifying the title of the button.
    * The callback gets the currently selected options and the select as argument and returns the title of the button as string.
    * The default buttonTitle callback returns nonSelectedText in the case no option is selected and the names of the selected options of less than {@link numberDisplayed} options are selected.
    * If more than numberDisplayed options are selected, {@link nSelectedText} is returned.
    * @param options
    * @param select
    */
  var buttonTitle: js.UndefOr[
    js.Function2[/* options */ js.Array[HTMLOptionElement], /* select */ HTMLSelectElement, String]
  ] = js.native
  /**
    * The width of the multiselect button may be fixed using this option.
    * Actually, buttonWidth describes the width of the .btn-group container and the width of the button is set to 100%.
    * @example.
    * $('#example-buttonWidth').multiselect({
    *       buttonWidth: '400px'
    *   });
    */
  var buttonWidth: js.UndefOr[String] = js.native
  /**
    * The name used for the generated checkboxes.
    * See {@link https://davidstutz.github.io/bootstrap-multiselect/#post|Server-Side Processing} for details.
    */
  var checkboxName: js.UndefOr[String] = js.native
  /**
    * Sets the separator for the list of selected items for mouse-over. Defaults to ', '. Set to '\n' for a neater display.
    */
  var delimiterText: js.UndefOr[String] = js.native
  /**
    * If set to true, the multiselect will be disabled if no options are given.
    */
  var disableIfEmpty: js.UndefOr[Boolean] = js.native
  /**
    * The text shown if the multiselect is disabled.
    * Note that this option is set to the empty string '' by default,
    * that is nonSelectedText is shown if the multiselect is disabled and no options are selected.
    */
  var disabledText: js.UndefOr[String] = js.native
  /**
    * The dropdown can also be dropped right.
    */
  var dropRight: js.UndefOr[Boolean] = js.native
  /**
    * The dropdown can also be dropped up. Note that it is recommended to also set {@link maxHeight}.
    * The plugin calculates the necessary height of the dropdown and takes the minimum of the calculated value and maxHeight.
    */
  var dropUp: js.UndefOr[Boolean] = js.native
  /**
    * The filter as configured above will use case sensitive filtering.
    * by setting enableCaseInsensitiveFiltering to true this behavior can be changed to use case insensitive filtering.
    */
  var enableCaseInsensitiveFiltering: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, optgroup's will be clickable, allowing to easily select multiple options belonging to the same group.
    * enableClickableOptGroups is not available in single selection mode, i.e. when the multiple attribute is not present.
    * When using selectedClass, the selected classes are also applied on the option groups.
    */
  var enableClickableOptGroups: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, optgroup's will be collapsible.
    */
  var enableCollapsibleOptGroups: js.UndefOr[Boolean] = js.native
  /**
    * Set to true or false to enable or disable the filter. A filter input will be added to dynamically filter all options.
    */
  var enableFiltering: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to enable full value filtering, that is all options are shown where the query is a prefix of.
    */
  var enableFullValueFiltering: js.UndefOr[Boolean] = js.native
  /**
    * XSS injection is a serious threat for all modern web applications. Setting enableHTML to false (default setting) will create a XSS safe multiselect.
    */
  var enableHTML: js.UndefOr[Boolean] = js.native
  /**
    * The options are filtered based on their text. This behavior can be changed to use the value of the options or both the text and the value.
    */
  var filterBehavior: js.UndefOr[text | value | both] = js.native
  /**
    * The placeholder used for the filter input.
    * @example   $('#example-filter-placeholder').multiselect({
    *        enableFiltering: true,
    *        filterPlaceholder: 'Search for something...'
    *   });
    */
  var filterPlaceholder: js.UndefOr[String] = js.native
  /**
    *  Set to true or false to enable or disable the select all option.
    */
  var includeSelectAllOption: js.UndefOr[Boolean] = js.native
  /**
    * Inherit the class of the button from the original select.
    */
  var inheritClass: js.UndefOr[Boolean] = js.native
  /**
    * The maximum height of the dropdown. This is useful when using the plugin with plenty of options.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * The text displayed if more than  {@link numberDisplayed} options are selected. This option is used by the default buttonText and buttonTitle callbacks.
    */
  var nSelectedText: js.UndefOr[String] = js.native
  /**
    * The text displayed when no option is selected. This option is used in the default buttonText and buttonTitle functions.
    */
  var nonSelectedText: js.UndefOr[String] = js.native
  /**
    * This option is used by the buttonText and buttonTitle functions to determine of too much options would be displayed.
    */
  var numberDisplayed: js.UndefOr[Double] = js.native
  /**
    * A function which is triggered on the change event of the options.
    * Note that the event is not triggered when selecting or deselecting options using the select and deselect methods provided by the plugin.
    * @param option The option item that was changed, wrapped in a JQuery object.
    * @param checked Whether the checkbox was checked or not.
    */
  var onChange: js.UndefOr[js.Function2[/* option */ JQuery, /* checked */ Boolean, Unit]] = js.native
  /**
    * This function is triggered when the select all option is used to deselect all options.
    * Note that this can also be triggered manually using the {@link .multiselect('deselectAll')} method.
    * Note that the onChange option is not triggered when (de)selecting all options using the select all option.
    * The onDeselectAll option is only triggered if the select all option was unchecked.
    * it is not triggered if all options were unchecked manually (causing the select all option to be unchecked as well).
    */
  var onDeselectAll: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A callback called after the dropdown has been closed.
    * The onDropdownHidden option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownHidden: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  /**
    * A callback called when the dropdown is closed.
    * The onDropdownHide option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownHide: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  /**
    * A callback called when the dropdown is shown.
    * The onDropdownShow option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownShow: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  /**
    * A callback called after the dropdown has been shown.
    * The onDropdownShown option is not available when using Twitter Bootstrap 2.3.
    */
  var onDropdownShown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  /**
    * A function which is triggered when the multiselect is finished initializing.
    */
  var onInitialized: js.UndefOr[js.Function2[/* select */ HTMLSelectElement, /* container */ HTMLElement, Unit]] = js.native
  /**
    * This function is triggered when the select all option is used to select all options.
    * Note that this can also be triggered manually using the {@link .multiselect('selectAll')} method.
    * Note that the onChange option is not triggered when (de)selecting all options using the select all option.
    * The onSelectAll option is only triggered if the select all option was checked.
    * it is not triggered if all options were checked manually (causing the select all option to be checked as well).
    */
  var onSelectAll: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A callback used to define the classes for the li elements containing checkboxes and labels.
    */
  var optionClass: js.UndefOr[js.Function1[/* element */ HTMLElement, String]] = js.native
  /**
    * A callback used to define the labels of the options.
    */
  var optionLabel: js.UndefOr[js.Function1[/* element */ HTMLElement, String]] = js.native
  /**
    * Setting both {@link includeSelectAllOption} and {@link enableFiltering} to true, the select all option does always select only the visible option.
    * With setting selectAllJustVisible to false this behavior is changed such that always all options (irrespective of whether they are visible) are selected.
    */
  var selectAllJustVisible: js.UndefOr[Boolean] = js.native
  /**
    * This option allows to control the name given to the select all option.
    * See {@link https://davidstutz.github.io/bootstrap-multiselect/#post|Server-Side Processing} for more details.
    */
  var selectAllName: js.UndefOr[String] = js.native
  /**
    * If set to true (default), the number of selected options will be shown in parantheses when all options are seleted.
    */
  var selectAllNumber: js.UndefOr[Boolean] = js.native
  /**
    * The text displayed for the select all option.
    */
  var selectAllText: js.UndefOr[String] = js.native
  /**
    * The select all option is added as additional option within the select.
    * To distinguish this option from the original options the value used for the select all option can be configured using the selectAllValue option.
    */
  var selectAllValue: js.UndefOr[String | Double] = js.native
  /**
    * The class(es) applied on selected options.
    */
  var selectedClass: js.UndefOr[String] = js.native
  /**
    * The generated HTML markup can be controlled using templates. Basically, templates are simple configuration options.
    */
  var templates: js.UndefOr[Templates] = js.native
}

object MultiSelectOptions {
  @scala.inline
  def apply(): MultiSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectOptions]
  }
  @scala.inline
  implicit class MultiSelectOptionsOps[Self <: MultiSelectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllSelectedText(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSelectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllSelectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSelectedText")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClass")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonText(value: (/* options */ HTMLOptionsCollection, /* select */ HTMLSelectElement) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonTitle(value: (/* options */ js.Array[HTMLOptionElement], /* select */ HTMLSelectElement) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTitle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxName")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiterText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterText")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableIfEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIfEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableIfEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIfEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledText")(js.undefined)
        ret
    }
    @scala.inline
    def withDropRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropRight")(js.undefined)
        ret
    }
    @scala.inline
    def withDropUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropUp")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCaseInsensitiveFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCaseInsensitiveFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCaseInsensitiveFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCaseInsensitiveFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableClickableOptGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClickableOptGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableClickableOptGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClickableOptGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCollapsibleOptGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCollapsibleOptGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCollapsibleOptGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCollapsibleOptGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFullValueFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFullValueFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFullValueFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFullValueFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBehavior(value: text | value | both): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSelectAllOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSelectAllOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSelectAllOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSelectAllOption")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withNSelectedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nSelectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNSelectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nSelectedText")(js.undefined)
        ret
    }
    @scala.inline
    def withNonSelectedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSelectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonSelectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSelectedText")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberDisplayed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberDisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberDisplayed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberDisplayed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* option */ JQuery, /* checked */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeselectAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselectAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDeselectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropdownHidden(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropdownHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropdownHide(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropdownHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropdownShow(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropdownShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropdownShown(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropdownShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownShown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialized(value: (/* select */ HTMLSelectElement, /* container */ HTMLElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionClass(value: /* element */ HTMLElement => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOptionClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionClass")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionLabel(value: /* element */ HTMLElement => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOptionLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllJustVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllJustVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllJustVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllJustVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllName")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: Templates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
  }
  
}

