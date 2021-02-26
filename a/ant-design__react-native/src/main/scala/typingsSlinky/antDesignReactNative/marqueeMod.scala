package typingsSlinky.antDesignReactNative

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marqueeMod {
  
  @JSImport("@ant-design/react-native/lib/notice-bar/Marquee", JSImport.Default)
  @js.native
  class default protected () extends Marquee {
    def this(props: MarqueeProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/notice-bar/Marquee", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/notice-bar/Marquee", "default.defaultProps.fps")
      @js.native
      def fps: Double = js.native
      @scala.inline
      def fps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fps")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/notice-bar/Marquee", "default.defaultProps.leading")
      @js.native
      def leading: Double = js.native
      @scala.inline
      def leading_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leading")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/notice-bar/Marquee", "default.defaultProps.loop")
      @js.native
      def loop: Boolean = js.native
      @scala.inline
      def loop_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loop")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/notice-bar/Marquee", "default.defaultProps.maxWidth")
      @js.native
      def maxWidth: Double = js.native
      @scala.inline
      def maxWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/notice-bar/Marquee", "default.defaultProps.text")
      @js.native
      def text: String = js.native
      @scala.inline
      def text_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/notice-bar/Marquee", "default.defaultProps.trailing")
      @js.native
      def trailing: Double = js.native
      @scala.inline
      def trailing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trailing")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Marquee
    extends PureComponent[MarqueeProps, js.Any, js.Any] {
    
    var left: js.Any = js.native
    
    def moveToHeader(): Unit = js.native
    
    def onLayout(e: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
    
    def onLayoutContainer(e: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
    
    def startMove(): Unit = js.native
    
    var texts: js.Any = js.native
    
    def tryStart(): Unit = js.native
  }
  
  @js.native
  trait MarqueeProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var fps: js.UndefOr[Double] = js.native
    
    var leading: js.UndefOr[Double] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var text: js.UndefOr[ReactElement] = js.native
    
    var trailing: js.UndefOr[Double] = js.native
  }
  object MarqueeProps {
    
    @scala.inline
    def apply(): MarqueeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarqueeProps]
    }
    
    @scala.inline
    implicit class MarqueePropsMutableBuilder[Self <: MarqueeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      @scala.inline
      def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextReactElement(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTrailing(value: Double): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
