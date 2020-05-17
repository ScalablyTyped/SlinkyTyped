package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SphereDirectedParticleEmitter")
@js.native
/**
  * Creates a new instance SphereDirectedParticleEmitter
  * @param radius the radius of the emission sphere (1 by default)
  * @param direction1 the min limit of the emission direction (up vector by default)
  * @param direction2 the max limit of the emission direction (up vector by default)
  */
class SphereDirectedParticleEmitter ()
  extends typingsSlinky.babylonjs.BABYLON.SphereDirectedParticleEmitter {
  def this(radius: Double) = this()
  def this(
    radius: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: typingsSlinky.babylonjs.BABYLON.Vector3
  ) = this()
  def this(
    radius: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: typingsSlinky.babylonjs.BABYLON.Vector3,
    /**
    * The max limit of the emission direction.
    */
  direction2: typingsSlinky.babylonjs.BABYLON.Vector3
  ) = this()
}

