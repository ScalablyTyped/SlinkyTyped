package typingsSlinky.reactDashDataDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AdazzleReactDataGrid {
  import org.scalajs.dom.raw.Event
  import slinky.core.SyntheticEvent
  import typingsSlinky.reactDashDataDashGrid.Anon_IdxName

  type ColumnEventCallback = js.Function2[/* ev */ SyntheticEvent[Event, js.Any], /* args */ Anon_IdxName, Unit]
  type ReactDataGrid[T] = ReactDataGrid_[T]
}
