package typingsSlinky.openjscad.CSG

import typingsSlinky.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector3D extends CxG {
  
  def abs(): Vector3D = js.native
  
  def cross(a: Vector3D): Vector3D = js.native
  
  def distanceTo(a: Vector3D): Double = js.native
  
  def distanceToSquared(a: Vector3D): Double = js.native
  
  def dividedBy(a: Double): Vector3D = js.native
  
  def dot(a: Vector3D): Double = js.native
  
  def equals(a: Vector3D): Boolean = js.native
  
  def length(): Double = js.native
  
  def lengthSquared(): Double = js.native
  
  def lerp(a: Vector3D, t: Double): Vector3D = js.native
  
  def max(p: Vector3D): Vector3D = js.native
  
  def min(p: Vector3D): Vector3D = js.native
  
  def minus(a: Vector3D): Vector3D = js.native
  
  def multiply4x4(matrix4x4: Matrix4x4): Vector3D = js.native
  
  def negated(): Vector3D = js.native
  
  def plus(a: Vector3D): Vector3D = js.native
  
  def randomNonParallelVector(): Vector3D = js.native
  
  def times(a: Double): Vector3D = js.native
  
  def unit(): Vector3D = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
