package typingsSlinky.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheDetails extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  /** Etag */
  var eTag: String = js.native
  /**
    * Expiration time of the cache entry.
    *
    * _(Format not documente but assumingly ISO 8601 -
    * `YYYY-MM-DDThh:mm:ss.sTZD`)_
    */
  var expires: js.UndefOr[String] = js.native
  /** The number of times the cache entry has been opened. */
  var hitCount: Double = js.native
  /**
    * The last time the cache entry was opened.
    *
    * _(Format not documente but assumingly ISO 8601 -
    * `YYYY-MM-DDThh:mm:ss.sTZD`)_
    */
  var lastAccess: String = js.native
}

object CacheDetails {
  @scala.inline
  def apply(eTag: String, hitCount: Double, lastAccess: String): CacheDetails = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], hitCount = hitCount.asInstanceOf[js.Any], lastAccess = lastAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDetails]
  }
  @scala.inline
  implicit class CacheDetailsOps[Self <: CacheDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastAccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
  }
  
}

