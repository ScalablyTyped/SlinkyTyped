package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactMaterialOptions extends js.Object {
  var contactEquationRelaxation: js.UndefOr[Double] = js.native
  var contactEquationStiffness: js.UndefOr[Double] = js.native
  var friction: js.UndefOr[Double] = js.native
  var frictionEquationRelaxation: js.UndefOr[Double] = js.native
  var frictionEquationStiffness: js.UndefOr[Double] = js.native
  var restitution: js.UndefOr[Double] = js.native
}

object IContactMaterialOptions {
  @scala.inline
  def apply(): IContactMaterialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContactMaterialOptions]
  }
  @scala.inline
  implicit class IContactMaterialOptionsOps[Self <: IContactMaterialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactEquationRelaxation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEquationRelaxation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactEquationRelaxation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEquationRelaxation")(js.undefined)
        ret
    }
    @scala.inline
    def withContactEquationStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEquationStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactEquationStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEquationStiffness")(js.undefined)
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
    def withFrictionEquationRelaxation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionEquationRelaxation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrictionEquationRelaxation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionEquationRelaxation")(js.undefined)
        ret
    }
    @scala.inline
    def withFrictionEquationStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionEquationStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrictionEquationStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionEquationStiffness")(js.undefined)
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
  }
  
}

