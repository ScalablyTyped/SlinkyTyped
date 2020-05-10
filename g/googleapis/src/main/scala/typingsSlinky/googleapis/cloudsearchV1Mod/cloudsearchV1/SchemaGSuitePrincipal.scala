package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGSuitePrincipal extends js.Object {
  /**
    * This principal represents all users of the G Suite domain of the
    * customer.
    */
  var gsuiteDomain: js.UndefOr[Boolean] = js.native
  /**
    * This principal references a G Suite group account
    */
  var gsuiteGroupEmail: js.UndefOr[String] = js.native
  /**
    * This principal references a G Suite user account
    */
  var gsuiteUserEmail: js.UndefOr[String] = js.native
}

object SchemaGSuitePrincipal {
  @scala.inline
  def apply(): SchemaGSuitePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGSuitePrincipal]
  }
  @scala.inline
  implicit class SchemaGSuitePrincipalOps[Self <: SchemaGSuitePrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGsuiteDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gsuiteDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGsuiteDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gsuiteDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withGsuiteGroupEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gsuiteGroupEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGsuiteGroupEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gsuiteGroupEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withGsuiteUserEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gsuiteUserEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGsuiteUserEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gsuiteUserEmail")(js.undefined)
        ret
    }
  }
  
}

