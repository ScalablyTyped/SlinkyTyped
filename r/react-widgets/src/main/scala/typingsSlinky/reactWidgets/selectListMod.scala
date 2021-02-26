package typingsSlinky.reactWidgets

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactWidgets.commonPropsMod.AutoFocus
import typingsSlinky.reactWidgets.commonPropsMod.ReactWidgetsCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectListMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-widgets/lib/SelectList", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[SelectListProps, js.Object, js.Any] {
    def this(props: SelectListProps) = this()
    def this(props: SelectListProps, context: js.Any) = this()
  }
  @JSImport("react-widgets/lib/SelectList", JSImport.Namespace)
  @js.native
  val ^ : SelectListClass = js.native
  
  type SelectListClass = ReactComponentClass[SelectListProps]
  
  @js.native
  trait SelectListMessages extends StObject {
    
    /**
      * @default: "There are no items in this list"
      */
    var emptyList: js.UndefOr[String | (js.Function1[/* props */ SelectListProps, String])] = js.native
  }
  object SelectListMessages {
    
    @scala.inline
    def apply(): SelectListMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectListMessages]
    }
    
    @scala.inline
    implicit class SelectListMessagesMutableBuilder[Self <: SelectListMessages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmptyList(value: String | (js.Function1[/* props */ SelectListProps, String])): Self = StObject.set(x, "emptyList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyListFunction1(value: /* props */ SelectListProps => String): Self = StObject.set(x, "emptyList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmptyListUndefined: Self = StObject.set(x, "emptyList", js.undefined)
    }
  }
  
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
    var groupComponent: js.UndefOr[ReactType[_]] = js.native
    
    /**
      * This component is used to render each item in the SelectList. The default component
      * renders the text of the selected item (specified by textfield)
      */
    var itemComponent: js.UndefOr[ReactType[_]] = js.native
    
    /**
      * @default List
      */
    var listComponent: js.UndefOr[ReactType[_] | String] = js.native
    
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
    implicit class SelectListPropsMutableBuilder[Self <: SelectListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(value: js.Any | js.Array[_]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: js.Any*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
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
      def setMessages(value: SelectListMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* values */ js.Any | js.Array[_] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnMove(value: (/* list */ HTMLElement, /* focusedNode */ HTMLElement, /* focusedItem */ js.Any) => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTextField(value: String | (js.Function1[/* dataItem */ js.Any, String])): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFieldFunction1(value: /* dataItem */ js.Any => String): Self = StObject.set(x, "textField", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any | js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type _To = SelectListClass
  
  /* This means you don't have to write `^`, but can instead just say `selectListMod.foo` */
  override def _to: SelectListClass = ^
}
