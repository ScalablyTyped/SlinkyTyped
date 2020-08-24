package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.ol.olMod.Transform
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.renderEventTypeMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/Event", JSImport.Namespace)
@js.native
object renderEventMod extends js.Object {
  @js.native
  trait RenderEvent
    extends typingsSlinky.ol.eventMod.default {
    var context: CanvasRenderingContext2D = js.native
    var frameState: FrameState = js.native
    var inversePixelTransform: Transform = js.native
  }
  
  @js.native
  class default protected () extends RenderEvent {
    def this(`type`: EventType) = this()
    def this(`type`: EventType, opt_inversePixelTransform: Transform) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: js.UndefOr[scala.Nothing],
      opt_frameState: FrameState
    ) = this()
    def this(`type`: EventType, opt_inversePixelTransform: Transform, opt_frameState: FrameState) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: js.UndefOr[scala.Nothing],
      opt_frameState: js.UndefOr[scala.Nothing],
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: js.UndefOr[scala.Nothing],
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: Transform,
      opt_frameState: js.UndefOr[scala.Nothing],
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_inversePixelTransform: Transform,
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D
    ) = this()
  }
  
}

