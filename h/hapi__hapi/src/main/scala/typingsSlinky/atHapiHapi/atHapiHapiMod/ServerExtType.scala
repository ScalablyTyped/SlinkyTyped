package typingsSlinky.atHapiHapi.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atHapiHapi.atHapiHapiStrings.onPreStart
  - typings.atHapiHapi.atHapiHapiStrings.onPostStart
  - typings.atHapiHapi.atHapiHapiStrings.onPreStop
  - typings.atHapiHapi.atHapiHapiStrings.onPostStop
*/
trait ServerExtType extends js.Object

object ServerExtType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onPostStart: typingsSlinky.atHapiHapi.atHapiHapiStrings.onPostStart = this.cast("onPostStart")
  @scala.inline
  def onPostStop: typingsSlinky.atHapiHapi.atHapiHapiStrings.onPostStop = this.cast("onPostStop")
  @scala.inline
  def onPreStart: typingsSlinky.atHapiHapi.atHapiHapiStrings.onPreStart = this.cast("onPreStart")
  @scala.inline
  def onPreStop: typingsSlinky.atHapiHapi.atHapiHapiStrings.onPreStop = this.cast("onPreStop")
}

