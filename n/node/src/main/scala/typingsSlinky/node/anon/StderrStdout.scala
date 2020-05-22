package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StderrStdout extends js.Object {
  var stderr: String | typingsSlinky.node.Buffer
  var stdout: String | typingsSlinky.node.Buffer
}

object StderrStdout {
  @scala.inline
  def apply(stderr: String | typingsSlinky.node.Buffer, stdout: String | typingsSlinky.node.Buffer): StderrStdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StderrStdout]
  }
}

