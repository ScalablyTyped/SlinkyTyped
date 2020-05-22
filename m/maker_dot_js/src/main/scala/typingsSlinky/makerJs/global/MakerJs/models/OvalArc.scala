package typingsSlinky.makerJs.global.MakerJs.models

import typingsSlinky.makerJs.MakerJs.IModelMap
import typingsSlinky.makerJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.OvalArc")
@js.native
class OvalArc protected ()
  extends typingsSlinky.makerJs.MakerJs.models.OvalArc {
  def this(startAngle: Double, endAngle: Double, sweepRadius: Double, slotRadius: Double) = this()
  def this(
    startAngle: Double,
    endAngle: Double,
    sweepRadius: Double,
    slotRadius: Double,
    selfIntersect: Boolean
  ) = this()
  def this(
    startAngle: Double,
    endAngle: Double,
    sweepRadius: Double,
    slotRadius: Double,
    selfIntersect: Boolean,
    isolateCaps: Boolean
  ) = this()
  /* CompleteClass */
  @JSName("models")
  override var models_OvalArc: IModelMap = js.native
  /* CompleteClass */
  @JSName("paths")
  override var paths_OvalArc: IPathMap = js.native
}

