package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFriction extends js.Object {
  /**
    * Friction definitions
    */
  var friction: js.UndefOr[Double] = js.native
  /**
    * the size of the impostor. Defaults to 10cm
    */
  var impostorSize: js.UndefOr[Double | AnonDepthHeight] = js.native
  /**
    * The type of impostor to create. Default is sphere
    */
  var impostorType: Double = js.native
  /**
    * Restitution
    */
  var restitution: js.UndefOr[Double] = js.native
}

object AnonFriction {
  @scala.inline
  def apply(impostorType: Double): AnonFriction = {
    val __obj = js.Dynamic.literal(impostorType = impostorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFriction]
  }
  @scala.inline
  implicit class AnonFrictionOps[Self <: AnonFriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImpostorType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impostorType")(value.asInstanceOf[js.Any])
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

