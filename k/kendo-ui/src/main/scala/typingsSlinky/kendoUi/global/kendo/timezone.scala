package typingsSlinky.kendoUi.global.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezone {
  
  @JSGlobal("kendo.timezone.abbr")
  @js.native
  def abbr(targetDate: js.Date, timezone: String): String = js.native
  
  @JSGlobal("kendo.timezone.apply")
  @js.native
  def apply(targetDate: js.Date, offset: String): js.Date = js.native
  @JSGlobal("kendo.timezone.apply")
  @js.native
  def apply(targetDate: js.Date, offset: Double): js.Date = js.native
  
  @JSGlobal("kendo.timezone.convert")
  @js.native
  def convert(targetDate: js.Date, fromOffset: String, toOffset: String): js.Date = js.native
  @JSGlobal("kendo.timezone.convert")
  @js.native
  def convert(targetDate: js.Date, fromOffset: String, toOffset: Double): js.Date = js.native
  @JSGlobal("kendo.timezone.convert")
  @js.native
  def convert(targetDate: js.Date, fromOffset: Double, toOffset: String): js.Date = js.native
  @JSGlobal("kendo.timezone.convert")
  @js.native
  def convert(targetDate: js.Date, fromOffset: Double, toOffset: Double): js.Date = js.native
  
  @JSGlobal("kendo.timezone.offset")
  @js.native
  def offset(utcTime: js.Date, timezone: String): Double = js.native
  @JSGlobal("kendo.timezone.offset")
  @js.native
  def offset(utcTime: Double, timezone: String): Double = js.native
  
  @JSGlobal("kendo.timezone.remove")
  @js.native
  def remove(targetDate: js.Date, offset: String): js.Date = js.native
  @JSGlobal("kendo.timezone.remove")
  @js.native
  def remove(targetDate: js.Date, offset: Double): js.Date = js.native
  
  @JSGlobal("kendo.timezone.toLocalDate")
  @js.native
  def toLocalDate(targetDate: js.Date): js.Date = js.native
  @JSGlobal("kendo.timezone.toLocalDate")
  @js.native
  def toLocalDate(targetDate: Double): js.Date = js.native
}
