package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpringOptions extends js.Object {
  var damping: js.UndefOr[Double] = js.native
  var localAnchorA: js.UndefOr[Vec3] = js.native
  var localAnchorB: js.UndefOr[Vec3] = js.native
  var restLength: js.UndefOr[Double] = js.native
  var stiffness: js.UndefOr[Double] = js.native
  var worldAnchorA: js.UndefOr[Vec3] = js.native
  var worldAnchorB: js.UndefOr[Vec3] = js.native
}

object ISpringOptions {
  @scala.inline
  def apply(): ISpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpringOptions]
  }
  @scala.inline
  implicit class ISpringOptionsOps[Self <: ISpringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLocalAnchorA(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAnchorA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorA")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalAnchorB(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAnchorB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorB")(js.undefined)
        ret
    }
    @scala.inline
    def withRestLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restLength")(js.undefined)
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
    def withWorldAnchorA(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldAnchorA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorldAnchorA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldAnchorA")(js.undefined)
        ret
    }
    @scala.inline
    def withWorldAnchorB(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldAnchorB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorldAnchorB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldAnchorB")(js.undefined)
        ret
    }
  }
  
}

