package typingsSlinky.antd.resultMod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var extra: js.UndefOr[TagMod[Any]] = js.undefined
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[ResultStatusType] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subTitle: js.UndefOr[TagMod[Any]] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object ResultProps {
  @scala.inline
  def apply(
    className: String = null,
    extra: TagMod[Any] = null,
    icon: TagMod[Any] = null,
    prefixCls: String = null,
    status: ResultStatusType = null,
    style: CSSProperties = null,
    subTitle: TagMod[Any] = null,
    title: TagMod[Any] = null
  ): ResultProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultProps]
  }
}

