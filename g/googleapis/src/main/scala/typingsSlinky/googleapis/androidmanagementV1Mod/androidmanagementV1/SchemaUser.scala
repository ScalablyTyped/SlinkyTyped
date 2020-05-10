package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A user belonging to an enterprise.
  */
@js.native
trait SchemaUser extends js.Object {
  /**
    * A unique identifier you create for this user, such as user342 or
    * asset#44418. This field must be set when the user is created and
    * can&#39;t be updated. This field must not contain personally identifiable
    * information (PII). This identifier must be 1024 characters or less;
    * otherwise, the update policy request will fail.
    */
  var accountIdentifier: js.UndefOr[String] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  @scala.inline
  implicit class SchemaUserOps[Self <: SchemaUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountIdentifier")(js.undefined)
        ret
    }
  }
  
}

