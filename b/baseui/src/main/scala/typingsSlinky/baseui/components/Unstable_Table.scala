package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.tableDashSemanticMod.Overrides
import typingsSlinky.baseui.tableDashSemanticMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Unstable_Table
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.tableDashSemanticMod.Unstable_Table] {
  @JSImport("baseui/table-semantic", "Unstable_Table")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    columns: js.Array[TagMod[Any]],
    data: js.Array[js.Array[TagMod[Any]]],
    horizontalScrollWidth: String = null,
    overrides: Overrides = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.tableDashSemanticMod.Unstable_Table] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (horizontalScrollWidth != null) __obj.updateDynamic("horizontalScrollWidth")(horizontalScrollWidth.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableProps
}

