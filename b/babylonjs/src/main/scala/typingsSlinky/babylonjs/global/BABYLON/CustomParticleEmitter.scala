package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.CustomParticleEmitter")
@js.native
/**
  * Creates a new instance CustomParticleEmitter
  */
class CustomParticleEmitter ()
  extends typingsSlinky.babylonjs.BABYLON.CustomParticleEmitter {
  /**
    * Called by the GPUParticleSystem to setup the update shader
    * @param effect defines the update shader
    */
  /* CompleteClass */
  override def applyToShader(effect: typingsSlinky.babylonjs.BABYLON.Effect): Unit = js.native
  /**
    * Returns a string representing the class name
    * @returns a string containing the class name
    */
  /* CompleteClass */
  override def getClassName(): String = js.native
  /**
    * Returns a string to use to update the GPU particles update shader
    * @returns the effect defines string
    */
  /* CompleteClass */
  override def getEffectDefines(): String = js.native
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  /* CompleteClass */
  override def parse(serializationObject: js.Any): Unit = js.native
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    * @param scene defines the hosting scene
    */
  /* CompleteClass */
  override def parse(serializationObject: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): Unit = js.native
  /**
    * Gets or sets the destination generator that will create the final destination of each particle.
    *  * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
    */
  /* CompleteClass */
  override def particleDestinationGenerator(
    index: Double,
    particle: Nullable[typingsSlinky.babylonjs.BABYLON.Particle],
    outDestination: typingsSlinky.babylonjs.BABYLON.Vector3
  ): Unit = js.native
  /**
    * Gets or sets the position generator that will create the inital position of each particle.
    * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
    */
  /* CompleteClass */
  override def particlePositionGenerator(
    index: Double,
    particle: Nullable[typingsSlinky.babylonjs.BABYLON.Particle],
    outPosition: typingsSlinky.babylonjs.BABYLON.Vector3
  ): Unit = js.native
  /**
    * Serializes the particle system to a JSON object.
    * @returns the JSON object
    */
  /* CompleteClass */
  override def serialize(): js.Any = js.native
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    */
  /* CompleteClass */
  override def startDirectionFunction(
    worldMatrix: typingsSlinky.babylonjs.BABYLON.Matrix,
    directionToUpdate: typingsSlinky.babylonjs.BABYLON.Vector3,
    particle: typingsSlinky.babylonjs.BABYLON.Particle,
    isLocal: Boolean
  ): Unit = js.native
  /**
    * Called by the particle System when the position is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param positionToUpdate is the position vector to update with the result
    * @param particle is the particle we are computed the position for
    * @param isLocal defines if the position should be set in local space
    */
  /* CompleteClass */
  override def startPositionFunction(
    worldMatrix: typingsSlinky.babylonjs.BABYLON.Matrix,
    positionToUpdate: typingsSlinky.babylonjs.BABYLON.Vector3,
    particle: typingsSlinky.babylonjs.BABYLON.Particle,
    isLocal: Boolean
  ): Unit = js.native
}

