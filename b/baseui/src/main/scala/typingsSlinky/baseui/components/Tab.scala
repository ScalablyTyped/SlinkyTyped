package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.baseui.tabsMod.SharedProps
import typingsSlinky.baseui.tabsMod.TabOverrides
import typingsSlinky.baseui.tabsMod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.tabsMod.Tab] {
  @JSImport("baseui/tabs", "Tab")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, id, onClick, onKeyDown */
  def apply(
    $orientation: horizontal | vertical = null,
    active: js.UndefOr[Boolean] = js.undefined,
    onSelect: () => _ = null,
    overrides: TabOverrides[SharedProps] = null,
    title: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.tabsMod.Tab] = {
    val __obj = js.Dynamic.literal()
    if ($orientation != null) __obj.updateDynamic("$orientation")($orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction0(onSelect))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.tabsMod.Tab] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.tabsMod.Tab](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TabProps
}

