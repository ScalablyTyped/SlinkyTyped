package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityProfileTargetMapping extends js.Object {
  /**
    * Information that identifies the security profile.
    */
  var securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier] = js.native
  /**
    * Information about the target (thing group) associated with the security profile.
    */
  var target: js.UndefOr[SecurityProfileTarget] = js.native
}

object SecurityProfileTargetMapping {
  @scala.inline
  def apply(): SecurityProfileTargetMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityProfileTargetMapping]
  }
  @scala.inline
  implicit class SecurityProfileTargetMappingOps[Self <: SecurityProfileTargetMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityProfileIdentifier(value: SecurityProfileIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityProfileIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: SecurityProfileTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

