package typingsSlinky.node.anon

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ProcessEnv
import typingsSlinky.node.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  encoding  :node.BufferEncoding} & node.child_process.ExecOptions */
@js.native
trait encodingBufferEncodingExe extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var encoding: BufferEncoding = js.native
  var env: js.UndefOr[ProcessEnv] = js.native
  var gid: js.UndefOr[Double] = js.native
  var killSignal: js.UndefOr[Signals | Double] = js.native
  var maxBuffer: js.UndefOr[Double] = js.native
  var shell: js.UndefOr[String] = js.native
  /**
    * @default 0
    */
  var timeout: js.UndefOr[Double] = js.native
  var uid: js.UndefOr[Double] = js.native
  /**
    * @default true
    */
  var windowsHide: js.UndefOr[Boolean] = js.native
}

object encodingBufferEncodingExe {
  @scala.inline
  def apply(encoding: BufferEncoding): encodingBufferEncodingExe = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[encodingBufferEncodingExe]
  }
  @scala.inline
  implicit class encodingBufferEncodingExeOps[Self <: encodingBufferEncodingExe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: BufferEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withEnv(value: ProcessEnv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withGid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(js.undefined)
        ret
    }
    @scala.inline
    def withKillSignal(value: Signals | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKillSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killSignal")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withShell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsHide")(js.undefined)
        ret
    }
  }
  
}

