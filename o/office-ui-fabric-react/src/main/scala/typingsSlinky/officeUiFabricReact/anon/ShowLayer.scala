package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowLayer extends js.Object {
  var showLayer: Boolean = js.native
}

object ShowLayer {
  @scala.inline
  def apply(showLayer: Boolean): ShowLayer = {
    val __obj = js.Dynamic.literal(showLayer = showLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowLayer]
  }
  @scala.inline
  implicit class ShowLayerOps[Self <: ShowLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLayer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

