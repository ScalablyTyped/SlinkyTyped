package typingsSlinky.childProcessPromise.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseResult[Enc /* <: String | Buffer */] extends js.Object {
  var childProcess: ChildProcess = js.native
  var stderr: Enc = js.native
  var stdout: Enc = js.native
}

object PromiseResult {
  @scala.inline
  def apply[Enc](childProcess: ChildProcess, stderr: Enc, stdout: Enc): PromiseResult[Enc] = {
    val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResult[Enc]]
  }
  @scala.inline
  implicit class PromiseResultOps[Self[enc] <: PromiseResult[enc], Enc] (val x: Self[Enc]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Enc] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Enc]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Enc] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Enc] with Other]
    @scala.inline
    def withChildProcess(value: ChildProcess): Self[Enc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStderr(value: Enc): Self[Enc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdout(value: Enc): Self[Enc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

