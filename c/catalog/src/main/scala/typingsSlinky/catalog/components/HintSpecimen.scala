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
import typingsSlinky.catalog.mod.HintSpecimenProps
import typingsSlinky.catalog.mod.SpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HintSpecimen
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.catalog.mod.HintSpecimen] {
  @JSImport("catalog", "HintSpecimen")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    directive: js.UndefOr[Boolean] = js.undefined,
    important: js.UndefOr[Boolean] = js.undefined,
    neutral: js.UndefOr[Boolean] = js.undefined,
    rawBody: String = null,
    rawOptions: String = null,
    span: `1` | `2` | `3` | `4` | `5` | `6` = null,
    warning: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.catalog.mod.HintSpecimen] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directive)) __obj.updateDynamic("directive")(directive.asInstanceOf[js.Any])
    if (!js.isUndefined(important)) __obj.updateDynamic("important")(important.asInstanceOf[js.Any])
    if (!js.isUndefined(neutral)) __obj.updateDynamic("neutral")(neutral.asInstanceOf[js.Any])
    if (rawBody != null) __obj.updateDynamic("rawBody")(rawBody.asInstanceOf[js.Any])
    if (rawOptions != null) __obj.updateDynamic("rawOptions")(rawOptions.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.catalog.mod.HintSpecimen] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.catalog.mod.HintSpecimen](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SpecimenProps with HintSpecimenProps
}

