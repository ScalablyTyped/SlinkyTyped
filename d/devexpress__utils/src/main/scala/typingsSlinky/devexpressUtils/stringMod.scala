package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.dateMod.DateFormatter
import typingsSlinky.devexpressUtils.numberMod.NumberFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/formatters/string", JSImport.Namespace)
@js.native
object stringMod extends js.Object {
  
  @js.native
  class StringFormatter protected () extends js.Object {
    def this(dateFormatter: DateFormatter, numberFormatter: NumberFormatter) = this()
    
    var activeDateFormat: js.Any = js.native
    
    val dateFormatter: js.Any = js.native
    
    def format(pattern: String, args: js.Any*): String = js.native
    
    val numberFormatter: js.Any = js.native
    
    var parseSpec: js.Any = js.native
  }
}
