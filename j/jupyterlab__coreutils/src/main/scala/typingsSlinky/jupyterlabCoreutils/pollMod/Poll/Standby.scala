package typingsSlinky.jupyterlabCoreutils.pollMod.Poll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates when the poll switches to standby.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.never
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`when-hidden`
*/
trait Standby extends js.Object

object Standby {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.never = this.cast("never")
  @scala.inline
  def `when-hidden`: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`when-hidden` = this.cast("when-hidden")
}

