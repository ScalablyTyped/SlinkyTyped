package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CylinderParticleEmitter extends IParticleEmitterType {
  /**
    * How much to randomize the particle direction [0-1].
    */
  var directionRandomizer: Double = js.native
  /**
    * The height of the emission cylinder.
    */
  var height: Double = js.native
  /**
    * The radius of the emission cylinder.
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

object CylinderParticleEmitter {
  @scala.inline
  def apply(
    applyToShader: Effect => Unit,
    directionRandomizer: Double,
    getClassName: () => String,
    getEffectDefines: () => String,
    height: Double,
    parse: js.Any => Unit,
    radius: Double,
    radiusRange: Double,
    serialize: () => js.Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): CylinderParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), directionRandomizer = directionRandomizer.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), height = height.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), radius = radius.asInstanceOf[js.Any], radiusRange = radiusRange.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction4(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[CylinderParticleEmitter]
  }
  @scala.inline
  implicit class CylinderParticleEmitterOps[Self <: CylinderParticleEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectionRandomizer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionRandomizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadiusRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

