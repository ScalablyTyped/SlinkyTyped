package typingsSlinky.baseui

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.baseuiStrings.CHANGE
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.toggle
import typingsSlinky.baseui.baseuiStrings.toggle_round
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("baseui/checkbox", "Checkbox")
  @js.native
  class Checkbox protected ()
    extends Component[CheckboxProps, CheckboxState, js.Any] {
    def this(props: CheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CheckboxProps, context: js.Any) = this()
    
    def onBlur(event: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
    
    def onFocus(event: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseDown(event: SyntheticMouseEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseEnter(event: SyntheticMouseEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseLeave(event: SyntheticMouseEvent[HTMLInputElement]): Unit = js.native
    
    def onMouseUp(event: SyntheticMouseEvent[HTMLInputElement]): Unit = js.native
  }
  
  @js.native
  trait LABEL_PLACEMENT extends StObject {
    
    var bottom: typingsSlinky.baseui.baseuiStrings.bottom = js.native
    
    var left: typingsSlinky.baseui.baseuiStrings.left = js.native
    
    var right: typingsSlinky.baseui.baseuiStrings.right = js.native
    
    var top: typingsSlinky.baseui.baseuiStrings.top = js.native
  }
  object LABEL_PLACEMENT {
    
    @JSImport("baseui/checkbox", "LABEL_PLACEMENT")
    @js.native
    val ^ : LABEL_PLACEMENT = js.native
    
    @scala.inline
    implicit class LABEL_PLACEMENTMutableBuilder[Self <: LABEL_PLACEMENT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait STATE_TYPE extends StObject {
    
    var change: CHANGE = js.native
  }
  object STATE_TYPE {
    
    @JSImport("baseui/checkbox", "STATE_TYPE")
    @js.native
    val ^ : STATE_TYPE = js.native
    
    @scala.inline
    implicit class STATE_TYPEMutableBuilder[Self <: STATE_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: CHANGE): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait STYLE_TYPE extends StObject {
    
    var default: default_ = js.native
    
    var toggle: typingsSlinky.baseui.baseuiStrings.toggle = js.native
    
    var toggle_round: typingsSlinky.baseui.baseuiStrings.toggle_round = js.native
  }
  object STYLE_TYPE {
    
    @JSImport("baseui/checkbox", "STYLE_TYPE")
    @js.native
    val ^ : STYLE_TYPE = js.native
    
    @scala.inline
    implicit class STYLE_TYPEMutableBuilder[Self <: STYLE_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggle(value: toggle): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggle_round(value: toggle_round): Self = StObject.set(x, "toggle_round", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/checkbox", "StatefulCheckbox")
  @js.native
  val StatefulCheckbox: ReactComponentClass[StatefulCheckboxProps] = js.native
  
  @JSImport("baseui/checkbox", "StatefulContainer")
  @js.native
  val StatefulContainer: ReactComponentClass[StatefulContainerProps] = js.native
  
  @JSImport("baseui/checkbox", "StyledCheckmark")
  @js.native
  val StyledCheckmark: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledInput")
  @js.native
  val StyledInput: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledToggle")
  @js.native
  val StyledToggle: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledToggleInner")
  @js.native
  val StyledToggleInner: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/checkbox", "StyledToggleTrack")
  @js.native
  val StyledToggleTrack: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait CheckboxOverrides extends StObject {
    
    var Checkmark: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Input: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Label: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Toggle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var ToggleInner: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var ToggleTrack: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object CheckboxOverrides {
    
    @scala.inline
    def apply(): CheckboxOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxOverrides]
    }
    
    @scala.inline
    implicit class CheckboxOverridesMutableBuilder[Self <: CheckboxOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckmark(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Checkmark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckmarkUndefined: Self = StObject.set(x, "Checkmark", js.undefined)
      
      @scala.inline
      def setInput(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      @scala.inline
      def setLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setToggle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleInner(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ToggleInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleInnerUndefined: Self = StObject.set(x, "ToggleInner", js.undefined)
      
      @scala.inline
      def setToggleTrack(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ToggleTrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleTrackUndefined: Self = StObject.set(x, "ToggleTrack", js.undefined)
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "Toggle", js.undefined)
    }
  }
  
  @js.native
  trait CheckboxProps extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var checkmarkType: js.UndefOr[default_ | toggle | toggle_round] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
    
    var isError: js.UndefOr[Boolean] = js.native
    
    var isIndeterminate: js.UndefOr[Boolean] = js.native
    
    var labelPlacement: js.UndefOr[top | right | bottom | left] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var overrides: js.UndefOr[CheckboxOverrides] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object CheckboxProps {
    
    @scala.inline
    def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit class CheckboxPropsMutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setCheckmarkType(value: default_ | toggle | toggle_round): Self = StObject.set(x, "checkmarkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckmarkTypeUndefined: Self = StObject.set(x, "checkmarkType", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      @scala.inline
      def setInputRefRefObject(value: ReactRef[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
      
      @scala.inline
      def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
      
      @scala.inline
      def setLabelPlacement(value: top | right | bottom | left): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOverrides(value: CheckboxOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CheckboxState extends StObject {
    
    var isActive: Boolean = js.native
    
    var isFocused: Boolean = js.native
    
    var isHovered: Boolean = js.native
  }
  object CheckboxState {
    
    @scala.inline
    def apply(isActive: Boolean, isFocused: Boolean, isHovered: Boolean): CheckboxState = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxState]
    }
    
    @scala.inline
    implicit class CheckboxStateMutableBuilder[Self <: CheckboxState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
    }
  }
  
  type StateReducer = js.Function4[
    /* stateType */ String, 
    /* nextState */ CheckboxState, 
    /* currentState */ CheckboxState, 
    /* event */ SyntheticEvent[Event, HTMLInputElement], 
    CheckboxState
  ]
  
  @js.native
  trait StatefulCheckboxProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var checkmarkType: js.UndefOr[default_ | toggle | toggle_round] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var initialState: js.UndefOr[typingsSlinky.baseui.checkboxMod.initialState] = js.native
    
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
    
    var isError: js.UndefOr[Boolean] = js.native
    
    var isIndeterminate: js.UndefOr[Boolean] = js.native
    
    var labelPlacement: js.UndefOr[top | right | bottom | left] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var overrides: js.UndefOr[CheckboxOverrides] = js.native
  }
  object StatefulCheckboxProps {
    
    @scala.inline
    def apply(): StatefulCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulCheckboxProps]
    }
    
    @scala.inline
    implicit class StatefulCheckboxPropsMutableBuilder[Self <: StatefulCheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setCheckmarkType(value: default_ | toggle | toggle_round): Self = StObject.set(x, "checkmarkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckmarkTypeUndefined: Self = StObject.set(x, "checkmarkType", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInitialState(value: initialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      @scala.inline
      def setInputRefRefObject(value: ReactRef[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
      
      @scala.inline
      def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
      
      @scala.inline
      def setLabelPlacement(value: top | right | bottom | left): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOverrides(value: CheckboxOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  @js.native
  trait StatefulContainerProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var initialState: js.UndefOr[CheckboxState] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var overrides: js.UndefOr[CheckboxOverrides] = js.native
    
    var stateReducer: js.UndefOr[StateReducer] = js.native
  }
  object StatefulContainerProps {
    
    @scala.inline
    def apply(): StatefulContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    @scala.inline
    implicit class StatefulContainerPropsMutableBuilder[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialState(value: CheckboxState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOverrides(value: CheckboxOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setStateReducer(
        value: (/* stateType */ String, /* nextState */ CheckboxState, /* currentState */ CheckboxState, /* event */ SyntheticEvent[Event, HTMLInputElement]) => CheckboxState
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction4(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  @js.native
  trait initialState extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var isIndeterminate: js.UndefOr[Boolean] = js.native
  }
  object initialState {
    
    @scala.inline
    def apply(): initialState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[initialState]
    }
    
    @scala.inline
    implicit class initialStateMutableBuilder[Self <: initialState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
    }
  }
}
