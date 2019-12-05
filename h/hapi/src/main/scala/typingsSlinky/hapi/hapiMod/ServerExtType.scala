package typingsSlinky.hapi.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapi.hapiStrings.onPreStart
  - typings.hapi.hapiStrings.onPostStart
  - typings.hapi.hapiStrings.onPreStop
  - typings.hapi.hapiStrings.onPostStop
*/
trait ServerExtType extends js.Object

object ServerExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onPostStart: typingsSlinky.hapi.hapiStrings.onPostStart = this.cast("onPostStart")
  @scala.inline
  def onPostStop: typingsSlinky.hapi.hapiStrings.onPostStop = this.cast("onPostStop")
  @scala.inline
  def onPreStart: typingsSlinky.hapi.hapiStrings.onPreStart = this.cast("onPreStart")
  @scala.inline
  def onPreStop: typingsSlinky.hapi.hapiStrings.onPreStop = this.cast("onPreStop")
}

