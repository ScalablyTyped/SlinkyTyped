package typingsSlinky.openapiTypes.mod.OpenAPIV2

import typingsSlinky.openapiTypes.openapiTypesStrings.apiKey
import typingsSlinky.openapiTypes.openapiTypesStrings.application
import typingsSlinky.openapiTypes.openapiTypesStrings.basic
import typingsSlinky.openapiTypes.openapiTypesStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecuritySchemeOauth2Application
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  @JSName("flow")
  var flow_SecuritySchemeOauth2Application: application = js.native
  var tokenUrl: String = js.native
}

object SecuritySchemeOauth2Application {
  @scala.inline
  def apply(flow: application, scopes: ScopesObject, tokenUrl: String, `type`: basic | apiKey | oauth2): SecuritySchemeOauth2Application = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2Application]
  }
  @scala.inline
  implicit class SecuritySchemeOauth2ApplicationOps[Self <: SecuritySchemeOauth2Application] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlow(value: application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

