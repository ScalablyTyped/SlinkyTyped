package typingsSlinky.reactabularTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactabularTable.AnonRowIndexNumber
import typingsSlinky.reactabularTable.PartialCSSStyleDeclaratio
import typingsSlinky.reactabularTable.mod.BodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Body
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactabularTable.mod.Body] {
  @JSImport("reactabular-table", "Body")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    rowKey: String,
    rows: js.Array[_],
    onRow: (/* row */ js.Any, /* props */ AnonRowIndexNumber) => _ = null,
    style: PartialCSSStyleDeclaratio = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactabularTable.mod.Body] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BodyProps
}

