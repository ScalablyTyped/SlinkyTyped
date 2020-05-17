package typingsSlinky.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AdazzleReactDataGrid {
  type ColumnEventCallback = js.Function2[
    /* ev */ slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, js.Any], 
    /* args */ typingsSlinky.reactDataGrid.anon.Name, 
    scala.Unit
  ]
  type ReactDataGrid[T] = typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid_[T]
}
