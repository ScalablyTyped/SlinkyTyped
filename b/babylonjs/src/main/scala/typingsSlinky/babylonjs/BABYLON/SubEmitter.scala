package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubEmitter extends js.Object {
  /**
    * If the particle should inherit the direction from the particle it's attached to. (+Y will face the direction the particle is moving) (Default: false)
    * Note: This only is supported when using an emitter of type Mesh
    */
  var inheritDirection: Boolean = js.native
  /**
    * How much of the attached particles speed should be added to the sub emitted particle (default: 0)
    */
  var inheritedVelocityAmount: Double = js.native
  /**
    * the particle system to be used by the sub emitter
    */
  var particleSystem: ParticleSystem = js.native
  /**
    * Type of the submitter (Default: END)
    */
  var `type`: SubEmitterType = js.native
  /** Release associated resources */
  def dispose(): Unit = js.native
  /**
    * Serialize current object to a JSON object
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
}

object SubEmitter {
  @scala.inline
  def apply(
    dispose: () => Unit,
    inheritDirection: Boolean,
    inheritedVelocityAmount: Double,
    particleSystem: ParticleSystem,
    serialize: () => js.Any,
    `type`: SubEmitterType
  ): SubEmitter = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), inheritDirection = inheritDirection.asInstanceOf[js.Any], inheritedVelocityAmount = inheritedVelocityAmount.asInstanceOf[js.Any], particleSystem = particleSystem.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubEmitter]
  }
  @scala.inline
  implicit class SubEmitterOps[Self <: SubEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInheritDirection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInheritedVelocityAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedVelocityAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticleSystem(value: ParticleSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialize(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: SubEmitterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

