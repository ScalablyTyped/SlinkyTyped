package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterprisesListResponse extends js.Object {
  /** An enterprise. */
  var enterprise: js.UndefOr[js.Array[Enterprise]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#enterprisesListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object EnterprisesListResponse {
  @scala.inline
  def apply(): EnterprisesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterprisesListResponse]
  }
  @scala.inline
  implicit class EnterprisesListResponseOps[Self <: EnterprisesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnterprise(value: js.Array[Enterprise]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterprise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterprise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterprise")(js.undefined)
        ret
    }
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
  }
  
}

