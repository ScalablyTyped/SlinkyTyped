package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.FirstInnerQuadrangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "QuaternionSpline")
@js.native
class QuaternionSpline protected () extends js.Object {
  def this(options: FirstInnerQuadrangle) = this()
  
  def evaluate(time: Double): Quaternion = js.native
  def evaluate(time: Double, result: Quaternion): Quaternion = js.native
  
  def findTimeInterval(time: Double): Double = js.native
  
  var innerQuadrangles: js.Array[Quaternion] = js.native
  
  var points: js.Array[Quaternion] = js.native
  
  var times: js.Array[Double] = js.native
}
