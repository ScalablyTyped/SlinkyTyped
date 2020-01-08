package typingsSlinky.grommet.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.Anon_ArgsColor
import typingsSlinky.grommet.Anon_ColorOpacity
import typingsSlinky.grommet.componentsMeterMod.MeterProps
import typingsSlinky.grommet.grommetStrings.bar
import typingsSlinky.grommet.grommetStrings.circle
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Meter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.grommet.grommetMod.Meter] {
  @JSImport("grommet", "Meter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    background: String | Anon_ColorOpacity = null,
    gridArea: GridAreaType = null,
    margin: MarginType = null,
    max: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    size: xsmall | small | medium | large | xlarge | full | String = null,
    thickness: xsmall | small | medium | large | xlarge | String = null,
    `type`: bar | circle = null,
    values: js.Array[Anon_ArgsColor] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.grommet.grommetMod.Meter] = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.grommet.grommetMod.Meter] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.grommet.grommetMod.Meter](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MeterProps
}

