package typingsSlinky.baseui

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.Close
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.close
import typingsSlinky.baseui.baseuiStrings.hover
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.menu
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.open
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.tooltip
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.popoverMod.PopoverOverrides
import typingsSlinky.baseui.popoverMod.State
import typingsSlinky.baseui.popoverMod.StateReducer
import typingsSlinky.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("baseui/helper", "ACCESSIBILITY_TYPE")
  @js.native
  val ACCESSIBILITY_TYPE: typingsSlinky.baseui.popoverMod.ACCESSIBILITY_TYPE = js.native
  
  @JSImport("baseui/helper", "PLACEMENT")
  @js.native
  val PLACEMENT: typingsSlinky.baseui.popoverMod.PLACEMENT = js.native
  
  @JSImport("baseui/helper", "StyledArrow")
  @js.native
  val StyledArrow: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/helper", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/helper", "TRIGGER_TYPE")
  @js.native
  val TRIGGER_TYPE: typingsSlinky.baseui.popoverMod.TRIGGER_TYPE = js.native
  
  @JSImport("baseui/helper", "Unstable_Helper")
  @js.native
  val UnstableHelper: ReactComponentClass[PropsT] = js.native
  
  @JSImport("baseui/helper", "Unstable_HelperSteps")
  @js.native
  val UnstableHelperSteps: ReactComponentClass[HelperStepsPropsT] = js.native
  
  @JSImport("baseui/helper", "Unstable_StatefulHelper")
  @js.native
  val UnstableStatefulHelper: ReactComponentClass[StatefulPropsT] = js.native
  
  @js.native
  trait HelperStepsPropsT extends StObject {
    
    var index: Double = js.native
    
    var length: Double = js.native
    
    def onFinish(): js.Any = js.native
    
    def onNext(): js.Any = js.native
    
    def onPrev(): js.Any = js.native
  }
  object HelperStepsPropsT {
    
    @scala.inline
    def apply(index: Double, length: Double, onFinish: () => js.Any, onNext: () => js.Any, onPrev: () => js.Any): HelperStepsPropsT = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onFinish = js.Any.fromFunction0(onFinish), onNext = js.Any.fromFunction0(onNext), onPrev = js.Any.fromFunction0(onPrev))
      __obj.asInstanceOf[HelperStepsPropsT]
    }
    
    @scala.inline
    implicit class HelperStepsPropsTMutableBuilder[Self <: HelperStepsPropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFinish(value: () => js.Any): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnNext(value: () => js.Any): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPrev(value: () => js.Any): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined baseui.baseui/popover.PopoverProps */
  @js.native
  trait PropsT extends StObject {
    
    var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
    
    var animateOutTime: js.UndefOr[Double] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var children: ReactElement = js.native
    
    var content: ReactElement | js.Function0[ReactElement] = js.native
    
    var `data-baseweb`: js.UndefOr[String] = js.native
    
    var focusLock: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var ignoreBoundary: js.UndefOr[Boolean] = js.native
    
    var isOpen: Boolean = js.native
    
    var mountNode: js.UndefOr[HTMLElement] = js.native
    
    var onBlur: js.UndefOr[js.Function0[_]] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
    
    var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.native
    
    var onEsc: js.UndefOr[js.Function0[_]] = js.native
    
    var onFocus: js.UndefOr[js.Function0[_]] = js.native
    
    var onMouseEnter: js.UndefOr[js.Function0[_]] = js.native
    
    var onMouseEnterDelay: js.UndefOr[Double] = js.native
    
    var onMouseLeave: js.UndefOr[js.Function0[_]] = js.native
    
    var onMouseLeaveDelay: js.UndefOr[Double] = js.native
    
    var overrides: js.UndefOr[PopoverOverrides] = js.native
    
    var placement: js.UndefOr[
        topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ] = js.native
    
    var popoverMargin: js.UndefOr[Double] = js.native
    
    var popperOptions: js.UndefOr[js.Any] = js.native
    
    var renderAll: js.UndefOr[Boolean] = js.native
    
    var returnFocus: js.UndefOr[Boolean] = js.native
    
    var showArrow: js.UndefOr[Boolean] = js.native
    
    var triggerType: js.UndefOr[click | hover] = js.native
  }
  object PropsT {
    
    @scala.inline
    def apply(isOpen: Boolean): PropsT = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsT]
    }
    
    @scala.inline
    implicit class PropsTMutableBuilder[Self <: PropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityType(value: none | menu | tooltip): Self = StObject.set(x, "accessibilityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityTypeUndefined: Self = StObject.set(x, "accessibilityType", js.undefined)
      
      @scala.inline
      def setAnimateOutTime(value: Double): Self = StObject.set(x, "animateOutTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateOutTimeUndefined: Self = StObject.set(x, "animateOutTime", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement | js.Function0[ReactElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction0(value: () => ReactElement): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      @scala.inline
      def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIgnoreBoundary(value: Boolean): Self = StObject.set(x, "ignoreBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreBoundaryUndefined: Self = StObject.set(x, "ignoreBoundary", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      @scala.inline
      def setOnBlur(value: () => _): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ Event => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickOutside(value: /* event */ MouseEvent => _): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnEsc(value: () => _): Self = StObject.set(x, "onEsc", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => _): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: () => _): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseEnterDelay(value: Double): Self = StObject.set(x, "onMouseEnterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseEnterDelayUndefined: Self = StObject.set(x, "onMouseEnterDelay", js.undefined)
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: () => _): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseLeaveDelay(value: Double): Self = StObject.set(x, "onMouseLeaveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseLeaveDelayUndefined: Self = StObject.set(x, "onMouseLeaveDelay", js.undefined)
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOverrides(value: PopoverOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPlacement(
        value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopoverMargin(value: Double): Self = StObject.set(x, "popoverMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverMarginUndefined: Self = StObject.set(x, "popoverMargin", js.undefined)
      
      @scala.inline
      def setPopperOptions(value: js.Any): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
      
      @scala.inline
      def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      @scala.inline
      def setReturnFocus(value: Boolean): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setTriggerType(value: click | hover): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
    }
  }
  
  /* Inlined baseui.baseui/popover.StatefulPopoverProps */
  @js.native
  trait StatefulPropsT extends StObject {
    
    var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
    
    var animateOutTime: js.UndefOr[Double] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var content: js.UndefOr[ReactElement | (js.Function1[/* args */ Close, ReactElement])] = js.native
    
    var `data-baseweb`: js.UndefOr[String] = js.native
    
    var dismissOnClickOutside: js.UndefOr[Boolean] = js.native
    
    var dismissOnEsc: js.UndefOr[Boolean] = js.native
    
    var focusLock: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var ignoreBoundary: js.UndefOr[Boolean] = js.native
    
    var initialState: js.UndefOr[State] = js.native
    
    var mountNode: js.UndefOr[HTMLElement] = js.native
    
    var onClose: js.UndefOr[js.Function0[_]] = js.native
    
    var onMouseEnterDelay: js.UndefOr[Double] = js.native
    
    var onMouseLeaveDelay: js.UndefOr[Double] = js.native
    
    var onOpen: js.UndefOr[js.Function0[_]] = js.native
    
    var overrides: js.UndefOr[PopoverOverrides] = js.native
    
    var placement: js.UndefOr[
        topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ] = js.native
    
    var popoverMargin: js.UndefOr[Double] = js.native
    
    var popperOptions: js.UndefOr[js.Any] = js.native
    
    var renderAll: js.UndefOr[Boolean] = js.native
    
    var returnFocus: js.UndefOr[Boolean] = js.native
    
    var showArrow: js.UndefOr[Boolean] = js.native
    
    var stateReducer: js.UndefOr[StateReducer] = js.native
    
    var triggerType: js.UndefOr[click | hover] = js.native
  }
  object StatefulPropsT {
    
    @scala.inline
    def apply(): StatefulPropsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulPropsT]
    }
    
    @scala.inline
    implicit class StatefulPropsTMutableBuilder[Self <: StatefulPropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityType(value: none | menu | tooltip): Self = StObject.set(x, "accessibilityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityTypeUndefined: Self = StObject.set(x, "accessibilityType", js.undefined)
      
      @scala.inline
      def setAnimateOutTime(value: Double): Self = StObject.set(x, "animateOutTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateOutTimeUndefined: Self = StObject.set(x, "animateOutTime", js.undefined)
      
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
      def setContent(value: ReactElement | (js.Function1[/* args */ Close, ReactElement])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction1(value: /* args */ Close => ReactElement): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      @scala.inline
      def setDismissOnClickOutside(value: Boolean): Self = StObject.set(x, "dismissOnClickOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissOnClickOutsideUndefined: Self = StObject.set(x, "dismissOnClickOutside", js.undefined)
      
      @scala.inline
      def setDismissOnEsc(value: Boolean): Self = StObject.set(x, "dismissOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissOnEscUndefined: Self = StObject.set(x, "dismissOnEsc", js.undefined)
      
      @scala.inline
      def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIgnoreBoundary(value: Boolean): Self = StObject.set(x, "ignoreBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreBoundaryUndefined: Self = StObject.set(x, "ignoreBoundary", js.undefined)
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => _): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnMouseEnterDelay(value: Double): Self = StObject.set(x, "onMouseEnterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseEnterDelayUndefined: Self = StObject.set(x, "onMouseEnterDelay", js.undefined)
      
      @scala.inline
      def setOnMouseLeaveDelay(value: Double): Self = StObject.set(x, "onMouseLeaveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseLeaveDelayUndefined: Self = StObject.set(x, "onMouseLeaveDelay", js.undefined)
      
      @scala.inline
      def setOnOpen(value: () => _): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOverrides(value: PopoverOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPlacement(
        value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopoverMargin(value: Double): Self = StObject.set(x, "popoverMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverMarginUndefined: Self = StObject.set(x, "popoverMargin", js.undefined)
      
      @scala.inline
      def setPopperOptions(value: js.Any): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
      
      @scala.inline
      def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      @scala.inline
      def setReturnFocus(value: Boolean): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setStateReducer(
        value: (/* stateChangeType */ open | close, /* nextState */ State, /* currentState */ State) => State
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
      
      @scala.inline
      def setTriggerType(value: click | hover): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
    }
  }
}
