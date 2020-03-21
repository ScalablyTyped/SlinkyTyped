package typingsSlinky.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AdazzleReactDataGrid {
  type ColumnEventCallback = js.Function2[
    /* ev */ slinky.core.SyntheticEvent[typingsSlinky.std.Event_, js.Any], 
    /* args */ typingsSlinky.reactDataGrid.AnonName, 
    scala.Unit
  ]
  type ReactDataGrid[T] = typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid_[T]
}
