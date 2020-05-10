package typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authentication rules for the service.  By default, if a method has any
  * authentication requirements, every request must include a valid credential
  * matching one of the requirements. It&#39;s an error to include more than
  * one kind of credential in a single request.  If a method doesn&#39;t have
  * any auth requirements, request credentials will be ignored.
  */
@js.native
trait SchemaAuthenticationRule extends js.Object {
  /**
    * If true, the service accepts API keys without any other credential.
    */
  var allowWithoutCredential: js.UndefOr[Boolean] = js.native
  /**
    * The requirements for OAuth credentials.
    */
  var oauth: js.UndefOr[SchemaOAuthRequirements] = js.native
  /**
    * Requirements for additional authentication providers.
    */
  var requirements: js.UndefOr[js.Array[SchemaAuthRequirement]] = js.native
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object SchemaAuthenticationRule {
  @scala.inline
  def apply(): SchemaAuthenticationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticationRule]
  }
  @scala.inline
  implicit class SchemaAuthenticationRuleOps[Self <: SchemaAuthenticationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowWithoutCredential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWithoutCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowWithoutCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWithoutCredential")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth(value: SchemaOAuthRequirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirements(value: js.Array[SchemaAuthRequirement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

