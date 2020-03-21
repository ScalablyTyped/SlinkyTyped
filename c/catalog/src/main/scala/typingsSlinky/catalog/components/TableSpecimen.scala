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
import typingsSlinky.catalog.mod.SpecimenProps
import typingsSlinky.catalog.mod.TableSpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableSpecimen
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.catalog.mod.TableSpecimen] {
  @JSImport("catalog", "TableSpecimen")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    rows: js.Array[StringDictionary[TagMod[Any]]],
    columns: js.Array[String] = null,
    rawBody: String = null,
    rawOptions: String = null,
    span: `1` | `2` | `3` | `4` | `5` | `6` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.catalog.mod.TableSpecimen] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (rawBody != null) __obj.updateDynamic("rawBody")(rawBody.asInstanceOf[js.Any])
    if (rawOptions != null) __obj.updateDynamic("rawOptions")(rawOptions.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SpecimenProps with TableSpecimenProps
}

