package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusListResult extends js.Object {
  var city: String = js.native
  var keyword: String = js.native
  var moreResultsUrl: String = js.native
  def getBusListItem(i: Double): BusListItem = js.native
  def getNumBusList(): Double = js.native
}

object BusListResult {
  @scala.inline
  def apply(
    city: String,
    getBusListItem: Double => BusListItem,
    getNumBusList: () => Double,
    keyword: String,
    moreResultsUrl: String
  ): BusListResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], getBusListItem = js.Any.fromFunction1(getBusListItem), getNumBusList = js.Any.fromFunction0(getNumBusList), keyword = keyword.asInstanceOf[js.Any], moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusListResult]
  }
  @scala.inline
  implicit class BusListResultOps[Self <: BusListResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBusListItem(value: Double => BusListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBusListItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNumBusList(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumBusList")(js.Any.fromFunction0(value))
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
  }
  
}

