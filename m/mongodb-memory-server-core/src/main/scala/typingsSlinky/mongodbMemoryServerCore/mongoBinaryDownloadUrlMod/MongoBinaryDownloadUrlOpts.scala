package typingsSlinky.mongodbMemoryServerCore.mongoBinaryDownloadUrlMod

import typingsSlinky.mongodbMemoryServerCore.getosMod.AnyOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoBinaryDownloadUrlOpts extends js.Object {
  var arch: String = js.native
  var os: js.UndefOr[AnyOS] = js.native
  var platform: String = js.native
  var version: String = js.native
}

object MongoBinaryDownloadUrlOpts {
  @scala.inline
  def apply(arch: String, platform: String, version: String): MongoBinaryDownloadUrlOpts = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoBinaryDownloadUrlOpts]
  }
  @scala.inline
  implicit class MongoBinaryDownloadUrlOptsOps[Self <: MongoBinaryDownloadUrlOpts] (val x: Self) extends AnyVal {
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
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: AnyOS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(js.undefined)
        ret
    }
  }
  
}

