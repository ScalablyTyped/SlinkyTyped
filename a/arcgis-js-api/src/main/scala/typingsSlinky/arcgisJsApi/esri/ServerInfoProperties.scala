package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerInfoProperties extends js.Object {
  /**
    * The token service URL used to generate tokens for ArcGIS Server Admin resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#adminTokenServiceUrl)
    */
  var adminTokenServiceUrl: js.UndefOr[String] = js.native
  /**
    * Version of the ArcGIS Server deployed on this server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#currentVersion)
    */
  var currentVersion: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the [server](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server) is a [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#hasPortal)
    */
  var hasPortal: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the [server](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server) is an [ArcGIS Server](https://enterprise.arcgis.com/en/server/latest/get-started/windows/what-is-arcgis-for-server-.htm) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#hasServer)
    */
  var hasServer: js.UndefOr[Boolean] = js.native
  /**
    * The server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server)
    */
  var server: js.UndefOr[String] = js.native
  /**
    * Validity of short-lived token in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#shortLivedTokenValidity)
    */
  var shortLivedTokenValidity: js.UndefOr[Double] = js.native
  /**
    * The token service URL used to generate tokens for the secured resources on the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#tokenServiceUrl)
    */
  var tokenServiceUrl: js.UndefOr[String] = js.native
}

object ServerInfoProperties {
  @scala.inline
  def apply(): ServerInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerInfoProperties]
  }
  @scala.inline
  implicit class ServerInfoPropertiesOps[Self <: ServerInfoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminTokenServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminTokenServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminTokenServiceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminTokenServiceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withHasPortal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasPortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPortal")(js.undefined)
        ret
    }
    @scala.inline
    def withHasServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasServer")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
    @scala.inline
    def withShortLivedTokenValidity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortLivedTokenValidity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortLivedTokenValidity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortLivedTokenValidity")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenServiceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenServiceUrl")(js.undefined)
        ret
    }
  }
  
}

