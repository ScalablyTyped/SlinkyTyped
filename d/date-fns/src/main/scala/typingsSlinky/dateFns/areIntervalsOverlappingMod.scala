package typingsSlinky.dateFns

import typingsSlinky.dateFns.anon.Inclusive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/areIntervalsOverlapping", JSImport.Namespace)
@js.native
object areIntervalsOverlappingMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(
      intervalLeft: typingsSlinky.dateFns.mod.Interval,
      intervalRight: typingsSlinky.dateFns.mod.Interval
    ): Boolean = js.native
    def apply(
      intervalLeft: typingsSlinky.dateFns.mod.Interval,
      intervalRight: typingsSlinky.dateFns.mod.Interval,
      options: Inclusive
    ): Boolean = js.native
  }
  
}

