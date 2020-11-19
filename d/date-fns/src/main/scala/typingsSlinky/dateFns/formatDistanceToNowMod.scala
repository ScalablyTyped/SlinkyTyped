package typingsSlinky.dateFns

import typingsSlinky.dateFns.anon.AddSuffix
import typingsSlinky.dateFns.anon.IncludeSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/formatDistanceToNow", JSImport.Namespace)
@js.native
object formatDistanceToNowMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double): String = js.native
    def apply(date: Double, options: AddSuffix): String = js.native
    def apply(date: Double, options: IncludeSeconds): String = js.native
    def apply(date: js.Date): String = js.native
    def apply(date: js.Date, options: AddSuffix): String = js.native
    def apply(date: js.Date, options: IncludeSeconds): String = js.native
  }
}
