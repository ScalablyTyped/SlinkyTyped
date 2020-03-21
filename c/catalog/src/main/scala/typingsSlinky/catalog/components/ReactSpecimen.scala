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
import typingsSlinky.catalog.mod.ReactSpecimenProps
import typingsSlinky.catalog.mod.SpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSpecimen
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.catalog.mod.ReactSpecimen] {
  @JSImport("catalog", "ReactSpecimen")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    dark: js.UndefOr[Boolean] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    light: js.UndefOr[Boolean] = js.undefined,
    noSource: js.UndefOr[Boolean] = js.undefined,
    plain: js.UndefOr[Boolean] = js.undefined,
    rawBody: String = null,
    rawOptions: String = null,
    responsive: Boolean | String | js.Array[String] = null,
    showSource: js.UndefOr[Boolean] = js.undefined,
    sourceText: String = null,
    span: `1` | `2` | `3` | `4` | `5` | `6` = null,
    state: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.catalog.mod.ReactSpecimen] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (!js.isUndefined(noSource)) __obj.updateDynamic("noSource")(noSource.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (rawBody != null) __obj.updateDynamic("rawBody")(rawBody.asInstanceOf[js.Any])
    if (rawOptions != null) __obj.updateDynamic("rawOptions")(rawOptions.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(showSource)) __obj.updateDynamic("showSource")(showSource.asInstanceOf[js.Any])
    if (sourceText != null) __obj.updateDynamic("sourceText")(sourceText.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.catalog.mod.ReactSpecimen] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.catalog.mod.ReactSpecimen](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SpecimenProps with ReactSpecimenProps
}

