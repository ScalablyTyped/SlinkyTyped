package typingsSlinky.nodelibFsScandir.settingsMod

import typingsSlinky.nodelibFsScandir.anon.PartialFileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var followSymbolicLinks: js.UndefOr[Boolean] = js.native
  var fs: js.UndefOr[PartialFileSystemAdapter] = js.native
  var pathSegmentSeparator: js.UndefOr[String] = js.native
  var stats: js.UndefOr[Boolean] = js.native
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowSymbolicLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymbolicLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowSymbolicLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymbolicLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withFs(value: PartialFileSystemAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(js.undefined)
        ret
    }
    @scala.inline
    def withPathSegmentSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSegmentSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathSegmentSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSegmentSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwErrorOnBrokenSymbolicLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowErrorOnBrokenSymbolicLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwErrorOnBrokenSymbolicLink")(js.undefined)
        ret
    }
  }
  
}

