package typingsSlinky.reactMdTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tableCellMod {
  type TableCellAttributes = typingsSlinky.std.Omit[
    typingsSlinky.react.mod.TdHTMLAttributes[typingsSlinky.std.HTMLTableDataCellElement] | typingsSlinky.react.mod.ThHTMLAttributes[typingsSlinky.std.HTMLTableHeaderCellElement], 
    typingsSlinky.reactMdTable.reactMdTableStrings.colSpan | typingsSlinky.reactMdTable.reactMdTableStrings.scope
  ]
  type TableCellElement = typingsSlinky.std.HTMLTableDataCellElement | typingsSlinky.std.HTMLTableHeaderCellElement
}
