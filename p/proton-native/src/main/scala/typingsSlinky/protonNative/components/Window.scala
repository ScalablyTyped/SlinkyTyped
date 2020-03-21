package typingsSlinky.protonNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.protonNative.AnonW
import typingsSlinky.protonNative.AnonY
import typingsSlinky.protonNative.mod.WindowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Window
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.protonNative.mod.Window] {
  @JSImport("proton-native", "Window")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: title */
  def apply(
    borderless: js.UndefOr[Boolean] = js.undefined,
    closed: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    lastWindow: js.UndefOr[Boolean] = js.undefined,
    margined: js.UndefOr[Boolean] = js.undefined,
    menuBar: js.UndefOr[Boolean] = js.undefined,
    onClose: () => Unit = null,
    onContentSizeChange: /* size */ AnonY => Unit = null,
    size: AnonW = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.protonNative.mod.Window] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(lastWindow)) __obj.updateDynamic("lastWindow")(lastWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(margined)) __obj.updateDynamic("margined")(margined.asInstanceOf[js.Any])
    if (!js.isUndefined(menuBar)) __obj.updateDynamic("menuBar")(menuBar.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1(onContentSizeChange))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.protonNative.mod.Window] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.protonNative.mod.Window](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = WindowProps
}

