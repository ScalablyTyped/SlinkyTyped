package typingsSlinky.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.none
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.select
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.lselect
*/
trait LightAlert extends js.Object

object LightAlert {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lselect: typingsSlinky.nodeHueApi.nodeHueApiStrings.lselect = this.cast("lselect")
  @scala.inline
  def none: typingsSlinky.nodeHueApi.nodeHueApiStrings.none = this.cast("none")
  @scala.inline
  def select: typingsSlinky.nodeHueApi.nodeHueApiStrings.select = this.cast("select")
}

