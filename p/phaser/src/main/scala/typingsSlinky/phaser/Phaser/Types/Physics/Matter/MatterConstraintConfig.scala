package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import typingsSlinky.phaser.MatterJS.BodyType
import typingsSlinky.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterConstraintConfig extends js.Object {
  /**
    * The angleA of the constraint. If bodyA is set, the angle of bodyA is used instead.
    */
  var angleA: js.UndefOr[Double] = js.native
  /**
    * The angleB of the constraint. If bodyB is set, the angle of bodyB is used instead.
    */
  var angleB: js.UndefOr[Double] = js.native
  /**
    * A `Number` that specifies the angular stiffness of the constraint.
    */
  var angularStiffness: js.UndefOr[Double] = js.native
  /**
    * The first possible `Body` that this constraint is attached to.
    */
  var bodyA: js.UndefOr[BodyType] = js.native
  /**
    * The second possible `Body` that this constraint is attached to.
    */
  var bodyB: js.UndefOr[BodyType] = js.native
  /**
    * A `Number` that specifies the damping of the constraint, i.e. the amount of resistance applied to each body based on their velocities to limit the amount of oscillation. Damping will only be apparent when the constraint also has a very low `stiffness`. A value of `0.1` means the constraint will apply heavy damping, resulting in little to no oscillation. A value of `0` means the constraint will apply no damping.
    */
  var damping: js.UndefOr[Double] = js.native
  /**
    * An arbitrary string-based name to help identify this constraint.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * A `Number` that specifies the target resting length of the constraint. It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * An object reserved for storing plugin-specific properties.
    */
  var plugin: js.UndefOr[js.Any] = js.native
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    */
  var pointA: js.UndefOr[Vector2Like] = js.native
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyB` if defined, otherwise a world-space position.
    */
  var pointB: js.UndefOr[Vector2Like] = js.native
  /**
    * The Debug Render configuration object for this constraint.
    */
  var render: js.UndefOr[MatterConstraintRenderConfig] = js.native
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts like a soft spring.
    */
  var stiffness: js.UndefOr[Double] = js.native
}

object MatterConstraintConfig {
  @scala.inline
  def apply(): MatterConstraintConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterConstraintConfig]
  }
  @scala.inline
  implicit class MatterConstraintConfigOps[Self <: MatterConstraintConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngleA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleA")(js.undefined)
        ret
    }
    @scala.inline
    def withAngleB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleB")(js.undefined)
        ret
    }
    @scala.inline
    def withAngularStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularStiffness")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyA(value: BodyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyA")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyB(value: BodyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyB")(js.undefined)
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
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.undefined)
        ret
    }
    @scala.inline
    def withPointA(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointA")(js.undefined)
        ret
    }
    @scala.inline
    def withPointB(value: Vector2Like): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointB")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: MatterConstraintRenderConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
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
  }
  
}

