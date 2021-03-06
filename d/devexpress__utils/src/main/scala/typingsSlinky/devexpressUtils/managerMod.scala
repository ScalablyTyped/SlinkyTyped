package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.dateMod.DateFormatter
import typingsSlinky.devexpressUtils.numberMod.NumberFormatter
import typingsSlinky.devexpressUtils.optionsMod.IFormattersOptions
import typingsSlinky.devexpressUtils.stringMod.StringFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managerMod {
  
  @JSImport("@devexpress/utils/lib/formatters/manager", "SimpleFormattersManager")
  @js.native
  class SimpleFormattersManager protected () extends StObject {
    def this(options: IFormattersOptions) = this()
    
    var dateFormatter: DateFormatter = js.native
    
    def formatDate(format: String, date: js.Date): String = js.native
    
    def formatNumber(format: String, value: Double): String = js.native
    
    def formatString(pattern: String, args: js.Any*): String = js.native
    
    var numberFormatter: NumberFormatter = js.native
    
    var options: IFormattersOptions = js.native
    
    var stringFormatter: StringFormatter = js.native
  }
}
