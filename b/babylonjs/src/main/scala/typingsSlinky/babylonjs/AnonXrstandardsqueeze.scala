package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXrstandardsqueeze extends js.Object {
  var `xr-standard-squeeze`: AnonRootNodeName = js.native
  var `xr-standard-thumbstick`: AnonRootNodeName = js.native
  var `xr-standard-touchpad`: AnonLabelAnchorNodeName = js.native
  var `xr-standard-trigger`: AnonRootNodeName = js.native
}

object AnonXrstandardsqueeze {
  @scala.inline
  def apply(
    `xr-standard-squeeze`: AnonRootNodeName,
    `xr-standard-thumbstick`: AnonRootNodeName,
    `xr-standard-touchpad`: AnonLabelAnchorNodeName,
    `xr-standard-trigger`: AnonRootNodeName
  ): AnonXrstandardsqueeze = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xr-standard-squeeze")(`xr-standard-squeeze`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-thumbstick")(`xr-standard-thumbstick`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-touchpad")(`xr-standard-touchpad`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-trigger")(`xr-standard-trigger`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXrstandardsqueeze]
  }
  @scala.inline
  implicit class AnonXrstandardsqueezeOps[Self <: AnonXrstandardsqueeze] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withXr-standard-squeeze`(value: AnonRootNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr-standard-squeeze")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXr-standard-thumbstick`(value: AnonRootNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr-standard-thumbstick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXr-standard-touchpad`(value: AnonLabelAnchorNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr-standard-touchpad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXr-standard-trigger`(value: AnonRootNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr-standard-trigger")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

