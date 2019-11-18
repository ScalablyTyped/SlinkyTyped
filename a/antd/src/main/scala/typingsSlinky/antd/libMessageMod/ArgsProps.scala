package typingsSlinky.antd.libMessageMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsProps extends js.Object {
  var content: TagMod[Any]
  var duration: Double | Null
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var key: js.UndefOr[String | Double] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `type`: NoticeType
}

object ArgsProps {
  @scala.inline
  def apply(
    content: TagMod[Any],
    `type`: NoticeType,
    duration: Int | Double = null,
    icon: TagMod[Any] = null,
    key: String | Double = null,
    onClose: () => Unit = null
  ): ArgsProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[ArgsProps]
  }
}

