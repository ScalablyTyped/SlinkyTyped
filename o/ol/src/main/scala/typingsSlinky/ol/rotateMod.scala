package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateMod {
  
  @JSImport("ol/control/Rotate", JSImport.Default)
  @js.native
  class default () extends Rotate {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var autoHide: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var label: js.UndefOr[String | HTMLElement] = js.native
    
    var render: js.UndefOr[js.Function1[/* p0 */ typingsSlinky.ol.mapEventMod.default, Unit]] = js.native
    
    var resetNorth: js.UndefOr[js.Function0[Unit]] = js.native
    
    var target: js.UndefOr[HTMLElement | String] = js.native
    
    var tipLabel: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setLabel(value: String | HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHTMLElement(value: HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRender(value: /* p0 */ typingsSlinky.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setResetNorth(value: () => Unit): Self = StObject.set(x, "resetNorth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetNorthUndefined: Self = StObject.set(x, "resetNorth", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetHTMLElement(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
  
  @js.native
  trait Rotate
    extends typingsSlinky.ol.controlControlMod.default
}
