package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Particle extends js.Object {
  /** @hidden */
  var _attachedSubEmitters: Nullable[js.Array[SubEmitter]] = js.native
  /** @hidden */
  var _currentAngularSpeed1: Double = js.native
  /** @hidden */
  var _currentAngularSpeed2: Double = js.native
  /** @hidden */
  var _currentAngularSpeedGradient: Nullable[FactorGradient] = js.native
  /** @hidden */
  var _currentColor1: Color4 = js.native
  /** @hidden */
  var _currentColor2: Color4 = js.native
  /** @hidden */
  var _currentColorGradient: Nullable[ColorGradient] = js.native
  /** @hidden */
  var _currentDrag1: Double = js.native
  /** @hidden */
  var _currentDrag2: Double = js.native
  /** @hidden */
  var _currentDragGradient: Nullable[FactorGradient] = js.native
  /** @hidden */
  var _currentLimitVelocity1: Double = js.native
  /** @hidden */
  var _currentLimitVelocity2: Double = js.native
  /** @hidden */
  var _currentLimitVelocityGradient: Nullable[FactorGradient] = js.native
  /** @hidden */
  var _currentSize1: Double = js.native
  /** @hidden */
  var _currentSize2: Double = js.native
  /** @hidden */
  var _currentSizeGradient: Nullable[FactorGradient] = js.native
  /** @hidden */
  var _currentVelocity1: Double = js.native
  /** @hidden */
  var _currentVelocity2: Double = js.native
  /** @hidden */
  var _currentVelocityGradient: Nullable[FactorGradient] = js.native
  /** @hidden */
  var _initialDirection: Nullable[Vector3] = js.native
  /** @hidden */
  var _initialEndSpriteCellID: Double = js.native
  /** @hidden */
  var _initialStartSpriteCellID: Double = js.native
  /** @hidden */
  var _localPosition: js.UndefOr[Vector3] = js.native
  /** @hidden */
  var _randomCellOffset: js.UndefOr[Double] = js.native
  /** @hidden */
  var _randomNoiseCoordinates1: Vector3 = js.native
  /** @hidden */
  var _randomNoiseCoordinates2: Vector3 = js.native
  /**
    * The current age of the particle.
    */
  var age: Double = js.native
  /**
    * The current angle of the particle.
    */
  var angle: Double = js.native
  /**
    * Defines how fast is the angle changing.
    */
  var angularSpeed: Double = js.native
  /**
    * Defines the cell index used by the particle to be rendered from a sprite.
    */
  var cellIndex: Double = js.native
  /**
    * The color of the particle.
    */
  var color: Color4 = js.native
  /**
    * The color change of the particle per step.
    */
  var colorStep: Color4 = js.native
  /**
    * The world direction of the particle in the scene.
    */
  var direction: Vector3 = js.native
  /**
    * Unique ID of the particle
    */
  var id: Double = js.native
  /**
    * Defines how long will the life of the particle be.
    */
  var lifeTime: Double = js.native
  /**
    * The particle system the particle belongs to.
    */
  var particleSystem: ParticleSystem = js.native
  /**
    * The world position of the particle in the scene.
    */
  var position: Vector3 = js.native
  /**
    * The information required to support color remapping
    */
  var remapData: Vector4 = js.native
  /**
    * The current scale of the particle.
    */
  var scale: Vector2 = js.native
  /**
    * The current size of the particle.
    */
  var size: Double = js.native
  var updateCellInfoFromSystem: js.Any = js.native
  /** @hidden */
  def _inheritParticleInfoToSubEmitter(subEmitter: SubEmitter): Unit = js.native
  /** @hidden */
  def _inheritParticleInfoToSubEmitters(): Unit = js.native
  /** @hidden */
  def _reset(): Unit = js.native
  /**
    * Copy the properties of particle to another one.
    * @param other the particle to copy the information to.
    */
  def copyTo(other: Particle): Unit = js.native
  /**
    * Defines how the sprite cell index is updated for the particle
    */
  def updateCellIndex(): Unit = js.native
}

