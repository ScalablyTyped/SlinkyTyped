package typingsSlinky.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Between extends js.Object {
  def between(from: String, to: String): js.Date = js.native
  def between(from: String, to: js.Date): js.Date = js.native
  def between(from: Double, to: String): js.Date = js.native
  def between(from: Double, to: js.Date): js.Date = js.native
  def between(from: js.Date, to: String): js.Date = js.native
  def between(from: js.Date, to: js.Date): js.Date = js.native
  def future(): js.Date = js.native
  def future(years: js.UndefOr[scala.Nothing], refDate: String): js.Date = js.native
  def future(years: js.UndefOr[scala.Nothing], refDate: js.Date): js.Date = js.native
  def future(years: Double): js.Date = js.native
  def future(years: Double, refDate: String): js.Date = js.native
  def future(years: Double, refDate: js.Date): js.Date = js.native
  def month(): String = js.native
  def month(options: Abbr): String = js.native
  def past(): js.Date = js.native
  def past(years: js.UndefOr[scala.Nothing], refDate: String): js.Date = js.native
  def past(years: js.UndefOr[scala.Nothing], refDate: js.Date): js.Date = js.native
  def past(years: Double): js.Date = js.native
  def past(years: Double, refDate: String): js.Date = js.native
  def past(years: Double, refDate: js.Date): js.Date = js.native
  def recent(): js.Date = js.native
  def recent(days: Double): js.Date = js.native
  def weekday(): String = js.native
  def weekday(options: Abbr): String = js.native
}

