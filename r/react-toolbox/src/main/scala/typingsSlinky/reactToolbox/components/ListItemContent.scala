package typingsSlinky.reactToolbox.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactToolbox.listListItemContentMod.ListItemContentProps
import typingsSlinky.reactToolbox.listListItemContentMod.ListItemContentTheme
import typingsSlinky.reactToolbox.reactToolboxStrings.auto
import typingsSlinky.reactToolbox.reactToolboxStrings.large
import typingsSlinky.reactToolbox.reactToolboxStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemContent
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactToolbox.libListMod.ListItemContent] {
  @JSImport("react-toolbox/lib/list", "ListItemContent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    caption: TagMod[Any] = null,
    legend: String = null,
    theme: ListItemContentTheme = null,
    `type`: auto | normal | large = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactToolbox.libListMod.ListItemContent] = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactToolbox.libListMod.ListItemContent] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactToolbox.libListMod.ListItemContent](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ListItemContentProps
}

