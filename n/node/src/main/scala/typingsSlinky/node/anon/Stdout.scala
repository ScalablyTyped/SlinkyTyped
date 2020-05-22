package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stdout extends js.Object {
  var stderr: typingsSlinky.node.Buffer
  var stdout: typingsSlinky.node.Buffer
}

object Stdout {
  @scala.inline
  def apply(stderr: typingsSlinky.node.Buffer, stdout: typingsSlinky.node.Buffer): Stdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stdout]
  }
}

