package typingsSlinky.pendoIoBrowser.pendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identity extends js.Object {
  var account: js.UndefOr[IdentityMetadata] = js.native
  /** visitor.id is required if user is logged in, otherwise an anonymous ID is generated and tracked by a cookie */
  var visitor: js.UndefOr[IdentityMetadata] = js.native
}

object Identity {
  @scala.inline
  def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  @scala.inline
  implicit class IdentityOps[Self <: Identity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: IdentityMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitor(value: IdentityMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitor")(js.undefined)
        ret
    }
  }
  
}

