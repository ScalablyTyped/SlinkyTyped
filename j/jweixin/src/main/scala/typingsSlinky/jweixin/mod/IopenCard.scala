package typingsSlinky.jweixin.mod

import typingsSlinky.jweixin.anon.CardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IopenCard extends BaseParams {
  var cardList: js.Array[CardId] = js.native
}

object IopenCard {
  @scala.inline
  def apply(cardList: js.Array[CardId]): IopenCard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IopenCard]
  }
  @scala.inline
  implicit class IopenCardOps[Self <: IopenCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardList(value: js.Array[CardId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

