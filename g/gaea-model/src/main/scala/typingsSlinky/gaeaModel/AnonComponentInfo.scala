package typingsSlinky.gaeaModel

import typingsSlinky.gaeaModel.FitGaea.ViewportComponentFullInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentInfo extends js.Object {
  // 组合的完整信息（不是 copy 的, 是真正对应的 mapUniqueKey）
  var componentInfo: ViewportComponentFullInfo = js.native
  // 父级的 index
  var index: Double = js.native
  // 父级 mapKey
  var parentMapUniqueKey: String = js.native
}

object AnonComponentInfo {
  @scala.inline
  def apply(componentInfo: ViewportComponentFullInfo, index: Double, parentMapUniqueKey: String): AnonComponentInfo = {
    val __obj = js.Dynamic.literal(componentInfo = componentInfo.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentInfo]
  }
  @scala.inline
  implicit class AnonComponentInfoOps[Self <: AnonComponentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentInfo(value: ViewportComponentFullInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentMapUniqueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMapUniqueKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

