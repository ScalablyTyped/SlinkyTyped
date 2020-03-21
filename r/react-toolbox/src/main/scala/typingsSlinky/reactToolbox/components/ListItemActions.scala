package typingsSlinky.reactToolbox.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactToolbox.listListItemActionMod.ListItemActionTheme
import typingsSlinky.reactToolbox.listListItemActionsMod.ListItemActionsProps
import typingsSlinky.reactToolbox.listListItemActionsMod.ListItemActionsTheme
import typingsSlinky.reactToolbox.reactToolboxStrings.left
import typingsSlinky.reactToolbox.reactToolboxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemActions
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactToolbox.libListMod.ListItemActions] {
  @JSImport("react-toolbox/lib/list", "ListItemActions")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    theme: ListItemActionsTheme with ListItemActionTheme = null,
    `type`: left | right = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactToolbox.libListMod.ListItemActions] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactToolbox.libListMod.ListItemActions] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactToolbox.libListMod.ListItemActions](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ListItemActionsProps
}

