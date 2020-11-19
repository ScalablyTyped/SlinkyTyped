package typingsSlinky.dateIoDateFns

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.dateIoCore.mod.DateIOFormats
import typingsSlinky.dateIoCore.mod.IUtils
import typingsSlinky.dateIoDateFns.anon.Formats
import typingsSlinky.dateIoDateFns.dateIoDateFnsStrings.AM
import typingsSlinky.dateIoDateFns.dateIoDateFnsStrings.PM
import typingsSlinky.dateIoDateFns.dateIoDateFnsStrings.am_
import typingsSlinky.dateIoDateFns.dateIoDateFnsStrings.pm_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@date-io/date-fns/build/date-fns-utils", JSImport.Namespace)
@js.native
object dateFnsUtilsMod extends js.Object {
  
  @js.native
  trait DateFnsUtils
    extends IUtils[js.Date] {
    
    @JSName("formats")
    var formats_DateFnsUtils: DateIOFormats[String] = js.native
    
    @JSName("getMeridiemText")
    def getMeridiemText_am(ampm: am_): AM | PM = js.native
    @JSName("getMeridiemText")
    def getMeridiemText_pm(ampm: pm_): AM | PM = js.native
    
    @JSName("locale")
    var locale_DateFnsUtils: js.UndefOr[Locale] = js.native
  }
  
  @js.native
  trait Locale
    extends TopLevel[typingsSlinky.dateFns.Locale]
  
  @js.native
  class default () extends DateFnsUtils {
    def this(hasLocaleFormats: Formats) = this()
  }
}
