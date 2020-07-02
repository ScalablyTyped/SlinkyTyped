package typingsSlinky.antd.badgeMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.colorsMod.PresetColorType
import typingsSlinky.antd.colorsMod.PresetStatusColorType
import typingsSlinky.antd.typeMod.LiteralUnion
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[LiteralUnion[PresetColorType, String]] = js.undefined
  /** Number to show in badge */
  var count: js.UndefOr[ReactElement] = js.undefined
  /** whether to show red dot without number */
  var dot: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.undefined
  /** Max count to show */
  var overflowCount: js.UndefOr[Double] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var scrollNumberPrefixCls: js.UndefOr[String] = js.undefined
  var showZero: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[PresetStatusColorType] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var text: js.UndefOr[ReactElement] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(): BadgeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeProps]
  }
  @scala.inline
  implicit class BadgePropsOps[Self <: BadgeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: LiteralUnion[PresetColorType, String]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCountReactElement(value: ReactElement): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: ReactElement): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    @scala.inline
    def setOffset(value: js.Tuple2[Double | String, Double | String]): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOverflowCount(value: Double): Self = this.set("overflowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowCount: Self = this.set("overflowCount", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setScrollNumberPrefixCls(value: String): Self = this.set("scrollNumberPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollNumberPrefixCls: Self = this.set("scrollNumberPrefixCls", js.undefined)
    @scala.inline
    def setShowZero(value: Boolean): Self = this.set("showZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowZero: Self = this.set("showZero", js.undefined)
    @scala.inline
    def setStatus(value: PresetStatusColorType): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTextReactElement(value: ReactElement): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: ReactElement): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

