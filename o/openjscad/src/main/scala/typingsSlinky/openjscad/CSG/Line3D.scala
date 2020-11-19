package typingsSlinky.openjscad.CSG

import typingsSlinky.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line3D extends CxG {
  
  def closestPointOnLine(point: Vector3D): Vector3D = js.native
  
  var direction: Vector3D = js.native
  
  def distanceToPoint(point: Vector3D): Double = js.native
  
  def equals(line3d: Line3D): Boolean = js.native
  
  def intersectWithPlane(plane: Plane): Vector3D = js.native
  
  var point: Vector3D = js.native
  
  def reverse(): Line3D = js.native
}
