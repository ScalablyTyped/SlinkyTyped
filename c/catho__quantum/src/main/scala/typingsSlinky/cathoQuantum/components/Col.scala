package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.cathoQuantum.gridMod.BreakpointsType
import typingsSlinky.cathoQuantum.gridMod.ColProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Col
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.cathoQuantum.gridMod.Col] {
  @JSImport("@catho/quantum/Grid", "Col")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    hide: BreakpointsType | js.Array[BreakpointsType] = null,
    large: Int | Double = null,
    `large-offset`: Int | Double = null,
    medium: Int | Double = null,
    `medium-offset`: Int | Double = null,
    `no-gutters`: js.UndefOr[Boolean] = js.undefined,
    small: Int | Double = null,
    `small-offset`: Int | Double = null,
    xlarge: Int | Double = null,
    `xlarge-offset`: Int | Double = null,
    xsmall: Int | Double = null,
    `xsmall-offset`: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.cathoQuantum.gridMod.Col] = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (`large-offset` != null) __obj.updateDynamic("large-offset")(`large-offset`.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (`medium-offset` != null) __obj.updateDynamic("medium-offset")(`medium-offset`.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-gutters`)) __obj.updateDynamic("no-gutters")(`no-gutters`.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (`small-offset` != null) __obj.updateDynamic("small-offset")(`small-offset`.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (`xlarge-offset` != null) __obj.updateDynamic("xlarge-offset")(`xlarge-offset`.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (`xsmall-offset` != null) __obj.updateDynamic("xsmall-offset")(`xsmall-offset`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.cathoQuantum.gridMod.Col] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.cathoQuantum.gridMod.Col](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ColProps
}

