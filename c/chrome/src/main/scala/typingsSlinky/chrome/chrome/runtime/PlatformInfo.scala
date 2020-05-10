package typingsSlinky.chrome.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformInfo extends js.Object {
  /**
    * The machine's processor architecture.
    * One of: "arm", "x86-32", or "x86-64"
    */
  var arch: String = js.native
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * One of: "arm", "x86-32", or "x86-64"
    */
  var nacl_arch: String = js.native
  /**
    * The operating system chrome is running on.
    * One of: "mac", "win", "android", "cros", "linux", or "openbsd"
    */
  var os: String = js.native
}

object PlatformInfo {
  @scala.inline
  def apply(arch: String, nacl_arch: String, os: String): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], nacl_arch = nacl_arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformInfo]
  }
  @scala.inline
  implicit class PlatformInfoOps[Self <: PlatformInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNacl_arch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nacl_arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

