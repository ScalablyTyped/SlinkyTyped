package typingsSlinky.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dateBodyMod {
  type DateRender[DateType] = js.Function2[/* currentDate */ DateType, /* today */ DateType, slinky.core.facade.ReactElement]
}
