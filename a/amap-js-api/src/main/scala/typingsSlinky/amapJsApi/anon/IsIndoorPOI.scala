package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsIndoorPOI extends js.Object {
  /**
    * 热点id
    */
  var id: String = js.native
  // internal
  /**
    * 是否室内热点
    */
  var isIndoorPOI: Boolean = js.native
  /**
    * 经纬度坐标
    */
  var lnglat: LngLat = js.native
  /**
    * 热点名称
    */
  var name: String = js.native
}

object IsIndoorPOI {
  @scala.inline
  def apply(id: String, isIndoorPOI: Boolean, lnglat: LngLat, name: String): IsIndoorPOI = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isIndoorPOI = isIndoorPOI.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsIndoorPOI]
  }
  @scala.inline
  implicit class IsIndoorPOIOps[Self <: IsIndoorPOI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIndoorPOI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndoorPOI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLnglat(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lnglat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

