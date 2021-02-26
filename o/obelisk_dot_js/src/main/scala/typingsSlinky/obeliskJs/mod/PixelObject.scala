package typingsSlinky.obeliskJs.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "PixelObject")
@js.native
class PixelObject protected () extends StObject {
  def this(primitive: AbstractPrimitive) = this()
  def this(primitive: AbstractPrimitive, point3D: Point3D) = this()
  
  var canvas: HTMLCanvasElement = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
