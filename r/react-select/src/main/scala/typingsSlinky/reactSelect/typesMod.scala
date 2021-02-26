package typingsSlinky.reactSelect

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.selectMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ActionMeta[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var action: ActionTypes = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var option: js.UndefOr[OptionType] = js.native
    
    var removedValue: js.UndefOr[OptionType] = js.native
  }
  object ActionMeta {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](action: ActionTypes): ActionMeta[OptionType] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionMeta[OptionType]]
    }
    
    @scala.inline
    implicit class ActionMetaMutableBuilder[Self <: ActionMeta[_], OptionType /* <: OptionTypeBase */] (val x: Self with ActionMeta[OptionType]) extends AnyVal {
      
      @scala.inline
      def setAction(value: ActionTypes): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOption(value: OptionType): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      @scala.inline
      def setRemovedValue(value: OptionType): Self = StObject.set(x, "removedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedValueUndefined: Self = StObject.set(x, "removedValue", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactSelect.reactSelectStrings.`select-option`
    - typingsSlinky.reactSelect.reactSelectStrings.`deselect-option`
    - typingsSlinky.reactSelect.reactSelectStrings.`remove-value`
    - typingsSlinky.reactSelect.reactSelectStrings.`pop-value`
    - typingsSlinky.reactSelect.reactSelectStrings.`set-value`
    - typingsSlinky.reactSelect.reactSelectStrings.clear
    - typingsSlinky.reactSelect.reactSelectStrings.`create-option`
  */
  trait ActionTypes extends StObject
  object ActionTypes {
    
    @scala.inline
    def clear: typingsSlinky.reactSelect.reactSelectStrings.clear = "clear".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.clear]
    
    @scala.inline
    def `create-option`: typingsSlinky.reactSelect.reactSelectStrings.`create-option` = "create-option".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.`create-option`]
    
    @scala.inline
    def `deselect-option`: typingsSlinky.reactSelect.reactSelectStrings.`deselect-option` = "deselect-option".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.`deselect-option`]
    
    @scala.inline
    def `pop-value`: typingsSlinky.reactSelect.reactSelectStrings.`pop-value` = "pop-value".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.`pop-value`]
    
    @scala.inline
    def `remove-value`: typingsSlinky.reactSelect.reactSelectStrings.`remove-value` = "remove-value".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.`remove-value`]
    
    @scala.inline
    def `select-option`: typingsSlinky.reactSelect.reactSelectStrings.`select-option` = "select-option".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.`select-option`]
    
    @scala.inline
    def `set-value`: typingsSlinky.reactSelect.reactSelectStrings.`set-value` = "set-value".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.`set-value`]
  }
  
  type ClassNameList = js.Array[String]
  
  type ClassNamesState = js.UndefOr[StringDictionary[Boolean]]
  
  @js.native
  trait CommonProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    def clearValue(): Unit = js.native
    
    def cx(): String = js.native
    def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
    def cx(state: ClassNamesState): String = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    def getValue(): ValueType[OptionType] = js.native
    
    var hasValue: Boolean = js.native
    
    var isMulti: Boolean = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactSelect.reactSelectStrings.up
    - typingsSlinky.reactSelect.reactSelectStrings.down
    - typingsSlinky.reactSelect.reactSelectStrings.pageup
    - typingsSlinky.reactSelect.reactSelectStrings.pagedown
    - typingsSlinky.reactSelect.reactSelectStrings.first
    - typingsSlinky.reactSelect.reactSelectStrings.last
  */
  trait FocusDirection extends StObject
  object FocusDirection {
    
    @scala.inline
    def down: typingsSlinky.reactSelect.reactSelectStrings.down = "down".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.down]
    
    @scala.inline
    def first: typingsSlinky.reactSelect.reactSelectStrings.first = "first".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.first]
    
    @scala.inline
    def last: typingsSlinky.reactSelect.reactSelectStrings.last = "last".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.last]
    
    @scala.inline
    def pagedown: typingsSlinky.reactSelect.reactSelectStrings.pagedown = "pagedown".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.pagedown]
    
    @scala.inline
    def pageup: typingsSlinky.reactSelect.reactSelectStrings.pageup = "pageup".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.pageup]
    
    @scala.inline
    def up: typingsSlinky.reactSelect.reactSelectStrings.up = "up".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.up]
  }
  
  type FocusEventHandler = js.Function1[/* event */ SyntheticFocusEvent[HTMLElement], Unit]
  
  @js.native
  trait GroupType[OptionType /* <: OptionTypeBase */]
    extends /* key */ StringDictionary[js.Any] {
    
    var options: OptionsType[OptionType] = js.native
  }
  object GroupType {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](options: OptionsType[OptionType]): GroupType[OptionType] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupType[OptionType]]
    }
    
    @scala.inline
    implicit class GroupTypeMutableBuilder[Self <: GroupType[_], OptionType /* <: OptionTypeBase */] (val x: Self with GroupType[OptionType]) extends AnyVal {
      
      @scala.inline
      def setOptions(value: OptionsType[OptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: OptionType*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  type GroupedOptionsType[OptionType /* <: OptionTypeBase */] = js.Array[GroupType[OptionType]]
  
  type InnerRef = Ref[js.Any]
  
  @js.native
  trait InputActionMeta extends StObject {
    
    var action: InputActionTypes = js.native
  }
  object InputActionMeta {
    
    @scala.inline
    def apply(action: InputActionTypes): InputActionMeta = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputActionMeta]
    }
    
    @scala.inline
    implicit class InputActionMetaMutableBuilder[Self <: InputActionMeta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: InputActionTypes): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactSelect.reactSelectStrings.`set-value`
    - typingsSlinky.reactSelect.reactSelectStrings.`input-change`
    - typingsSlinky.reactSelect.reactSelectStrings.`input-blur`
    - typingsSlinky.reactSelect.reactSelectStrings.`menu-close`
  */
  trait InputActionTypes extends StObject
  object InputActionTypes {
    
    @scala.inline
    def `input-blur`: typingsSlinky.reactSelect.reactSelectStrings.`input-blur` = "input-blur".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.`input-blur`]
    
    @scala.inline
    def `input-change`: typingsSlinky.reactSelect.reactSelectStrings.`input-change` = "input-change".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.`input-change`]
    
    @scala.inline
    def `menu-close`: typingsSlinky.reactSelect.reactSelectStrings.`menu-close` = "menu-close".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.`menu-close`]
    
    @scala.inline
    def `set-value`: typingsSlinky.reactSelect.reactSelectStrings.`set-value` = "set-value".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.`set-value`]
  }
  
  type KeyboardEventHandler = js.Function1[/* event */ SyntheticKeyboardEvent[HTMLElement], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactSelect.reactSelectStrings.auto
    - typingsSlinky.reactSelect.reactSelectStrings.bottom
    - typingsSlinky.reactSelect.reactSelectStrings.top
  */
  trait MenuPlacement extends StObject
  object MenuPlacement {
    
    @scala.inline
    def auto: typingsSlinky.reactSelect.reactSelectStrings.auto = "auto".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.auto]
    
    @scala.inline
    def bottom: typingsSlinky.reactSelect.reactSelectStrings.bottom = "bottom".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.bottom]
    
    @scala.inline
    def top: typingsSlinky.reactSelect.reactSelectStrings.top = "top".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactSelect.reactSelectStrings.absolute
    - typingsSlinky.reactSelect.reactSelectStrings.fixed
  */
  trait MenuPosition extends StObject
  object MenuPosition {
    
    @scala.inline
    def absolute: typingsSlinky.reactSelect.reactSelectStrings.absolute = "absolute".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.absolute]
    
    @scala.inline
    def fixed: typingsSlinky.reactSelect.reactSelectStrings.fixed = "fixed".asInstanceOf[typingsSlinky.reactSelect.reactSelectStrings.fixed]
  }
  
  type MouseEventHandler = js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]
  
  /* Inlined react-select.react-select/src/types.PropsWithInnerRef & {  data :any,   id :number,   index :number,   isDisabled :boolean,   isFocused :boolean,   isSelected :boolean,   label :string,   onClick :react-select.react-select/src/types.MouseEventHandler,   onMouseOver :react-select.react-select/src/types.MouseEventHandler,   value :any} */
  @js.native
  trait OptionProps extends StObject {
    
    var data: js.Any = js.native
    
    var id: Double = js.native
    
    var index: Double = js.native
    
    /** The inner reference. */
    var innerRef: Ref[_] = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
    
    var isSelected: Boolean = js.native
    
    var label: String = js.native
    
    var onClick: MouseEventHandler = js.native
    
    var onMouseOver: MouseEventHandler = js.native
    
    var value: js.Any = js.native
  }
  object OptionProps {
    
    @scala.inline
    def apply(
      data: js.Any,
      id: Double,
      index: Double,
      isDisabled: Boolean,
      isFocused: Boolean,
      isSelected: Boolean,
      label: String,
      onClick: /* event */ SyntheticMouseEvent[HTMLElement] => Unit,
      onMouseOver: /* event */ SyntheticMouseEvent[HTMLElement] => Unit,
      value: js.Any
    ): OptionProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseOver = js.Any.fromFunction1(onMouseOver), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionProps]
    }
    
    @scala.inline
    implicit class OptionPropsMutableBuilder[Self <: OptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRef(value: Ref[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOver(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionTypeBase = StringDictionary[js.Any]
  
  type OptionsType[OptionType /* <: OptionTypeBase */] = js.Array[OptionType]
  
  @js.native
  trait PropsWithInnerRef extends StObject {
    
    /** The inner reference. */
    var innerRef: Ref[_] = js.native
  }
  object PropsWithInnerRef {
    
    @scala.inline
    def apply(): PropsWithInnerRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsWithInnerRef]
    }
    
    @scala.inline
    implicit class PropsWithInnerRefMutableBuilder[Self <: PropsWithInnerRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInnerRef(value: Ref[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PropsWithStyles extends StObject {
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    var theme: Theme = js.native
  }
  object PropsWithStyles {
    
    @scala.inline
    def apply(getStyles: (String, js.Any) => js.Object, theme: Theme): PropsWithStyles = {
      val __obj = js.Dynamic.literal(getStyles = js.Any.fromFunction2(getStyles), theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsWithStyles]
    }
    
    @scala.inline
    implicit class PropsWithStylesMutableBuilder[Self <: PropsWithStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetStyles(value: (String, js.Any) => js.Object): Self = StObject.set(x, "getStyles", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Theme extends StObject {
    
    var borderRadius: Double = js.native
    
    var colors: StringDictionary[String] = js.native
    
    var spacing: ThemeSpacing = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(borderRadius: Double, colors: StringDictionary[String], spacing: ThemeSpacing): Theme = {
      val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColors(value: StringDictionary[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacing(value: ThemeSpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ThemeSpacing extends StObject {
    
    var baseUnit: Double = js.native
    
    var controlHeight: Double = js.native
    
    var menuGutter: Double = js.native
  }
  object ThemeSpacing {
    
    @scala.inline
    def apply(baseUnit: Double, controlHeight: Double, menuGutter: Double): ThemeSpacing = {
      val __obj = js.Dynamic.literal(baseUnit = baseUnit.asInstanceOf[js.Any], controlHeight = controlHeight.asInstanceOf[js.Any], menuGutter = menuGutter.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeSpacing]
    }
    
    @scala.inline
    implicit class ThemeSpacingMutableBuilder[Self <: ThemeSpacing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUnit(value: Double): Self = StObject.set(x, "baseUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlHeight(value: Double): Self = StObject.set(x, "controlHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuGutter(value: Double): Self = StObject.set(x, "menuGutter", value.asInstanceOf[js.Any])
    }
  }
  
  type ValueType[OptionType /* <: OptionTypeBase */] = js.UndefOr[OptionType | OptionsType[OptionType] | Null]
}
