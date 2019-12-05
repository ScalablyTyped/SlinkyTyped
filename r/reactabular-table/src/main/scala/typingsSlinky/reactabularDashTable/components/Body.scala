package typingsSlinky.reactabularDashTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CSSStyleDeclaration
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactabularDashTable.Anon_RowIndex
import typingsSlinky.reactabularDashTable.reactabularDashTableMod.BodyProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Body
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactabularDashTable.reactabularDashTableMod.Body] {
  @JSImport("reactabular-table", "Body")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    rowKey: String,
    rows: js.Array[_],
    onRow: (/* row */ js.Any, /* props */ Anon_RowIndex) => _ = null,
    style: Partial[CSSStyleDeclaration] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactabularDashTable.reactabularDashTableMod.Body] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BodyProps
}

