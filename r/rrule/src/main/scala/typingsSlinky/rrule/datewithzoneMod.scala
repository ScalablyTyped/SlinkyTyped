package typingsSlinky.rrule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrule/dist/esm/src/datewithzone", JSImport.Namespace)
@js.native
object datewithzoneMod extends js.Object {
  
  @js.native
  class DateWithZone protected () extends js.Object {
    def this(date: js.Date) = this()
    def this(date: js.Date, tzid: String) = this()
    
    var date: js.Date = js.native
    
    def getTime(): Double = js.native
    
    /* private */ def isUTC: js.Any = js.native
    
    def rezonedDate(): js.Date = js.native
    
    var tzid: js.UndefOr[String | Null] = js.native
  }
}
