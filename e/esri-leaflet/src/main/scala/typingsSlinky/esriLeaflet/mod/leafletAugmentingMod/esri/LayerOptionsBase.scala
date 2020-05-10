package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerOptionsBase extends js.Object {
  /**
    * URL of an ArcGIS API for JavaScript proxy or ArcGIS Resource Proxy to use for proxying requests.
    */
  var proxy: js.UndefOr[String] = js.native
  /**
    * Will use this token to authenticate all calls to the service.
    */
  var token: js.UndefOr[String] = js.native
  /**
    * URL of the Map Service
    */
  var url: String = js.native
  /**
    * Dictates if the service should use CORS when making GET requests.
    */
  var useCors: js.UndefOr[Boolean] = js.native
}

object LayerOptionsBase {
  @scala.inline
  def apply(url: String): LayerOptionsBase = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerOptionsBase]
  }
  @scala.inline
  implicit class LayerOptionsBaseOps[Self <: LayerOptionsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCors")(js.undefined)
        ret
    }
  }
  
}

