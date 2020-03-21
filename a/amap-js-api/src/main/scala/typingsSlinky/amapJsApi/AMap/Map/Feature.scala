package typingsSlinky.amapJsApi.AMap.Map

import typingsSlinky.amapJsApi.amapJsApiStrings.point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApi.amapJsApiStrings.bg
  - typingsSlinky.amapJsApi.amapJsApiStrings.point_
  - typingsSlinky.amapJsApi.amapJsApiStrings.road
  - typingsSlinky.amapJsApi.amapJsApiStrings.building
*/
trait Feature extends js.Object

object Feature {
  @scala.inline
  def bg: typingsSlinky.amapJsApi.amapJsApiStrings.bg = this.cast("bg")
  @scala.inline
  def building: typingsSlinky.amapJsApi.amapJsApiStrings.building = this.cast("building")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def point: point_ = this.cast("point")
  @scala.inline
  def road: typingsSlinky.amapJsApi.amapJsApiStrings.road = this.cast("road")
}

