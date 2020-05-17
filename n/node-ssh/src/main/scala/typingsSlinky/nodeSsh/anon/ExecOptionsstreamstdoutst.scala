package typingsSlinky.nodeSsh.anon

import typingsSlinky.node.Buffer
import typingsSlinky.nodeSsh.nodeSshStrings.stderr
import typingsSlinky.nodeSsh.nodeSshStrings.stdout
import typingsSlinky.ssh2.mod.ExecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node-ssh.node-ssh.ExecOptions & {  stream ? :'stdout' | 'stderr'} */
@js.native
trait ExecOptionsstreamstdoutst extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var onStderr: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.native
  var onStdout: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.native
  var options: js.UndefOr[ExecOptions] = js.native
  var stdin: js.UndefOr[String] = js.native
  var stream: js.UndefOr[stdout | stderr] = js.native
}

object ExecOptionsstreamstdoutst {
  @scala.inline
  def apply(): ExecOptionsstreamstdoutst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOptionsstreamstdoutst]
  }
  @scala.inline
  implicit class ExecOptionsstreamstdoutstOps[Self <: ExecOptionsstreamstdoutst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStderr(value: /* chunk */ Buffer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStderr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStderr")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStdout(value: /* chunk */ Buffer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStdout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStdout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStdout")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: ExecOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withStdin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: stdout | stderr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
  }
  
}

