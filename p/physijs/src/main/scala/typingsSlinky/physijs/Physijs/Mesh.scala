package typingsSlinky.physijs.Physijs

import typingsSlinky.physijs.anon.Target
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mesh
  extends typingsSlinky.three.mod.Mesh[
      Geometry | BufferGeometry, 
      typingsSlinky.three.materialMod.Material | js.Array[typingsSlinky.three.materialMod.Material]
    ] {
  
  def applyCentralForce(force: Vector3): Unit = js.native
  
  def applyCentralImpulse(force: Vector3): Unit = js.native
  
  def applyForce(force: Vector3, offset: Vector3): Unit = js.native
  
  def applyImpulse(force: Vector3, offset: Vector3): Unit = js.native
  
  def dispatchEvent(event_name: String): Unit = js.native
  // (extends from Object3D)
  def dispatchEvent(event: Target): Unit = js.native
  
  def getAngularVelocity(): Vector3 = js.native
  
  def getLinearVelocity(): Vector3 = js.native
  
  def setAngularFactor(factor: Vector3): Unit = js.native
  
  def setAngularVelocity(velocity: Vector3): Unit = js.native
  
  def setCcdMotionThreshold(threshold: Double): Unit = js.native
  
  def setCcdSweptSphereRadius(radius: Double): Unit = js.native
  
  def setDamping(linear: Double, angular: Double): Unit = js.native
  
  def setLinearFactor(factor: Vector3): Unit = js.native
  
  def setLinearVelocity(velocity: Vector3): Unit = js.native
}
