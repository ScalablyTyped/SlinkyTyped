package typingsSlinky.dateFns

import typingsSlinky.dateFns.anon.FirstWeekContainsDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/format/index", JSImport.Namespace)
@js.native
object dateFnsIndexMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double, format: String): String = js.native
    def apply(date: Double, format: String, options: FirstWeekContainsDate): String = js.native
    def apply(date: js.Date, format: String): String = js.native
    def apply(date: js.Date, format: String, options: FirstWeekContainsDate): String = js.native
  }
}
