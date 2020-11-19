package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Ray")
@js.native
class Ray () extends js.Object {
  def this(options: RayOptions) = this()
  
  def callback(result: RaycastResult): Unit = js.native
  
  var checkCollisionResponse: Boolean = js.native
  
  var collisionGroup: Double = js.native
  
  var collisionMask: Double = js.native
  
  var direction: js.Tuple2[Double, Double] = js.native
  
  var from: js.Tuple2[Double, Double] = js.native
  
  def getAABB(): AABB = js.native
  
  def intersectBodies(result: RaycastResult, bodies: js.Array[Body]): Unit = js.native
  
  var length: Double = js.native
  
  var mode: Double = js.native
  
  var skipBackfaces: Boolean = js.native
  
  var to: js.Tuple2[Double, Double] = js.native
  
  def update(): Unit = js.native
}
/* static members */
@JSImport("p2", "Ray")
@js.native
object Ray extends js.Object {
  
  var ALL: Double = js.native
  
  var ANY: Double = js.native
  
  var CLOSEST: Double = js.native
}
