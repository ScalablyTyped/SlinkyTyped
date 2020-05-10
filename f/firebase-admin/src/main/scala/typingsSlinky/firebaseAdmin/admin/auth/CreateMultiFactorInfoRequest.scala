package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing base properties of a user enrolled second factor for a
  * `CreateRequest`.
  */
@js.native
trait CreateMultiFactorInfoRequest extends js.Object {
  /**
    * The optional display name for an enrolled second factor.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The type identifier of the second factor. For SMS second factors, this is `phone`.
    */
  var factorId: String = js.native
}

object CreateMultiFactorInfoRequest {
  @scala.inline
  def apply(factorId: String): CreateMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiFactorInfoRequest]
  }
  @scala.inline
  implicit class CreateMultiFactorInfoRequestOps[Self <: CreateMultiFactorInfoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFactorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
  }
  
}

