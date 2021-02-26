package typingsSlinky.rmcCalendar

import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rmc-calendar/lib/util", "formatDate")
  @js.native
  def formatDate(date: js.Date, format: String): String = js.native
  @JSImport("rmc-calendar/lib/util", "formatDate")
  @js.native
  def formatDate(date: js.Date, format: String, locale: Locale): String = js.native
  
  @JSImport("rmc-calendar/lib/util", "mergeDateTime")
  @js.native
  def mergeDateTime(): js.Date = js.native
  @JSImport("rmc-calendar/lib/util", "mergeDateTime")
  @js.native
  def mergeDateTime(date: js.UndefOr[scala.Nothing], time: js.Date): js.Date = js.native
  @JSImport("rmc-calendar/lib/util", "mergeDateTime")
  @js.native
  def mergeDateTime(date: js.Date): js.Date = js.native
  @JSImport("rmc-calendar/lib/util", "mergeDateTime")
  @js.native
  def mergeDateTime(date: js.Date, time: js.Date): js.Date = js.native
  
  @JSImport("rmc-calendar/lib/util", "shallowEqual")
  @js.native
  def shallowEqual(objA: js.Any, objB: js.Any): Boolean = js.native
  @JSImport("rmc-calendar/lib/util", "shallowEqual")
  @js.native
  def shallowEqual(objA: js.Any, objB: js.Any, exclude: js.Array[String]): Boolean = js.native
}
