package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.CustomParticleEmitter")
@js.native
/**
  * Creates a new instance CustomParticleEmitter
  */
class CustomParticleEmitter () extends IParticleEmitterType {
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: js.Any): Unit = js.native
  /**
    * Gets or sets the destination generator that will create the final destination of each particle.
    *  * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
    */
  def particleDestinationGenerator(index: Double, particle: Nullable[Particle], outDestination: Vector3): Unit = js.native
  /**
    * Gets or sets the position generator that will create the inital position of each particle.
    * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
    */
  def particlePositionGenerator(index: Double, particle: Nullable[Particle], outPosition: Vector3): Unit = js.native
}

