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

trait EventMap extends js.Object {
  var click: MouseEvent[typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.click]
  var complete: Event_[
    typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.complete, 
    js.UndefOr[scala.Nothing]
  ]
  var floor_complete: Event_[
    typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.floor_complete, 
    SearchResult
  ]
  var mouseout: MouseEvent[typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseout]
  var mouseover: MouseEvent[typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseover]
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
}

