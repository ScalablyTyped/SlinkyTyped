package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule for automatically choosing a private key and certificate to
  * authenticate the device to a server.
  */
@js.native
trait SchemaChoosePrivateKeyRule extends js.Object {
  /**
    * The package names for which outgoing requests are subject to this rule.
    * If no package names are specified, then the rule applies to all packages.
    * For each package name listed, the rule applies to that package and all
    * other packages that shared the same Android UID. The SHA256 hash of the
    * signing key signatures of each package_name will be verified against
    * those provided by Play
    */
  var packageNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The alias of the private key to be used.
    */
  var privateKeyAlias: js.UndefOr[String] = js.native
  /**
    * The URL pattern to match against the URL of the outgoing request. The
    * pattern may contain asterisk (*) wildcards. Any URL is matched if
    * unspecified.
    */
  var urlPattern: js.UndefOr[String] = js.native
}

object SchemaChoosePrivateKeyRule {
  @scala.inline
  def apply(): SchemaChoosePrivateKeyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChoosePrivateKeyRule]
  }
  @scala.inline
  implicit class SchemaChoosePrivateKeyRuleOps[Self <: SchemaChoosePrivateKeyRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackageNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageNames")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKeyAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeyAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPattern")(js.undefined)
        ret
    }
  }
  
}