object Particle {
  @scala.inline
  def apply(
    _currentAngularSpeed1: Double,
    _currentAngularSpeed2: Double,
    _currentColor1: Color4,
    _currentColor2: Color4,
    _currentDrag1: Double,
    _currentDrag2: Double,
    _currentLimitVelocity1: Double,
    _currentLimitVelocity2: Double,
    _currentSize1: Double,
    _currentSize2: Double,
    _currentVelocity1: Double,
    _currentVelocity2: Double,
    _inheritParticleInfoToSubEmitter: SubEmitter => Unit,
    _inheritParticleInfoToSubEmitters: () => Unit,
    _initialEndSpriteCellID: Double,
    _initialStartSpriteCellID: Double,
    _randomNoiseCoordinates1: Vector3,
    _randomNoiseCoordinates2: Vector3,
    _reset: () => Unit,
    age: Double,
    angle: Double,
    angularSpeed: Double,
    cellIndex: Double,
    color: Color4,
    colorStep: Color4,
    copyTo: Particle => Unit,
    direction: Vector3,
    id: Double,
    lifeTime: Double,
    particleSystem: ParticleSystem,
    position: Vector3,
    remapData: Vector4,
    scale: Vector2,
    size: Double,
    updateCellIndex: () => Unit,
    updateCellInfoFromSystem: js.Any
  ): Particle = {
    val __obj = js.Dynamic.literal(_currentAngularSpeed1 = _currentAngularSpeed1.asInstanceOf[js.Any], _currentAngularSpeed2 = _currentAngularSpeed2.asInstanceOf[js.Any], _currentColor1 = _currentColor1.asInstanceOf[js.Any], _currentColor2 = _currentColor2.asInstanceOf[js.Any], _currentDrag1 = _currentDrag1.asInstanceOf[js.Any], _currentDrag2 = _currentDrag2.asInstanceOf[js.Any], _currentLimitVelocity1 = _currentLimitVelocity1.asInstanceOf[js.Any], _currentLimitVelocity2 = _currentLimitVelocity2.asInstanceOf[js.Any], _currentSize1 = _currentSize1.asInstanceOf[js.Any], _currentSize2 = _currentSize2.asInstanceOf[js.Any], _currentVelocity1 = _currentVelocity1.asInstanceOf[js.Any], _currentVelocity2 = _currentVelocity2.asInstanceOf[js.Any], _inheritParticleInfoToSubEmitter = js.Any.fromFunction1(_inheritParticleInfoToSubEmitter), _inheritParticleInfoToSubEmitters = js.Any.fromFunction0(_inheritParticleInfoToSubEmitters), _initialEndSpriteCellID = _initialEndSpriteCellID.asInstanceOf[js.Any], _initialStartSpriteCellID = _initialStartSpriteCellID.asInstanceOf[js.Any], _randomNoiseCoordinates1 = _randomNoiseCoordinates1.asInstanceOf[js.Any], _randomNoiseCoordinates2 = _randomNoiseCoordinates2.asInstanceOf[js.Any], _reset = js.Any.fromFunction0(_reset), age = age.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], angularSpeed = angularSpeed.asInstanceOf[js.Any], cellIndex = cellIndex.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorStep = colorStep.asInstanceOf[js.Any], copyTo = js.Any.fromFunction1(copyTo), direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lifeTime = lifeTime.asInstanceOf[js.Any], particleSystem = particleSystem.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], remapData = remapData.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], updateCellIndex = js.Any.fromFunction0(updateCellIndex), updateCellInfoFromSystem = updateCellInfoFromSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Particle]
  }
  @scala.inline
  implicit class ParticleOps[Self <: Particle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_currentAngularSpeed1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentAngularSpeed1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentAngularSpeed2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentAngularSpeed2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentColor1(value: Color4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentColor1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentColor2(value: Color4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentColor2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentDrag1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentDrag1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentDrag2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentDrag2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentLimitVelocity1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentLimitVelocity1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentLimitVelocity2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentLimitVelocity2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentSize1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentSize1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentSize2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentSize2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentVelocity1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentVelocity1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentVelocity2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentVelocity2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_inheritParticleInfoToSubEmitter(value: SubEmitter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_inheritParticleInfoToSubEmitter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_inheritParticleInfoToSubEmitters(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_inheritParticleInfoToSubEmitters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_initialEndSpriteCellID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialEndSpriteCellID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_initialStartSpriteCellID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialStartSpriteCellID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_randomNoiseCoordinates1(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_randomNoiseCoordinates1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_randomNoiseCoordinates2(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_randomNoiseCoordinates2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_reset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorStep(value: Color4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyTo(value: Particle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDirection(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifeTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticleSystem(value: ParticleSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemapData(value: Vector4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remapData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateCellIndex(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCellIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateCellInfoFromSystem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCellInfoFromSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_attachedSubEmitters(value: Nullable[js.Array[SubEmitter]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attachedSubEmitters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_attachedSubEmittersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attachedSubEmitters")(null)
        ret
    }
    @scala.inline
    def with_currentAngularSpeedGradient(value: Nullable[FactorGradient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentAngularSpeedGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentAngularSpeedGradientNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentAngularSpeedGradient")(null)
        ret
    }
    @scala.inline
    def with_currentColorGradient(value: Nullable[ColorGradient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentColorGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentColorGradientNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentColorGradient")(null)
        ret
    }
    @scala.inline
    def with_currentDragGradient(value: Nullable[FactorGradient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentDragGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentDragGradientNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentDragGradient")(null)
        ret
    }
    @scala.inline
    def with_currentLimitVelocityGradient(value: Nullable[FactorGradient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentLimitVelocityGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentLimitVelocityGradientNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentLimitVelocityGradient")(null)
        ret
    }
    @scala.inline
    def with_currentSizeGradient(value: Nullable[FactorGradient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentSizeGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentSizeGradientNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentSizeGradient")(null)
        ret
    }
    @scala.inline
    def with_currentVelocityGradient(value: Nullable[FactorGradient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentVelocityGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentVelocityGradientNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentVelocityGradient")(null)
        ret
    }
    @scala.inline
    def with_initialDirection(value: Nullable[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_initialDirectionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialDirection")(null)
        ret
    }
    @scala.inline
    def with_localPosition(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_localPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_localPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_localPosition")(js.undefined)
        ret
    }
    @scala.inline
    def with_randomCellOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_randomCellOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_randomCellOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_randomCellOffset")(js.undefined)
        ret
    }
  }
  
}

