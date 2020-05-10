package typingsSlinky.googleapis.siteVerificationV1Mod.siteVerificationV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSiteVerificationWebResourceListResponse extends js.Object {
  /**
    * The list of sites that are owned by the authenticated user.
    */
  var items: js.UndefOr[js.Array[SchemaSiteVerificationWebResourceResource]] = js.native
}

object SchemaSiteVerificationWebResourceListResponse {
  @scala.inline
  def apply(): SchemaSiteVerificationWebResourceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceListResponse]
  }
  @scala.inline
  implicit class SchemaSiteVerificationWebResourceListResponseOps[Self <: SchemaSiteVerificationWebResourceListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaSiteVerificationWebResourceResource]): Self = {
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

