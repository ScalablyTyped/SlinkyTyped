package typingsSlinky.cathoQuantum.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: js.UndefOr[TagMod[Any]] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var opened: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    content: TagMod[Any] = null,
    onClick: () => Unit = null,
    opened: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): Content = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

