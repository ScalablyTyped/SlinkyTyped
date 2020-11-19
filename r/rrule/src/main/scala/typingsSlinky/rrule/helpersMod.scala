package typingsSlinky.rrule

import typingsSlinky.rrule.anon.Div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrule/dist/esm/src/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  def clone[T](array: js.Array[T]): js.Array[T] = js.native
  
  def divmod(a: Double, b: Double): Div = js.native
  
  def empty[T](): Boolean = js.native
  def empty[T](obj: js.Array[T]): Boolean = js.native
  
  def includes[T](arr: js.UndefOr[scala.Nothing], `val`: T): Boolean = js.native
  def includes[T](arr: js.Array[T], `val`: T): Boolean = js.native
  def includes[T](arr: Null, `val`: T): Boolean = js.native
  
  def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  def isNumber(): /* is number */ Boolean = js.native
  def isNumber(value: js.Any): /* is number */ Boolean = js.native
  
  def isPresent[T](): /* is T */ Boolean = js.native
  def isPresent[T](value: T): /* is T */ Boolean = js.native
  
  def isWeekdayStr(): /* is rrule.rrule/dist/esm/src/weekday.WeekdayStr */ Boolean = js.native
  def isWeekdayStr(value: js.Any): /* is rrule.rrule/dist/esm/src/weekday.WeekdayStr */ Boolean = js.native
  
  def notEmpty[T](): /* is std.Array<T> */ Boolean = js.native
  def notEmpty[T](obj: js.Array[T]): /* is std.Array<T> */ Boolean = js.native
  
  def padStart(item: String, targetLength: Double): String = js.native
  def padStart(item: String, targetLength: Double, padString: String): String = js.native
  def padStart(item: Double, targetLength: Double): String = js.native
  def padStart(item: Double, targetLength: Double, padString: String): String = js.native
  
  def pymod(a: Double, b: Double): Double = js.native
  
  def range(start: Double): js.Array[Double] = js.native
  def range(start: Double, end: Double): js.Array[Double] = js.native
  
  def repeat[T](value: T, times: Double): js.Array[T | js.Array[T]] = js.native
  def repeat[T](value: js.Array[T], times: Double): js.Array[T | js.Array[T]] = js.native
  
  def split(str: String, sep: String, num: Double): js.Array[String] = js.native
  
  def toArray[T](item: T): js.Array[T] = js.native
  def toArray[T](item: js.Array[T]): js.Array[T] = js.native
}
