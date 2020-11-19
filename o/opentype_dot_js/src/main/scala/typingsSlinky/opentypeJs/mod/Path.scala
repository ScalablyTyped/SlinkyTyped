package typingsSlinky.opentypeJs.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentype.js", "Path")
@js.native
class Path () extends js.Object {
  
  def bezierCurveTo(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Unit = js.native
  
  def close(): Unit = js.native
  
  def closePath(): Unit = js.native
  
  var commands: js.Array[PathCommand] = js.native
  
  def curveTo(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Unit = js.native
  
  def draw(ctx: CanvasRenderingContext2D): Unit = js.native
  
  def extend(pathOrCommands: js.Array[PathCommand]): Unit = js.native
  def extend(pathOrCommands: BoundingBox): Unit = js.native
  def extend(pathOrCommands: Path): Unit = js.native
  
  var fill: js.Any = js.native
  
  def getBoundingBox(): BoundingBox = js.native
  
  def lineTo(x: Double, y: Double): Unit = js.native
  
  def moveTo(x: Double, y: Double): Unit = js.native
  
  def quadTo(x1: Double, y1: Double, x: Double, y: Double): Unit = js.native
  
  def quadraticCurveTo(x1: Double, y1: Double, x: Double, y: Double): Unit = js.native
  
  var stroke: js.Any = js.native
  
  var strokeWidth: js.Any = js.native
  
  def toDOMElement(decimalPlaces: Double): SVGPathElement = js.native
  
  def toPathData(decimalPlaces: Double): String = js.native
  
  def toSVG(decimalPlaces: Double): String = js.native
  
  var unitsPerEm: Double = js.native
}
