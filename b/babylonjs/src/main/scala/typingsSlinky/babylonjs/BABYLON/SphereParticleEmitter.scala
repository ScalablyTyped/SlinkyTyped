package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SphereParticleEmitter")
@js.native
/**
  * Creates a new instance SphereParticleEmitter
  * @param radius the radius of the emission sphere (1 by default)
  * @param radiusRange the range of the emission sphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
  * @param directionRandomizer defines how much to randomize the particle direction [0-1]
  */
class SphereParticleEmitter () extends IParticleEmitterType {
  def this(/**
    * The radius of the emission sphere.
    */
  radius: Double) = this()
  def this(
    /**
    * The radius of the emission sphere.
    */
  radius: Double,
    /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  radiusRange: Double
  ) = this()
  def this(
    /**
    * The radius of the emission sphere.
    */
  radius: Double,
    /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  radiusRange: Double,
    /**
    * How much to randomize the particle direction [0-1].
    */
  directionRandomizer: Double
  ) = this()
  /**
    * How much to randomize the particle direction [0-1].
    */
  var directionRandomizer: Double = js.native
  /**
    * The radius of the emission sphere.
    */
  var radius: Double = js.native
  /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  var radiusRange: Double = js.native
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: js.Any): Unit = js.native
}

