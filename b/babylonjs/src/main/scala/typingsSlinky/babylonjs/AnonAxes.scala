package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAxes extends js.Object {
  var axes: AnonXrstandardthumbstick = js.native
  var buttons: AnonXrstandardsqueeze = js.native
  var defaultAxis: AnonMaxNodeName = js.native
  var defaultButton: AnonPressedNodeName = js.native
}

object AnonAxes {
  @scala.inline
  def apply(
    axes: AnonXrstandardthumbstick,
    buttons: AnonXrstandardsqueeze,
    defaultAxis: AnonMaxNodeName,
    defaultButton: AnonPressedNodeName
  ): AnonAxes = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], defaultAxis = defaultAxis.asInstanceOf[js.Any], defaultButton = defaultButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxes]
  }
  @scala.inline
  implicit class AnonAxesOps[Self <: AnonAxes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: AnonXrstandardthumbstick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: AnonXrstandardsqueeze): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultAxis(value: AnonMaxNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultButton(value: AnonPressedNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

