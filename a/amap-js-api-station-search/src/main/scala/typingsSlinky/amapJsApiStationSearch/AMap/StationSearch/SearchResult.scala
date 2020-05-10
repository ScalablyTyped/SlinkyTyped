package typingsSlinky.amapJsApiStationSearch.AMap.StationSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  /**
    * 查该城市无此公交站时，返回的建议城市列表
    */
  var cityList: js.UndefOr[js.Array[CityInfo]] = js.native
  /**
    * 成功状态文字描述
    */
  var info: String = js.native
  /**
    * 查无此公交站时，返回的建议关键字列表，可根据建议关键字查询
    */
  var keywordList: js.UndefOr[js.Array[String]] = js.native
  /**
    * 根据查询条件返回公交站点信息
    */
  var stationInfo: js.Array[StationInfo] = js.native
}

object SearchResult {
  @scala.inline
  def apply(info: String, stationInfo: js.Array[StationInfo]): SearchResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], stationInfo = stationInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStationInfo(value: js.Array[StationInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCityList(value: js.Array[CityInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCityList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityList")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywordList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywordList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywordList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywordList")(js.undefined)
        ret
    }
  }
  
}

