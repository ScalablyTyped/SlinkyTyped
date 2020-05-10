package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.antvG2Strings.center
import typingsSlinky.antvG2.antvG2Strings.polygon
import typingsSlinky.antvG2.mod.Styles.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisGrid extends js.Object {
  /**
    * 声明网格顶点从两个刻度中间开始，默认从刻度点开始
    */
  var align: js.UndefOr[center] = js.native
  /**
    * 当网格类型 type 为 polygon 时，使用 alternateColor 为网格设置交替的颜色。
    * 指定一个值则先渲染奇数层，两个值则交替渲染
    */
  var alternateColor: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  /**
    * 是否隐藏第一条网格线，默认为 false
    */
  var hideFirstLine: js.UndefOr[Boolean] = js.native
  /**
    * 是否隐藏最后一条网格线，默认为 false
    */
  var hideLastLine: js.UndefOr[Boolean] = js.native
  /**
    * 当网格类型 type 为 line 时，使用 lineStyle 设置样式
    */
  var lineStyle: js.UndefOr[line] = js.native
  /**
    * 声明网格的类型，line 表示线，polygon 表示矩形框
    */
  var `type`: js.UndefOr[typingsSlinky.antvG2.antvG2Strings.line | polygon] = js.native
}

object AxisGrid {
  @scala.inline
  def apply(): AxisGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisGrid]
  }
  @scala.inline
  implicit class AxisGridOps[Self <: AxisGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternateColor(value: String | (js.Tuple2[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFirstLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFirstLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFirstLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFirstLine")(js.undefined)
        ret
    }
    @scala.inline
    def withHideLastLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLastLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideLastLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLastLine")(js.undefined)
        ret
    }
    @scala.inline
    def withLineStyle(value: line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.antvG2.antvG2Strings.line | polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

