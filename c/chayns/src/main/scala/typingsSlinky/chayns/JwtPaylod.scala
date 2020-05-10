package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Utility Functions
  * Miscellaneous
  * chayns.utils
  * interfaces
  */
// chayns.utils.getJwtPayload()
@js.native
trait JwtPaylod extends js.Object {
  var FacebookUserID: String = js.native
  var FirstName: String = js.native
  var LastName: String = js.native
  var LocationID: Double = js.native
  var LoginType: Double = js.native
  var PersonID: String = js.native
  var TobitUserID: Double = js.native
  var isAdmin: Boolean = js.native
}

object JwtPaylod {
  @scala.inline
  def apply(
    FacebookUserID: String,
    FirstName: String,
    LastName: String,
    LocationID: Double,
    LoginType: Double,
    PersonID: String,
    TobitUserID: Double,
    isAdmin: Boolean
  ): JwtPaylod = {
    val __obj = js.Dynamic.literal(FacebookUserID = FacebookUserID.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], LocationID = LocationID.asInstanceOf[js.Any], LoginType = LoginType.asInstanceOf[js.Any], PersonID = PersonID.asInstanceOf[js.Any], TobitUserID = TobitUserID.asInstanceOf[js.Any], isAdmin = isAdmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtPaylod]
  }
  @scala.inline
  implicit class JwtPaylodOps[Self <: JwtPaylod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacebookUserID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacebookUserID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoginType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoginType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTobitUserID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TobitUserID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAdmin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdmin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

