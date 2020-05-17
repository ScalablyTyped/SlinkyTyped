package typingsSlinky.dateFns

import typingsSlinky.dateFns.anon.WeekStartsOn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/eachWeekOfInterval", JSImport.Namespace)
@js.native
object esmEachWeekOfIntervalMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(interval: Interval | typingsSlinky.dateFns.mod.Interval): js.Array[js.Date] = js.native
    def apply(interval: Interval, options: WeekStartsOn): js.Array[js.Date] = js.native
    def apply(interval: typingsSlinky.dateFns.mod.Interval, options: typingsSlinky.dateFns.anon.Locale): js.Array[js.Date] = js.native
  }
  
}

