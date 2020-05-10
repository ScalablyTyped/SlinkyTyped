package typingsSlinky.baidumapWebSdk

import typingsSlinky.baidumapWebSdk.BMap.MapStyleItem
import typingsSlinky.baidumapWebSdk.BMap.MapStyleV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStyleJson extends MapStyleV2 {
  var styleJson: js.Array[MapStyleItem] = js.native
}

object AnonStyleJson {
  @scala.inline
  def apply(styleJson: js.Array[MapStyleItem]): AnonStyleJson = {
    val __obj = js.Dynamic.literal(styleJson = styleJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyleJson]
  }
  @scala.inline
  implicit class AnonStyleJsonOps[Self <: AnonStyleJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyleJson(value: js.Array[MapStyleItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleJson")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

