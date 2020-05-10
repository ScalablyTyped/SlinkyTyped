package typingsSlinky.nodelibFsScandir.settingsMod

import typingsSlinky.nodelibFsScandir.fsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var _getValue: js.Any = js.native
  val _options: js.Any = js.native
  val followSymbolicLinks: Boolean = js.native
  val fs: FileSystemAdapter = js.native
  val fsStatSettings: Settings = js.native
  val pathSegmentSeparator: String = js.native
  val stats: Boolean = js.native
  val throwErrorOnBrokenSymbolicLink: Boolean = js.native
}

object Settings {
  @scala.inline
  def apply(
    _getValue: js.Any,
    _options: js.Any,
    followSymbolicLinks: Boolean,
    fs: FileSystemAdapter,
    fsStatSettings: Settings,
    pathSegmentSeparator: String,
    stats: Boolean,
    throwErrorOnBrokenSymbolicLink: Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(_getValue = _getValue.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], followSymbolicLinks = followSymbolicLinks.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], fsStatSettings = fsStatSettings.asInstanceOf[js.Any], pathSegmentSeparator = pathSegmentSeparator.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_getValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_options(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowSymbolicLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymbolicLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFs(value: FileSystemAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFsStatSettings(value: Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsStatSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathSegmentSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSegmentSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwErrorOnBrokenSymbolicLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

