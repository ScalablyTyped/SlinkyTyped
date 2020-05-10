package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Alerts for user account warning events.
  */
@js.native
trait SchemaAccountWarning extends js.Object {
  /**
    * Required. The email of the user that this event belongs to.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Optional. Details of the login action associated with the warning event.
    * This is only available for:  * Suspicious login * Suspicious login (less
    * secure app) * Suspicious programmatic login * User suspended (suspicious
    * activity)
    */
  var loginDetails: js.UndefOr[SchemaLoginDetails] = js.native
}

object SchemaAccountWarning {
  @scala.inline
  def apply(): SchemaAccountWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountWarning]
  }
  @scala.inline
  implicit class SchemaAccountWarningOps[Self <: SchemaAccountWarning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
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
    def withLoginDetails(value: SchemaLoginDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginDetails")(js.undefined)
        ret
    }
  }
  
}

