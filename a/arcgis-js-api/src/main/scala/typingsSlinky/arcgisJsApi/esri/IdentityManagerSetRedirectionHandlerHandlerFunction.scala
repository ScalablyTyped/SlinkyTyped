package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityManagerSetRedirectionHandlerHandlerFunction extends Object {
  /**
    * The URL of the secure resource that triggers the redirection to the ArcGIS.com sign-in page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var resourceUrl: String = js.native
  /**
    * The application URL where the sign-in page redirects after a successful login. To create the return URL, append the application's URL to signInPage as a parameter. The *returnUrlParamName* contains the name of the parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var returnUrlParamName: String = js.native
  /**
    * The ServerInfo object describing the server where the secure resource is hosted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var serverInfo: ServerInfo = js.native
  /**
    * URL of the sign-in page where users will be redirected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var signInPage: String = js.native
}

object IdentityManagerSetRedirectionHandlerHandlerFunction {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    resourceUrl: String,
    returnUrlParamName: String,
    serverInfo: ServerInfo,
    signInPage: String
  ): IdentityManagerSetRedirectionHandlerHandlerFunction = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resourceUrl = resourceUrl.asInstanceOf[js.Any], returnUrlParamName = returnUrlParamName.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any], signInPage = signInPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerSetRedirectionHandlerHandlerFunction]
  }
  @scala.inline
  implicit class IdentityManagerSetRedirectionHandlerHandlerFunctionOps[Self <: IdentityManagerSetRedirectionHandlerHandlerFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnUrlParamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnUrlParamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerInfo(value: ServerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignInPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signInPage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

