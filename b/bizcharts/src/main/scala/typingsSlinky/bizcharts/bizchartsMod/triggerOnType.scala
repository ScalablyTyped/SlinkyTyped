package typingsSlinky.bizcharts.bizchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bizcharts.bizchartsStrings.mousemove
  - typings.bizcharts.bizchartsStrings.click
  - typings.bizcharts.bizchartsStrings.none
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

