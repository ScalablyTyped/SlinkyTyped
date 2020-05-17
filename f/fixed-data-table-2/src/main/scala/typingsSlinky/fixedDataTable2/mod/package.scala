package typingsSlinky.fixedDataTable2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TableRowEventHandler = js.Function2[
    /* event */ slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, typingsSlinky.fixedDataTable2.mod.Table], 
    /* rowIndex */ scala.Double, 
    scala.Unit
  ]
}
