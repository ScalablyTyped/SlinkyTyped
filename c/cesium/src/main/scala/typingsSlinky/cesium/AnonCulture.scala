package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Ellipsoid
import typingsSlinky.cesium.mod.Proxy
import typingsSlinky.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCulture extends js.Object {
  var culture: js.UndefOr[String] = js.native
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  var key: js.UndefOr[String] = js.native
  var mapStyle: js.UndefOr[String] = js.native
  var proxy: js.UndefOr[Proxy] = js.native
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.native
  var tileProtocol: js.UndefOr[String] = js.native
  var url: String = js.native
}

object AnonCulture {
  @scala.inline
  def apply(url: String): AnonCulture = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCulture]
  }
  @scala.inline
  implicit class AnonCultureOps[Self <: AnonCulture] (val x: Self) extends AnyVal {
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
    def withCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsoid(value: Ellipsoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMapStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: Proxy): Self = {
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
    def withTileDiscardPolicy(value: TileDiscardPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileDiscardPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileDiscardPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileDiscardPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withTileProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileProtocol")(js.undefined)
        ret
    }
  }
  
}

