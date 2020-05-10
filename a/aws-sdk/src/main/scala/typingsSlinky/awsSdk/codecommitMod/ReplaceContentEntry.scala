package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceContentEntry extends js.Object {
  /**
    * The base-64 encoded content to use when the replacement type is USE_NEW_CONTENT.
    */
  var content: js.UndefOr[FileContent] = js.native
  /**
    * The file mode to apply during conflict resoltion.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.native
  /**
    * The path of the conflicting file.
    */
  var filePath: Path = js.native
  /**
    * The replacement type to use when determining how to resolve the conflict.
    */
  var replacementType: ReplacementTypeEnum = js.native
}

object ReplaceContentEntry {
  @scala.inline
  def apply(filePath: Path, replacementType: ReplacementTypeEnum): ReplaceContentEntry = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], replacementType = replacementType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceContentEntry]
  }
  @scala.inline
  implicit class ReplaceContentEntryOps[Self <: ReplaceContentEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacementType(value: ReplacementTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: FileContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withFileMode(value: FileModeTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(js.undefined)
        ret
    }
  }
  
}

