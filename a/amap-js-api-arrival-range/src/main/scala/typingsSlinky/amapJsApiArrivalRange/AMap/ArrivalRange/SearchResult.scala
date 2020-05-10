package typingsSlinky.amapJsApiArrivalRange.AMap.ArrivalRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  /**
    * 到达圈边界坐标点
    */
  var bounds: js.Array[js.Array[js.Array[js.Array[String]]]] = js.native
  /**
    * 提供的终点坐标是否在到达圈内
    */
  var inRange: js.UndefOr[js.Array[Boolean]] = js.native
  /**
    * 查询状态说明
    */
  var info: String = js.native
  // internal
  var infocode: String = js.native
}

object SearchResult {
  @scala.inline
  def apply(bounds: js.Array[js.Array[js.Array[js.Array[String]]]], info: String, infocode: String): SearchResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], infocode = infocode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: js.Array[js.Array[js.Array[js.Array[String]]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfocode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infocode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInRange(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRange")(js.undefined)
        ret
    }
  }
  
}

