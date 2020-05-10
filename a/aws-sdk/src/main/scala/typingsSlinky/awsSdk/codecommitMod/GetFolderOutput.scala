package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFolderOutput extends js.Object {
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
  implicit class GetFolderOutputOps[Self <: GetFolderOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: FileList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withSubFolders(value: FolderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withSubModules(value: SubModuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subModules")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolicLinks(value: SymbolicLinkList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolicLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolicLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolicLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeId")(js.undefined)
        ret
    }
  }
  
}

