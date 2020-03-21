package typingsSlinky.materializeCss

import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Datepicker, 'setDate'> */
@js.native
trait PickDatepickersetDate extends js.Object {
  @JSName("setDate")
  var setDate_Original: js.Function2[
    /* date */ js.UndefOr[js.Date | String], 
    /* preventOnSelect */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  def setDate(): Unit = js.native
  def setDate(date: String): Unit = js.native
  def setDate(date: String, preventOnSelect: Boolean): Unit = js.native
  def setDate(date: Date): Unit = js.native
  def setDate(date: Date, preventOnSelect: Boolean): Unit = js.native
}

