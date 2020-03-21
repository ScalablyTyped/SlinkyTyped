package typingsSlinky.grommet.announceContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grommet.grommetStrings.off
  - typingsSlinky.grommet.grommetStrings.polite
  - typingsSlinky.grommet.grommetStrings.assertive
*/
trait AnnounceMode extends js.Object

object AnnounceMode {
  @scala.inline
  def assertive: typingsSlinky.grommet.grommetStrings.assertive = this.cast("assertive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def off: typingsSlinky.grommet.grommetStrings.off = this.cast("off")
  @scala.inline
  def polite: typingsSlinky.grommet.grommetStrings.polite = this.cast("polite")
}

