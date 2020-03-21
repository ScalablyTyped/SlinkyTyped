package typingsSlinky.bizcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bizcharts.bizchartsStrings.mousemove
  - typingsSlinky.bizcharts.bizchartsStrings.click
  - typingsSlinky.bizcharts.bizchartsStrings.none
*/
trait triggerOnType extends js.Object

object triggerOnType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typingsSlinky.bizcharts.bizchartsStrings.click = this.cast("click")
  @scala.inline
  def mousemove: typingsSlinky.bizcharts.bizchartsStrings.mousemove = this.cast("mousemove")
  @scala.inline
  def none: typingsSlinky.bizcharts.bizchartsStrings.none = this.cast("none")
}

