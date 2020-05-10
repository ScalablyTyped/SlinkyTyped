package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for returning group information from authenticators.
  */
@js.native
trait SchemaAuthenticatorGroupsConfig extends js.Object {
  /**
    * Whether this cluster should return group membership lookups during
    * authentication using a group of security groups.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the security group-of-groups to be used. Only relevant if
    * enabled = true.
    */
  var securityGroup: js.UndefOr[String] = js.native
}

object SchemaAuthenticatorGroupsConfig {
  @scala.inline
  def apply(): SchemaAuthenticatorGroupsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticatorGroupsConfig]
  }
  @scala.inline
  implicit class SchemaAuthenticatorGroupsConfigOps[Self <: SchemaAuthenticatorGroupsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroup")(js.undefined)
        ret
    }
  }
  
}

