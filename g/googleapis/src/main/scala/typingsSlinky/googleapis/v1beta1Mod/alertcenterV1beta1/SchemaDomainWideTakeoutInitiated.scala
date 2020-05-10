package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A takeout operation for the entire domain was initiated by an admin.
  * Derived from audit logs.
  */
@js.native
trait SchemaDomainWideTakeoutInitiated extends js.Object {
  /**
    * The email of the admin who initiated the takeout.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The takeout request ID.
    */
  var takeoutRequestId: js.UndefOr[String] = js.native
}

object SchemaDomainWideTakeoutInitiated {
  @scala.inline
  def apply(): SchemaDomainWideTakeoutInitiated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainWideTakeoutInitiated]
  }
  @scala.inline
  implicit class SchemaDomainWideTakeoutInitiatedOps[Self <: SchemaDomainWideTakeoutInitiated] (val x: Self) extends AnyVal {
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
    def withTakeoutRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeoutRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTakeoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeoutRequestId")(js.undefined)
        ret
    }
  }
  
}

