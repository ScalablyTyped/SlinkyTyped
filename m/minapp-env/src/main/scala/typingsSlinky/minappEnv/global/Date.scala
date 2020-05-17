package typingsSlinky.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.minappEnv.DateConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Date")
@js.native
class Date ()
  extends typingsSlinky.minappEnv.Date {
  def this(value: java.lang.String) = this()
  def this(value: Double) = this()
  def this(value: typingsSlinky.minappEnv.Date) = this()
  def this(year: Double, month: Double) = this()
  def this(year: Double, month: Double, date: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
  def this(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ) = this()
}

@JSGlobal("Date")
@js.native
object Date extends TopLevel[DateConstructor]

