package typingsSlinky.antd.esCardMetaMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardMetaProps extends js.Object {
  var avatar: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[TagMod[Any]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object CardMetaProps {
  @scala.inline
  def apply(
    avatar: TagMod[Any] = null,
    className: String = null,
    description: TagMod[Any] = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: TagMod[Any] = null
  ): CardMetaProps = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardMetaProps]
  }
}

