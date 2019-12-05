package typingsSlinky.reactDashToggled.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashToggled.reactDashToggledMod.ReactToggledProps
import typingsSlinky.reactDashToggled.reactDashToggledMod.TogglerStateAndHelpers
import typingsSlinky.reactDashToggled.reactDashToggledMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashToggled
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-toggled", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    defaultOn: js.UndefOr[Boolean] = js.undefined,
    on: js.UndefOr[Boolean] = js.undefined,
    onToggle: (/* on */ Boolean, /* object */ TogglerStateAndHelpers) => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultOn)) __obj.updateDynamic("defaultOn")(defaultOn.asInstanceOf[js.Any])
    if (!js.isUndefined(on)) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2(onToggle))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactToggledProps
}

