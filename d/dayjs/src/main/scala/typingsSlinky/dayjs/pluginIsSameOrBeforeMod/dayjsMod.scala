package typingsSlinky.dayjs.pluginIsSameOrBeforeMod

import typingsSlinky.dayjs.dayjsMod.ConfigType
import typingsSlinky.dayjs.dayjsMod.OpUnitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsMod extends js.Object {
  @js.native
  trait Dayjs extends js.Object {
    def isSameOrBefore(date: ConfigType): Boolean = js.native
    def isSameOrBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
  }
  
}

