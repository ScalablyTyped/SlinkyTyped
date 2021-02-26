package typingsSlinky.reactContentLoader

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-content-loader", JSImport.Default)
  @js.native
  val default: ReactComponentClass[IContentLoaderProps] = js.native
  
  @JSImport("react-content-loader", "BulletList")
  @js.native
  val BulletList: ReactComponentClass[IContentLoaderProps] = js.native
  
  @JSImport("react-content-loader", "Code")
  @js.native
  val Code: ReactComponentClass[IContentLoaderProps] = js.native
  
  @JSImport("react-content-loader", "Facebook")
  @js.native
  val Facebook: ReactComponentClass[IContentLoaderProps] = js.native
  
  @JSImport("react-content-loader", "Instagram")
  @js.native
  val Instagram: ReactComponentClass[IContentLoaderProps] = js.native
  
  @JSImport("react-content-loader", "List")
  @js.native
  val List: ReactComponentClass[IContentLoaderProps] = js.native
  
  @js.native
  trait IContentLoaderProps extends SVGAttributes[SVGElement] {
    
    var animate: js.UndefOr[Boolean] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var backgroundOpacity: js.UndefOr[Double] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var foregroundColor: js.UndefOr[String] = js.native
    
    var foregroundOpacity: js.UndefOr[Double] = js.native
    
    var gradientRatio: js.UndefOr[Double] = js.native
    
    var interval: js.UndefOr[Double] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    @JSName("speed")
    var speed_IContentLoaderProps: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var uniqueKey: js.UndefOr[String] = js.native
  }
  object IContentLoaderProps {
    
    @scala.inline
    def apply(): IContentLoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IContentLoaderProps]
    }
    
    @scala.inline
    implicit class IContentLoaderPropsMutableBuilder[Self <: IContentLoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundOpacity(value: Double): Self = StObject.set(x, "backgroundOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundOpacityUndefined: Self = StObject.set(x, "backgroundOpacity", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
      
      @scala.inline
      def setForegroundOpacity(value: Double): Self = StObject.set(x, "foregroundOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForegroundOpacityUndefined: Self = StObject.set(x, "foregroundOpacity", js.undefined)
      
      @scala.inline
      def setGradientRatio(value: Double): Self = StObject.set(x, "gradientRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientRatioUndefined: Self = StObject.set(x, "gradientRatio", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUniqueKey(value: String): Self = StObject.set(x, "uniqueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueKeyUndefined: Self = StObject.set(x, "uniqueKey", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[IContentLoaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[IContentLoaderProps] = default
}
