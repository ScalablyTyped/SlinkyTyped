package typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullMetadata extends SettableMetadata {
  var bucket: String = js.native
  var fullPath: String = js.native
  var generation: String = js.native
  var md5Hash: js.UndefOr[String | Null] = js.native
  var metageneration: String = js.native
  var name: String = js.native
  var size: Double = js.native
  var timeCreated: String = js.native
  var updated: String = js.native
}

object FullMetadata {
  @scala.inline
  def apply(
    bucket: String,
    fullPath: String,
    generation: String,
    metageneration: String,
    name: String,
    size: Double,
    timeCreated: String,
    updated: String
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMetadata]
  }
  @scala.inline
  implicit class FullMetadataOps[Self <: FullMetadata] (val x: Self) extends AnyVal {
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
    def withFullPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetageneration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metageneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd5Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withMd5HashNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(null)
        ret
    }
  }
  
}

