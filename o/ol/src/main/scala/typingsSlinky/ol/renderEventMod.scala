package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
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
    extends typingsSlinky.ol.eventsEventMod.default {
    var context: CanvasRenderingContext2D = js.native
    var frameState: FrameState = js.native
    var glContext: typingsSlinky.ol.webglContextMod.default = js.native
    var vectorContext: typingsSlinky.ol.renderVectorContextMod.default = js.native
  }
  
  @js.native
  class default protected () extends RenderEvent {
    def this(`type`: EventType) = this()
    def this(`type`: EventType, opt_vectorContext: typingsSlinky.ol.renderVectorContextMod.default) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: typingsSlinky.ol.renderVectorContextMod.default,
      opt_frameState: FrameState
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: typingsSlinky.ol.renderVectorContextMod.default,
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: typingsSlinky.ol.renderVectorContextMod.default,
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D,
      opt_glContext: typingsSlinky.ol.webglContextMod.default
    ) = this()
  }
  
}

