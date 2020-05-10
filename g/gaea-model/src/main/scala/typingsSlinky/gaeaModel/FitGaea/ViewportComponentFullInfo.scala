package typingsSlinky.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportComponentFullInfo extends js.Object {
  // 子元素列表 （包括非直接子集）
  var childs: StringDictionary[ViewportComponentInfo] = js.native
  // 组件信息
  var componentInfo: ViewportComponentInfo = js.native
  // 组件的 mapUniqueKey
  var mapUniqueKey: String = js.native
}

object ViewportComponentFullInfo {
  @scala.inline
  def apply(
    childs: StringDictionary[ViewportComponentInfo],
    componentInfo: ViewportComponentInfo,
    mapUniqueKey: String
  ): ViewportComponentFullInfo = {
    val __obj = js.Dynamic.literal(childs = childs.asInstanceOf[js.Any], componentInfo = componentInfo.asInstanceOf[js.Any], mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportComponentFullInfo]
  }
  @scala.inline
  implicit class ViewportComponentFullInfoOps[Self <: ViewportComponentFullInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChilds(value: StringDictionary[ViewportComponentInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentInfo(value: ViewportComponentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapUniqueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapUniqueKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

