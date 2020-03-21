package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.cathoQuantum.AnonBreakpointsObject
import typingsSlinky.cathoQuantum.gridMod.HideProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Hide
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.cathoQuantum.gridMod.Hide] {
  @JSImport("@catho/quantum/Grid", "Hide")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    large: js.UndefOr[Boolean] = js.undefined,
    medium: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    theme: AnonBreakpointsObject = null,
    xlarge: js.UndefOr[Boolean] = js.undefined,
    xsmall: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.cathoQuantum.gridMod.Hide] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (!js.isUndefined(medium)) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(xlarge)) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (!js.isUndefined(xsmall)) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.cathoQuantum.gridMod.Hide] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.cathoQuantum.gridMod.Hide](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HideProps
}

