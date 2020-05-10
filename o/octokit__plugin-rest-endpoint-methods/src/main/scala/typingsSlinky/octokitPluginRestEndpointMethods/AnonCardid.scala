package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCardid extends js.Object {
  var card_id: AnonRequired = js.native
}

object AnonCardid {
  @scala.inline
  def apply(card_id: AnonRequired): AnonCardid = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCardid]
  }
  @scala.inline
  implicit class AnonCardidOps[Self <: AnonCardid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

