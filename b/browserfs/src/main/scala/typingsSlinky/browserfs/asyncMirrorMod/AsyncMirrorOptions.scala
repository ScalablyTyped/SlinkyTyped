package typingsSlinky.browserfs.asyncMirrorMod

import typingsSlinky.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncMirrorOptions extends js.Object {
  var async: FileSystem = js.native
  var sync: FileSystem = js.native
}

object AsyncMirrorOptions {
  @scala.inline
  def apply(async: FileSystem, sync: FileSystem): AsyncMirrorOptions = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncMirrorOptions]
  }
  @scala.inline
  implicit class AsyncMirrorOptionsOps[Self <: AsyncMirrorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: FileSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSync(value: FileSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

