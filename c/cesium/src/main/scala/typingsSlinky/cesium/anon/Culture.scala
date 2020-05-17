package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Culture extends js.Object {
  var culture: js.UndefOr[String] = js.native
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  var key: js.UndefOr[String] = js.native
  var mapStyle: js.UndefOr[String] = js.native
  var proxy: js.UndefOr[typingsSlinky.cesium.mod.Proxy] = js.native
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.native
  var tileProtocol: js.UndefOr[String] = js.native
  var url: String = js.native
}

object Culture {
  @scala.inline
  def apply(url: String): Culture = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Culture]
  }
  @scala.inline
  implicit class CultureOps[Self <: Culture] (val x: Self) extends AnyVal {
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
    def withEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = {
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
    def withProxy(value: typingsSlinky.cesium.mod.Proxy): Self = {
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

