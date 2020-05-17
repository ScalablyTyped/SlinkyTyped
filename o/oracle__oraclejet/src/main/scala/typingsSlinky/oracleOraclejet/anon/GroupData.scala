package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupData extends js.Object {
  var data: js.Object = js.native
  var groupData: js.Array[_] = js.native
  var itemData: js.Object = js.native
  var seriesData: js.Object = js.native
}

object GroupData {
  @scala.inline
  def apply(data: js.Object, groupData: js.Array[_], itemData: js.Object, seriesData: js.Object): GroupData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupData = groupData.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], seriesData = seriesData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupData]
  }
  @scala.inline
  implicit class GroupDataOps[Self <: GroupData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

