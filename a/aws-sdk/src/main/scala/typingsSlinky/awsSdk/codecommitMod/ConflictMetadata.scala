package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConflictMetadata extends StObject {
  
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
  implicit class ConflictMetadataMutableBuilder[Self <: ConflictMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentConflict(value: IsContentConflict): Self = StObject.set(x, "contentConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentConflictUndefined: Self = StObject.set(x, "contentConflict", js.undefined)
    
    @scala.inline
    def setFileModeConflict(value: IsFileModeConflict): Self = StObject.set(x, "fileModeConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileModeConflictUndefined: Self = StObject.set(x, "fileModeConflict", js.undefined)
    
    @scala.inline
    def setFileModes(value: FileModes): Self = StObject.set(x, "fileModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileModesUndefined: Self = StObject.set(x, "fileModes", js.undefined)
    
    @scala.inline
    def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setFileSizes(value: FileSizes): Self = StObject.set(x, "fileSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizesUndefined: Self = StObject.set(x, "fileSizes", js.undefined)
    
    @scala.inline
    def setIsBinaryFile(value: IsBinaryFile): Self = StObject.set(x, "isBinaryFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBinaryFileUndefined: Self = StObject.set(x, "isBinaryFile", js.undefined)
    
    @scala.inline
    def setMergeOperations(value: MergeOperations): Self = StObject.set(x, "mergeOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOperationsUndefined: Self = StObject.set(x, "mergeOperations", js.undefined)
    
    @scala.inline
    def setNumberOfConflicts(value: NumberOfConflicts): Self = StObject.set(x, "numberOfConflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfConflictsUndefined: Self = StObject.set(x, "numberOfConflicts", js.undefined)
    
    @scala.inline
    def setObjectTypeConflict(value: IsObjectTypeConflict): Self = StObject.set(x, "objectTypeConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeConflictUndefined: Self = StObject.set(x, "objectTypeConflict", js.undefined)
    
    @scala.inline
    def setObjectTypes(value: ObjectTypes): Self = StObject.set(x, "objectTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypesUndefined: Self = StObject.set(x, "objectTypes", js.undefined)
  }
}
