package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewResizeEvent extends js.Object {
  var height: Double = js.native
  var oldHeight: Double = js.native
  var oldWidth: Double = js.native
  var width: Double = js.native
}

object SceneViewResizeEvent {
  @scala.inline
  def apply(height: Double, oldHeight: Double, oldWidth: Double, width: Double): SceneViewResizeEvent = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], oldHeight = oldHeight.asInstanceOf[js.Any], oldWidth = oldWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewResizeEvent]
  }
  @scala.inline
  implicit class SceneViewResizeEventOps[Self <: SceneViewResizeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

