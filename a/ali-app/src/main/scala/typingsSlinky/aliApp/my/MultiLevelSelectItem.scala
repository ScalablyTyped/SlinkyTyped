package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 级联选择 https://docs.alipay.com/mini/api/ewdxl3
@js.native
trait MultiLevelSelectItem extends js.Object {
  var name: String = js.native
  var subList: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.native
}

object MultiLevelSelectItem {
  @scala.inline
  def apply(name: String): MultiLevelSelectItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLevelSelectItem]
  }
  @scala.inline
  implicit class MultiLevelSelectItemOps[Self <: MultiLevelSelectItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubList(value: js.Array[MultiLevelSelectItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subList")(js.undefined)
        ret
    }
  }
  
}

