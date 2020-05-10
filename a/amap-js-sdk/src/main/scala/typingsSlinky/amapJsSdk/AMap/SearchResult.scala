package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  var cityList: js.Array[CityInfo] = js.native
  var info: String = js.native
  var keywordList: js.Array[String] = js.native
  var poiList: PoiList = js.native
}

object SearchResult {
  @scala.inline
  def apply(cityList: js.Array[CityInfo], info: String, keywordList: js.Array[String], poiList: PoiList): SearchResult = {
    val __obj = js.Dynamic.literal(cityList = cityList.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], keywordList = keywordList.asInstanceOf[js.Any], poiList = poiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCityList(value: js.Array[CityInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywordList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywordList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoiList(value: PoiList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poiList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

