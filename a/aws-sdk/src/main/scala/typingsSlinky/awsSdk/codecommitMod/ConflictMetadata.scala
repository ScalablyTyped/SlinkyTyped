package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConflictMetadata extends js.Object {
  /**
    * A boolean value indicating whether there are conflicts in the content of a file.
    */
  var contentConflict: js.UndefOr[IsContentConflict] = js.native
  /**
    * A boolean value indicating whether there are conflicts in the file mode of a file.
    */
  var fileModeConflict: js.UndefOr[IsFileModeConflict] = js.native
  /**
    * The file modes of the file in the source, destination, and base of the merge.
    */
  var fileModes: js.UndefOr[FileModes] = js.native
  /**
    * The path of the file that contains conflicts.
    */
  var filePath: js.UndefOr[Path] = js.native
  /**
    * The file sizes of the file in the source, destination, and base of the merge.
    */
  var fileSizes: js.UndefOr[FileSizes] = js.native
  /**
    * A boolean value (true or false) indicating whether the file is binary or textual in the source, destination, and base of the merge.
    */
  var isBinaryFile: js.UndefOr[IsBinaryFile] = js.native
  /**
    * Whether an add, modify, or delete operation caused the conflict between the source and destination of the merge.
    */
  var mergeOperations: js.UndefOr[MergeOperations] = js.native
  /**
    * The number of conflicts, including both hunk conflicts and metadata conflicts.
    */
  var numberOfConflicts: js.UndefOr[NumberOfConflicts] = js.native
  /**
    * A boolean value (true or false) indicating whether there are conflicts between the branches in the object type of a file, folder, or submodule.
    */
  var objectTypeConflict: js.UndefOr[IsObjectTypeConflict] = js.native
  /**
    * Information about any object type conflicts in a merge operation.
    */
  var objectTypes: js.UndefOr[ObjectTypes] = js.native
}

object ConflictMetadata {
  @scala.inline
  def apply(): ConflictMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConflictMetadata]
  }
  @scala.inline
  implicit class ConflictMetadataOps[Self <: ConflictMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentConflict(value: IsContentConflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentConflict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentConflict")(js.undefined)
        ret
    }
    @scala.inline
    def withFileModeConflict(value: IsFileModeConflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileModeConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileModeConflict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileModeConflict")(js.undefined)
        ret
    }
    @scala.inline
    def withFileModes(value: FileModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileModes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilePath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSizes(value: FileSizes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBinaryFile(value: IsBinaryFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBinaryFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBinaryFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBinaryFile")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeOperations(value: MergeOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfConflicts(value: NumberOfConflicts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfConflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfConflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfConflicts")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectTypeConflict(value: IsObjectTypeConflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectTypeConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectTypeConflict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectTypeConflict")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectTypes(value: ObjectTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectTypes")(js.undefined)
        ret
    }
  }
  
}

