package typingsSlinky.gfc.anon

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stderr extends js.Object {
  var stderr: String | Buffer = js.native
  var stdout: String | Buffer = js.native
}

object Stderr {
  @scala.inline
  def apply(stderr: String | Buffer, stdout: String | Buffer): Stderr = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stderr]
  }
  @scala.inline
  implicit class StderrOps[Self <: Stderr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStderr(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdout(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

