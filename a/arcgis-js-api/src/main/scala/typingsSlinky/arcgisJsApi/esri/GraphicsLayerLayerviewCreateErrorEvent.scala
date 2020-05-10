package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error = js.native
  var view: View = js.native
}

object GraphicsLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): GraphicsLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsLayerLayerviewCreateErrorEvent]
  }
  @scala.inline
  implicit class GraphicsLayerLayerviewCreateErrorEventOps[Self <: GraphicsLayerLayerviewCreateErrorEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

