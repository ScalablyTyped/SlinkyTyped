package typingsSlinky.node.childProcessMod

import typingsSlinky.node.nodeStrings.ignore
import typingsSlinky.node.nodeStrings.inherit
import typingsSlinky.node.nodeStrings.ipc
import typingsSlinky.node.nodeStrings.pipe
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.pipe
  - typingsSlinky.node.nodeStrings.ignore
  - typingsSlinky.node.nodeStrings.inherit
  - js.Array[
js.UndefOr[
  typingsSlinky.node.nodeStrings.pipe | typingsSlinky.node.nodeStrings.ipc | typingsSlinky.node.nodeStrings.ignore | typingsSlinky.node.nodeStrings.inherit | typingsSlinky.node.streamMod.Stream | scala.Double | scala.Null
]]
*/
trait StdioOptions extends js.Object

object StdioOptions {
  @scala.inline
  def pipe: typingsSlinky.node.nodeStrings.pipe = "pipe".asInstanceOf[typingsSlinky.node.nodeStrings.pipe]
  @scala.inline
  def ignore: typingsSlinky.node.nodeStrings.ignore = "ignore".asInstanceOf[typingsSlinky.node.nodeStrings.ignore]
  @scala.inline
  def inherit: typingsSlinky.node.nodeStrings.inherit = "inherit".asInstanceOf[typingsSlinky.node.nodeStrings.inherit]
  @scala.inline
  implicit def apply(value: js.Array[js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null]]): StdioOptions = value.asInstanceOf[StdioOptions]
}

