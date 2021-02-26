package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.AdjustY
import typingsSlinky.antd.colorsMod.PresetColorType
import typingsSlinky.antd.placementsMod.AdjustOverflow
import typingsSlinky.antd.typeMod.LiteralUnion
import typingsSlinky.rcTooltip.anon.KeepParent
import typingsSlinky.rcTrigger.interfaceMod.ActionType
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.rcTrigger.interfaceMod.AnimationType
import typingsSlinky.rcTrigger.interfaceMod.BuildInPlacements
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod extends Shortcut {
  
  @JSImport("antd/lib/tooltip", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[
    (TooltipPropsWithOverlay with RefAttributes[_]) | (TooltipPropsWithTitle with RefAttributes[_])
  ] = js.native
  
  /* Inlined parent std.Partial<std.Omit<rc-tooltip.rc-tooltip/es/Tooltip.TooltipProps, 'children'>> */
  @js.native
  trait AbstractTooltipProps extends StObject {
    
    var afterVisibleChange: js.UndefOr[js.Function0[Unit]] = js.native
    
    var align: js.UndefOr[AlignType] = js.native
    
    var animation: js.UndefOr[AnimationType] = js.native
    
    var arrowContent: js.UndefOr[ReactElement] = js.native
    
    var arrowPointAtCenter: js.UndefOr[Boolean] = js.native
    
    var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[LiteralUnion[PresetColorType, String]] = js.native
    
    var defaultVisible: js.UndefOr[Boolean] = js.native
    
    var destroyTooltipOnHide: js.UndefOr[Boolean | KeepParent] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    
    var getTooltipContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var mouseEnterDelay: js.UndefOr[Double] = js.native
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.native
    
    var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.native
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var openClassName: js.UndefOr[String] = js.native
    
    var overlay: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.native
    
    var overlayClassName: js.UndefOr[String] = js.native
    
    var overlayInnerStyle: js.UndefOr[CSSProperties] = js.native
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.native
    
    var placement: js.UndefOr[TooltipPlacement] = js.native
    
    var popupVisible: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var trigger: js.UndefOr[ActionType | js.Array[ActionType]] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object AbstractTooltipProps {
    
    @scala.inline
    def apply(): AbstractTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractTooltipProps]
    }
    
    @scala.inline
    implicit class AbstractTooltipPropsMutableBuilder[Self <: AbstractTooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterVisibleChange(value: () => Unit): Self = StObject.set(x, "afterVisibleChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterVisibleChangeUndefined: Self = StObject.set(x, "afterVisibleChange", js.undefined)
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setArrowContent(value: ReactElement): Self = StObject.set(x, "arrowContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowContentReactElement(value: ReactElement): Self = StObject.set(x, "arrowContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowContentUndefined: Self = StObject.set(x, "arrowContent", js.undefined)
      
      @scala.inline
      def setArrowPointAtCenter(value: Boolean): Self = StObject.set(x, "arrowPointAtCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowPointAtCenterUndefined: Self = StObject.set(x, "arrowPointAtCenter", js.undefined)
      
      @scala.inline
      def setAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = StObject.set(x, "autoAdjustOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustOverflowUndefined: Self = StObject.set(x, "autoAdjustOverflow", js.undefined)
      
      @scala.inline
      def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: LiteralUnion[PresetColorType, String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVisibleUndefined: Self = StObject.set(x, "defaultVisible", js.undefined)
      
      @scala.inline
      def setDestroyTooltipOnHide(value: Boolean | KeepParent): Self = StObject.set(x, "destroyTooltipOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyTooltipOnHideUndefined: Self = StObject.set(x, "destroyTooltipOnHide", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setGetTooltipContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getTooltipContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTooltipContainerUndefined: Self = StObject.set(x, "getTooltipContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      @scala.inline
      def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      @scala.inline
      def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = StObject.set(x, "onPopupAlign", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
      
      @scala.inline
      def setOverlay(value: js.Function0[ReactElement] | ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayInnerStyle(value: CSSProperties): Self = StObject.set(x, "overlayInnerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayInnerStyleUndefined: Self = StObject.set(x, "overlayInnerStyle", js.undefined)
      
      @scala.inline
      def setOverlayReactElement(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPlacement(value: TooltipPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTrigger(value: ActionType | js.Array[ActionType]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setTriggerVarargs(value: ActionType*): Self = StObject.set(x, "trigger", js.Array(value :_*))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type RenderFunction = js.Function0[ReactElement]
  
  @js.native
  trait TooltipAlignConfig extends StObject {
    
    var offset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
    
    var overflow: js.UndefOr[AdjustY] = js.native
    
    var points: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var targetOffset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
    
    var useCssBottom: js.UndefOr[Boolean] = js.native
    
    var useCssRight: js.UndefOr[Boolean] = js.native
    
    var useCssTransform: js.UndefOr[Boolean] = js.native
  }
  object TooltipAlignConfig {
    
    @scala.inline
    def apply(): TooltipAlignConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipAlignConfig]
    }
    
    @scala.inline
    implicit class TooltipAlignConfigMutableBuilder[Self <: TooltipAlignConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOverflow(value: AdjustY): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPoints(value: js.Tuple2[String, String]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setTargetOffset(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
      
      @scala.inline
      def setUseCssBottom(value: Boolean): Self = StObject.set(x, "useCssBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssBottomUndefined: Self = StObject.set(x, "useCssBottom", js.undefined)
      
      @scala.inline
      def setUseCssRight(value: Boolean): Self = StObject.set(x, "useCssRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssRightUndefined: Self = StObject.set(x, "useCssRight", js.undefined)
      
      @scala.inline
      def setUseCssTransform(value: Boolean): Self = StObject.set(x, "useCssTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssTransformUndefined: Self = StObject.set(x, "useCssTransform", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.top
    - typingsSlinky.antd.antdStrings.left
    - typingsSlinky.antd.antdStrings.right
    - typingsSlinky.antd.antdStrings.bottom
    - typingsSlinky.antd.antdStrings.topLeft
    - typingsSlinky.antd.antdStrings.topRight
    - typingsSlinky.antd.antdStrings.bottomLeft
    - typingsSlinky.antd.antdStrings.bottomRight
    - typingsSlinky.antd.antdStrings.leftTop
    - typingsSlinky.antd.antdStrings.leftBottom
    - typingsSlinky.antd.antdStrings.rightTop
    - typingsSlinky.antd.antdStrings.rightBottom
  */
  trait TooltipPlacement extends StObject
  object TooltipPlacement {
    
    @scala.inline
    def bottom: typingsSlinky.antd.antdStrings.bottom = "bottom".asInstanceOf[typingsSlinky.antd.antdStrings.bottom]
    
    @scala.inline
    def bottomLeft: typingsSlinky.antd.antdStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsSlinky.antd.antdStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: typingsSlinky.antd.antdStrings.bottomRight = "bottomRight".asInstanceOf[typingsSlinky.antd.antdStrings.bottomRight]
    
    @scala.inline
    def left: typingsSlinky.antd.antdStrings.left = "left".asInstanceOf[typingsSlinky.antd.antdStrings.left]
    
    @scala.inline
    def leftBottom: typingsSlinky.antd.antdStrings.leftBottom = "leftBottom".asInstanceOf[typingsSlinky.antd.antdStrings.leftBottom]
    
    @scala.inline
    def leftTop: typingsSlinky.antd.antdStrings.leftTop = "leftTop".asInstanceOf[typingsSlinky.antd.antdStrings.leftTop]
    
    @scala.inline
    def right: typingsSlinky.antd.antdStrings.right = "right".asInstanceOf[typingsSlinky.antd.antdStrings.right]
    
    @scala.inline
    def rightBottom: typingsSlinky.antd.antdStrings.rightBottom = "rightBottom".asInstanceOf[typingsSlinky.antd.antdStrings.rightBottom]
    
    @scala.inline
    def rightTop: typingsSlinky.antd.antdStrings.rightTop = "rightTop".asInstanceOf[typingsSlinky.antd.antdStrings.rightTop]
    
    @scala.inline
    def top: typingsSlinky.antd.antdStrings.top = "top".asInstanceOf[typingsSlinky.antd.antdStrings.top]
    
    @scala.inline
    def topLeft: typingsSlinky.antd.antdStrings.topLeft = "topLeft".asInstanceOf[typingsSlinky.antd.antdStrings.topLeft]
    
    @scala.inline
    def topRight: typingsSlinky.antd.antdStrings.topRight = "topRight".asInstanceOf[typingsSlinky.antd.antdStrings.topRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.tooltipMod.TooltipPropsWithTitle
    - typingsSlinky.antd.tooltipMod.TooltipPropsWithOverlay
  */
  trait TooltipProps extends StObject
  object TooltipProps {
    
    @scala.inline
    def TooltipPropsWithOverlay(): typingsSlinky.antd.tooltipMod.TooltipPropsWithOverlay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.antd.tooltipMod.TooltipPropsWithOverlay]
    }
    
    @scala.inline
    def TooltipPropsWithTitle(): typingsSlinky.antd.tooltipMod.TooltipPropsWithTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.antd.tooltipMod.TooltipPropsWithTitle]
    }
  }
  
  @js.native
  trait TooltipPropsWithOverlay
    extends AbstractTooltipProps
       with TooltipProps {
    
    @JSName("overlay")
    var overlay_TooltipPropsWithOverlay: ReactElement | RenderFunction = js.native
    
    var title: js.UndefOr[ReactElement | RenderFunction] = js.native
  }
  object TooltipPropsWithOverlay {
    
    @scala.inline
    def apply(): TooltipPropsWithOverlay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipPropsWithOverlay]
    }
    
    @scala.inline
    implicit class TooltipPropsWithOverlayMutableBuilder[Self <: TooltipPropsWithOverlay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverlay(value: ReactElement | RenderFunction): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayReactElement(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait TooltipPropsWithTitle
    extends AbstractTooltipProps
       with TooltipProps {
    
    @JSName("overlay")
    var overlay_TooltipPropsWithTitle: js.UndefOr[ReactElement | RenderFunction] = js.native
    
    var title: ReactElement | RenderFunction = js.native
  }
  object TooltipPropsWithTitle {
    
    @scala.inline
    def apply(): TooltipPropsWithTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipPropsWithTitle]
    }
    
    @scala.inline
    implicit class TooltipPropsWithTitleMutableBuilder[Self <: TooltipPropsWithTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverlay(value: ReactElement | RenderFunction): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayReactElement(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[
    (TooltipPropsWithOverlay with RefAttributes[_]) | (TooltipPropsWithTitle with RefAttributes[_])
  ]
  
  /* This means you don't have to write `default`, but can instead just say `tooltipMod.foo` */
  override def _to: ForwardRefExoticComponent[
    (TooltipPropsWithOverlay with RefAttributes[_]) | (TooltipPropsWithTitle with RefAttributes[_])
  ] = default
}
