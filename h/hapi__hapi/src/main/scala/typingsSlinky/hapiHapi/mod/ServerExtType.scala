package typingsSlinky.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiHapi.hapiHapiStrings.onPreStart
  - typingsSlinky.hapiHapi.hapiHapiStrings.onPostStart
  - typingsSlinky.hapiHapi.hapiHapiStrings.onPreStop
  - typingsSlinky.hapiHapi.hapiHapiStrings.onPostStop
*/
trait ServerExtType extends js.Object

object ServerExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onPostStart: typingsSlinky.hapiHapi.hapiHapiStrings.onPostStart = this.cast("onPostStart")
  @scala.inline
  def onPostStop: typingsSlinky.hapiHapi.hapiHapiStrings.onPostStop = this.cast("onPostStop")
  @scala.inline
  def onPreStart: typingsSlinky.hapiHapi.hapiHapiStrings.onPreStart = this.cast("onPreStart")
  @scala.inline
  def onPreStop: typingsSlinky.hapiHapi.hapiHapiStrings.onPreStop = this.cast("onPreStop")
}

