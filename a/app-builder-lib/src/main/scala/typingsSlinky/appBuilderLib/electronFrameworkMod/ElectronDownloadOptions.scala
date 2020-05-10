package typingsSlinky.appBuilderLib.electronFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectronDownloadOptions extends js.Object {
  var arch: js.UndefOr[String] = js.native
  /**
    * The [cache location](https://github.com/electron-userland/electron-download#cache-location).
    */
  var cache: js.UndefOr[String | Null] = js.native
  /** @private */
  var customDir: js.UndefOr[String | Null] = js.native
  /** @private */
  var customFilename: js.UndefOr[String | Null] = js.native
  var isVerifyChecksum: js.UndefOr[Boolean] = js.native
  /**
    * The mirror.
    */
  var mirror: js.UndefOr[String | Null] = js.native
  var platform: js.UndefOr[ElectronPlatformName] = js.native
  var strictSSL: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
}

object ElectronDownloadOptions {
  @scala.inline
  def apply(): ElectronDownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElectronDownloadOptions]
  }
  @scala.inline
  implicit class ElectronDownloadOptionsOps[Self <: ElectronDownloadOptions] (val x: Self) extends AnyVal {
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
    def withCache(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(null)
        ret
    }
    @scala.inline
    def withCustomDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDir")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDirNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDir")(null)
        ret
    }
    @scala.inline
    def withCustomFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFilenameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFilename")(null)
        ret
    }
    @scala.inline
    def withIsVerifyChecksum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerifyChecksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVerifyChecksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerifyChecksum")(js.undefined)
        ret
    }
    @scala.inline
    def withMirror(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(js.undefined)
        ret
    }
    @scala.inline
    def withMirrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(null)
        ret
    }
    @scala.inline
    def withPlatform(value: ElectronPlatformName): Self = {
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
    def withStrictSSL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictSSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSSL")(js.undefined)
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

