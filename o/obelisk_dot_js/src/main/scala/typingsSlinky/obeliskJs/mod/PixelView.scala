package typingsSlinky.obeliskJs.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "PixelView")
@js.native
class PixelView protected () extends js.Object {
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, point: Point) = this()
  
  var canvas: HTMLCanvasElement = js.native
  
  def clear(): Unit = js.native
  
  var context: CanvasRenderingContext2D = js.native
  
  var point: Point = js.native
  
  def renderObject(primitive: AbstractPrimitive): Unit = js.native
  def renderObject(primitive: AbstractPrimitive, point3D: Point3D): Unit = js.native
}
