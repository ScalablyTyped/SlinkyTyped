package typingsSlinky.reactToolbox.listListItemActionsMod

import slinky.core.TagMod
import typingsSlinky.reactToolbox.listListItemActionMod.ListItemActionTheme
import typingsSlinky.reactToolbox.reactToolboxStrings.left
import typingsSlinky.reactToolbox.reactToolboxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemActionsProps extends js.Object {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[ListItemActionsTheme with ListItemActionTheme] = js.undefined
  /**
    * List item action type.
    */
  var `type`: js.UndefOr[left | right] = js.undefined
}

object ListItemActionsProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    theme: ListItemActionsTheme with ListItemActionTheme = null,
    `type`: left | right = null
  ): ListItemActionsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemActionsProps]
  }
}

