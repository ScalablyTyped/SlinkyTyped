package typingsSlinky.atBlueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmComponentsPanelDashStackPanelPropsMod.IPanel
import typingsSlinky.atBlueprintjsCore.libEsmComponentsPanelDashStackPanelViewMod.IPanelViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelView
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atBlueprintjsCore.libEsmComponentsPanelDashStackPanelViewMod.PanelView
    ] {
  @JSImport("@blueprintjs/core/lib/esm/components/panel-stack/panelView", "PanelView")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onClose: IPanel[js.Object] => Unit,
    onOpen: IPanel[js.Object] => Unit,
    panel: IPanel[js.Object],
    showHeader: Boolean,
    previousPanel: IPanel[js.Object] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.atBlueprintjsCore.libEsmComponentsPanelDashStackPanelViewMod.PanelView
  ] = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
    if (previousPanel != null) __obj.updateDynamic("previousPanel")(previousPanel.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IPanelViewProps
}

