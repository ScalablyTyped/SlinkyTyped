package typingsSlinky.bizcharts.bizchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bizcharts.bizchartsStrings.rect
  - typings.bizcharts.bizchartsStrings.polar
  - typings.bizcharts.bizchartsStrings.theta
  - typings.bizcharts.bizchartsStrings.helix
*/
trait CoordType extends js.Object

object CoordType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def helix: typingsSlinky.bizcharts.bizchartsStrings.helix = this.cast("helix")
  @scala.inline
  def polar: typingsSlinky.bizcharts.bizchartsStrings.polar = this.cast("polar")
  @scala.inline
  def rect: typingsSlinky.bizcharts.bizchartsStrings.rect = this.cast("rect")
  @scala.inline
  def theta: typingsSlinky.bizcharts.bizchartsStrings.theta = this.cast("theta")
}

