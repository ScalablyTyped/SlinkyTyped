package typingsSlinky.compressionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.compressionWebpackPlugin.mod.ZlibOptions
  - typingsSlinky.compressionWebpackPlugin.mod.CustomOptions[O]
*/
trait Options[O] extends js.Object

object Options {
  @scala.inline
  implicit def apply[O](value: CustomOptions[O]): Options[O] = value.asInstanceOf[Options[O]]
  @scala.inline
  implicit def apply[O](value: ZlibOptions): Options[O] = value.asInstanceOf[Options[O]]
}

