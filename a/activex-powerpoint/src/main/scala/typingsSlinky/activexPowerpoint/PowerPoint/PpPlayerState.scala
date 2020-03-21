package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexPowerpoint.activexPowerpointNumbers.`0`
import typingsSlinky.activexPowerpoint.activexPowerpointNumbers.`1`
import typingsSlinky.activexPowerpoint.activexPowerpointNumbers.`2`
import typingsSlinky.activexPowerpoint.activexPowerpointNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexPowerpoint.activexPowerpointNumbers.`3`
  - typingsSlinky.activexPowerpoint.activexPowerpointNumbers.`1`
  - typingsSlinky.activexPowerpoint.activexPowerpointNumbers.`0`
  - typingsSlinky.activexPowerpoint.activexPowerpointNumbers.`2`
*/
trait PpPlayerState extends js.Object

object PpPlayerState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ppNotReady: `3` = this.cast(3)
  @scala.inline
  def ppPaused: `1` = this.cast(1)
  @scala.inline
  def ppPlaying: `0` = this.cast(0)
  @scala.inline
  def ppStopped: `2` = this.cast(2)
}

