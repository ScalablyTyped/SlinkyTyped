package typingsSlinky.reactToolbox.listListItemContentMod

import slinky.core.TagMod
import typingsSlinky.reactToolbox.reactToolboxStrings.auto
import typingsSlinky.reactToolbox.reactToolboxStrings.large
import typingsSlinky.reactToolbox.reactToolboxStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemContentProps extends js.Object {
  /**
    * Main text of the item.
    */
  var caption: js.UndefOr[TagMod[Any]] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /**
    * Secondary text to display under the caption.
    */
  var legend: js.UndefOr[String] = js.undefined
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[ListItemContentTheme] = js.undefined
  /**
    * List item content type.
    */
  var `type`: js.UndefOr[auto | normal | large] = js.undefined
}

object ListItemContentProps {
  @scala.inline
  def apply(
    caption: TagMod[Any] = null,
    children: TagMod[Any] = null,
    legend: String = null,
    theme: ListItemContentTheme = null,
    `type`: auto | normal | large = null
  ): ListItemContentProps = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemContentProps]
  }
}

