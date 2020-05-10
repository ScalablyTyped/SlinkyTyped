package typingsSlinky.jweixin.mod

import typingsSlinky.jweixin.AnonCardExt
import typingsSlinky.jweixin.AnonCardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IaddCard extends BaseParams {
  var cardList: js.Array[AnonCardExt] = js.native
   // 需要添加的卡券列表
  @JSName("success")
  def success_MIaddCard(res: AnonCardList): Unit = js.native
}

object IaddCard {
  @scala.inline
  def apply(cardList: js.Array[AnonCardExt], success: AnonCardList => Unit): IaddCard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IaddCard]
  }
  @scala.inline
  implicit class IaddCardOps[Self <: IaddCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardList(value: js.Array[AnonCardExt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: AnonCardList => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

