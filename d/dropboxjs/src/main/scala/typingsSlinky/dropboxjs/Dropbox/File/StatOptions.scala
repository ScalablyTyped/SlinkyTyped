package typingsSlinky.dropboxjs.Dropbox.File

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatOptions extends js.Object {
  var contentHash: String = js.native
  var deleted: Boolean = js.native
  var hash: String = js.native
  var httpCache: Boolean = js.native
  var readDir: Boolean = js.native
  var removed: Boolean = js.native
  var rev: String = js.native
  var version: Double = js.native
  var versionTag: String = js.native
}

object StatOptions {
  @scala.inline
  def apply(
    contentHash: String,
    deleted: Boolean,
    hash: String,
    httpCache: Boolean,
    readDir: Boolean,
    removed: Boolean,
    rev: String,
    version: Double,
    versionTag: String
  ): StatOptions = {
    val __obj = js.Dynamic.literal(contentHash = contentHash.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], httpCache = httpCache.asInstanceOf[js.Any], readDir = readDir.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionTag = versionTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptions]
  }
  @scala.inline
  implicit class StatOptionsOps[Self <: StatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionTag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

