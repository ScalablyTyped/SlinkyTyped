package typingsSlinky.antvG2.anon

import typingsSlinky.antvG2.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoSetAxis extends js.Object {
  /**
    * 自动设置坐标轴的文本，避免重复和遮挡
    */
  var autoSetAxis: js.UndefOr[Boolean] = js.native
  /**
    * 列标题
    */
  var colTitle: js.UndefOr[OffsetY | Null] = js.native
  /**
    * 创建每个分面中的视图
    * @param view 视图对象
    * @param facet 行列等信息，常见属性：data rows cols rowIndex colIndex rowField colField
    */
  var eachView: js.UndefOr[js.Function2[/* view */ View, /* facet */ js.Any, Unit]] = js.native
  var fields: js.UndefOr[js.Array[String]] = js.native
  /**
    * 每个 view 之间的间距
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * 行标题
    */
  var rowTitle: js.UndefOr[OffsetX | Null] = js.native
  /**
    * 显示标题
    */
  var showTitle: js.UndefOr[Boolean] = js.native
}

object AutoSetAxis {
  @scala.inline
  def apply(): AutoSetAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoSetAxis]
  }
  @scala.inline
  implicit class AutoSetAxisOps[Self <: AutoSetAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSetAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSetAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSetAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSetAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withColTitle(value: OffsetY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withColTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colTitle")(null)
        ret
    }
    @scala.inline
    def withEachView(value: (/* view */ View, /* facet */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachView")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEachView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachView")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withRowTitle(value: OffsetX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRowTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTitle")(null)
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.undefined)
        ret
    }
  }
  
}

