package typingsSlinky.mockjs.mockjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Date
// see https://github.com/nuysoft/Mock/wiki/Date
/* Rewritten from type alias, can be one of: 
  - typings.mockjs.mockjsStrings.year
  - typings.mockjs.mockjsStrings.month
  - typings.mockjs.mockjsStrings.week
  - typings.mockjs.mockjsStrings.day
  - typings.mockjs.mockjsStrings.hour
  - typings.mockjs.mockjsStrings.minute
  - typings.mockjs.mockjsStrings.second
*/
trait RandomDateUtilString extends js.Object

object RandomDateUtilString {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typingsSlinky.mockjs.mockjsStrings.day = this.cast("day")
  @scala.inline
  def hour: typingsSlinky.mockjs.mockjsStrings.hour = this.cast("hour")
  @scala.inline
  def minute: typingsSlinky.mockjs.mockjsStrings.minute = this.cast("minute")
  @scala.inline
  def month: typingsSlinky.mockjs.mockjsStrings.month = this.cast("month")
  @scala.inline
  def second: typingsSlinky.mockjs.mockjsStrings.second = this.cast("second")
  @scala.inline
  def week: typingsSlinky.mockjs.mockjsStrings.week = this.cast("week")
  @scala.inline
  def year: typingsSlinky.mockjs.mockjsStrings.year = this.cast("year")
}

