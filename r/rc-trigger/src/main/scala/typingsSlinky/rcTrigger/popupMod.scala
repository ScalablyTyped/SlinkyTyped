package typingsSlinky.rcTrigger

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.rcMotion.cssmotionMod.CSSMotionProps
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.rcTrigger.interfaceMod.AnimationType
import typingsSlinky.rcTrigger.interfaceMod.MobileConfig
import typingsSlinky.rcTrigger.interfaceMod.Point
import typingsSlinky.rcTrigger.interfaceMod.StretchType
import typingsSlinky.rcTrigger.interfaceMod.TransitionNameType
import typingsSlinky.rcTrigger.popupInnerMod.PopupInnerRef
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.TouchEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod extends Shortcut {
  
  @JSImport("rc-trigger/es/Popup", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PopupProps with RefAttributes[PopupInnerRef]] = js.native
  
  @js.native
  trait PopupProps extends StObject {
    
    var align: js.UndefOr[AlignType] = js.native
    
    var animation: AnimationType = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
    
    var getClassNameFromAlign: js.UndefOr[js.Function1[/* align */ AlignType, String]] = js.native
    
    var getRootDomNode: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    var maskAnimation: AnimationType = js.native
    
    var maskMotion: CSSMotionProps = js.native
    
    var maskTransitionName: TransitionNameType = js.native
    
    var mobile: js.UndefOr[MobileConfig] = js.native
    
    var motion: CSSMotionProps = js.native
    
    var onAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
    
    var point: js.UndefOr[Point] = js.native
    
    var prefixCls: String = js.native
    
    var stretch: js.UndefOr[StretchType] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transitionName: TransitionNameType = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object PopupProps {
    
    @scala.inline
    def apply(
      animation: AnimationType,
      maskAnimation: AnimationType,
      maskMotion: CSSMotionProps,
      maskTransitionName: TransitionNameType,
      motion: CSSMotionProps,
      prefixCls: String,
      transitionName: TransitionNameType
    ): PopupProps = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], maskAnimation = maskAnimation.asInstanceOf[js.Any], maskMotion = maskMotion.asInstanceOf[js.Any], maskTransitionName = maskTransitionName.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupProps]
    }
    
    @scala.inline
    implicit class PopupPropsMutableBuilder[Self <: PopupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
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
      def setDestroyPopupOnHide(value: Boolean): Self = StObject.set(x, "destroyPopupOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyPopupOnHideUndefined: Self = StObject.set(x, "destroyPopupOnHide", js.undefined)
      
      @scala.inline
      def setGetClassNameFromAlign(value: /* align */ AlignType => String): Self = StObject.set(x, "getClassNameFromAlign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetClassNameFromAlignUndefined: Self = StObject.set(x, "getClassNameFromAlign", js.undefined)
      
      @scala.inline
      def setGetRootDomNode(value: () => HTMLElement): Self = StObject.set(x, "getRootDomNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRootDomNodeUndefined: Self = StObject.set(x, "getRootDomNode", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskAnimation(value: AnimationType): Self = StObject.set(x, "maskAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskMotion(value: CSSMotionProps): Self = StObject.set(x, "maskMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionName(value: TransitionNameType): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMobile(value: MobileConfig): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      @scala.inline
      def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = StObject.set(x, "onAlign", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAlignUndefined: Self = StObject.set(x, "onAlign", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretch(value: StretchType): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionName(value: TransitionNameType): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PopupProps with RefAttributes[PopupInnerRef]]
  
  /* This means you don't have to write `default`, but can instead just say `popupMod.foo` */
  override def _to: ForwardRefExoticComponent[PopupProps with RefAttributes[PopupInnerRef]] = default
}
