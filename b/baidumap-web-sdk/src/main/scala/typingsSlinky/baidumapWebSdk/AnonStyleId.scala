package typingsSlinky.baidumapWebSdk

import typingsSlinky.baidumapWebSdk.BMap.MapStyleV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStyleId extends MapStyleV2 {
  var styleId: String = js.native
}

object AnonStyleId {
  @scala.inline
  def apply(styleId: String): AnonStyleId = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyleId]
  }
  @scala.inline
  implicit class AnonStyleIdOps[Self <: AnonStyleId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

