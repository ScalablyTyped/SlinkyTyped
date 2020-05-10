package typingsSlinky.nodelibFsStat.optionsMod

import typingsSlinky.nodelibFsStat.PartialFileSystemAdapter
import typingsSlinky.nodelibFsStat.fsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  fs  :@nodelib/fs.stat.@nodelib/fs.stat/out/adapters/fs.FileSystemAdapter} & std.Required<@nodelib/fs.stat.@nodelib/fs.stat/out/managers/options.Options> */
@js.native
trait StrictOptions extends js.Object {
  var followSymlinks: Boolean = js.native
  var fs: FileSystemAdapter with PartialFileSystemAdapter = js.native
  var throwErrorOnBrokenSymlinks: Boolean = js.native
}

object StrictOptions {
  @scala.inline
  def apply(
    followSymlinks: Boolean,
    fs: FileSystemAdapter with PartialFileSystemAdapter,
    throwErrorOnBrokenSymlinks: Boolean
  ): StrictOptions = {
    val __obj = js.Dynamic.literal(followSymlinks = followSymlinks.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], throwErrorOnBrokenSymlinks = throwErrorOnBrokenSymlinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictOptions]
  }
  @scala.inline
  implicit class StrictOptionsOps[Self <: StrictOptions] (val x: Self) extends AnyVal {
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
    def withFs(value: FileSystemAdapter with PartialFileSystemAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrowErrorOnBrokenSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwErrorOnBrokenSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

