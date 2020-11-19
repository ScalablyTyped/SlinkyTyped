package typingsSlinky.geodesy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geodesy/vector3d", JSImport.Namespace)
@js.native
object vector3dMod extends js.Object {
  
  @js.native
  trait Vector3d extends js.Object {
    
    def angleTo(v: Vector3d): Double = js.native
    def angleTo(v: Vector3d, n: Vector3d): Double = js.native
    
    def cross(v: Vector3d): Vector3d = js.native
    
    def dividedBy(x: Double): Vector3d = js.native
    
    def dot(v: Vector3d): Double = js.native
    
    def length: Double = js.native
    
    def minus(v: Vector3d): Vector3d = js.native
    
    def negate(): Vector3d = js.native
    
    def plus(v: Vector3d): Vector3d = js.native
    
    def rotateAround(axis: Vector3d, angle: Double): Vector3d = js.native
    
    def times(x: Double): Vector3d = js.native
    
    def toString(dp: Double): String = js.native
    
    def unit(): Vector3d = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  
  @js.native
  class default protected () extends Vector3d {
    def this(x: Double, y: Double, z: Double) = this()
  }
}
