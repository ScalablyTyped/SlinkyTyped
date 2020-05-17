package typingsSlinky.nodelibFsStat.optionsMod

import typingsSlinky.nodelibFsStat.anon.PartialFileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var followSymlinks: js.UndefOr[Boolean] = js.native
  var fs: js.UndefOr[PartialFileSystemAdapter] = js.native
  var throwErrorOnBrokenSymlinks: js.UndefOr[Boolean] = js.native
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
    def withFollowSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymlinks")(js.undefined)
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
    def withThrowErrorOnBrokenSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwErrorOnBrokenSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowErrorOnBrokenSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwErrorOnBrokenSymlinks")(js.undefined)
        ret
    }
  }
  
}

