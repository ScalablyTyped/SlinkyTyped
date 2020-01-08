package typingsSlinky.bizcharts.bizchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bizcharts.bizchartsStrings.rect
  - typings.bizcharts.bizchartsStrings.list
  - typings.bizcharts.bizchartsStrings.circle
  - typings.bizcharts.bizchartsStrings.tree
  - typings.bizcharts.bizchartsStrings.mirror
  - typings.bizcharts.bizchartsStrings.matrix
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

