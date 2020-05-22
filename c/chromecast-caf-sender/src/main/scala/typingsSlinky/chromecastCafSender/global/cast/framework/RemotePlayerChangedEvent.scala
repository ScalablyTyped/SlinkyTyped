package typingsSlinky.chromecastCafSender.global.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.RemotePlayerChangedEvent")
@js.native
class RemotePlayerChangedEvent[T] protected ()
  extends typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerChangedEvent[T] {
  def this(
    `type`: typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerEventType,
    field: String,
    value: T
  ) = this()
  /* CompleteClass */
  override var field: String = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override var value: T = js.native
}

