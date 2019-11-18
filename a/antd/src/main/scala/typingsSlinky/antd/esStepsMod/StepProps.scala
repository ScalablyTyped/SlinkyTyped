package typingsSlinky.antd.esStepsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdStrings.error
import typingsSlinky.antd.antdStrings.finish
import typingsSlinky.antd.antdStrings.process
import typingsSlinky.antd.antdStrings.wait
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[TagMod[Any]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var status: js.UndefOr[wait | process | finish | error] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subTitle: js.UndefOr[TagMod[Any]] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object StepProps {
  @scala.inline
  def apply(
    className: String = null,
    description: TagMod[Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: TagMod[Any] = null,
    onClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    status: wait | process | finish | error = null,
    style: CSSProperties = null,
    subTitle: TagMod[Any] = null,
    title: TagMod[Any] = null
  ): StepProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepProps]
  }
}

