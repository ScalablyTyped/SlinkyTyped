package typingsSlinky.amapJsApiIndoorMap.AMap.IndoorMap

import typingsSlinky.amapJsApiIndoorMap.amapJsApiIndoorMapNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSuccessResult extends SearchResult {
  /**
    * 建筑信息
    */
  var building: Building = js.native
  /**
    * 楼层的id
    */
  var id: String = js.native
  var status: `0` = js.native
}

object SearchSuccessResult {
  @scala.inline
  def apply(building: Building, id: String, status: `0`): SearchSuccessResult = {
    val __obj = js.Dynamic.literal(building = building.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuccessResult]
  }
  @scala.inline
  implicit class SearchSuccessResultOps[Self <: SearchSuccessResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuilding(value: Building): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("building")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

