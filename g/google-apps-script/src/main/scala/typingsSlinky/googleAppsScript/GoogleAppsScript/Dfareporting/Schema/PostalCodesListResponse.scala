package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostalCodesListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.native
}

object PostalCodesListResponse {
  @scala.inline
  def apply(): PostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalCodesListResponse]
  }
  @scala.inline
  implicit class PostalCodesListResponseOps[Self <: PostalCodesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCodes(value: js.Array[PostalCode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodes")(js.undefined)
        ret
    }
  }
  
}

