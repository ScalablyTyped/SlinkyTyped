package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing common properties of a user enrolled second factor
  * for an `UpdateRequest`.
  */
@js.native
trait UpdateMultiFactorInfoRequest extends js.Object {
  /**
    * The optional display name for an enrolled second factor.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The optional date the second factor was enrolled, formatted as a UTC string.
    */
  var enrollmentTime: js.UndefOr[String] = js.native
  /**
    * The type identifier of the second factor. For SMS second factors, this is `phone`.
    */
  var factorId: String = js.native
  /**
    * The ID of the enrolled second factor. This ID is unique to the user. When not provided,
    * a new one is provisioned by the Auth server.
    */
  var uid: js.UndefOr[String] = js.native
}

object UpdateMultiFactorInfoRequest {
  @scala.inline
  def apply(factorId: String): UpdateMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiFactorInfoRequest]
  }
  @scala.inline
  implicit class UpdateMultiFactorInfoRequestOps[Self <: UpdateMultiFactorInfoRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withEnrollmentTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollmentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
  }
  
}

