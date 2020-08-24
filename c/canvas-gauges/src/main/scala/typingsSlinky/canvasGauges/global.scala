package typingsSlinky.canvasGauges

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.canvasGauges.CanvasGauges.AnimationRule
import typingsSlinky.canvasGauges.CanvasGauges.DrawEventCallback
import typingsSlinky.canvasGauges.CanvasGauges.EndEventCallback
import typingsSlinky.canvasGauges.CanvasGauges.LinearGaugeOptions
import typingsSlinky.canvasGauges.CanvasGauges.RadialGaugeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object CanvasGauges extends js.Object {
    @js.native
    class Animation ()
      extends typingsSlinky.canvasGauges.CanvasGauges.Animation {
      def this(rule: String) = this()
      def this(rule: AnimationRule) = this()
      def this(rule: js.UndefOr[scala.Nothing], duration: Double) = this()
      def this(rule: String, duration: Double) = this()
      def this(rule: AnimationRule, duration: Double) = this()
      def this(rule: js.UndefOr[scala.Nothing], duration: js.UndefOr[scala.Nothing], draw: DrawEventCallback) = this()
      def this(rule: js.UndefOr[scala.Nothing], duration: Double, draw: DrawEventCallback) = this()
      def this(rule: String, duration: js.UndefOr[scala.Nothing], draw: DrawEventCallback) = this()
      def this(rule: String, duration: Double, draw: DrawEventCallback) = this()
      def this(rule: AnimationRule, duration: js.UndefOr[scala.Nothing], draw: DrawEventCallback) = this()
      def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback) = this()
      def this(
        rule: js.UndefOr[scala.Nothing],
        duration: js.UndefOr[scala.Nothing],
        draw: js.UndefOr[scala.Nothing],
        end: EndEventCallback
      ) = this()
      def this(
        rule: js.UndefOr[scala.Nothing],
        duration: js.UndefOr[scala.Nothing],
        draw: DrawEventCallback,
        end: EndEventCallback
      ) = this()
      def this(
        rule: js.UndefOr[scala.Nothing],
        duration: Double,
        draw: js.UndefOr[scala.Nothing],
        end: EndEventCallback
      ) = this()
      def this(rule: js.UndefOr[scala.Nothing], duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
      def this(
        rule: String,
        duration: js.UndefOr[scala.Nothing],
        draw: js.UndefOr[scala.Nothing],
        end: EndEventCallback
      ) = this()
      def this(rule: String, duration: js.UndefOr[scala.Nothing], draw: DrawEventCallback, end: EndEventCallback) = this()
      def this(rule: String, duration: Double, draw: js.UndefOr[scala.Nothing], end: EndEventCallback) = this()
      def this(rule: String, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
      def this(
        rule: AnimationRule,
        duration: js.UndefOr[scala.Nothing],
        draw: js.UndefOr[scala.Nothing],
        end: EndEventCallback
      ) = this()
      def this(
        rule: AnimationRule,
        duration: js.UndefOr[scala.Nothing],
        draw: DrawEventCallback,
        end: EndEventCallback
      ) = this()
      def this(rule: AnimationRule, duration: Double, draw: js.UndefOr[scala.Nothing], end: EndEventCallback) = this()
      def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
    }
    
    @js.native
    abstract class BaseGauge protected ()
      extends typingsSlinky.canvasGauges.CanvasGauges.BaseGauge {
      def this(options: typingsSlinky.canvasGauges.CanvasGauges.GenericOptions) = this()
    }
    
    @js.native
    class DomObserver protected ()
      extends typingsSlinky.canvasGauges.CanvasGauges.DomObserver {
      def this(options: typingsSlinky.canvasGauges.CanvasGauges.GenericOptions, element: String, `type`: String) = this()
    }
    
    @js.native
    class LinearGauge protected ()
      extends typingsSlinky.canvasGauges.CanvasGauges.LinearGauge {
      def this(options: LinearGaugeOptions) = this()
    }
    
    @js.native
    class RadialGauge protected ()
      extends typingsSlinky.canvasGauges.CanvasGauges.RadialGauge {
      def this(options: RadialGaugeOptions) = this()
    }
    
    @js.native
    class SmartCanvas protected ()
      extends typingsSlinky.canvasGauges.CanvasGauges.SmartCanvas {
      def this(element: HTMLCanvasElement) = this()
      def this(element: HTMLCanvasElement, width: Double) = this()
      def this(element: HTMLCanvasElement, width: js.UndefOr[scala.Nothing], height: Double) = this()
      def this(element: HTMLCanvasElement, width: Double, height: Double) = this()
    }
    
    val GenericOptions: typingsSlinky.canvasGauges.CanvasGauges.GenericOptions = js.native
    /* static members */
    @js.native
    object Animation extends js.Object {
      var rules: typingsSlinky.canvasGauges.CanvasGauges.rules = js.native
    }
    
    /* static members */
    @js.native
    object BaseGauge extends js.Object {
      val version: Double = js.native
      def ensureValue(value: Double): Double = js.native
      def fromElement(element: HTMLElement): js.Any = js.native
      def initialize(`type`: String, options: typingsSlinky.canvasGauges.CanvasGauges.GenericOptions): js.Any = js.native
    }
    
    /* static members */
    @js.native
    object DomObserver extends js.Object {
      def domReady(handler: js.Function): js.Any = js.native
      def parse(value: js.Any): js.Any = js.native
      def toAttributeName(str: String): String = js.native
      def toDashed(camelCase: String): String = js.native
    }
    
    /* static members */
    @js.native
    object SmartCanvas extends js.Object {
      var collection: js.Array[typingsSlinky.canvasGauges.CanvasGauges.SmartCanvas] = js.native
      def redraw(): js.Any = js.native
    }
    
  }
  
}

