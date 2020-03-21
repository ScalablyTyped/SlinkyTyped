package typingsSlinky.blueprintjsCore.breadcrumbMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.IActionProps
import typingsSlinky.blueprintjsCore.propsMod.ILinkProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBreadcrumbProps
  extends IActionProps
     with ILinkProps {
  /** Whether this breadcrumb is the current breadcrumb. */
  var current: js.UndefOr[Boolean] = js.undefined
}

object IBreadcrumbProps {
  @scala.inline
  def apply(
    className: String = null,
    current: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    onClick: /* event */ SyntheticMouseEvent[HTMLElement] => Unit = null,
    target: String = null,
    text: TagMod[Any] = null
  ): IBreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbProps]
  }
}

