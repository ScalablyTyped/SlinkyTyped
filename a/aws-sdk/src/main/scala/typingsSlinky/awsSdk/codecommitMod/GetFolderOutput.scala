package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFolderOutput extends StObject {
  
  /**
    * The full commit ID used as a reference for the returned version of the folder content.
    */
  var commitId: ObjectId = js.native
  
  /**
    * The list of files in the specified folder, if any.
    */
  var files: js.UndefOr[FileList] = js.native
  
  /**
    * The fully qualified path of the folder whose contents are returned.
    */
  var folderPath: Path = js.native
  
  /**
    * The list of folders that exist under the specified folder, if any.
    */
  var subFolders: js.UndefOr[FolderList] = js.native
  
  /**
    * The list of submodules in the specified folder, if any.
    */
  var subModules: js.UndefOr[SubModuleList] = js.native
  
  /**
    * The list of symbolic links to other files and folders in the specified folder, if any.
    */
  var symbolicLinks: js.UndefOr[SymbolicLinkList] = js.native
  
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the folder.
    */
  var treeId: js.UndefOr[ObjectId] = js.native
}
object GetFolderOutput {
  
  @scala.inline
  def apply(commitId: ObjectId, folderPath: Path): GetFolderOutput = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderOutput]
  }
  
  @scala.inline
  implicit class GetFolderOutputMutableBuilder[Self <: GetFolderOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: FileList): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setFolderPath(value: Path): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFolders(value: FolderList): Self = StObject.set(x, "subFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFoldersUndefined: Self = StObject.set(x, "subFolders", js.undefined)
    
    @scala.inline
    def setSubFoldersVarargs(value: Folder*): Self = StObject.set(x, "subFolders", js.Array(value :_*))
    
    @scala.inline
    def setSubModules(value: SubModuleList): Self = StObject.set(x, "subModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubModulesUndefined: Self = StObject.set(x, "subModules", js.undefined)
    
    @scala.inline
    def setSubModulesVarargs(value: SubModule*): Self = StObject.set(x, "subModules", js.Array(value :_*))
    
    @scala.inline
    def setSymbolicLinks(value: SymbolicLinkList): Self = StObject.set(x, "symbolicLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolicLinksUndefined: Self = StObject.set(x, "symbolicLinks", js.undefined)
    
    @scala.inline
    def setSymbolicLinksVarargs(value: SymbolicLink*): Self = StObject.set(x, "symbolicLinks", js.Array(value :_*))
    
    @scala.inline
    def setTreeId(value: ObjectId): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
  }
}
