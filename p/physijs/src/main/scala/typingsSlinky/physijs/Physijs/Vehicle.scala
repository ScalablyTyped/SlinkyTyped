package typingsSlinky.physijs.Physijs

import typingsSlinky.three.threeMod.Geometry
import typingsSlinky.three.threeMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.Vehicle")
@js.native
class Vehicle protected () extends js.Object {
  def this(mesh: Mesh) = this()
  def this(mesh: Mesh, tuning: VehicleTuning) = this()
  var mesh: typingsSlinky.three.threeMod.Mesh = js.native
  var wheels: js.Array[typingsSlinky.three.threeMod.Mesh] = js.native
  def addWheel(
    wheel_geometry: Geometry,
    wheel_material: typingsSlinky.three.threeMod.Material,
    connection_point: Vector3,
    wheel_direction: Vector3,
    wheel_axle: Vector3,
    suspension_rest_length: Double,
    wheel_radius: Double,
    is_front_wheel: Boolean
  ): Unit = js.native
  def addWheel(
    wheel_geometry: Geometry,
    wheel_material: typingsSlinky.three.threeMod.Material,
    connection_point: Vector3,
    wheel_direction: Vector3,
    wheel_axle: Vector3,
    suspension_rest_length: Double,
    wheel_radius: Double,
    is_front_wheel: Boolean,
    tuning: VehicleTuning
  ): Unit = js.native
  def applyEngineForce(amount: Double): Unit = js.native
  def applyEngineForce(amount: Double, wheel: typingsSlinky.three.threeMod.Mesh): Unit = js.native
  def setBrake(amount: Double): Unit = js.native
  def setBrake(amount: Double, wheel: typingsSlinky.three.threeMod.Mesh): Unit = js.native
  def setSteering(amount: Double): Unit = js.native
  def setSteering(amount: Double, wheel: typingsSlinky.three.threeMod.Mesh): Unit = js.native
}

