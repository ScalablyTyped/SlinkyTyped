package typingsSlinky.amapJsApiIndoorMap.AMap.IndoorMap

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.click
import typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.complete
import typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.floor_complete
import typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseout
import typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var click: MouseEvent[typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.click] = js.native
  var complete: Event_[
    typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.complete, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  var floor_complete: Event_[
    typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.floor_complete, 
    SearchResult
  ] = js.native
  var mouseout: MouseEvent[typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseout] = js.native
  var mouseover: MouseEvent[typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseover] = js.native
}

object EventMap {
  @scala.inline
  def apply(
    click: MouseEvent[click],
    complete: Event_[complete, js.UndefOr[scala.Nothing]],
    floor_complete: Event_[floor_complete, SearchResult],
    mouseout: MouseEvent[mouseout],
    mouseover: MouseEvent[mouseover]
  ): EventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], floor_complete = floor_complete.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: MouseEvent[click]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: Event_[complete, js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloor_complete(value: Event_[floor_complete, SearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor_complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseout(value: MouseEvent[mouseout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseover(value: MouseEvent[mouseover]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

