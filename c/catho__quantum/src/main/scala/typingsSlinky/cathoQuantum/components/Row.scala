package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.cathoQuantum.Anon7
import typingsSlinky.cathoQuantum.gridMod.BreakpointsType
import typingsSlinky.cathoQuantum.gridMod.RowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Row
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.cathoQuantum.gridMod.Row] {
  @JSImport("@catho/quantum/Grid", "Row")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    hide: BreakpointsType | js.Array[BreakpointsType] = null,
    `no-gutters`: js.UndefOr[Boolean] = js.undefined,
    theme: Anon7 = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.cathoQuantum.gridMod.Row] = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-gutters`)) __obj.updateDynamic("no-gutters")(`no-gutters`.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.cathoQuantum.gridMod.Row] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.cathoQuantum.gridMod.Row](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RowProps
}

