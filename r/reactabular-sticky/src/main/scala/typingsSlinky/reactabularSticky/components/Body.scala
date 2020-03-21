package typingsSlinky.reactabularSticky.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactabularSticky.PartialUIEvent
import typingsSlinky.reactabularSticky.mod.StickyBodyProps
import typingsSlinky.reactabularTable.AnonRowIndexNumber
import typingsSlinky.reactabularTable.PartialCSSStyleDeclaratio
import typingsSlinky.reactabularTable.mod.BodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Body
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactabularSticky.mod.Body] {
  @JSImport("reactabular-sticky", "Body")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    rowKey: String,
    rows: js.Array[_],
    onRow: (/* row */ js.Any, /* props */ AnonRowIndexNumber) => _ = null,
    onScroll: /* e */ PartialUIEvent => Unit = null,
    style: PartialCSSStyleDeclaratio = null,
    tableHeader: HTMLElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactabularSticky.mod.Body] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tableHeader != null) __obj.updateDynamic("tableHeader")(tableHeader.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StickyBodyProps with BodyProps
}

