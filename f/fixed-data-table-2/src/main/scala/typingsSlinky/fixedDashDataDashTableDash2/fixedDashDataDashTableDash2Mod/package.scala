package typingsSlinky.fixedDashDataDashTableDash2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fixedDashDataDashTableDash2Mod {
  import org.scalajs.dom.raw.Event
  import slinky.core.SyntheticEvent
  import slinky.core.facade.ReactElement

  type ElementOrFunc[P] = String | ReactElement | (js.Function1[/* props */ P, String | ReactElement])
  type TableRowEventHandler = js.Function2[/* event */ SyntheticEvent[Event, Table], /* rowIndex */ Double, Unit]
}
