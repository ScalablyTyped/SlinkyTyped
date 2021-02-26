package typingsSlinky.javascriptTimeAgo

import typingsSlinky.javascriptTimeAgo.localeMod.DefaultFormats
import typingsSlinky.javascriptTimeAgo.localeMod.Duration
import typingsSlinky.javascriptTimeAgo.localeMod.Formats
import typingsSlinky.javascriptTimeAgo.localeMod.Locale
import typingsSlinky.javascriptTimeAgo.localeMod.RTFFormatter
import typingsSlinky.javascriptTimeAgo.localeMod.TimeUnit
import typingsSlinky.javascriptTimeAgo.styleMod.FormatStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("javascript-time-ago", JSImport.Namespace)
  @js.native
  class ^ () extends TimeAgo {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
  }
  
  /* static member */
  @JSImport("javascript-time-ago", "addLocale")
  @js.native
  def addLocale(localeData: Locale): Unit = js.native
  
  /* static member */
  @JSImport("javascript-time-ago", "getDefaultLocale")
  @js.native
  def getDefaultLocale(): String = js.native
  
  /* static member */
  @JSImport("javascript-time-ago", "intlDateTimeFormatSupported")
  @js.native
  def intlDateTimeFormatSupported(): Boolean = js.native
  
  /* static member */
  @JSImport("javascript-time-ago", "intlDateTimeFormatSupportedLocale")
  @js.native
  def intlDateTimeFormatSupportedLocale(locale: String): String | Unit = js.native
  
  /* static member */
  @JSImport("javascript-time-ago", "locale")
  @js.native
  def locale(localeData: Locale): Unit = js.native
  
  /* static member */
  @JSImport("javascript-time-ago", "setDefaultLocale")
  @js.native
  def setDefaultLocale(locale: String): Unit = js.native
  
  @js.native
  trait TimeAgo extends StObject {
    
    def format(input: js.Date): String = js.native
    def format(input: js.Date, style: String): String = js.native
    def format(input: js.Date, style: FormatStyle): String = js.native
    def format(input: Double): String = js.native
    def format(input: Double, style: String): String = js.native
    def format(input: Double, style: FormatStyle): String = js.native
    
    def formatNumber(number: Double): String = js.native
    
    def formatValue(value: js.Date, unit: TimeUnit, localeData: Duration): String = js.native
    def formatValue(value: Double, unit: TimeUnit, localeData: Duration): String = js.native
    
    def getFormatter(flavor: DefaultFormats): RTFFormatter = js.native
    
    def getLocaleData(): Duration = js.native
    def getLocaleData(format: Formats): Duration = js.native
    
    // Defaults to "long"
    def getRule(value: js.Date, unit: TimeUnit, localeData: Duration): String = js.native
    def getRule(value: Double, unit: TimeUnit, localeData: Duration): String = js.native
  }
}
