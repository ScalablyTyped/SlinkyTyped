package typingsSlinky.playcanvas

import typingsSlinky.playcanvas.pc.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLayer extends js.Object {
  var layer: js.UndefOr[Layer] = js.native
}

object AnonLayer {
  @scala.inline
  def apply(): AnonLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLayer]
  }
  @scala.inline
  implicit class AnonLayerOps[Self <: AnonLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayer(value: Layer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(js.undefined)
        ret
    }
  }
  
}

