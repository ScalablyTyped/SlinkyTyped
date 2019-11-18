package typingsSlinky.node.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ** Signifies if the --zap_code_space option is enabled or not.  1 == enabled, 0 == disabled. */
/* Rewritten from type alias, can be one of: 
  - typings.node.nodeNumbers.`0`
  - typings.node.nodeNumbers.`1`
*/
trait DoesZapCodeSpaceFlag extends js.Object

object DoesZapCodeSpaceFlag {
  @scala.inline
  def `0`: typingsSlinky.node.nodeNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typingsSlinky.node.nodeNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

