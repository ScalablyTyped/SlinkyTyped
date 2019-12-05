package typingsSlinky.rrule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/datewithzone", JSImport.Namespace)
@js.native
object distEsmSrcDatewithzoneMod extends js.Object {
  @js.native
  class DateWithZone protected () extends js.Object {
    def this(date: js.Date) = this()
    def this(date: js.Date, tzid: String) = this()
    var date: js.Date = js.native
    val isUTC: js.Any = js.native
    var tzid: js.UndefOr[String | Null] = js.native
    def getTime(): Double = js.native
    def rezonedDate(): js.Date = js.native
  }
  
}

