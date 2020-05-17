package typingsSlinky.execa.mod

import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.execa.execaStrings.pipe
  - typingsSlinky.execa.execaStrings.ipc
  - typingsSlinky.execa.execaStrings.ignore
  - typingsSlinky.execa.execaStrings.inherit
  - typingsSlinky.node.streamMod.Stream
  - scala.Double
  - js.UndefOr[scala.Nothing]
*/
trait StdioOption extends js.Object

object StdioOption {
  @scala.inline
  def pipe: typingsSlinky.execa.execaStrings.pipe = "pipe".asInstanceOf[typingsSlinky.execa.execaStrings.pipe]
  @scala.inline
  def ipc: typingsSlinky.execa.execaStrings.ipc = "ipc".asInstanceOf[typingsSlinky.execa.execaStrings.ipc]
  @scala.inline
  def ignore: typingsSlinky.execa.execaStrings.ignore = "ignore".asInstanceOf[typingsSlinky.execa.execaStrings.ignore]
  @scala.inline
  def inherit: typingsSlinky.execa.execaStrings.inherit = "inherit".asInstanceOf[typingsSlinky.execa.execaStrings.inherit]
  @scala.inline
  implicit def apply(value: Double): StdioOption = value.asInstanceOf[StdioOption]
  @scala.inline
  implicit def apply(value: Stream): StdioOption = value.asInstanceOf[StdioOption]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => StdioOption): StdioOption = value.asInstanceOf[StdioOption]
}

