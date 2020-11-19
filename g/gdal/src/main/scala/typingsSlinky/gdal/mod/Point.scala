package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gdal", "Point")
@js.native
class Point protected () extends Geometry {
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
