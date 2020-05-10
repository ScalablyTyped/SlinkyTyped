package typingsSlinky.reactWidgets.selectListMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.ReactComponentClass
import typingsSlinky.reactWidgets.commonPropsMod.AutoFocus
import typingsSlinky.reactWidgets.commonPropsMod.ReactWidgetsCommonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectListProps
  extends ReactWidgetsCommonProps
     with AutoFocus {
  /**
    * Mark whether the widget is in a busy or loading state. If true the widget will display a
    * spinner gif, useful when loading data via an ajax call.
    * @default false
    */
  var busy: js.UndefOr[Boolean] = js.native
  /**
    * Provide an array of possible values for the SelectList. If an array of objects is
    * provided you should use the valueField and textField props, to specify which object
    * properties comprise the value field (such as an id) and the field used to label the item.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * Default Value.
    */
  var defaultValue: js.UndefOr[js.Any | js.Array[_]] = js.native
  /**
    * Delay
    * @default 250
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Determines how to group the SelectList dropdown list. Providing a string will group the
    * data array by that property. You can also provide a 'function' which should return the
    * group value.
    */
  var groupBy: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, _])] = js.native
  /**
    * This component is used to render each option group, when groupBy is specified. By default
    * the groupBy value will be used.
    */
  var groupComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * This component is used to render each item in the SelectList. The default component
    * renders the text of the selected item (specified by textfield)
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
  var messages: js.UndefOr[SelectListMessages] = js.native
  /**
    * Whether or not the SelectList allows multiple selection or not. when false the SelectList
    * will render as a list of radio buttons, and checkboxes when true.
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * The HTML name attribute used to group checkboxes and radio buttons together.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Change event handler that is called when the value is changed. values will be an array
    * when multiple prop is set.
    */
  var onChange: js.UndefOr[js.Function1[/* values */ js.Any | js.Array[_], Unit]] = js.native
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  /**
    * The native onKeyPress event, called preventDefault will stop any custom behavior.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  /**
    * A handler called when focus shifts on the SelectList. Internally this is used to ensure
    * the focused item is in view. If you want to define your own "scrollTo" behavior or just
    * disable the default one specify an onMove handler. The handler is called with the
    * relevant DOM nodes needed to implement scroll behavior: the list element, the element
    * that is currently focused, and a focused value.
    */
  var onMove: js.UndefOr[
    js.Function3[/* list */ HTMLElement, /* focusedNode */ HTMLElement, /* focusedItem */ js.Any, Unit]
  ] = js.native
  /**
    * The HTML tabindex attribute, controls the order in which focus moves via the TAB key
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * Specify which data item field to display in the SelectList and selected item. The
    * textField prop may also also used as to find an item in the list as you type. Providing
    * an accessor function allows for computed text values.
    */
  var textField: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, String])] = js.native
  /**
    * The current value or values of the SelectList. This can be an object (such as a member of
    * the data array) or a primitive value, hinted to by the valueField. The widget value does
    * not need to be in the data array; widgets can have values that are not in their list.
    */
  var value: js.UndefOr[js.Any | js.Array[_]] = js.native
  /**
    * A dataItem field name for uniquely identifying items in the data list. A valueField is
    * required when the value prop is not itself a dataItem. A valueField is useful when
    * specifying the selected item, by its id instead of using the model as the value.
    * When a valueField is not provided, the SelectList will use strict equality checks (===)
    * to locate the value in the data list.
    */
  var valueField: js.UndefOr[String] = js.native
}

object SelectListProps {
  @scala.inline
  def apply(): SelectListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectListProps]
  }
  @scala.inline
  implicit class SelectListPropsOps[Self <: SelectListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDefaultValue(value: js.Any | js.Array[_]): Self = {
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
    def withMessages(value: SelectListMessages): Self = {
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
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* values */ js.Any | js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: /* event */ KeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMove(value: (/* list */ HTMLElement, /* focusedNode */ HTMLElement, /* focusedItem */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMove")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMove")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
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
    def withValue(value: js.Any | js.Array[_]): Self = {
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

