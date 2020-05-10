package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to get the account information.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest extends js.Object {
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /**
    * The list of emails of the users to inquiry.
    */
  var email: js.UndefOr[js.Array[String]] = js.native
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The list of local ID&#39;s of the users to inquiry.
    */
  var localId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Privileged caller can query users by specified phone number.
    */
  var phoneNumber: js.UndefOr[js.Array[String]] = js.native
}

object SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequestOps[Self <: SchemaIdentitytoolkitRelyingpartyGetAccountInfoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelegatedProjectNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedProjectNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegatedProjectNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedProjectNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
  }
  
}

