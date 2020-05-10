package typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2 extends js.Object {
  /**
    * The supported locations for passing the state parameter.
    */
  var STATE_PARAMETER_LOCATION: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StateParameterLocation */ js.Any = js.native
  /**
    * The supported formats for the returned OAuth2 token.
    */
  var TOKEN_FORMAT: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TokenFormat */ js.Any = js.native
  /**
    * Creates a new OAuth2 service with the name specified.
    * It's usually best to create and configure your service once at the start of your script,
    * and then reference them during the different phases of the authorization flow.
    */
  def createService(serviceName: String): OAuth2Service = js.native
  /**
    * Returns the redirect URI that will be used for a given script.
    * Often this URI needs to be entered into a configuration screen of your OAuth provider.
    */
  def getRedirectUri(scriptId: String): String = js.native
}

object OAuth2 {
  @scala.inline
  def apply(
    STATE_PARAMETER_LOCATION: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StateParameterLocation */ js.Any,
    TOKEN_FORMAT: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TokenFormat */ js.Any,
    createService: String => OAuth2Service,
    getRedirectUri: String => String
  ): OAuth2 = {
    val __obj = js.Dynamic.literal(STATE_PARAMETER_LOCATION = STATE_PARAMETER_LOCATION.asInstanceOf[js.Any], TOKEN_FORMAT = TOKEN_FORMAT.asInstanceOf[js.Any], createService = js.Any.fromFunction1(createService), getRedirectUri = js.Any.fromFunction1(getRedirectUri))
    __obj.asInstanceOf[OAuth2]
  }
  @scala.inline
  implicit class OAuth2Ops[Self <: OAuth2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSTATE_PARAMETER_LOCATION(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StateParameterLocation */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STATE_PARAMETER_LOCATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOKEN_FORMAT(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TokenFormat */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOKEN_FORMAT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateService(value: String => OAuth2Service): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createService")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRedirectUri(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRedirectUri")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

