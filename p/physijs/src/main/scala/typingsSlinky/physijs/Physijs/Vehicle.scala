package typingsSlinky.physijs.Physijs

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.mod.Geometry
import typingsSlinky.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vehicle extends js.Object {
  
  def addWheel(
    wheel_geometry: Geometry,
    wheel_material: typingsSlinky.three.mod.Material,
    connection_point: Vector3,
    wheel_direction: Vector3,
    wheel_axle: Vector3,
    suspension_rest_length: Double,
    wheel_radius: Double,
    is_front_wheel: Boolean
  ): Unit = js.native
  def addWheel(
    wheel_geometry: Geometry,
    wheel_material: typingsSlinky.three.mod.Material,
    connection_point: Vector3,
    wheel_direction: Vector3,
    wheel_axle: Vector3,
    suspension_rest_length: Double,
    wheel_radius: Double,
    is_front_wheel: Boolean,
    tuning: VehicleTuning
  ): Unit = js.native
  
  def applyEngineForce(amount: Double): Unit = js.native
  def applyEngineForce(
    amount: Double,
    wheel: typingsSlinky.three.mod.Mesh[
      typingsSlinky.three.geometryMod.Geometry | BufferGeometry, 
      typingsSlinky.three.materialMod.Material | js.Array[typingsSlinky.three.materialMod.Material]
    ]
  ): Unit = js.native
  
  var mesh: typingsSlinky.three.mod.Mesh[
    typingsSlinky.three.geometryMod.Geometry | BufferGeometry, 
    typingsSlinky.three.materialMod.Material | js.Array[typingsSlinky.three.materialMod.Material]
  ] = js.native
  
  def setBrake(amount: Double): Unit = js.native
  def setBrake(
    amount: Double,
    wheel: typingsSlinky.three.mod.Mesh[
      typingsSlinky.three.geometryMod.Geometry | BufferGeometry, 
      typingsSlinky.three.materialMod.Material | js.Array[typingsSlinky.three.materialMod.Material]
    ]
  ): Unit = js.native
  
  def setSteering(amount: Double): Unit = js.native
  def setSteering(
    amount: Double,
    wheel: typingsSlinky.three.mod.Mesh[
      typingsSlinky.three.geometryMod.Geometry | BufferGeometry, 
      typingsSlinky.three.materialMod.Material | js.Array[typingsSlinky.three.materialMod.Material]
    ]
  ): Unit = js.native
  
  var wheels: js.Array[
    typingsSlinky.three.mod.Mesh[
      typingsSlinky.three.geometryMod.Geometry | BufferGeometry, 
      typingsSlinky.three.materialMod.Material | js.Array[typingsSlinky.three.materialMod.Material]
    ]
  ] = js.native
}
