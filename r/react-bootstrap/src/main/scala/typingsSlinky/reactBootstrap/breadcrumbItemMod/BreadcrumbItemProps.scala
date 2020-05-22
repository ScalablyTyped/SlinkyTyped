package typingsSlinky.reactBootstrap.breadcrumbItemMod

import slinky.core.TagMod
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbItemProps extends Props[BreadcrumbItem] {
  var active: js.UndefOr[Boolean] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object BreadcrumbItemProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    href: String = null,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[BreadcrumbItem]] = js.undefined,
    target: String = null,
    title: TagMod[Any] = null
  ): BreadcrumbItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbItemProps]
  }
}

