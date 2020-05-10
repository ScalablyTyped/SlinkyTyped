package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ConeParticleEmitter")
@js.native
/**
  * Creates a new instance ConeParticleEmitter
  * @param radius the radius of the emission cone (1 by default)
  * @param angle the cone base angle (PI by default)
  * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
  */
class ConeParticleEmitter () extends IParticleEmitterType {
  def this(radius: Double) = this()
  def this(radius: Double, angle: Double) = this()
  def this(
    radius: Double,
    angle: Double,
    /** defines how much to randomize the particle direction [0-1] (default is 0) */
  directionRandomizer: Double
  ) = this()
  var _angle: js.Any = js.native
  var _buildHeight: js.Any = js.native
  var _height: js.Any = js.native
  var _radius: js.Any = js.native
  /** defines how much to randomize the particle direction [0-1] (default is 0) */
  var directionRandomizer: Double = js.native
  /**
    * Gets or sets a value indicating if all the particles should be emitted from the spawn point only (the base of the cone)
    */
  var emitFromSpawnPointOnly: Boolean = js.native
  /**
    * Gets or sets a value indicating where on the height the start position should be picked (1 = everywhere, 0 = only surface)
    */
  var heightRange: Double = js.native
  /**
    * Gets or sets a value indicating where on the radius the start position should be picked (1 = everywhere, 0 = only surface)
    */
  var radiusRange: Double = js.native
  /**
    * Gets or sets the angle of the emission cone
    */
  def angle: Double = js.native
  def angle(value: Double): js.Any = js.native
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: js.Any): Unit = js.native
  /**
    * Gets or sets the radius of the emission cone
    */
  def radius: Double = js.native
  def radius(value: Double): js.Any = js.native
}

