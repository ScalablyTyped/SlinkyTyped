package typingsSlinky.nodelibFsStat.optionsMod

import typingsSlinky.nodelibFsStat.PartialFileSystemAdapter
import typingsSlinky.nodelibFsStat.fsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  fs  :@nodelib/fs.stat.@nodelib/fs.stat/out/adapters/fs.FileSystemAdapter} & std.Required<@nodelib/fs.stat.@nodelib/fs.stat/out/managers/options.Options> */
trait StrictOptions extends js.Object {
  var followSymlinks: Boolean
  var fs: FileSystemAdapter with PartialFileSystemAdapter
  var throwErrorOnBrokenSymlinks: Boolean
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
}

