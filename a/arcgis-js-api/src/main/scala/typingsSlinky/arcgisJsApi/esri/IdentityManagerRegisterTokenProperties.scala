package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityManagerRegisterTokenProperties extends Object {
  /**
    * Token expiration time specified as number of milliseconds since 1 January 1970 00:00:00 UTC.
    *
    * [Read more...](properties.html)
    */
  var expires: js.UndefOr[Double] = js.native
  /**
    * For ArcGIS Online or Portal, this is https://www.arcgis.com/sharing/rest or similar to https://www.example.com/portal/sharing/rest. For ArcGIS Server this is similar to https://www.example.com/arcgis/rest/services.
    *
    * [Read more...](properties.html)
    */
  var server: String = js.native
  /**
    * Set this to `true` if the user has an ArcGIS Online organizational account and the organization is configured to allow access to resources only through SSL.
    *
    * [Read more...](properties.html)
    */
  var ssl: js.UndefOr[Boolean] = js.native
  /**
    * The access token.
    *
    * [Read more...](properties.html)
    */
  var token: String = js.native
  /**
    * The id of the user who owns the access token.
    *
    * [Read more...](properties.html)
    */
  var userId: js.UndefOr[String] = js.native
}

object IdentityManagerRegisterTokenProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    server: String,
    token: String
  ): IdentityManagerRegisterTokenProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), server = server.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerRegisterTokenProperties]
  }
  @scala.inline
  implicit class IdentityManagerRegisterTokenPropertiesOps[Self <: IdentityManagerRegisterTokenProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

