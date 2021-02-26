package typingsSlinky.baseui

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.ArrowOffset
import typingsSlinky.baseui.anon.Close
import typingsSlinky.baseui.anon.PopoverPropschildrennever
import typingsSlinky.baseui.anon.SharedStylePropsArgchildrArrowOffset
import typingsSlinky.baseui.baseuiNumbers.`0`
import typingsSlinky.baseui.baseuiNumbers.`20`
import typingsSlinky.baseui.baseuiNumbers.`6`
import typingsSlinky.baseui.baseuiNumbers.`8`
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
import typingsSlinky.baseui.layerMod.NormalizedOffsets
import typingsSlinky.baseui.layerMod.PopperDataObject
import typingsSlinky.react.mod.Component
import typingsSlinky.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @js.native
  trait ACCESSIBILITY_TYPE extends StObject {
    
    var menu: typingsSlinky.baseui.baseuiStrings.menu = js.native
    
    var none: typingsSlinky.baseui.baseuiStrings.none = js.native
    
    var tooltip: typingsSlinky.baseui.baseuiStrings.tooltip = js.native
  }
  object ACCESSIBILITY_TYPE {
    
    @JSImport("baseui/popover", "ACCESSIBILITY_TYPE")
    @js.native
    val ^ : ACCESSIBILITY_TYPE = js.native
    
    @scala.inline
    implicit class ACCESSIBILITY_TYPEMutableBuilder[Self <: ACCESSIBILITY_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMenu(value: menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltip(value: tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/popover", "ANIMATE_IN_TIME")
  @js.native
  val ANIMATE_IN_TIME: typingsSlinky.baseui.popoverMod.ANIMATE_IN_TIME = js.native
  type ANIMATE_IN_TIME = `20`
  
  @JSImport("baseui/popover", "ANIMATE_OUT_TIME")
  @js.native
  val ANIMATE_OUT_TIME: typingsSlinky.baseui.popoverMod.ANIMATE_OUT_TIME = js.native
  type ANIMATE_OUT_TIME = `0`
  
  @JSImport("baseui/popover", "ARROW_SIZE")
  @js.native
  val ARROW_SIZE: `6` = js.native
  
  @JSImport("baseui/popover", "ARROW_WIDTH")
  @js.native
  val ARROW_WIDTH: Double = js.native
  
  @js.native
  trait PLACEMENT extends StObject {
    
    var auto: typingsSlinky.baseui.baseuiStrings.auto = js.native
    
    var bottom: typingsSlinky.baseui.baseuiStrings.bottom = js.native
    
    var bottomLeft: typingsSlinky.baseui.baseuiStrings.bottomLeft = js.native
    
    var bottomRight: typingsSlinky.baseui.baseuiStrings.bottomRight = js.native
    
    var left: typingsSlinky.baseui.baseuiStrings.left = js.native
    
    var leftBottom: typingsSlinky.baseui.baseuiStrings.leftBottom = js.native
    
    var leftTop: typingsSlinky.baseui.baseuiStrings.leftTop = js.native
    
    var right: typingsSlinky.baseui.baseuiStrings.right = js.native
    
    var rightBottom: typingsSlinky.baseui.baseuiStrings.rightBottom = js.native
    
    var rightTop: typingsSlinky.baseui.baseuiStrings.rightTop = js.native
    
    var top: typingsSlinky.baseui.baseuiStrings.top = js.native
    
    var topLeft: typingsSlinky.baseui.baseuiStrings.topLeft = js.native
    
    var topRight: typingsSlinky.baseui.baseuiStrings.topRight = js.native
  }
  object PLACEMENT {
    
    @JSImport("baseui/popover", "PLACEMENT")
    @js.native
    val ^ : PLACEMENT = js.native
    
    @scala.inline
    implicit class PLACEMENTMutableBuilder[Self <: PLACEMENT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto(value: auto): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeft(value: bottomLeft): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRight(value: bottomRight): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftBottom(value: leftBottom): Self = StObject.set(x, "leftBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftTop(value: leftTop): Self = StObject.set(x, "leftTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightBottom(value: rightBottom): Self = StObject.set(x, "rightBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightTop(value: rightTop): Self = StObject.set(x, "rightTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: topLeft): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRight(value: topRight): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/popover", "POPOVER_MARGIN")
  @js.native
  val POPOVER_MARGIN: `8` = js.native
  
  @JSImport("baseui/popover", "Popover")
  @js.native
  class Popover protected ()
    extends Component[PopoverProps, PopoverPrivateState, js.Any] {
    def this(props: PopoverProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PopoverProps, context: js.Any) = this()
    
    def addDomEvents(): Unit = js.native
    
    def animateIn(): Unit = js.native
    
    def animateOut(): Unit = js.native
    
    def clearTimers(): Unit = js.native
    
    def getAnchorFromChildren(): ReactElement = js.native
    
    def getAnchorIdAttr(): String | Null = js.native
    
    def getAnchorProps(): js.Object = js.native
    
    def getDefaultState(props: PopoverProps): ArrowOffset = js.native
    
    def getPopoverBodyProps(): js.Object = js.native
    
    def getPopoverIdAttr(): String | Null = js.native
    
    def getSharedProps(): SharedStylePropsArgchildrArrowOffset = js.native
    
    def init(prevProps: PopoverProps, prevState: PopoverPrivateState): Unit = js.native
    
    def isAccessibilityTypeMenu(): Boolean = js.native
    
    def isAccessibilityTypeTooltip(): Boolean = js.native
    
    def isClickTrigger(): Boolean = js.native
    
    def isHoverTrigger(): Boolean = js.native
    
    def onAnchorClick(e: Event): Unit = js.native
    
    def onAnchorMouseEnter(): Unit = js.native
    
    def onAnchorMouseLeave(): Unit = js.native
    
    def onDocumentClick(evt: MouseEvent): Unit = js.native
    
    def onKeyPress(evt: KeyboardEvent): Unit = js.native
    
    def onPopoverMouseEnter(): Unit = js.native
    
    def onPopoverMouseLeave(): Unit = js.native
    
    def onPopperUpdate(normalizedOffsets: NormalizedOffsets, data: PopperDataObject): Unit = js.native
    
    def removeDomEvents(): Unit = js.native
    
    def renderAnchor(): ReactElement = js.native
    
    def renderPopover(): ReactElement = js.native
    
    def triggerOnMouseEnter(): Unit = js.native
    
    def triggerOnMouseEnterWithDelay(): Unit = js.native
    
    def triggerOnMouseLeave(): Unit = js.native
    
    def triggerOnMouseLeaveWithDelay(): Unit = js.native
  }
  
  @js.native
  trait STATE_CHANGE_TYPE extends StObject {
    
    var close: typingsSlinky.baseui.baseuiStrings.close = js.native
    
    var open: typingsSlinky.baseui.baseuiStrings.open = js.native
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/popover", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    @scala.inline
    implicit class STATE_CHANGE_TYPEMutableBuilder[Self <: STATE_CHANGE_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: close): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: open): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/popover", "StatefulContainer")
  @js.native
  class StatefulContainer protected ()
    extends Component[StatefulPopoverContainerProps, State, js.Any] {
    def this(props: StatefulPopoverContainerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatefulPopoverContainerProps, context: js.Any) = this()
    
    def close(): Unit = js.native
    
    @JSName("internalSetState")
    def internalSetState_close(`type`: close, changes: State): Unit = js.native
    @JSName("internalSetState")
    def internalSetState_open(`type`: open, changes: State): Unit = js.native
    
    def onBlur(): Unit = js.native
    
    def onClick(): Unit = js.native
    
    def onClickOutside(): Unit = js.native
    
    def onContentClose(): Unit = js.native
    
    def onEsc(): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onMouseEnter(): Unit = js.native
    
    def onMouseLeave(): Unit = js.native
    
    def open(): Unit = js.native
  }
  
  @JSImport("baseui/popover", "StatefulPopover")
  @js.native
  val StatefulPopover: ReactComponentClass[StatefulPopoverProps] = js.native
  
  @JSImport("baseui/popover", "StyledArrow")
  @js.native
  val StyledArrow: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/popover", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/popover", "StyledInner")
  @js.native
  val StyledInner: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/popover", "StyledPadding")
  @js.native
  val StyledPadding: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait TRIGGER_TYPE extends StObject {
    
    var click: typingsSlinky.baseui.baseuiStrings.click = js.native
    
    var hover: typingsSlinky.baseui.baseuiStrings.hover = js.native
  }
  object TRIGGER_TYPE {
    
    @JSImport("baseui/popover", "TRIGGER_TYPE")
    @js.native
    val ^ : TRIGGER_TYPE = js.native
    
    @scala.inline
    implicit class TRIGGER_TYPEMutableBuilder[Self <: TRIGGER_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: click): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHover(value: hover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BasePopoverProps extends StObject {
    
    var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
    
    var animateOutTime: js.UndefOr[Double] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var `data-baseweb`: js.UndefOr[String] = js.native
    
    var focusLock: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var ignoreBoundary: js.UndefOr[Boolean] = js.native
    
    var mountNode: js.UndefOr[HTMLElement] = js.native
    
    var onMouseEnterDelay: js.UndefOr[Double] = js.native
    
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
  object BasePopoverProps {
    
    @scala.inline
    def apply(): BasePopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasePopoverProps]
    }
    
    @scala.inline
    implicit class BasePopoverPropsMutableBuilder[Self <: BasePopoverProps] (val x: Self) extends AnyVal {
      
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
      def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      @scala.inline
      def setOnMouseEnterDelay(value: Double): Self = StObject.set(x, "onMouseEnterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseEnterDelayUndefined: Self = StObject.set(x, "onMouseEnterDelay", js.undefined)
      
      @scala.inline
      def setOnMouseLeaveDelay(value: Double): Self = StObject.set(x, "onMouseLeaveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseLeaveDelayUndefined: Self = StObject.set(x, "onMouseLeaveDelay", js.undefined)
      
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
  
  @js.native
  trait Offset extends StObject {
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object Offset {
    
    @scala.inline
    def apply(left: Double, top: Double): Offset = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopoverOverrides extends StObject {
    
    var Arrow: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var Body: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
    
    var Inner: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.native
  }
  object PopoverOverrides {
    
    @scala.inline
    def apply(): PopoverOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverOverrides]
    }
    
    @scala.inline
    implicit class PopoverOverridesMutableBuilder[Self <: PopoverOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrow(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "Arrow", js.undefined)
      
      @scala.inline
      def setBody(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setInner(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Inner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerUndefined: Self = StObject.set(x, "Inner", js.undefined)
    }
  }
  
  @js.native
  trait PopoverPrivateState extends StObject {
    
    var arrowOffset: Offset = js.native
    
    var isAnimating: Boolean = js.native
    
    var isLayerMounted: Boolean = js.native
    
    var isMounted: Boolean = js.native
    
    var placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = js.native
    
    var popoverOffset: Offset = js.native
  }
  object PopoverPrivateState {
    
    @scala.inline
    def apply(
      arrowOffset: Offset,
      isAnimating: Boolean,
      isLayerMounted: Boolean,
      isMounted: Boolean,
      placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top,
      popoverOffset: Offset
    ): PopoverPrivateState = {
      val __obj = js.Dynamic.literal(arrowOffset = arrowOffset.asInstanceOf[js.Any], isAnimating = isAnimating.asInstanceOf[js.Any], isLayerMounted = isLayerMounted.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverPrivateState]
    }
    
    @scala.inline
    implicit class PopoverPrivateStateMutableBuilder[Self <: PopoverPrivateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowOffset(value: Offset): Self = StObject.set(x, "arrowOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAnimating(value: Boolean): Self = StObject.set(x, "isAnimating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLayerMounted(value: Boolean): Self = StObject.set(x, "isLayerMounted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(
        value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverOffset(value: Offset): Self = StObject.set(x, "popoverOffset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined baseui.baseui/popover.BasePopoverProps & {  children :react.react.ReactNode,   content :react.react.ReactNode | (): react.react.ReactNode,   isOpen :boolean,   onBlur :(): any | undefined,   onClick :(e : std.Event): any | undefined,   onClickOutside :(event : std.MouseEvent): any | undefined,   onEsc :(): any | undefined,   onFocus :(): any | undefined,   onMouseEnter :(): any | undefined,   onMouseLeave :(): any | undefined} */
  @js.native
  trait PopoverProps extends StObject {
    
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
  object PopoverProps {
    
    @scala.inline
    def apply(isOpen: Boolean): PopoverProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$arrowOffset")
    var $arrowOffset: js.UndefOr[Offset] = js.native
    
    @JSName("$isAnimating")
    var $isAnimating: js.UndefOr[Boolean] = js.native
    
    @JSName("$isOpen")
    var $isOpen: js.UndefOr[Boolean] = js.native
    
    @JSName("$placement")
    var $placement: js.UndefOr[
        topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ] = js.native
    
    @JSName("$popoverMargin")
    var $popoverMargin: js.UndefOr[Double] = js.native
    
    @JSName("$popoverOffset")
    var $popoverOffset: js.UndefOr[Offset] = js.native
    
    @JSName("$showArrow")
    var $showArrow: js.UndefOr[Boolean] = js.native
  }
  object SharedStylePropsArg {
    
    @scala.inline
    def apply(): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    @scala.inline
    implicit class SharedStylePropsArgMutableBuilder[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$arrowOffset(value: Offset): Self = StObject.set(x, "$arrowOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$arrowOffsetUndefined: Self = StObject.set(x, "$arrowOffset", js.undefined)
      
      @scala.inline
      def set$isAnimating(value: Boolean): Self = StObject.set(x, "$isAnimating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isAnimatingUndefined: Self = StObject.set(x, "$isAnimating", js.undefined)
      
      @scala.inline
      def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isOpenUndefined: Self = StObject.set(x, "$isOpen", js.undefined)
      
      @scala.inline
      def set$placement(
        value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$placementUndefined: Self = StObject.set(x, "$placement", js.undefined)
      
      @scala.inline
      def set$popoverMargin(value: Double): Self = StObject.set(x, "$popoverMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$popoverMarginUndefined: Self = StObject.set(x, "$popoverMargin", js.undefined)
      
      @scala.inline
      def set$popoverOffset(value: Offset): Self = StObject.set(x, "$popoverOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$popoverOffsetUndefined: Self = StObject.set(x, "$popoverOffset", js.undefined)
      
      @scala.inline
      def set$showArrow(value: Boolean): Self = StObject.set(x, "$showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$showArrowUndefined: Self = StObject.set(x, "$showArrow", js.undefined)
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var isOpen: Boolean = js.native
  }
  object State {
    
    @scala.inline
    def apply(isOpen: Boolean): State = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
  
  type StateReducer = js.Function3[
    /* stateChangeType */ open | close, 
    /* nextState */ State, 
    /* currentState */ State, 
    State
  ]
  
  /* Inlined baseui.baseui/popover.StatefulPopoverProps & {children (props : baseui.baseui/popover.PopoverProps & {  children :never}): react.react.ReactNode} */
  @js.native
  trait StatefulPopoverContainerProps extends StObject {
    
    var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
    
    var animateOutTime: js.UndefOr[Double] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    def children(props: PopoverPropschildrennever): ReactElement = js.native
    
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
  
  /* Inlined baseui.baseui/popover.BasePopoverProps & {  children :react.react.ReactNode | undefined,   content :react.react.ReactNode | (args : {close (): void}): react.react.ReactNode | undefined,   dismissOnClickOutside :boolean | undefined,   dismissOnEsc :boolean | undefined,   initialState :baseui.baseui/popover.State | undefined,   onClose :(): any | undefined,   onOpen :(): any | undefined,   stateReducer :baseui.baseui/popover.StateReducer | undefined} */
  @js.native
  trait StatefulPopoverProps extends StObject {
    
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
  object StatefulPopoverProps {
    
    @scala.inline
    def apply(): StatefulPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulPopoverProps]
    }
    
    @scala.inline
    implicit class StatefulPopoverPropsMutableBuilder[Self <: StatefulPopoverProps] (val x: Self) extends AnyVal {
      
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
