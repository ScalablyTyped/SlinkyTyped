package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cardid extends js.Object {
  var card_id: Required = js.native
}

object Cardid {
  @scala.inline
  def apply(card_id: Required): Cardid = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cardid]
  }
  @scala.inline
  implicit class CardidOps[Self <: Cardid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

