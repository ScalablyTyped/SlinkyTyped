package typingsSlinky.rcDashTable.libInterfaceMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcDashTable.Anon_Cell
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableComponents extends js.Object {
  var body: js.UndefOr[Anon_Cell] = js.undefined
  var header: js.UndefOr[Anon_Cell] = js.undefined
  var table: js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]] = js.undefined
}

object TableComponents {
  @scala.inline
  def apply(
    body: Anon_Cell = null,
    header: Anon_Cell = null,
    table: CustomizeComponent[HTMLAttributes[HTMLElement]] = null
  ): TableComponents = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponents]
  }
}

