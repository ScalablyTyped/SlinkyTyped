package typingsSlinky.reactCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClickWeekNumberCallback = js.Function2[/* weekNumber */ scala.Double, /* date */ js.Date, scala.Unit]
  type DateCallback = js.Function1[/* date */ js.Date, scala.Unit]
  type FormatterCallback = js.Function2[/* locale */ java.lang.String, /* date */ js.Date, java.lang.String]
  type OnChangeDateCallback = js.Function1[/* date */ js.Date | js.Array[js.Date], scala.Unit]
  type ViewCallback = js.Function1[/* props */ typingsSlinky.reactCalendar.mod.ViewCallbackProperties, scala.Unit]
}
