package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.mod.ColumnProps
import typingsSlinky.gestalt.mod.UnsignedUpTo12
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.mod.Column] {
  @JSImport("gestalt", "Column")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    span: UnsignedUpTo12,
    lgSpan: UnsignedUpTo12 = null,
    mdSpan: UnsignedUpTo12 = null,
    smSpan: UnsignedUpTo12 = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.mod.Column] = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    if (lgSpan != null) __obj.updateDynamic("lgSpan")(lgSpan.asInstanceOf[js.Any])
    if (mdSpan != null) __obj.updateDynamic("mdSpan")(mdSpan.asInstanceOf[js.Any])
    if (smSpan != null) __obj.updateDynamic("smSpan")(smSpan.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ColumnProps
}

