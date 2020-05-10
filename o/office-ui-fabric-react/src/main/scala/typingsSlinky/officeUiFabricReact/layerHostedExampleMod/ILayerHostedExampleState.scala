package typingsSlinky.officeUiFabricReact.layerHostedExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayerHostedExampleState extends js.Object {
  var showHost: Boolean = js.native
  var showLayer: Boolean = js.native
  var showLayerNoId: Boolean = js.native
}

object ILayerHostedExampleState {
  @scala.inline
  def apply(showHost: Boolean, showLayer: Boolean, showLayerNoId: Boolean): ILayerHostedExampleState = {
    val __obj = js.Dynamic.literal(showHost = showHost.asInstanceOf[js.Any], showLayer = showLayer.asInstanceOf[js.Any], showLayerNoId = showLayerNoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayerHostedExampleState]
  }
  @scala.inline
  implicit class ILayerHostedExampleStateOps[Self <: ILayerHostedExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowHost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowLayerNoId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLayerNoId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

