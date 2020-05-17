package typingsSlinky.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetFileName extends js.Object {
  var assetFileName: String = js.native
  var chunkId: String = js.native
  var format: String = js.native
  var moduleId: String = js.native
  var relativeAssetPath: String = js.native
}

object AssetFileName {
  @scala.inline
  def apply(
    assetFileName: String,
    chunkId: String,
    format: String,
    moduleId: String,
    relativeAssetPath: String
  ): AssetFileName = {
    val __obj = js.Dynamic.literal(assetFileName = assetFileName.asInstanceOf[js.Any], chunkId = chunkId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], relativeAssetPath = relativeAssetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetFileName]
  }
  @scala.inline
  implicit class AssetFileNameOps[Self <: AssetFileName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkId")(value.asInstanceOf[js.Any])
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
    def withRelativeAssetPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeAssetPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

