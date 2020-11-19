package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olMod.Transform
import typingsSlinky.ol.projMod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/render/canvas/Immediate", JSImport.Namespace)
@js.native
object immediateMod extends js.Object {
  
  @js.native
  trait CanvasImmediateRenderer
    extends typingsSlinky.ol.vectorContextMod.default {
    
    def setTransform(transform: Transform): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasImmediateRenderer {
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: Double
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: js.UndefOr[scala.Nothing],
      opt_userTransform: TransformFunction
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: Double,
      opt_userTransform: TransformFunction
    ) = this()
  }
}
