package typingsSlinky.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fsExtra.fsExtraStrings.dir
  - typingsSlinky.fsExtra.fsExtraStrings.file
  - typingsSlinky.fsExtra.fsExtraStrings.junction
*/
trait FsSymlinkType extends js.Object

object FsSymlinkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dir: typingsSlinky.fsExtra.fsExtraStrings.dir = this.cast("dir")
  @scala.inline
  def file: typingsSlinky.fsExtra.fsExtraStrings.file = this.cast("file")
  @scala.inline
  def junction: typingsSlinky.fsExtra.fsExtraStrings.junction = this.cast("junction")
}

