package typingsSlinky.nodemon.nodemonMod

import typingsSlinky.node.Buffer
import typingsSlinky.nodemon.nodemonStrings.stderr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "emit")
@js.native
object emit_stderr extends js.Object {
  def apply(event: stderr, data: Buffer): Boolean = js.native
}

