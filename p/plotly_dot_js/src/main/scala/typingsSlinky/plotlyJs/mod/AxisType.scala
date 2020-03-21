package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.plotlyJs.plotlyJsStrings.`-_`
  - typingsSlinky.plotlyJs.plotlyJsStrings.linear
  - typingsSlinky.plotlyJs.plotlyJsStrings.log
  - typingsSlinky.plotlyJs.plotlyJsStrings.date
  - typingsSlinky.plotlyJs.plotlyJsStrings.category
*/
trait AxisType extends js.Object

object AxisType {
  @scala.inline
  def _dash: `-_` = this.cast("-")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typingsSlinky.plotlyJs.plotlyJsStrings.category = this.cast("category")
  @scala.inline
  def date: typingsSlinky.plotlyJs.plotlyJsStrings.date = this.cast("date")
  @scala.inline
  def linear: typingsSlinky.plotlyJs.plotlyJsStrings.linear = this.cast("linear")
  @scala.inline
  def log: typingsSlinky.plotlyJs.plotlyJsStrings.log = this.cast("log")
}

