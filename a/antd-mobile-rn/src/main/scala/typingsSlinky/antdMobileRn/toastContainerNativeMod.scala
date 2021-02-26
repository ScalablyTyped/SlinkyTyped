package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.Duration
import typingsSlinky.antdMobileRn.toastStyleIndexNativeMod.IToastStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.Animated.CompositeAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastContainerNativeMod {
  
  @JSImport("antd-mobile-rn/lib/toast/ToastContainer.native", JSImport.Default)
  @js.native
  class default protected () extends ToastContainer {
    def this(props: ToastProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/toast/ToastContainer.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/toast/ToastContainer.native", "default.defaultProps")
    @js.native
    def defaultProps: Duration = js.native
    @scala.inline
    def defaultProps_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ToastContainer
    extends Component[ToastProps, js.Any, js.Any] {
    
    var anim: CompositeAnimation | Null = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MToastContainer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToastContainer(): Unit = js.native
  }
  
  @js.native
  trait ToastProps extends StObject {
    
    var content: String = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    var onAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var styles: js.UndefOr[IToastStyle] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object ToastProps {
    
    @scala.inline
    def apply(content: String): ToastProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastProps]
    }
    
    @scala.inline
    implicit class ToastPropsMutableBuilder[Self <: ToastProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: () => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setStyles(value: IToastStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
