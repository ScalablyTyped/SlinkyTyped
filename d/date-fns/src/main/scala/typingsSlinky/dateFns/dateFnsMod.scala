package typingsSlinky.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/format", JSImport.Namespace)
@js.native
object dateFnsMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, format: String): String = js.native
    def apply(date: Double, format: String, options: AnonFirstWeekContainsDate): String = js.native
    def apply(date: js.Date, format: String): String = js.native
    def apply(date: js.Date, format: String, options: AnonFirstWeekContainsDate): String = js.native
  }
  
}

