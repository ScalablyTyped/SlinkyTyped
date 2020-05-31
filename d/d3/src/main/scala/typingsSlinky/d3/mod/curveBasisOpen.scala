package typingsSlinky.d3.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.d3Path.mod.Path_
import typingsSlinky.d3Shape.mod.CurveGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "curveBasisOpen")
@js.native
object curveBasisOpen extends js.Object {
  /**
    * Returns a curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  def apply(context: Path_): CurveGenerator = js.native
  /**
    * Returns a curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  def apply(context: CanvasRenderingContext2D): CurveGenerator = js.native
}

