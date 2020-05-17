package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SphereDirectedParticleEmitter extends SphereParticleEmitter {
  /**
    * The min limit of the emission direction.
    */
  var direction1: Vector3 = js.native
  /**
    * The max limit of the emission direction.
    */
  var direction2: Vector3 = js.native
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle): Unit = js.native
}

object SphereDirectedParticleEmitter {
  @scala.inline
  def apply(
    applyToShader: Effect => Unit,
    direction1: Vector3,
    direction2: Vector3,
    directionRandomizer: Double,
    getClassName: () => String,
    getEffectDefines: () => String,
    parse: js.Any => Unit,
    radius: Double,
    radiusRange: Double,
    serialize: () => js.Any,
    startDirectionFunction: (Matrix, Vector3, Particle) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): SphereDirectedParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), direction1 = direction1.asInstanceOf[js.Any], direction2 = direction2.asInstanceOf[js.Any], directionRandomizer = directionRandomizer.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction1(parse), radius = radius.asInstanceOf[js.Any], radiusRange = radiusRange.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction3(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[SphereDirectedParticleEmitter]
  }
  @scala.inline
  implicit class SphereDirectedParticleEmitterOps[Self <: SphereDirectedParticleEmitter] (val x: Self) extends AnyVal {
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
    def withStartDirectionFunction(value: (Matrix, Vector3, Particle) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDirectionFunction")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

