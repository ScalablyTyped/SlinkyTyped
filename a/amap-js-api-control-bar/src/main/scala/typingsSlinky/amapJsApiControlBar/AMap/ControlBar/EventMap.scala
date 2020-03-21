package typingsSlinky.amapJsApiControlBar.AMap.ControlBar

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiControlBar.amapJsApiControlBarStrings.hide
import typingsSlinky.amapJsApiControlBar.amapJsApiControlBarStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var hide: Event_[
    typingsSlinky.amapJsApiControlBar.amapJsApiControlBarStrings.hide, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event_[
    typingsSlinky.amapJsApiControlBar.amapJsApiControlBarStrings.show, 
    js.UndefOr[scala.Nothing]
  ]
}

object EventMap {
  @scala.inline
  def apply(hide: Event_[hide, js.UndefOr[scala.Nothing]], show: Event_[show, js.UndefOr[scala.Nothing]]): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

