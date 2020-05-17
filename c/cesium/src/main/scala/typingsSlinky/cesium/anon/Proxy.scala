package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proxy extends js.Object {
  var credit: js.UndefOr[typingsSlinky.cesium.mod.Credit | String] = js.native
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  var proxy: js.UndefOr[js.Any] = js.native
  var url: String = js.native
}

object Proxy {
  @scala.inline
  def apply(url: String): Proxy = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proxy]
  }
  @scala.inline
  implicit class ProxyOps[Self <: Proxy] (val x: Self) extends AnyVal {
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
    def withCredit(value: typingsSlinky.cesium.mod.Credit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(js.undefined)
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
    def withProxy(value: js.Any): Self = {
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
  }
  
}

