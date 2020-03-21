package typingsSlinky.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dateFilterMod {
  type IDateComparatorFunc = js.Function2[/* filterLocalDateAtMidnight */ js.Date, /* cellValue */ js.Any, scala.Double]
}
