package typingsSlinky.jweixin.mod

import typingsSlinky.jweixin.AnonCardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信卡券================================*/
@js.native
trait IchooseCard extends BaseParams {
   // 卡券类型
  var cardId: String = js.native
   // 签名方式，默认'SHA1'
  var cardSign: String = js.native
   // 门店Id
  var cardType: String = js.native
   // 卡券签名时间戳
  var nonceStr: String = js.native
  var shopId: String = js.native
   // 卡券签名随机串
  var signType: String = js.native
   // 卡券Id
  var timestamp: Double = js.native
   // 卡券签名
  @JSName("success")
  def success_MIchooseCard(res: AnonCardList): Unit = js.native
}

object IchooseCard {
  @scala.inline
  def apply(
    cardId: String,
    cardSign: String,
    cardType: String,
    nonceStr: String,
    shopId: String,
    signType: String,
    success: AnonCardList => Unit,
    timestamp: Double
  ): IchooseCard = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], cardSign = cardSign.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], shopId = shopId.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IchooseCard]
  }
  @scala.inline
  implicit class IchooseCardOps[Self <: IchooseCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardSign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonceStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShopId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shopId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: AnonCardList => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

