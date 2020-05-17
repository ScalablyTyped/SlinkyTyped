package typingsSlinky.gfc.mod

import typingsSlinky.gfc.anon.Contents
import typingsSlinky.gfc.gfcBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[TExecOptions] extends js.Object {
  var commit: js.UndefOr[Boolean] = js.native
  var cwd: js.UndefOr[String] = js.native
  var exec: js.UndefOr[TExecOptions] = js.native
  var file: js.UndefOr[Contents | `false`] = js.native
  var forceFile: js.UndefOr[Boolean] = js.native
  var message: js.UndefOr[String] = js.native
  var push: js.UndefOr[Boolean] = js.native
  var remote: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply[TExecOptions](): Options[TExecOptions] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TExecOptions]]
  }
  @scala.inline
  implicit class OptionsOps[Self[texecoptions] <: Options[texecoptions], TExecOptions] (val x: Self[TExecOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TExecOptions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TExecOptions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TExecOptions] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TExecOptions] with Other]
    @scala.inline
    def withCommit(value: Boolean): Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommit: Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withExec(value: TExecOptions): Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExec: Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: Contents | `false`): Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFile(value: Boolean): Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFile: Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFile")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: Boolean): Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote(value: String): Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote: Self[TExecOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.undefined)
        ret
    }
  }
  
}

