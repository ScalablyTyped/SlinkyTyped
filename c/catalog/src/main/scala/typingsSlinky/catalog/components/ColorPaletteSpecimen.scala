package typingsSlinky.catalog.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.catalog.catalogNumbers.`1`
import typingsSlinky.catalog.catalogNumbers.`2`
import typingsSlinky.catalog.catalogNumbers.`3`
import typingsSlinky.catalog.catalogNumbers.`4`
import typingsSlinky.catalog.catalogNumbers.`5`
import typingsSlinky.catalog.catalogNumbers.`6`
import typingsSlinky.catalog.mod.ColorPaletteSpecimenProps
import typingsSlinky.catalog.mod.ColorSpecimenProps
import typingsSlinky.catalog.mod.SpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorPaletteSpecimen
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.catalog.mod.ColorPaletteSpecimen] {
  @JSImport("catalog", "ColorPaletteSpecimen")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    colors: js.Array[ColorSpecimenProps],
    horizontal: js.UndefOr[Boolean] = js.undefined,
    rawBody: String = null,
    rawOptions: String = null,
    span: `1` | `2` | `3` | `4` | `5` | `6` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.catalog.mod.ColorPaletteSpecimen] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (rawBody != null) __obj.updateDynamic("rawBody")(rawBody.asInstanceOf[js.Any])
    if (rawOptions != null) __obj.updateDynamic("rawOptions")(rawOptions.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SpecimenProps with ColorPaletteSpecimenProps
}

