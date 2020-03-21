package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.AnonExpandedBoolean
import typingsSlinky.baseui.accordionMod.PanelOverrides
import typingsSlinky.baseui.accordionMod.PanelProps
import typingsSlinky.baseui.accordionMod.SharedProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Panel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.accordionMod.Panel] {
  @JSImport("baseui/accordion", "Panel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    expanded: js.UndefOr[Boolean] = js.undefined,
    onChange: /* args */ AnonExpandedBoolean => _ = null,
    onClick: /* e */ Event_ => _ = null,
    onKeyDown: /* e */ KeyboardEvent => _ = null,
    overrides: PanelOverrides[SharedProps] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    renderPanelContent: js.UndefOr[Boolean] = js.undefined,
    title: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.accordionMod.Panel] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPanelContent)) __obj.updateDynamic("renderPanelContent")(renderPanelContent.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.accordionMod.Panel] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.accordionMod.Panel](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PanelProps
}

