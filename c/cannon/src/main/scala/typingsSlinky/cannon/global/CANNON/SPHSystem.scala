package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.SPHSystem")
@js.native
class SPHSystem ()
  extends typingsSlinky.cannon.CANNON.SPHSystem {
  /* CompleteClass */
  override var densities: js.Array[Double] = js.native
  /* CompleteClass */
  override var density: Double = js.native
  /* CompleteClass */
  override var eps: Double = js.native
  /* CompleteClass */
  override var neighbors: js.Array[Double] = js.native
  /* CompleteClass */
  override var particles: js.Array[typingsSlinky.cannon.CANNON.Particle] = js.native
  /* CompleteClass */
  override var pressures: js.Array[Double] = js.native
  /* CompleteClass */
  override var smoothingRadius: Double = js.native
  /* CompleteClass */
  override var speedOfSound: Double = js.native
  /* CompleteClass */
  override var viscosity: Double = js.native
  /* CompleteClass */
  override def add(particle: typingsSlinky.cannon.CANNON.Particle): Unit = js.native
  /* CompleteClass */
  override def getNeighbors(
    particle: typingsSlinky.cannon.CANNON.Particle,
    neighbors: js.Array[typingsSlinky.cannon.CANNON.Particle]
  ): Unit = js.native
  /* CompleteClass */
  override def gradw(rVec: typingsSlinky.cannon.CANNON.Vec3, resultVec: typingsSlinky.cannon.CANNON.Vec3): Unit = js.native
  /* CompleteClass */
  override def nablaw(r: Double): Double = js.native
  /* CompleteClass */
  override def remove(particle: typingsSlinky.cannon.CANNON.Particle): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
  /* CompleteClass */
  override def w(r: Double): Double = js.native
}

