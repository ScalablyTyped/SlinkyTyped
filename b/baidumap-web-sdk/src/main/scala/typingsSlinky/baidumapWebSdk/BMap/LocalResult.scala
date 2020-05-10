package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalResult extends js.Object {
  var bounds: Bounds = js.native
  var center: LocalResultPoi = js.native
  var city: String = js.native
  var keyword: String = js.native
  var moreResultsUrl: String = js.native
  var province: String = js.native
  var radius: Double = js.native
  var suggestions: js.Array[String] = js.native
  def getCityList(): js.Array[_] = js.native
  def getCurrentNumPois(): Double = js.native
  def getNumPages(): Double = js.native
  def getNumPois(): Double = js.native
  def getPageIndex(): Double = js.native
  def getPoi(i: Double): LocalResultPoi = js.native
}

object LocalResult {
  @scala.inline
  def apply(
    bounds: Bounds,
    center: LocalResultPoi,
    city: String,
    getCityList: () => js.Array[_],
    getCurrentNumPois: () => Double,
    getNumPages: () => Double,
    getNumPois: () => Double,
    getPageIndex: () => Double,
    getPoi: Double => LocalResultPoi,
    keyword: String,
    moreResultsUrl: String,
    province: String,
    radius: Double,
    suggestions: js.Array[String]
  ): LocalResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], getCityList = js.Any.fromFunction0(getCityList), getCurrentNumPois = js.Any.fromFunction0(getCurrentNumPois), getNumPages = js.Any.fromFunction0(getNumPages), getNumPois = js.Any.fromFunction0(getNumPois), getPageIndex = js.Any.fromFunction0(getPageIndex), getPoi = js.Any.fromFunction1(getPoi), keyword = keyword.asInstanceOf[js.Any], moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalResult]
  }
  @scala.inline
  implicit class LocalResultOps[Self <: LocalResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenter(value: LocalResultPoi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCityList(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCityList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentNumPois(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentNumPois")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumPages(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumPages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumPois(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumPois")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPageIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPoi(value: Double => LocalResultPoi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPoi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoreResultsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreResultsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

