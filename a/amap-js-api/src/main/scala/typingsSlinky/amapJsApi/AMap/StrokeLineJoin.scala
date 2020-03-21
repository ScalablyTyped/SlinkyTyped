package typingsSlinky.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApi.amapJsApiStrings.miter
  - typingsSlinky.amapJsApi.amapJsApiStrings.round
  - typingsSlinky.amapJsApi.amapJsApiStrings.bevel
*/
trait StrokeLineJoin extends js.Object

object StrokeLineJoin {
  @scala.inline
  def bevel: typingsSlinky.amapJsApi.amapJsApiStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typingsSlinky.amapJsApi.amapJsApiStrings.miter = this.cast("miter")
  @scala.inline
  def round: typingsSlinky.amapJsApi.amapJsApiStrings.round = this.cast("round")
}

