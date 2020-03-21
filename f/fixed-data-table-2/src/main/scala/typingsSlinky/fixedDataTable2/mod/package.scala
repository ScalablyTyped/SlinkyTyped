package typingsSlinky.fixedDataTable2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ElementOrFunc[P] = java.lang.String | slinky.core.facade.ReactElement | (js.Function1[/* props */ P, java.lang.String | slinky.core.facade.ReactElement])
  type TableRowEventHandler = js.Function2[
    /* event */ slinky.core.SyntheticEvent[typingsSlinky.std.Event_, typingsSlinky.fixedDataTable2.mod.Table], 
    /* rowIndex */ scala.Double, 
    scala.Unit
  ]
}
