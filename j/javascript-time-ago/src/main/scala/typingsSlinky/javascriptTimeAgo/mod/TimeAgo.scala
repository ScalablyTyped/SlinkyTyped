package typingsSlinky.javascriptTimeAgo.mod

import typingsSlinky.javascriptTimeAgo.localeMod.DefaultFormats
import typingsSlinky.javascriptTimeAgo.localeMod.Duration
import typingsSlinky.javascriptTimeAgo.localeMod.Formats
import typingsSlinky.javascriptTimeAgo.localeMod.RTFFormatter
import typingsSlinky.javascriptTimeAgo.localeMod.TimeUnit
import typingsSlinky.javascriptTimeAgo.styleMod.FormatStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeAgo extends js.Object {
  def format(input: Double): String = js.native
  def format(input: Double, style: String): String = js.native
  def format(input: Double, style: FormatStyle): String = js.native
  def format(input: js.Date): String = js.native
  def format(input: js.Date, style: String): String = js.native
  def format(input: js.Date, style: FormatStyle): String = js.native
  def formatNumber(number: Double): String = js.native
  def formatValue(value: Double, unit: TimeUnit, localeData: Duration): String = js.native
  def formatValue(value: js.Date, unit: TimeUnit, localeData: Duration): String = js.native
  def getFormatter(flavor: DefaultFormats): RTFFormatter = js.native
  def getLocaleData(): Duration = js.native
  def getLocaleData(format: Formats): Duration = js.native
  def getRule(value: Double, unit: TimeUnit, localeData: Duration): String = js.native
   // Defaults to "long"
  def getRule(value: js.Date, unit: TimeUnit, localeData: Duration): String = js.native
}

