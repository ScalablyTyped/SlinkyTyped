package typingsSlinky.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/date", JSImport.Namespace)
@js.native
object dateMod extends js.Object {
  
  @js.native
  class SfDate () extends js.Object
  /* static members */
  @js.native
  object SfDate extends js.Object {
    
    def parseDate(str: String): js.Date = js.native
    
    def toDateLiteral(date: String): SfDate = js.native
    def toDateLiteral(date: Double): SfDate = js.native
    def toDateLiteral(date: js.Date): SfDate = js.native
    
    def toDateTimeLiteral(date: String): SfDate = js.native
    def toDateTimeLiteral(date: Double): SfDate = js.native
    def toDateTimeLiteral(date: js.Date): SfDate = js.native
  }
}
