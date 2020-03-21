package typingsSlinky.reactSizeme.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactSizeme.mod.SizeMeRenderProps
import typingsSlinky.reactSizeme.reactSizemeStrings.debounce
import typingsSlinky.reactSizeme.reactSizemeStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SizeMe
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactSizeme.mod.SizeMe] {
  @JSImport("react-sizeme", "SizeMe")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    monitorHeight: js.UndefOr[Boolean] = js.undefined,
    monitorPosition: js.UndefOr[Boolean] = js.undefined,
    monitorWidth: js.UndefOr[Boolean] = js.undefined,
    noPlaceholder: js.UndefOr[Boolean] = js.undefined,
    refreshMode: throttle | debounce = null,
    refreshRate: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactSizeme.mod.SizeMe] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(monitorHeight)) __obj.updateDynamic("monitorHeight")(monitorHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorPosition)) __obj.updateDynamic("monitorPosition")(monitorPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWidth)) __obj.updateDynamic("monitorWidth")(monitorWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noPlaceholder)) __obj.updateDynamic("noPlaceholder")(noPlaceholder.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactSizeme.mod.SizeMe] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactSizeme.mod.SizeMe](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SizeMeRenderProps
}

