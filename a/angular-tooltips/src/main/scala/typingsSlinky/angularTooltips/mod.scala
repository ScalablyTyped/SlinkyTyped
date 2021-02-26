package typingsSlinky.angularTooltips

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.angularTooltips.angularTooltipsStrings.`720kbDottooltips`
import typingsSlinky.angularTooltips.angularTooltipsStrings.`bottom left`
import typingsSlinky.angularTooltips.angularTooltipsStrings.`bottom right`
import typingsSlinky.angularTooltips.angularTooltipsStrings.`top left`
import typingsSlinky.angularTooltips.angularTooltipsStrings.`top right`
import typingsSlinky.angularTooltips.angularTooltipsStrings.bottom
import typingsSlinky.angularTooltips.angularTooltipsStrings.fast
import typingsSlinky.angularTooltips.angularTooltipsStrings.large
import typingsSlinky.angularTooltips.angularTooltipsStrings.left
import typingsSlinky.angularTooltips.angularTooltipsStrings.medium
import typingsSlinky.angularTooltips.angularTooltipsStrings.right
import typingsSlinky.angularTooltips.angularTooltipsStrings.slow
import typingsSlinky.angularTooltips.angularTooltipsStrings.small
import typingsSlinky.angularTooltips.angularTooltipsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-tooltips", JSImport.Namespace)
  @js.native
  val ^ : `720kbDottooltips` = js.native
  
  @js.native
  trait TooltipsConfProvider extends StObject {
    
    def configure(options: TooltipsConfProviderOptions): Unit = js.native
  }
  object TooltipsConfProvider {
    
    @scala.inline
    def apply(configure: TooltipsConfProviderOptions => Unit): TooltipsConfProvider = {
      val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
      __obj.asInstanceOf[TooltipsConfProvider]
    }
    
    @scala.inline
    implicit class TooltipsConfProviderMutableBuilder[Self <: TooltipsConfProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigure(value: TooltipsConfProviderOptions => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TooltipsConfProviderOptions extends StObject {
    
    var `class`: js.UndefOr[String] = js.native
    
    var closeButton: js.UndefOr[Boolean] = js.native
    
    var hideTrigger: js.UndefOr[String] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var showTrigger: js.UndefOr[String] = js.native
    
    var side: js.UndefOr[
        left | right | top | bottom | (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`)
      ] = js.native
    
    var size: js.UndefOr[small | medium | large] = js.native
    
    var smart: js.UndefOr[Boolean] = js.native
    
    var speed: js.UndefOr[slow | medium | fast] = js.native
    
    var tooltipTemplateUrlCache: js.UndefOr[Boolean] = js.native
  }
  object TooltipsConfProviderOptions {
    
    @scala.inline
    def apply(): TooltipsConfProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipsConfProviderOptions]
    }
    
    @scala.inline
    implicit class TooltipsConfProviderOptionsMutableBuilder[Self <: TooltipsConfProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      @scala.inline
      def setHideTrigger(value: String): Self = StObject.set(x, "hideTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideTriggerUndefined: Self = StObject.set(x, "hideTrigger", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTrigger(value: String): Self = StObject.set(x, "showTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTriggerUndefined: Self = StObject.set(x, "showTrigger", js.undefined)
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSide(
        value: left | right | top | bottom | (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`)
      ): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
      
      @scala.inline
      def setSpeed(value: slow | medium | fast): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setTooltipTemplateUrlCache(value: Boolean): Self = StObject.set(x, "tooltipTemplateUrlCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTemplateUrlCacheUndefined: Self = StObject.set(x, "tooltipTemplateUrlCache", js.undefined)
    }
  }
  
  type _To = `720kbDottooltips`
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: `720kbDottooltips` = ^
}
