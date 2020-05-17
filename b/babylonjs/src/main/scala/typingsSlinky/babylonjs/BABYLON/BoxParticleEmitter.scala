package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxParticleEmitter extends IParticleEmitterType {
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction1: Vector3 = js.native
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction2: Vector3 = js.native
  /**
    * Maximum box point around our emitter. Our emitter is the center of particles source, but if you want your particles to emit from more than one point, then you can tell it to do so.
    */
  var maxEmitBox: Vector3 = js.native
  /**
    * Minimum box point around our emitter. Our emitter is the center of particles source, but if you want your particles to emit from more than one point, then you can tell it to do so.
    */
  var minEmitBox: Vector3 = js.native
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: js.Any): Unit = js.native
}

object BoxParticleEmitter {
  @scala.inline
  def apply(
    applyToShader: Effect => Unit,
    direction1: Vector3,
    direction2: Vector3,
    getClassName: () => String,
    getEffectDefines: () => String,
    maxEmitBox: Vector3,
    minEmitBox: Vector3,
    parse: js.Any => Unit,
    serialize: () => js.Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): BoxParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), direction1 = direction1.asInstanceOf[js.Any], direction2 = direction2.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), maxEmitBox = maxEmitBox.asInstanceOf[js.Any], minEmitBox = minEmitBox.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction4(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[BoxParticleEmitter]
  }
  @scala.inline
  implicit class BoxParticleEmitterOps[Self <: BoxParticleEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection1(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection2(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxEmitBox(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEmitBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinEmitBox(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minEmitBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

