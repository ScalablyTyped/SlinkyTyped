package typingsSlinky.catalog.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.catalog.catalogNumbers.`1`
import typingsSlinky.catalog.catalogNumbers.`2`
import typingsSlinky.catalog.catalogNumbers.`3`
import typingsSlinky.catalog.catalogNumbers.`4`
import typingsSlinky.catalog.catalogNumbers.`5`
import typingsSlinky.catalog.catalogNumbers.`6`
import typingsSlinky.catalog.mod.CodeSpecimenProps
import typingsSlinky.catalog.mod.SpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CodeSpecimen
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.catalog.mod.CodeSpecimen] {
  @JSImport("catalog", "CodeSpecimen")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    collapsed: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    rawBody: String = null,
    rawOptions: String = null,
    span: `1` | `2` | `3` | `4` | `5` | `6` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.catalog.mod.CodeSpecimen] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (rawBody != null) __obj.updateDynamic("rawBody")(rawBody.asInstanceOf[js.Any])
    if (rawOptions != null) __obj.updateDynamic("rawOptions")(rawOptions.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.catalog.mod.CodeSpecimen] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.catalog.mod.CodeSpecimen](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SpecimenProps with CodeSpecimenProps
}

