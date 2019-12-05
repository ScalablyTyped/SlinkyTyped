package typingsSlinky.rcDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libExpandableTableMod {
  import org.scalajs.dom.raw.HTMLElement
  import slinky.core.facade.ReactElement
  import slinky.web.SyntheticMouseEvent
  import typingsSlinky.rcDashTable.libInterfaceMod.Cell
  import typingsSlinky.rcDashTable.libInterfaceMod.FixedType
  import typingsSlinky.rcDashTable.libInterfaceMod.Key
  import typingsSlinky.rcDashTable.libInterfaceMod.RenderRows

  type ExpandChangeEventHandler[ValueType] = js.Function5[
    /* expanded */ Boolean, 
    /* record */ ValueType, 
    /* event */ SyntheticMouseEvent[HTMLElement], 
    /* rowKey */ Key, 
    /* destroy */ Boolean, 
    Unit
  ]
  type ExpandEventHandler[ValueType] = js.Function2[/* expanded */ Boolean, /* record */ ValueType, Unit]
  type RenderExpandIndentCell = js.Function2[/* rows */ js.Array[js.Array[Cell]], /* fixed */ FixedType, Unit]
  type RenderTableRows[ValueType] = js.Function8[
    /* renderRows */ RenderRows[ValueType], 
    /* rows */ js.Array[ReactElement], 
    /* record */ ValueType, 
    /* index */ Double, 
    /* indent */ Double, 
    /* fixed */ FixedType, 
    /* parentKey */ Key, 
    /* ancestorKeys */ js.Array[Key], 
    Unit
  ]
}
