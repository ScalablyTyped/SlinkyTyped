package typingsSlinky.antDesignCompatible.formFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomScrollIntoViewConfig extends js.Object {
  /** 是否和左边界对齐 */
  var alignWithLeft: js.UndefOr[Boolean] = js.native
  /** 是否和上边界对齐  */
  var alignWithTop: js.UndefOr[Boolean] = js.native
  /** 是否允许容器水平滚动 */
  var allowHorizontalScroll: js.UndefOr[Boolean] = js.native
  /** 底部偏移量 */
  var offsetBottom: js.UndefOr[Double] = js.native
  /** 左侧偏移量 */
  var offsetLeft: js.UndefOr[Double] = js.native
  /** 右侧偏移量 */
  var offsetRight: js.UndefOr[Double] = js.native
  /** 顶部偏移量 */
  var offsetTop: js.UndefOr[Double] = js.native
  /** 当内容可见时是否允许滚动容器 */
  var onlyScrollIfNeeded: js.UndefOr[Boolean] = js.native
}

object DomScrollIntoViewConfig {
  @scala.inline
  def apply(): DomScrollIntoViewConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomScrollIntoViewConfig]
  }
  @scala.inline
  implicit class DomScrollIntoViewConfigOps[Self <: DomScrollIntoViewConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignWithLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignWithLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignWithLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignWithLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignWithTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignWithTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignWithTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignWithTop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHorizontalScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHorizontalScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHorizontalScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHorizontalScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyScrollIfNeeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyScrollIfNeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyScrollIfNeeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyScrollIfNeeded")(js.undefined)
        ret
    }
  }
  
}

