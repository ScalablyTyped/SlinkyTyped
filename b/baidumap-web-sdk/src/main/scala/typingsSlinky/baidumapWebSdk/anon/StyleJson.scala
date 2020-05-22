package typingsSlinky.baidumapWebSdk.anon

import typingsSlinky.baidumapWebSdk.BMap.MapStyleItem
import typingsSlinky.baidumapWebSdk.BMap.MapStyleV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleJson extends MapStyleV2 {
  var styleJson: js.Array[MapStyleItem]
}

object StyleJson {
  @scala.inline
  def apply(styleJson: js.Array[MapStyleItem]): StyleJson = {
    val __obj = js.Dynamic.literal(styleJson = styleJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleJson]
  }
}

