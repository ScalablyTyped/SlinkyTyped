package typingsSlinky.physijs.Physijs

import typingsSlinky.three.mod.Geometry
import typingsSlinky.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vehicle extends js.Object {
  var mesh: typingsSlinky.three.mod.Mesh = js.native
  var wheels: js.Array[typingsSlinky.three.mod.Mesh] = js.native
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
  def applyEngineForce(amount: Double, wheel: typingsSlinky.three.mod.Mesh): Unit = js.native
  def setBrake(amount: Double): Unit = js.native
  def setBrake(amount: Double, wheel: typingsSlinky.three.mod.Mesh): Unit = js.native
  def setSteering(amount: Double): Unit = js.native
  def setSteering(amount: Double, wheel: typingsSlinky.three.mod.Mesh): Unit = js.native
}

