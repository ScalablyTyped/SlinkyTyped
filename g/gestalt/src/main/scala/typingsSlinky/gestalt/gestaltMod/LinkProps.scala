package typingsSlinky.gestalt.gestaltMod

import slinky.core.TagMod
import typingsSlinky.gestalt.Anon_Event
import typingsSlinky.gestalt.gestaltStrings.`null`
import typingsSlinky.gestalt.gestaltStrings.blank
import typingsSlinky.gestalt.gestaltStrings.self
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ Anon_Event, Unit]] = js.undefined
  var target: js.UndefOr[`null` | self | blank] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    href: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    onClick: /* args */ Anon_Event => Unit = null,
    target: `null` | self | blank = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
}

