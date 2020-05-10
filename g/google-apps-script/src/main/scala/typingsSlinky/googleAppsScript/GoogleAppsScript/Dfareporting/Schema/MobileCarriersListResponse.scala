package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileCarriersListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var mobileCarriers: js.UndefOr[js.Array[MobileCarrier]] = js.native
}

object MobileCarriersListResponse {
  @scala.inline
  def apply(): MobileCarriersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileCarriersListResponse]
  }
  @scala.inline
  implicit class MobileCarriersListResponseOps[Self <: MobileCarriersListResponse] (val x: Self) extends AnyVal {
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
    def withMobileCarriers(value: js.Array[MobileCarrier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileCarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileCarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileCarriers")(js.undefined)
        ret
    }
  }
  
}

