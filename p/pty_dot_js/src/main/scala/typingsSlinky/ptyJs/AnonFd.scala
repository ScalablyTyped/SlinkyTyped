package typingsSlinky.ptyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFd extends js.Object {
  var fd: Double = js.native
  var pid: Double = js.native
  var pty: String = js.native
}

object AnonFd {
  @scala.inline
  def apply(fd: Double, pid: Double, pty: String): AnonFd = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFd]
  }
  @scala.inline
  implicit class AnonFdOps[Self <: AnonFd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

