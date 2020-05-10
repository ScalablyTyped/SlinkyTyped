package typingsSlinky.officeUiFabricReact.layerCustomizedExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayerCustomizedExampleState extends js.Object {
  var showPanel: Boolean = js.native
  var trapPanel: Boolean = js.native
}

object ILayerCustomizedExampleState {
  @scala.inline
  def apply(showPanel: Boolean, trapPanel: Boolean): ILayerCustomizedExampleState = {
    val __obj = js.Dynamic.literal(showPanel = showPanel.asInstanceOf[js.Any], trapPanel = trapPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayerCustomizedExampleState]
  }
  @scala.inline
  implicit class ILayerCustomizedExampleStateOps[Self <: ILayerCustomizedExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrapPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapPanel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

