package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftwareTokenMfaConfigType extends js.Object {
  /**
    * Specifies whether software token MFA is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
}

object SoftwareTokenMfaConfigType {
  @scala.inline
  def apply(): SoftwareTokenMfaConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareTokenMfaConfigType]
  }
  @scala.inline
  implicit class SoftwareTokenMfaConfigTypeOps[Self <: SoftwareTokenMfaConfigType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: BooleanType): Self = {
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
  }
  
}

