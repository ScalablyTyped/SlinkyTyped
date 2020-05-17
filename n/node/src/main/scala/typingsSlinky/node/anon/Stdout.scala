package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stdout extends js.Object {
  var stderr: typingsSlinky.node.Buffer = js.native
  var stdout: typingsSlinky.node.Buffer = js.native
}

object Stdout {
  @scala.inline
  def apply(stderr: typingsSlinky.node.Buffer, stdout: typingsSlinky.node.Buffer): Stdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stdout]
  }
  @scala.inline
  implicit class StdoutOps[Self <: Stdout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStderr(value: typingsSlinky.node.Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdout(value: typingsSlinky.node.Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

