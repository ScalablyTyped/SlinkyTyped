package typingsSlinky.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dplayer.dplayerStrings.none
  - typingsSlinky.dplayer.dplayerStrings.metadata
  - typingsSlinky.dplayer.dplayerStrings.auto
*/
trait Preload extends js.Object

object Preload {
  @scala.inline
  def auto: typingsSlinky.dplayer.dplayerStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def metadata: typingsSlinky.dplayer.dplayerStrings.metadata = this.cast("metadata")
  @scala.inline
  def none: typingsSlinky.dplayer.dplayerStrings.none = this.cast("none")
}

