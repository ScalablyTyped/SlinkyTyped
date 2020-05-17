package typingsSlinky.mangopay2NodejsSdk.anon

import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.disputeDocument.DocumentPageConsult> */
@js.native
trait PartialDocumentPageConsul extends js.Object {
  var ExpirationDate: js.UndefOr[Timestamp] = js.native
  var Url: js.UndefOr[String] = js.native
}

object PartialDocumentPageConsul {
  @scala.inline
  def apply(): PartialDocumentPageConsul = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDocumentPageConsul]
  }
  @scala.inline
  implicit class PartialDocumentPageConsulOps[Self <: PartialDocumentPageConsul] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}

