package typingsSlinky.babylonjs.physicsImpostorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsImpostorParameters extends js.Object {
  /**
    * The collision margin around a soft object
    */
  var damping: js.UndefOr[Double] = js.native
  /**
    * Specifies if bi-directional transformations should be disabled
    */
  var disableBidirectionalTransformation: js.UndefOr[Boolean] = js.native
  /**
    * The number used to fix points on a cloth (0, 1, 2, 4, 8) or rope (0, 1, 2) only
    * 0 None, 1, back left or top, 2, back right or bottom, 4, front left, 8, front right
    * Add to fix multiple points
    */
  var fixedPoints: js.UndefOr[Double] = js.native
  /**
    * The friction of the physics imposter
    */
  var friction: js.UndefOr[Double] = js.native
  /**
    * Specifies if the parent should be ignored
    */
  var ignoreParent: js.UndefOr[Boolean] = js.native
  /**
    * The collision margin around a soft object
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * The mass of the physics imposter
    */
  var mass: Double = js.native
  /**
    * The native options of the physics imposter
    */
  var nativeOptions: js.UndefOr[js.Any] = js.native
  /**
    * The path for a rope based on an extrusion
    */
  var path: js.UndefOr[js.Any] = js.native
  /**
    * The number of iterations used in maintaining consistent vertex positions, soft object only
    */
  var positionIterations: js.UndefOr[Double] = js.native
  /**
    * The pressure inside the physics imposter, soft object only
    */
  var pressure: js.UndefOr[Double] = js.native
  /**
    * The coefficient of restitution of the physics imposter
    */
  var restitution: js.UndefOr[Double] = js.native
  /**
    * The shape of an extrusion used for a rope based on an extrusion
    */
  var shape: js.UndefOr[js.Any] = js.native
  /**
    * The stiffness the physics imposter, soft object only
    */
  var stiffness: js.UndefOr[Double] = js.native
  /**
    * The number of iterations used in maintaining consistent vertex velocities, soft object only
    */
  var velocityIterations: js.UndefOr[Double] = js.native
}

object PhysicsImpostorParameters {
  @scala.inline
  def apply(mass: Double): PhysicsImpostorParameters = {
    val __obj = js.Dynamic.literal(mass = mass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsImpostorParameters]
  }
  @scala.inline
  implicit class PhysicsImpostorParametersOps[Self <: PhysicsImpostorParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDamping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableBidirectionalTransformation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBidirectionalTransformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableBidirectionalTransformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBidirectionalTransformation")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreParent")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionIterations")(js.undefined)
        ret
    }
    @scala.inline
    def withPressure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressure")(js.undefined)
        ret
    }
    @scala.inline
    def withRestitution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestitution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restitution")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocityIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocityIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityIterations")(js.undefined)
        ret
    }
  }
  
}

