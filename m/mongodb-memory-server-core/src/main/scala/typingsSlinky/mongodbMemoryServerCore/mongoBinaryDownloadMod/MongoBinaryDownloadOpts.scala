package typingsSlinky.mongodbMemoryServerCore.mongoBinaryDownloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoBinaryDownloadOpts extends js.Object {
  var arch: js.UndefOr[String] = js.native
  var checkMD5: js.UndefOr[Boolean] = js.native
  var downloadDir: js.UndefOr[String] = js.native
  var platform: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object MongoBinaryDownloadOpts {
  @scala.inline
  def apply(): MongoBinaryDownloadOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoBinaryDownloadOpts]
  }
  @scala.inline
  implicit class MongoBinaryDownloadOptsOps[Self <: MongoBinaryDownloadOpts] (val x: Self) extends AnyVal {
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
    def withoutArch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckMD5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDir")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

