package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedSecurityOptionsInput extends js.Object {
  /**
    * True if advanced security is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * True if the internal user database is enabled.
    */
  var InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Credentials for the master user: username and password, ARN, or both.
    */
  var MasterUserOptions: js.UndefOr[typingsSlinky.awsSdk.esMod.MasterUserOptions] = js.native
}

object AdvancedSecurityOptionsInput {
  @scala.inline
  def apply(): AdvancedSecurityOptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSecurityOptionsInput]
  }
  @scala.inline
  implicit class AdvancedSecurityOptionsInputOps[Self <: AdvancedSecurityOptionsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalUserDatabaseEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternalUserDatabaseEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalUserDatabaseEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternalUserDatabaseEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterUserOptions(value: MasterUserOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUserOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterUserOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUserOptions")(js.undefined)
        ret
    }
  }
  
}

