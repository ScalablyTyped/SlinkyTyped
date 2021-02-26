package typingsSlinky.reactWidgets

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactWidgets.commonPropsMod.AutoFocus
import typingsSlinky.reactWidgets.commonPropsMod.ReactWidgetsCommonDropdownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboboxMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-widgets/lib/Combobox", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[ComboboxProps, js.Object, js.Any] {
    def this(props: ComboboxProps) = this()
    def this(props: ComboboxProps, context: js.Any) = this()
  }
  @JSImport("react-widgets/lib/Combobox", JSImport.Namespace)
  @js.native
  val ^ : ComboboxClass = js.native
  
  type ComboboxClass = ReactComponentClass[ComboboxProps]
  
  @js.native
  trait ComboboxMessages extends StObject {
    
    /**
      * text to display when the the current filter does not return any results
      */
    var emptyFilter: String | (js.Function1[/* props */ ComboboxProps, String]) = js.native
    
    /**
      * text to display when the data prop array is empty
      */
    var emptyList: String | (js.Function1[/* props */ ComboboxProps, String]) = js.native
    
    /**
      * Combobox button text for screen readers
      */
    var open: String | (js.Function1[/* props */ ComboboxProps, String]) = js.native
  }
  object ComboboxMessages {
    
    @scala.inline
    def apply(
      emptyFilter: String | (js.Function1[/* props */ ComboboxProps, String]),
      emptyList: String | (js.Function1[/* props */ ComboboxProps, String]),
      open: String | (js.Function1[/* props */ ComboboxProps, String])
    ): ComboboxMessages = {
      val __obj = js.Dynamic.literal(emptyFilter = emptyFilter.asInstanceOf[js.Any], emptyList = emptyList.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComboboxMessages]
    }
    
    @scala.inline
    implicit class ComboboxMessagesMutableBuilder[Self <: ComboboxMessages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmptyFilter(value: String | (js.Function1[/* props */ ComboboxProps, String])): Self = StObject.set(x, "emptyFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyFilterFunction1(value: /* props */ ComboboxProps => String): Self = StObject.set(x, "emptyFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmptyList(value: String | (js.Function1[/* props */ ComboboxProps, String])): Self = StObject.set(x, "emptyList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyListFunction1(value: /* props */ ComboboxProps => String): Self = StObject.set(x, "emptyList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpen(value: String | (js.Function1[/* props */ ComboboxProps, String])): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenFunction1(value: /* props */ ComboboxProps => String): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ComboboxProps
    extends ReactWidgetsCommonDropdownProps
       with AutoFocus {
    
    /**
      * Mark whether the widget is in a busy or loading state. If true the widget will display a
      * spinner gif, useful when loading data via an ajax call.
      */
    var busy: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional ReactNode to override the spinner gif element when the busy property
      * is set to true.
      */
    var busySpinner: js.UndefOr[ReactElement] = js.native
    
    /**
      * Use in conjunction with the filter prop. Filter the list without regard for case. This
      * only applies to non function values for filter
      */
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    /**
      * An array of possible values for the Combobox. If an array of objects is provided you
      * should use the valueField and textField props, to specify which object properties
      * comprise the value field (such as an id) and the field used to label the item.
      */
    var data: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * Default value.
      */
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    /**
      * Delay
      * @default 500
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * The speed, in milliseconds, of the dropdown animation.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * Specify a filtering method used to reduce the items in the dropdown as you type. It can
      * be used in conjunction with the suggest prop or instead of it. There are a few built-in
      * filtering methods that can be specified by passing the String name. You can explicitly
      * opt out of filtering by setting filter to false To handle custom filtering techniques
      * provide a function that returns true or false for each passed in item (analogous to the
      * array.filter builtin) Acceptable values for filter are: false "startsWith" "endsWith"
      * "contains" function(String item)
      */
    var filter: js.UndefOr[
        Boolean | String | (js.Function2[/* dataItem */ js.Any, /* searchItem */ js.Any, Boolean])
      ] = js.native
    
    /**
      * Determines how to group the Combobox. Providing a string will group the data array by
      * that property. You can also provide a function which should return the group value.
      */
    var groupBy: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, _])] = js.native
    
    /**
      * This component is used to render each option group, when groupBy is specified. By default
      * the groupBy value will be used.
      */
    var groupComponent: js.UndefOr[ReactType[_]] = js.native
    
    /**
      * An object of props that is passed directly to the underlying input component.
      */
    var inputProps: js.UndefOr[js.Object] = js.native
    
    /**
      * This component is used to render each possible item in the Combobox. The default
      * component renders the text of the selected item (specified by textfield)
      */
    var itemComponent: js.UndefOr[ReactType[_]] = js.native
    
    var listComponent: js.UndefOr[ReactType[_] | String] = js.native
    
    /**
      * An object of props that is passed directly to the underlying List component.
      */
    var listProps: js.UndefOr[js.Object] = js.native
    
    /**
      * Object hash containing display text and/or text for screen readers. Use the messages
      * object to localize widget text and increase accessibility.
      */
    var messages: js.UndefOr[ComboboxMessages] = js.native
    
    /**
      * Use in conjunction with the filter prop. Start filtering the list only after the value
      * has reached a minimum length.
      */
    var minLength: js.UndefOr[Double] = js.native
    
    /**
      * The HTML name attribute, passed directly to the input element.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Called when the value is changed. If the value is one of the data members that item will
      * be returned. In the case of a value not being found in the data array the string value of
      * the Combobox will be returned.
      */
    var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    /**
      * This handler fires when an item has been selected from the list. It fires before the
      * onChange handler, and fires regardless of whether the value has actually changed.
      */
    var onSelect: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    /**
      * Called fires when the Combobox is about to open or close. onToggle should be used when
      * the open prop is set otherwise the widget will never open or close.
      */
    var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
    
    /**
      * Whether or not the Combobox is open. When unset (undefined) the Combobox will handle the
      * opening and closing internally. The defaultOpen prop can be used to set an initialization
      * value for uncontrolled widgets.
      */
    var open: js.UndefOr[Boolean] = js.native
    
    /**
      * The same as an input placeholder, only works in browsers that support the placeholder
      * attribute for inputs
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * A Transition component from react-transition-group v2. The provided component will be used
      * instead of the default SlideDownTransition for fully customizable animations.
      * The transition component is also injected with a dropUp prop indicating the direction it should open.
      */
    var popupTransition: js.UndefOr[ReactType[_] | String] = js.native
    
    /**
      * When true the Combobox will suggest, or fill in, values as you type. The suggestions are
      * always "startsWith", meaning it will search from the start of the textField property
      */
    var suggest: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify which data item field to display in the Combobox and selected item. The
      * textField` prop may also also used as to find an item in the list as you type. Providing
      * an accessor function allows for computed text values
      */
    var textField: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, String])] = js.native
    
    /**
      * The current value of the Combobox. This can be an object (such as a member of the data
      * array) or a primitive value, hinted to by the valueField. The widget value does not need
      * to be in the data, widgets can have values that are not in their list.
      */
    var value: js.UndefOr[js.Any] = js.native
    
    /**
      * A dataItem field name for uniquely identifying items in the data list. A valueField is
      * required when the value prop is not itself a dataItem. A valueField is useful when
      * specifying the selected item, by its id instead of using the model as the value. When a
      * valueField is not provided, the Combobox will use strict equality checks (===) to locate
      * the value in the data list.
      */
    var valueField: js.UndefOr[String] = js.native
  }
  object ComboboxProps {
    
    @scala.inline
    def apply(): ComboboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxProps]
    }
    
    @scala.inline
    implicit class ComboboxPropsMutableBuilder[Self <: ComboboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusySpinner(value: ReactElement): Self = StObject.set(x, "busySpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusySpinnerReactElement(value: ReactElement): Self = StObject.set(x, "busySpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusySpinnerUndefined: Self = StObject.set(x, "busySpinner", js.undefined)
      
      @scala.inline
      def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFilter(value: Boolean | String | (js.Function2[/* dataItem */ js.Any, /* searchItem */ js.Any, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction2(value: (/* dataItem */ js.Any, /* searchItem */ js.Any) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGroupBy(value: String | (js.Function1[/* dataItem */ js.Any, _])): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByFunction1(value: /* dataItem */ js.Any => _): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setGroupComponent(value: ReactType[_]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      @scala.inline
      def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setItemComponent(value: ReactType[_]): Self = StObject.set(x, "itemComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "itemComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "itemComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemComponentUndefined: Self = StObject.set(x, "itemComponent", js.undefined)
      
      @scala.inline
      def setListComponent(value: ReactType[_] | String): Self = StObject.set(x, "listComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "listComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "listComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListComponentUndefined: Self = StObject.set(x, "listComponent", js.undefined)
      
      @scala.inline
      def setListProps(value: js.Object): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      @scala.inline
      def setMessages(value: ComboboxMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnToggle(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopupTransition(value: ReactType[_] | String): Self = StObject.set(x, "popupTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupTransitionComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "popupTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupTransitionFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "popupTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupTransitionUndefined: Self = StObject.set(x, "popupTransition", js.undefined)
      
      @scala.inline
      def setSuggest(value: Boolean): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
      
      @scala.inline
      def setTextField(value: String | (js.Function1[/* dataItem */ js.Any, String])): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFieldFunction1(value: /* dataItem */ js.Any => String): Self = StObject.set(x, "textField", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ComboboxClass
  
  /* This means you don't have to write `^`, but can instead just say `comboboxMod.foo` */
  override def _to: ComboboxClass = ^
}
