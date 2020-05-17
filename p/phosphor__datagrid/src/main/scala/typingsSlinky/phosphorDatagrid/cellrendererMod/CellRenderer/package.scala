package typingsSlinky.phosphorDatagrid.cellrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CellRenderer {
  /**
    * A type alias for a cell renderer config function.
    *
    * This type is used to compute a value from a cell config object.
    */
  type ConfigFunc[T] = js.Function1[
    /* config */ typingsSlinky.phosphorDatagrid.cellrendererMod.CellRenderer.ICellConfig, 
    T
  ]
}
