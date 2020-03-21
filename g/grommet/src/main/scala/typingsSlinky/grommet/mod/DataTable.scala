package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.dataTableMod.DataTableProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.TableHTMLAttributes
import typingsSlinky.std.HTMLTableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "DataTable")
@js.native
class DataTable protected ()
  extends Component[
      DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: DataTableProps with (DetailedHTMLProps[
        TableHTMLAttributes[org.scalajs.dom.raw.HTMLTableElement], 
        org.scalajs.dom.raw.HTMLTableElement
      ])) = this()
  def this(
    props: DataTableProps with (DetailedHTMLProps[
        TableHTMLAttributes[org.scalajs.dom.raw.HTMLTableElement], 
        org.scalajs.dom.raw.HTMLTableElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "DataTable")
@js.native
object DataTable extends TopLevel[
      ComponentClass[
        DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
        ComponentState
      ]
    ]

