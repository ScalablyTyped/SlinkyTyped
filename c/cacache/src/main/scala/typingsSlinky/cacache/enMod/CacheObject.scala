package typingsSlinky.cacache.enMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheObject extends js.Object {
  /** Subresource Integrity hash for the content this entry refers to. */
  var integrity: String = js.native
  /** Key the entry was looked up under. Matches the key argument. */
  var key: String = js.native
  /** User-assigned metadata associated with the entry/content. */
  var metadata: js.UndefOr[js.Any] = js.native
  /** Filesystem path where content is stored, joined with cache argument. */
  var path: String = js.native
  /** Timestamp the entry was first added on. */
  var time: Double = js.native
}

object CacheObject {
  @scala.inline
  def apply(integrity: String, key: String, path: String, time: Double): CacheObject = {
    val __obj = js.Dynamic.literal(integrity = integrity.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheObject]
  }
  @scala.inline
  implicit class CacheObjectOps[Self <: CacheObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntegrity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

