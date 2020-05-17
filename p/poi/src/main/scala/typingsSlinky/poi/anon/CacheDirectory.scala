package typingsSlinky.poi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheDirectory extends js.Object {
  var cacheDirectory: String = js.native
  var cacheIdentifier: String = js.native
}

object CacheDirectory {
  @scala.inline
  def apply(cacheDirectory: String, cacheIdentifier: String): CacheDirectory = {
    val __obj = js.Dynamic.literal(cacheDirectory = cacheDirectory.asInstanceOf[js.Any], cacheIdentifier = cacheIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDirectory]
  }
  @scala.inline
  implicit class CacheDirectoryOps[Self <: CacheDirectory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

