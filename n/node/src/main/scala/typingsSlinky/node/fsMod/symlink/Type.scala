package typingsSlinky.node.fsMod.symlink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.dir
  - typingsSlinky.node.nodeStrings.file
  - typingsSlinky.node.nodeStrings.junction
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dir: typingsSlinky.node.nodeStrings.dir = this.cast("dir")
  @scala.inline
  def file: typingsSlinky.node.nodeStrings.file = this.cast("file")
  @scala.inline
  def junction: typingsSlinky.node.nodeStrings.junction = this.cast("junction")
}

