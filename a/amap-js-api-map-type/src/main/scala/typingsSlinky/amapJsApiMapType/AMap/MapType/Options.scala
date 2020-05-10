package typingsSlinky.amapJsApiMapType.AMap.MapType

import typingsSlinky.amapJsApiMapType.amapJsApiMapTypeNumbers.`0`
import typingsSlinky.amapJsApiMapType.amapJsApiMapTypeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 初始化默认图层类型，默认为0
    * 取值为0：默认底图
    * 取值为1：卫星图
    */
  var defaultType: js.UndefOr[`0` | `1`] = js.native
  /**
    * 是否叠加路网图层，默认false
    */
  var showRoad: js.UndefOr[Boolean] = js.native
  /**
    * 是否叠加实时交通图层，默认false
    */
  var showTraffic: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultType(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoad")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTraffic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTraffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTraffic")(js.undefined)
        ret
    }
  }
  
}

