package typingsSlinky.grommet.mod

import org.scalajs.dom.raw.HTMLTableElement
import typingsSlinky.grommet.dataTableMod.DataTableProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.TableHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "DataTable")
@js.native
class DataTable[TRowType] ()
  extends Component[
      DataTableProps[TRowType] with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
      js.Object, 
      js.Any
    ]

