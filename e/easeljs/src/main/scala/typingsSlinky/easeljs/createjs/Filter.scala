package typingsSlinky.easeljs.createjs

import org.scalajs.dom.raw.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Filter")
@js.native
class Filter () extends js.Object {
  // methods
  def applyFilter(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double): Boolean = js.native
  def applyFilter(
    ctx: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    targetCtx: CanvasRenderingContext2D
  ): Boolean = js.native
  def applyFilter(
    ctx: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    targetCtx: CanvasRenderingContext2D,
    targetX: Double
  ): Boolean = js.native
  def applyFilter(
    ctx: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    targetCtx: CanvasRenderingContext2D,
    targetX: Double,
    targetY: Double
  ): Boolean = js.native
  def getBounds(): Rectangle = js.native
}

