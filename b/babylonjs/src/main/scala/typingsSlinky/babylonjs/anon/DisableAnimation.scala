package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableAnimation extends js.Object {
  /**
    * Disable the mesh's animation sequence
    */
  var disableAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Disable lighting on the material or the ring and arrow
    */
  var disableLighting: js.UndefOr[Boolean] = js.native
  /**
    * Border color for the teleportation area
    */
  var teleportationBorderColor: js.UndefOr[String] = js.native
  /**
    * Fill color of the teleportation area
    */
  var teleportationFillColor: js.UndefOr[String] = js.native
  /**
    * Override the default material of the torus and arrow
    */
  var torusArrowMaterial: js.UndefOr[Material] = js.native
}

object DisableAnimation {
  @scala.inline
  def apply(): DisableAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableAnimation]
  }
  @scala.inline
  implicit class DisableAnimationOps[Self <: DisableAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableLighting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableLighting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLighting")(js.undefined)
        ret
    }
    @scala.inline
    def withTeleportationBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeleportationBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTeleportationFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeleportationFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTorusArrowMaterial(value: Material): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torusArrowMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTorusArrowMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torusArrowMaterial")(js.undefined)
        ret
    }
  }
  
}

