package typingsSlinky.atMaterialDashUiCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.hiddenHiddenJsMod.HiddenJsProps
import typingsSlinky.atMaterialDashUiCore.hiddenHiddenJsMod.default
import typingsSlinky.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HiddenJs
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@material-ui/core/Hidden/HiddenJs", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    initialWidth: Breakpoint = null,
    lgDown: js.UndefOr[Boolean] = js.undefined,
    lgUp: js.UndefOr[Boolean] = js.undefined,
    mdDown: js.UndefOr[Boolean] = js.undefined,
    mdUp: js.UndefOr[Boolean] = js.undefined,
    only: Breakpoint | js.Array[Breakpoint] = null,
    smDown: js.UndefOr[Boolean] = js.undefined,
    smUp: js.UndefOr[Boolean] = js.undefined,
    xlDown: js.UndefOr[Boolean] = js.undefined,
    xlUp: js.UndefOr[Boolean] = js.undefined,
    xsDown: js.UndefOr[Boolean] = js.undefined,
    xsUp: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(lgDown)) __obj.updateDynamic("lgDown")(lgDown.asInstanceOf[js.Any])
    if (!js.isUndefined(lgUp)) __obj.updateDynamic("lgUp")(lgUp.asInstanceOf[js.Any])
    if (!js.isUndefined(mdDown)) __obj.updateDynamic("mdDown")(mdDown.asInstanceOf[js.Any])
    if (!js.isUndefined(mdUp)) __obj.updateDynamic("mdUp")(mdUp.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(smDown)) __obj.updateDynamic("smDown")(smDown.asInstanceOf[js.Any])
    if (!js.isUndefined(smUp)) __obj.updateDynamic("smUp")(smUp.asInstanceOf[js.Any])
    if (!js.isUndefined(xlDown)) __obj.updateDynamic("xlDown")(xlDown.asInstanceOf[js.Any])
    if (!js.isUndefined(xlUp)) __obj.updateDynamic("xlUp")(xlUp.asInstanceOf[js.Any])
    if (!js.isUndefined(xsDown)) __obj.updateDynamic("xsDown")(xsDown.asInstanceOf[js.Any])
    if (!js.isUndefined(xsUp)) __obj.updateDynamic("xsUp")(xsUp.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atMaterialDashUiCore.hiddenHiddenJsMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HiddenJsProps
}

