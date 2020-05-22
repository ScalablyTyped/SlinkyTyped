package typingsSlinky.nodelibFsStat.optionsMod

import typingsSlinky.nodelibFsStat.anon.PartialFileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var followSymlinks: js.UndefOr[Boolean] = js.undefined
  var fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
  var throwErrorOnBrokenSymlinks: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    followSymlinks: js.UndefOr[Boolean] = js.undefined,
    fs: PartialFileSystemAdapter = null,
    throwErrorOnBrokenSymlinks: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(followSymlinks)) __obj.updateDynamic("followSymlinks")(followSymlinks.get.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (!js.isUndefined(throwErrorOnBrokenSymlinks)) __obj.updateDynamic("throwErrorOnBrokenSymlinks")(throwErrorOnBrokenSymlinks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

