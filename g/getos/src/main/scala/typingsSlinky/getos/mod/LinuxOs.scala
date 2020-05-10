package typingsSlinky.getos.mod

import typingsSlinky.getos.getosStrings.linux
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxOs extends Os {
  var codename: js.UndefOr[String] = js.native
  var dist: String = js.native
  var os: linux = js.native
  var release: String = js.native
}

object LinuxOs {
  @scala.inline
  def apply(dist: String, os: linux, release: String): LinuxOs = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxOs]
  }
  @scala.inline
  implicit class LinuxOsOps[Self <: LinuxOs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: linux): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codename")(js.undefined)
        ret
    }
  }
  
}

