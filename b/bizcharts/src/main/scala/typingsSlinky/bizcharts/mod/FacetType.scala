package typingsSlinky.bizcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bizcharts.bizchartsStrings.rect
  - typingsSlinky.bizcharts.bizchartsStrings.list
  - typingsSlinky.bizcharts.bizchartsStrings.circle
  - typingsSlinky.bizcharts.bizchartsStrings.tree
  - typingsSlinky.bizcharts.bizchartsStrings.mirror
  - typingsSlinky.bizcharts.bizchartsStrings.matrix
*/
trait FacetType extends js.Object

object FacetType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typingsSlinky.bizcharts.bizchartsStrings.circle = this.cast("circle")
  @scala.inline
  def list: typingsSlinky.bizcharts.bizchartsStrings.list = this.cast("list")
  @scala.inline
  def matrix: typingsSlinky.bizcharts.bizchartsStrings.matrix = this.cast("matrix")
  @scala.inline
  def mirror: typingsSlinky.bizcharts.bizchartsStrings.mirror = this.cast("mirror")
  @scala.inline
  def rect: typingsSlinky.bizcharts.bizchartsStrings.rect = this.cast("rect")
  @scala.inline
  def tree: typingsSlinky.bizcharts.bizchartsStrings.tree = this.cast("tree")
}

