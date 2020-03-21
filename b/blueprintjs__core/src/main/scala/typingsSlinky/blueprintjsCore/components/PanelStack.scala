package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.panelPropsMod.IPanel
import typingsSlinky.blueprintjsCore.panelStackMod.IPanelStackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelStack
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.PanelStack] {
  @JSImport("@blueprintjs/core", "PanelStack")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    initialPanel: IPanel[_] = null,
    onClose: /* removedPanel */ IPanel[js.Object] => Unit = null,
    onOpen: /* addedPanel */ IPanel[js.Object] => Unit = null,
    showPanelHeader: js.UndefOr[Boolean] = js.undefined,
    stack: js.Array[IPanel[_]] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.PanelStack] = {
    val __obj = js.Dynamic.literal()
    if (initialPanel != null) __obj.updateDynamic("initialPanel")(initialPanel.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(showPanelHeader)) __obj.updateDynamic("showPanelHeader")(showPanelHeader.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.PanelStack] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.blueprintjsCore.mod.PanelStack](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IPanelStackProps
}

