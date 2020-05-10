package typingsSlinky.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletedResult extends js.Object {
  var avinfo: js.UndefOr[AvAudioInfo] = js.native
  var bucket: String = js.native
  var ext: String = js.native
  var imageInfo: js.UndefOr[AvImageInfo] = js.native
  var key: String = js.native
  var name: String = js.native
  var persistentid: String = js.native
  var sec: String = js.native
  var size: Double = js.native
}

object CompletedResult {
  @scala.inline
  def apply(
    bucket: String,
    ext: String,
    key: String,
    name: String,
    persistentid: String,
    sec: String,
    size: Double
  ): CompletedResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], persistentid = persistentid.asInstanceOf[js.Any], sec = sec.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedResult]
  }
  @scala.inline
  implicit class CompletedResultOps[Self <: CompletedResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistentid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvinfo(value: AvAudioInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avinfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvinfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avinfo")(js.undefined)
        ret
    }
    @scala.inline
    def withImageInfo(value: AvImageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageInfo")(js.undefined)
        ret
    }
  }
  
}

