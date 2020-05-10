package typingsSlinky.gapiClientSiteverification.gapi.client.siteverification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiteVerificationWebResourceListResponse extends js.Object {
  /** The list of sites that are owned by the authenticated user. */
  var items: js.UndefOr[js.Array[SiteVerificationWebResourceResource]] = js.native
}

object SiteVerificationWebResourceListResponse {
  @scala.inline
  def apply(): SiteVerificationWebResourceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteVerificationWebResourceListResponse]
  }
  @scala.inline
  implicit class SiteVerificationWebResourceListResponseOps[Self <: SiteVerificationWebResourceListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SiteVerificationWebResourceResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

