package typingsSlinky.atBlueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmComponentsTabsTabMod.TabId
import typingsSlinky.atBlueprintjsCore.libEsmComponentsTabsTabTitleMod.ITabTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabTitle
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsTabsTabTitleMod.TabTitle] {
  @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabTitle", "TabTitle")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    id: TabId,
    onClick: (TabId, SyntheticMouseEvent[HTMLElement]) => Unit,
    parentId: TabId,
    selected: Boolean,
    panel: typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    panelClassName: String = null,
    title: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsTabsTabTitleMod.TabTitle] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), parentId = parentId.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITabTitleProps
}

