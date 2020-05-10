package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRDisplayCapabilities extends js.Object {
  val canPresent: Boolean = js.native
  val hasExternalDisplay: Boolean = js.native
  val hasOrientation: Boolean = js.native
  val hasPosition: Boolean = js.native
  val maxLayers: Double = js.native
}

object VRDisplayCapabilities {
  @scala.inline
  def apply(
    canPresent: Boolean,
    hasExternalDisplay: Boolean,
    hasOrientation: Boolean,
    hasPosition: Boolean,
    maxLayers: Double
  ): VRDisplayCapabilities = {
    val __obj = js.Dynamic.literal(canPresent = canPresent.asInstanceOf[js.Any], hasExternalDisplay = hasExternalDisplay.asInstanceOf[js.Any], hasOrientation = hasOrientation.asInstanceOf[js.Any], hasPosition = hasPosition.asInstanceOf[js.Any], maxLayers = maxLayers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRDisplayCapabilities]
  }
  @scala.inline
  implicit class VRDisplayCapabilitiesOps[Self <: VRDisplayCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanPresent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPresent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasExternalDisplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasExternalDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasOrientation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLayers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLayers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

