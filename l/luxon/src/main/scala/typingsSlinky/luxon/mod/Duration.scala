package typingsSlinky.luxon.mod

import typingsSlinky.luxon.anon.IncludeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "Duration")
@js.native
class Duration () extends js.Object {
  
  def as(unit: DurationUnit): Double = js.native
  
  var days: Double = js.native
  
  def equals(other: Duration): Boolean = js.native
  
  def get(unit: DurationUnit): Double = js.native
  
  var hours: Double = js.native
  
  var invalidExplanation: String | Null = js.native
  
  var invalidReason: String | Null = js.native
  
  var isValid: Boolean = js.native
  
  var locale: String = js.native
  
  def mapUnits(fn: js.Function2[/* x */ Double, /* u */ DurationUnit, Double]): Duration = js.native
  
  var milliseconds: Double = js.native
  
  def minus(duration: Double): Duration = js.native
  def minus(duration: Duration): Duration = js.native
  def minus(duration: DurationObject): Duration = js.native
  
  var minutes: Double = js.native
  
  var months: Double = js.native
  
  def negate(): Duration = js.native
  
  def normalize(): Duration = js.native
  
  var numberingSystem: String = js.native
  
  def plus(duration: Double): Duration = js.native
  def plus(duration: Duration): Duration = js.native
  def plus(duration: DurationObject): Duration = js.native
  
  var quarters: Double = js.native
  
  def reconfigure(objectPattern: DurationOptions): Duration = js.native
  
  var seconds: Double = js.native
  
  def set(values: DurationObjectUnits): Duration = js.native
  
  def shiftTo(units: DurationUnit*): Duration = js.native
  
  def toFormat(format: String): String = js.native
  def toFormat(format: String, options: DurationToFormatOptions): String = js.native
  
  def toISO(): String | Null = js.native
  
  def toJSON(): String | Null = js.native
  
  def toObject(): DurationObject = js.native
  def toObject(options: IncludeConfig): DurationObject = js.native
  
  var weeks: Double = js.native
  
  var years: Double = js.native
}
/* static members */
@JSImport("luxon", "Duration")
@js.native
object Duration extends js.Object {
  
  def fromISO(text: String): Duration = js.native
  def fromISO(text: String, options: DurationOptions): Duration = js.native
  
  def fromMillis(count: Double): Duration = js.native
  def fromMillis(count: Double, options: DurationOptions): Duration = js.native
  
  def fromObject(Object: DurationObject): Duration = js.native
  
  def invalid(): Duration = js.native
  def invalid(reason: String): Duration = js.native
  
  def isDuration(o: js.Any): /* is luxon.luxon.Duration */ Boolean = js.native
}
