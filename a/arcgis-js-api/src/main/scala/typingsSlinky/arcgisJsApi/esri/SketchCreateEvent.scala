package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.active
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cancel
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.circle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.complete
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.create
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchCreateEvent extends js.Object {
  var graphic: Graphic = js.native
  var state: start | active | complete | cancel = js.native
  var tool: point | polyline | polygon | rectangle | circle = js.native
  var toolEventInfo: CreateToolEventInfo = js.native
  var `type`: create = js.native
}

object SketchCreateEvent {
  @scala.inline
  def apply(
    graphic: Graphic,
    state: start | active | complete | cancel,
    tool: point | polyline | polygon | rectangle | circle,
    toolEventInfo: CreateToolEventInfo,
    `type`: create
  ): SketchCreateEvent = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchCreateEvent]
  }
  @scala.inline
  implicit class SketchCreateEventOps[Self <: SketchCreateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraphic(value: Graphic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: start | active | complete | cancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTool(value: point | polyline | polygon | rectangle | circle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolEventInfo(value: CreateToolEventInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolEventInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: create): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

