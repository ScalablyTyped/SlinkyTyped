package typingsSlinky.openjscad.global.CSG

import typingsSlinky.openjscad.CSG.IArcOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG.Path2D")
@js.native
class Path2D protected ()
  extends typingsSlinky.openjscad.CSG.Path2D {
  def this(points: js.Array[Double | typingsSlinky.openjscad.CSG.Vector2D]) = this()
  def this(points: js.Array[Double | typingsSlinky.openjscad.CSG.Vector2D], closed: Boolean) = this()
}
/* static members */
@JSGlobal("CSG.Path2D")
@js.native
object Path2D extends js.Object {
  
  def arc(options: IArcOptions): typingsSlinky.openjscad.CSG.Path2D = js.native
}
