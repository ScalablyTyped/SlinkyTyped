package typingsSlinky.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportComponentInfo extends js.Object {
  /**
    * 子元素（canDragIn才有）
    * 只存子元素在 map 中的 key
    */
  var layoutChilds: js.UndefOr[js.Array[String]] = js.native
  /**
    * 父级 mapUniqueKey, 这样不但方便寻找父级,还能根据是否为 null 判断是否为根元素
    */
  var parentMapUniqueKey: String = js.native
  /**
    * props
    */
  var props: ComponentProps = js.native
}

object ViewportComponentInfo {
  @scala.inline
  def apply(parentMapUniqueKey: String, props: ComponentProps): ViewportComponentInfo = {
    val __obj = js.Dynamic.literal(parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportComponentInfo]
  }
  @scala.inline
  implicit class ViewportComponentInfoOps[Self <: ViewportComponentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentMapUniqueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMapUniqueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: ComponentProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutChilds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutChilds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutChilds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutChilds")(js.undefined)
        ret
    }
  }
  
}

