package typingsSlinky.googleapis.fusiontablesV1Mod.fusiontablesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTableCopy extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether to also copy tabs, styles, and templates. Default is false.
    */
  var copyPresentation: js.UndefOr[Boolean] = js.native
  /**
    * ID of the table that is being copied.
    */
  var tableId: js.UndefOr[String] = js.native
}

object ParamsResourceTableCopy {
  @scala.inline
  def apply(): ParamsResourceTableCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTableCopy]
  }
  @scala.inline
  implicit class ParamsResourceTableCopyOps[Self <: ParamsResourceTableCopy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyPresentation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyPresentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyPresentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyPresentation")(js.undefined)
        ret
    }
    @scala.inline
    def withTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(js.undefined)
        ret
    }
  }
  
}

