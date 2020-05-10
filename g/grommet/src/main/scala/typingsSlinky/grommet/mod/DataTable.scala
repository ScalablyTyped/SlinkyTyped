package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLTableElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.dataTableMod.DataTableProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.TableHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "DataTable")
@js.native
class DataTable protected ()
  extends Component[
      DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
      js.Object, 
      js.Any
    ] {
  def this(props: DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])) = this()
  def this(
    props: DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "DataTable")
@js.native
object DataTable extends TopLevel[
      ReactComponentClass[
        DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
      ]
    ]

