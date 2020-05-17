package typingsSlinky.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetReferenceId extends js.Object {
  var assetReferenceId: String | Null = js.native
  var chunkId: String = js.native
  var chunkReferenceId: String | Null = js.native
  var fileName: String = js.native
  var format: String = js.native
  var moduleId: String = js.native
  var referenceId: String = js.native
  var relativePath: String = js.native
}

object AssetReferenceId {
  @scala.inline
  def apply(
    chunkId: String,
    fileName: String,
    format: String,
    moduleId: String,
    referenceId: String,
    relativePath: String
  ): AssetReferenceId = {
    val __obj = js.Dynamic.literal(chunkId = chunkId.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetReferenceId]
  }
  @scala.inline
  implicit class AssetReferenceIdOps[Self <: AssetReferenceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetReferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetReferenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetReferenceIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetReferenceId")(null)
        ret
    }
    @scala.inline
    def withChunkReferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkReferenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunkReferenceIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkReferenceId")(null)
        ret
    }
  }
  
}

