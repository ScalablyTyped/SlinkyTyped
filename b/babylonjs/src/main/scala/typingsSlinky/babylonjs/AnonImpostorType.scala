package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImpostorType extends js.Object {
  var friction: js.UndefOr[Double] = js.native
  var impostorSize: js.UndefOr[Double | AnonDepthHeight] = js.native
  var impostorType: js.UndefOr[Double] = js.native
  var restitution: js.UndefOr[Double] = js.native
}

object AnonImpostorType {
  @scala.inline
  def apply(): AnonImpostorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonImpostorType]
  }
  @scala.inline
  implicit class AnonImpostorTypeOps[Self <: AnonImpostorType] (val x: Self) extends AnyVal {
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
    def withImpostorSize(value: Double | AnonDepthHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impostorSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpostorSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impostorSize")(js.undefined)
        ret
    }
    @scala.inline
    def withImpostorType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impostorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpostorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impostorType")(js.undefined)
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

