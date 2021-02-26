package typingsSlinky.rcMotion

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.rcMotion.anon.Appear
import typingsSlinky.rcMotion.anon.CSSMotionPropsrefRefanyun
import typingsSlinky.rcMotion.anon.Dictkey
import typingsSlinky.rcMotion.anon.ForwardRef
import typingsSlinky.rcMotion.interfaceMod.MotionEndEventHandler
import typingsSlinky.rcMotion.interfaceMod.MotionEvent
import typingsSlinky.rcMotion.interfaceMod.MotionEventHandler
import typingsSlinky.rcMotion.interfaceMod.MotionPrepareEventHandler
import typingsSlinky.rcMotion.interfaceMod.MotionStatus
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssmotionMod extends Shortcut {
  
  @JSImport("rc-motion/es/CSSMotion", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CSSMotionPropsrefRefanyun] = js.native
  
  @JSImport("rc-motion/es/CSSMotion", "genCSSMotion")
  @js.native
  def genCSSMotion(config: CSSMotionConfig): ForwardRefExoticComponent[CSSMotionPropsrefRefanyun] = js.native
  
  type CSSMotionConfig = Boolean | ForwardRef
  
  @js.native
  trait CSSMotionProps extends StObject {
    
    var children: js.UndefOr[
        js.Function2[/* props */ Dictkey, /* ref */ js.Function1[/* node */ js.Any, Unit], ReactElement]
      ] = js.native
    
    /** @private Used by CSSMotionList. Do not use in your production. */
    var eventProps: js.UndefOr[js.Object] = js.native
    
    /**
      * Create element in view even the element is invisible.
      * Will patch `display: none` style on it.
      */
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var internalRef: js.UndefOr[Ref[_]] = js.native
    
    var leavedClassName: js.UndefOr[String] = js.native
    
    var motionAppear: js.UndefOr[Boolean] = js.native
    
    var motionDeadline: js.UndefOr[Double] = js.native
    
    var motionEnter: js.UndefOr[Boolean] = js.native
    
    var motionLeave: js.UndefOr[Boolean] = js.native
    
    var motionLeaveImmediately: js.UndefOr[Boolean] = js.native
    
    var motionName: js.UndefOr[MotionName] = js.native
    
    var onAppearActive: js.UndefOr[MotionEventHandler] = js.native
    
    var onAppearEnd: js.UndefOr[MotionEndEventHandler] = js.native
    
    var onAppearPrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
    
    var onAppearStart: js.UndefOr[MotionEventHandler] = js.native
    
    var onEnterActive: js.UndefOr[MotionEventHandler] = js.native
    
    var onEnterEnd: js.UndefOr[MotionEndEventHandler] = js.native
    
    var onEnterPrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
    
    var onEnterStart: js.UndefOr[MotionEventHandler] = js.native
    
    var onLeaveActive: js.UndefOr[MotionEventHandler] = js.native
    
    var onLeaveEnd: js.UndefOr[MotionEndEventHandler] = js.native
    
    var onLeavePrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
    
    var onLeaveStart: js.UndefOr[MotionEventHandler] = js.native
    
    /** This will always trigger after final visible changed. Even if no motion configured. */
    var onVisibleChanged: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    /**
      * Remove element when motion end. This will not work when `forceRender` is set.
      */
    var removeOnLeave: js.UndefOr[Boolean] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object CSSMotionProps {
    
    @scala.inline
    def apply(): CSSMotionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSMotionProps]
    }
    
    @scala.inline
    implicit class CSSMotionPropsMutableBuilder[Self <: CSSMotionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (/* props */ Dictkey, /* ref */ js.Function1[/* node */ js.Any, Unit]) => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setEventProps(value: js.Object): Self = StObject.set(x, "eventProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPropsUndefined: Self = StObject.set(x, "eventProps", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setInternalRef(value: Ref[_]): Self = StObject.set(x, "internalRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "internalRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInternalRefNull: Self = StObject.set(x, "internalRef", null)
      
      @scala.inline
      def setInternalRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "internalRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalRefUndefined: Self = StObject.set(x, "internalRef", js.undefined)
      
      @scala.inline
      def setLeavedClassName(value: String): Self = StObject.set(x, "leavedClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeavedClassNameUndefined: Self = StObject.set(x, "leavedClassName", js.undefined)
      
      @scala.inline
      def setMotionAppear(value: Boolean): Self = StObject.set(x, "motionAppear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionAppearUndefined: Self = StObject.set(x, "motionAppear", js.undefined)
      
      @scala.inline
      def setMotionDeadline(value: Double): Self = StObject.set(x, "motionDeadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionDeadlineUndefined: Self = StObject.set(x, "motionDeadline", js.undefined)
      
      @scala.inline
      def setMotionEnter(value: Boolean): Self = StObject.set(x, "motionEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionEnterUndefined: Self = StObject.set(x, "motionEnter", js.undefined)
      
      @scala.inline
      def setMotionLeave(value: Boolean): Self = StObject.set(x, "motionLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionLeaveImmediately(value: Boolean): Self = StObject.set(x, "motionLeaveImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionLeaveImmediatelyUndefined: Self = StObject.set(x, "motionLeaveImmediately", js.undefined)
      
      @scala.inline
      def setMotionLeaveUndefined: Self = StObject.set(x, "motionLeave", js.undefined)
      
      @scala.inline
      def setMotionName(value: MotionName): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionNameUndefined: Self = StObject.set(x, "motionName", js.undefined)
      
      @scala.inline
      def setOnAppearActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onAppearActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAppearActiveUndefined: Self = StObject.set(x, "onAppearActive", js.undefined)
      
      @scala.inline
      def setOnAppearEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onAppearEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAppearEndUndefined: Self = StObject.set(x, "onAppearEnd", js.undefined)
      
      @scala.inline
      def setOnAppearPrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): Self = StObject.set(x, "onAppearPrepare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAppearPrepareUndefined: Self = StObject.set(x, "onAppearPrepare", js.undefined)
      
      @scala.inline
      def setOnAppearStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onAppearStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAppearStartUndefined: Self = StObject.set(x, "onAppearStart", js.undefined)
      
      @scala.inline
      def setOnEnterActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onEnterActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterActiveUndefined: Self = StObject.set(x, "onEnterActive", js.undefined)
      
      @scala.inline
      def setOnEnterEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onEnterEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterEndUndefined: Self = StObject.set(x, "onEnterEnd", js.undefined)
      
      @scala.inline
      def setOnEnterPrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): Self = StObject.set(x, "onEnterPrepare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnterPrepareUndefined: Self = StObject.set(x, "onEnterPrepare", js.undefined)
      
      @scala.inline
      def setOnEnterStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onEnterStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterStartUndefined: Self = StObject.set(x, "onEnterStart", js.undefined)
      
      @scala.inline
      def setOnLeaveActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onLeaveActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLeaveActiveUndefined: Self = StObject.set(x, "onLeaveActive", js.undefined)
      
      @scala.inline
      def setOnLeaveEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onLeaveEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLeaveEndUndefined: Self = StObject.set(x, "onLeaveEnd", js.undefined)
      
      @scala.inline
      def setOnLeavePrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): Self = StObject.set(x, "onLeavePrepare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLeavePrepareUndefined: Self = StObject.set(x, "onLeavePrepare", js.undefined)
      
      @scala.inline
      def setOnLeaveStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onLeaveStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLeaveStartUndefined: Self = StObject.set(x, "onLeaveStart", js.undefined)
      
      @scala.inline
      def setOnVisibleChanged(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangedUndefined: Self = StObject.set(x, "onVisibleChanged", js.undefined)
      
      @scala.inline
      def setRemoveOnLeave(value: Boolean): Self = StObject.set(x, "removeOnLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOnLeaveUndefined: Self = StObject.set(x, "removeOnLeave", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait CSSMotionState extends StObject {
    
    var newStatus: js.UndefOr[Boolean] = js.native
    
    var prevProps: js.UndefOr[CSSMotionProps] = js.native
    
    var status: js.UndefOr[MotionStatus] = js.native
    
    var statusActive: js.UndefOr[Boolean] = js.native
    
    var statusStyle: js.UndefOr[CSSProperties] = js.native
  }
  object CSSMotionState {
    
    @scala.inline
    def apply(): CSSMotionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSMotionState]
    }
    
    @scala.inline
    implicit class CSSMotionStateMutableBuilder[Self <: CSSMotionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewStatus(value: Boolean): Self = StObject.set(x, "newStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewStatusUndefined: Self = StObject.set(x, "newStatus", js.undefined)
      
      @scala.inline
      def setPrevProps(value: CSSMotionProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
      
      @scala.inline
      def setStatus(value: MotionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusActive(value: Boolean): Self = StObject.set(x, "statusActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusActiveUndefined: Self = StObject.set(x, "statusActive", js.undefined)
      
      @scala.inline
      def setStatusStyle(value: CSSProperties): Self = StObject.set(x, "statusStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusStyleUndefined: Self = StObject.set(x, "statusStyle", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type MotionName = String | Appear
  
  type _To = ForwardRefExoticComponent[CSSMotionPropsrefRefanyun]
  
  /* This means you don't have to write `default`, but can instead just say `cssmotionMod.foo` */
  override def _to: ForwardRefExoticComponent[CSSMotionPropsrefRefanyun] = default
}
