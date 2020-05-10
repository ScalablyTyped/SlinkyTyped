package typingsSlinky.amapJsApiDistrictSearch.AMap.DistrictSearch

import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`0`
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`1`
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`2`
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`3`
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.all
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 是否返回行政区边界坐标点
    */
  var extensions: js.UndefOr[base | all] = js.native
  /**
    * 关键字对应的行政区级别或商圈
    */
  var level: js.UndefOr[Level] = js.native
  /**
    * 是否显示商圈
    */
  var showbiz: js.UndefOr[Boolean] = js.native
  /**
    * 显示下级行政区级数
    * 0：不返回下级行政区
    * 1：返回下一级行政区
    * 2：返回下两级行政区
    * 3：返回下三级行政区
    */
  var subdistrict: js.UndefOr[`0` | `1` | `2` | `3`] = js.native
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
    def withExtensions(value: base | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withShowbiz(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showbiz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowbiz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showbiz")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdistrict(value: `0` | `1` | `2` | `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdistrict")(js.undefined)
        ret
    }
  }
  
}

