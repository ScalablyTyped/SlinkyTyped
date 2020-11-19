package typingsSlinky.kendoUi.global.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.timezone")
@js.native
object timezone extends js.Object {
  
  def abbr(targetDate: js.Date, timezone: String): String = js.native
  
  @JSName("apply")
  def apply(targetDate: js.Date, offset: String): js.Date = js.native
  @JSName("apply")
  def apply(targetDate: js.Date, offset: Double): js.Date = js.native
  
  def convert(targetDate: js.Date, fromOffset: String, toOffset: String): js.Date = js.native
  def convert(targetDate: js.Date, fromOffset: String, toOffset: Double): js.Date = js.native
  def convert(targetDate: js.Date, fromOffset: Double, toOffset: String): js.Date = js.native
  def convert(targetDate: js.Date, fromOffset: Double, toOffset: Double): js.Date = js.native
  
  def offset(utcTime: Double, timezone: String): Double = js.native
  def offset(utcTime: js.Date, timezone: String): Double = js.native
  
  def remove(targetDate: js.Date, offset: String): js.Date = js.native
  def remove(targetDate: js.Date, offset: Double): js.Date = js.native
  
  def toLocalDate(targetDate: Double): js.Date = js.native
  def toLocalDate(targetDate: js.Date): js.Date = js.native
}
