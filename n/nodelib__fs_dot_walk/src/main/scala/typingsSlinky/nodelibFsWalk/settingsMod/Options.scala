package typingsSlinky.nodelibFsWalk.settingsMod

import typingsSlinky.nodelibFsWalk.anon.PartialFileSystemAdapter
import typingsSlinky.nodelibFsWalk.typesMod.Entry
import typingsSlinky.nodelibFsWalk.typesMod.Errno
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var basePath: js.UndefOr[String] = js.native
  var concurrency: js.UndefOr[Double] = js.native
  var deepFilter: js.UndefOr[DeepFilterFunction] = js.native
  var entryFilter: js.UndefOr[EntryFilterFunction] = js.native
  var errorFilter: js.UndefOr[ErrorFilterFunction] = js.native
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
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepFilter(value: Entry => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeepFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryFilter(value: Entry => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEntryFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorFilter(value: Errno => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFilter")(js.undefined)
        ret
    }
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

