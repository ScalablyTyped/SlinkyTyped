package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityManagerSetProtocolErrorHandlerHandlerFunction extends Object {
  /**
    * The secure resource URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setProtocolErrorHandler)
    */
  var resourceUrl: String = js.native
  /**
    * ServerInfo object describing the server where the secure resource is hosted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setProtocolErrorHandler)
    */
  var serverInfo: ServerInfo = js.native
}

object IdentityManagerSetProtocolErrorHandlerHandlerFunction {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    resourceUrl: String,
    serverInfo: ServerInfo
  ): IdentityManagerSetProtocolErrorHandlerHandlerFunction = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resourceUrl = resourceUrl.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerSetProtocolErrorHandlerHandlerFunction]
  }
  @scala.inline
  implicit class IdentityManagerSetProtocolErrorHandlerHandlerFunctionOps[Self <: IdentityManagerSetProtocolErrorHandlerHandlerFunction] (val x: Self) extends AnyVal {
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
    def withServerInfo(value: ServerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

