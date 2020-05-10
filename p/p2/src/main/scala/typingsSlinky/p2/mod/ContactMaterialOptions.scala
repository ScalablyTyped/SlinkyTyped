package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactMaterialOptions extends js.Object {
  var friction: js.UndefOr[Double] = js.native
  var frictionRelaxation: js.UndefOr[Double] = js.native
  var frictionStiffness: js.UndefOr[Double] = js.native
  var relaxation: js.UndefOr[Double] = js.native
  var restitution: js.UndefOr[Double] = js.native
  var stiffness: js.UndefOr[Double] = js.native
  var surfaceVelocity: js.UndefOr[Double] = js.native
}

object ContactMaterialOptions {
  @scala.inline
  def apply(): ContactMaterialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactMaterialOptions]
  }
  @scala.inline
  implicit class ContactMaterialOptionsOps[Self <: ContactMaterialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFrictionRelaxation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionRelaxation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrictionRelaxation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionRelaxation")(js.undefined)
        ret
    }
    @scala.inline
    def withFrictionStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrictionStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionStiffness")(js.undefined)
        ret
    }
    @scala.inline
    def withRelaxation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaxation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelaxation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaxation")(js.undefined)
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
    def withSurfaceVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surfaceVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurfaceVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surfaceVelocity")(js.undefined)
        ret
    }
  }
  
}

