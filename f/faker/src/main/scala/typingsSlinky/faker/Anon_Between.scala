package typingsSlinky.faker

import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Between extends js.Object {
  def between(from: String, to: String): js.Date = js.native
  def between(from: String, to: Date): js.Date = js.native
  def between(from: Double, to: String): js.Date = js.native
  def between(from: Double, to: Date): js.Date = js.native
  def between(from: Date, to: String): js.Date = js.native
  def between(from: Date, to: Date): js.Date = js.native
  def future(): js.Date = js.native
  def future(years: Double): js.Date = js.native
  def future(years: Double, refDate: String): js.Date = js.native
  def future(years: Double, refDate: Date): js.Date = js.native
  def month(): String = js.native
  def month(options: Anon_Abbr): String = js.native
  def past(): js.Date = js.native
  def past(years: Double): js.Date = js.native
  def past(years: Double, refDate: String): js.Date = js.native
  def past(years: Double, refDate: Date): js.Date = js.native
  def recent(): js.Date = js.native
  def recent(days: Double): js.Date = js.native
  def soon(): js.Date = js.native
  def soon(days: Double): js.Date = js.native
  def weekday(): String = js.native
  def weekday(options: Anon_Abbr): String = js.native
}

