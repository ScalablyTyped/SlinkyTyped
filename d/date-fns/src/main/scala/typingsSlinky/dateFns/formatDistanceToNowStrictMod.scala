package typingsSlinky.dateFns

import typingsSlinky.dateFns.anon.RoundingMethod
import typingsSlinky.dateFns.anon.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/formatDistanceToNowStrict", JSImport.Namespace)
@js.native
object formatDistanceToNowStrictMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): String = js.native
    def apply(date: Double, options: RoundingMethod): String = js.native
    def apply(date: Double, options: Unit): String = js.native
    def apply(date: js.Date): String = js.native
    def apply(date: js.Date, options: RoundingMethod): String = js.native
    def apply(date: js.Date, options: Unit): String = js.native
  }
  
}

