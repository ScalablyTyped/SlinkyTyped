package typingsSlinky.mangopay2NodejsSdk.mod.disputeDocument

import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentPageConsult extends js.Object {
  /**
    * Time in millis when the page consult will expire.
    */
  var ExpirationDate: Timestamp = js.native
  /**
    * URL where this document page can be viewed.
    */
  var Url: String = js.native
}

object DocumentPageConsult {
  @scala.inline
  def apply(ExpirationDate: Timestamp, Url: String): DocumentPageConsult = {
    val __obj = js.Dynamic.literal(ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentPageConsult]
  }
  @scala.inline
  implicit class DocumentPageConsultOps[Self <: DocumentPageConsult] (val x: Self) extends AnyVal {
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
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

