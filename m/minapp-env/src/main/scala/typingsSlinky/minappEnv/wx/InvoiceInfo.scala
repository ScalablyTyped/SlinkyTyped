package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 用户选中的发票列表 */
@js.native
trait InvoiceInfo extends js.Object {
  /** 所选发票卡券的 cardId */
  var cardId: String = js.native
  /** 所选发票卡券的加密 code，报销方可以通过 cardId 和 encryptCode 获得报销发票的信息。 */
  var encryptCode: String = js.native
  /** 发票方的 appId */
  var publisherAppId: String = js.native
}

object InvoiceInfo {
  @scala.inline
  def apply(cardId: String, encryptCode: String, publisherAppId: String): InvoiceInfo = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], encryptCode = encryptCode.asInstanceOf[js.Any], publisherAppId = publisherAppId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceInfo]
  }
  @scala.inline
  implicit class InvoiceInfoOps[Self <: InvoiceInfo] (val x: Self) extends AnyVal {
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
    def withEncryptCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherAppId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

