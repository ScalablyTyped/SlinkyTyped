package typingsSlinky.antDesignPro.resultMod

import slinky.core.TagMod
import typingsSlinky.antDesignPro.antDesignProStrings.error
import typingsSlinky.antDesignPro.antDesignProStrings.success
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProps extends js.Object {
  var actions: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[TagMod[Any]] = js.undefined
  var extra: js.UndefOr[TagMod[Any]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
  var `type`: success | error
}

object ResultProps {
  @scala.inline
  def apply(
    `type`: success | error,
    actions: TagMod[Any] = null,
    className: String = null,
    description: TagMod[Any] = null,
    extra: TagMod[Any] = null,
    style: CSSProperties = null,
    title: TagMod[Any] = null
  ): ResultProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultProps]
  }
}

