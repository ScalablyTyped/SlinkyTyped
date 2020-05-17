package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xrstandardsqueeze extends js.Object {
  var `xr-standard-squeeze`: RootNodeName = js.native
  var `xr-standard-thumbstick`: RootNodeName = js.native
  var `xr-standard-touchpad`: LabelAnchorNodeName = js.native
  var `xr-standard-trigger`: RootNodeName = js.native
}

object Xrstandardsqueeze {
  @scala.inline
  def apply(
    `xr-standard-squeeze`: RootNodeName,
    `xr-standard-thumbstick`: RootNodeName,
    `xr-standard-touchpad`: LabelAnchorNodeName,
    `xr-standard-trigger`: RootNodeName
  ): Xrstandardsqueeze = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xr-standard-squeeze")(`xr-standard-squeeze`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-thumbstick")(`xr-standard-thumbstick`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-touchpad")(`xr-standard-touchpad`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-trigger")(`xr-standard-trigger`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xrstandardsqueeze]
  }
  @scala.inline
  implicit class XrstandardsqueezeOps[Self <: Xrstandardsqueeze] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withXr-standard-squeeze`(value: RootNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr-standard-squeeze")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXr-standard-thumbstick`(value: RootNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr-standard-thumbstick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXr-standard-touchpad`(value: LabelAnchorNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr-standard-touchpad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXr-standard-trigger`(value: RootNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr-standard-trigger")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

