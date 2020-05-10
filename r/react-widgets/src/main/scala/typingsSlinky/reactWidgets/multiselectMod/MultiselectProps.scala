package typingsSlinky.reactWidgets.multiselectMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactWidgets.AnonAction
import typingsSlinky.reactWidgets.AnonLastSearchTerm
import typingsSlinky.reactWidgets.AnonOriginalEvent
import typingsSlinky.reactWidgets.commonPropsMod.AutoFocus
import typingsSlinky.reactWidgets.commonPropsMod.ReactWidgetsCommonDropdownProps
import typingsSlinky.reactWidgets.reactWidgetsBooleans.`false`
import typingsSlinky.reactWidgets.reactWidgetsStrings.contains
import typingsSlinky.reactWidgets.reactWidgetsStrings.endsWith
import typingsSlinky.reactWidgets.reactWidgetsStrings.onFilter
import typingsSlinky.reactWidgets.reactWidgetsStrings.startsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiselectProps
  extends ReactWidgetsCommonDropdownProps
     with AutoFocus {
  /**
    * Enables the list option creation UI. onFilter will only the UI when actively filtering for a list item.
    * @default 'onFilter'
    */
  var allowCreate: js.UndefOr[Boolean | onFilter] = js.native
  /**
    * mark whether the widget is in a busy or loading state. If true the widget will display a
    * spinner gif, useful when loading data via an ajax call.
    * @default false
    */
  var busy: js.UndefOr[Boolean] = js.native
  /**
    * Use in conjunction with the filter prop. Filter the list without regard for case. This
    * only applies to non function values for filter.
    * @default false
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * Adds a css class to the input container element.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * Provide an array of possible values for the Multiselect. If an array of objects is
    * provided you should use the valueField and textField props, to specify which object
    * properties comprise the value field (such as an id) and the field used to label the item.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * Default Value.
    */
  var defaultValue: js.UndefOr[js.Array[_]] = js.native
  /**
    * The speed, in milliseconds, of the dropdown animation.
    * @default 250
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Specify a filtering method used to reduce the items in the dropdown as you type. There
    * are a few built-in filtering methods that can be specified by passing the String name.
    * You can explicitly opt out of filtering by setting filter to false. To handle custom
    * filtering techniques provide a function that returns true or false for each passed in
    * item (analogous to the array.filter builtin)
    * @default startsWith
    */
  var filter: js.UndefOr[
    `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* searchTerm */ String, Boolean])
  ] = js.native
  /**
    * Determines how to group the Multiselect values. Providing a string will group the data
    * array by that property. You can also provide a 'function' which should return the group
    * value.
    */
  var groupBy: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, _])] = js.native
  /**
    * This component is used to render each option group, when groupBy is specified. By default
    * the groupBy value will be used.
    */
  var groupComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * An object of props that is passed directly to the underlying input component.
    */
  var inputProps: js.UndefOr[js.Object] = js.native
  /**
    * This component is used to render each possible item in the list. The default component
    * renders the text of the selected item (specified by textfield).
    */
  var itemComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * @default List
    */
  var listComponent: js.UndefOr[ReactComponentClass[_] | String] = js.native
  /**
    * An object of props that is passed directly to the underlying List component.
    */
  var listProps: js.UndefOr[js.Object] = js.native
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[MultiselectMessages] = js.native
  /**
    * Use in conjunction with the filter prop. Start filtering the list only after the value
    * has reached a minimum length.
    * @default 1
    */
  var minLength: js.UndefOr[Double] = js.native
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * an array of values.
    */
  var onChange: js.UndefOr[js.Function2[/* dataItems */ js.Array[_], /* metadata */ AnonAction, Unit]] = js.native
  /**
    * This handler fires when the user chooses to create a new tag, not in the data list. It is
    * up to the widget parent to implement creation logic, a common implementation is shown
    * below, where the new tag is selected and added to the data list.
    */
  var onCreate: js.UndefOr[js.Function1[/* searchTerm */ String, Unit]] = js.native
  /**
    * Called when the value of the text box changes either from typing or a pasted value.
    * onSearch should be used when the searchTerm prop is set.
    */
  var onSearch: js.UndefOr[js.Function2[/* searchTerm */ String, /* metadata */ AnonLastSearchTerm, Unit]] = js.native
  /**
    * This handler fires when an item has been selected from the list. It fires before the
    * onChange handler, and fires regardless of whether the value has actually changed
    */
  var onSelect: js.UndefOr[js.Function2[/* value */ js.Any, /* metadata */ AnonOriginalEvent, Unit]] = js.native
  /**
    * Called when the Multiselect is about to open or close. onToggle should be used when the
    * open prop is set otherwise the widget will never open or close.
    */
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
  /**
    * Whether or not the Multiselect is open. When unset (undefined) the Multiselect will
    * handle the opening and closing internally. The defaultOpen prop can be used to set an
    * initialization value for uncontrolled widgets.
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * The same as an input placeholder, only works in browsers that support the placeholder
    * attribute for inputs
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * A Transition component from react-transition-group v2.
    * The provided component will be used instead of the default SlideDownTransition for fully customizable animations.
    * The transition component is also injected with a dropUp prop indicating the direction it should open.
    */
  var popupTransition: js.UndefOr[ReactComponentClass[_] | String] = js.native
  /**
    * The string value of the current search being typed into the Multiselect. When unset
    * (undefined) the Multiselect will handle the filtering internally. The defaultSearchTerm
    * prop can be used to set an initialization value for uncontrolled widgets.
    */
  var searchTerm: js.UndefOr[String] = js.native
  /**
    * This component is used to render each selected item. The default component renders the
    * text of the selected item (specified by textfield).
    */
  var tagComponent: js.UndefOr[ReactComponentClass[_] | String] = js.native
  /**
    * Specify which data item field to display in the Multiselect and selected item. The
    * textField prop may also also used as to find an item in the list as you type. Providing
    * an accessor function allows for computed text values.
    */
  var textField: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, String])] = js.native
  /**
    * The current values of the Multiselect. The value should can null, or an array of
    * valueField values, or an array of objects (such as a few items in the data array)
    */
  var value: js.UndefOr[js.Array[_]] = js.native
  /**
    * A dataItem field name for uniquely identifying items in the data list. A valueField is
    * required when the value prop is not itself a dataItem. A valueField is useful when
    * specifying the selected item, by its id instead of using the model as the value.
    * When a valueField is not provided, the Multiselect will use strict equality checks (===)
    * to locate the value in the data list.
    */
  var valueField: js.UndefOr[String] = js.native
}

object MultiselectProps {
  @scala.inline
  def apply(): MultiselectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiselectProps]
  }
  @scala.inline
  implicit class MultiselectPropsOps[Self <: MultiselectProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCreate(value: Boolean | onFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withBusy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busy")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Array[_]): Self = {
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
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction2(value: (/* dataItem */ js.Any, /* searchTerm */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFilter(
      value: `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* searchTerm */ String, Boolean])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByFunction1(value: /* dataItem */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupBy(value: String | (js.Function1[/* dataItem */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withItemComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withListComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListComponent(value: ReactComponentClass[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withListProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: MultiselectMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* dataItems */ js.Array[_], /* metadata */ AnonAction) => Unit): Self = {
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
    def withOnCreate(value: /* searchTerm */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearch(value: (/* searchTerm */ String, /* metadata */ AnonLastSearchTerm) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: (/* value */ js.Any, /* metadata */ AnonOriginalEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggle(value: /* isOpen */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
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
    def withPopupTransitionFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupTransitionComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupTransition(value: ReactComponentClass[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTerm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTerm")(js.undefined)
        ret
    }
    @scala.inline
    def withTagComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagComponent(value: ReactComponentClass[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFieldFunction1(value: /* dataItem */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTextField(value: String | (js.Function1[/* dataItem */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textField")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
  }
  
}

