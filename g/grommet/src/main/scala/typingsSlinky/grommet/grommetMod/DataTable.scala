package typingsSlinky.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.componentsDataTableMod.DataTableProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.TableHTMLAttributes
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

