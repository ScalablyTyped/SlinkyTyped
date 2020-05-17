package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axes extends js.Object {
  var axes: Xrstandardthumbstick = js.native
  var buttons: Xrstandardsqueeze = js.native
  var defaultAxis: MaxNodeName = js.native
  var defaultButton: PressedNodeName = js.native
}

object Axes {
  @scala.inline
  def apply(
    axes: Xrstandardthumbstick,
    buttons: Xrstandardsqueeze,
    defaultAxis: MaxNodeName,
    defaultButton: PressedNodeName
  ): Axes = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], defaultAxis = defaultAxis.asInstanceOf[js.Any], defaultButton = defaultButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axes]
  }
  @scala.inline
  implicit class AxesOps[Self <: Axes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: Xrstandardthumbstick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: Xrstandardsqueeze): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultAxis(value: MaxNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultButton(value: PressedNodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

