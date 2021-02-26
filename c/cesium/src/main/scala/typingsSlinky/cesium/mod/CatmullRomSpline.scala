package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.FirstTangent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CatmullRomSpline")
@js.native
class CatmullRomSpline protected () extends StObject {
  def this(options: FirstTangent) = this()
  
  def evaluate(time: Double): Cartesian3 = js.native
  def evaluate(time: Double, result: Cartesian3): Cartesian3 = js.native
  
  def findTimeInterval(time: Double): Double = js.native
  
  var firstTangent: Cartesian3 = js.native
  
  var lastTangent: Cartesian3 = js.native
  
  var points: js.Array[Cartesian3] = js.native
  
  var times: js.Array[Double] = js.native
}
