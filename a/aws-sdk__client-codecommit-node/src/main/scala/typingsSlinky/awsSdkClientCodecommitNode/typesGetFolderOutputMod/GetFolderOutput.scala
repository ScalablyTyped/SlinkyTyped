package typingsSlinky.awsSdkClientCodecommitNode.typesGetFolderOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesFileMod.UnmarshalledFile
import typingsSlinky.awsSdkClientCodecommitNode.typesFolderMod.UnmarshalledFolder
import typingsSlinky.awsSdkClientCodecommitNode.typesSubModuleMod.UnmarshalledSubModule
import typingsSlinky.awsSdkClientCodecommitNode.typesSymbolicLinkMod.UnmarshalledSymbolicLink
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFolderOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The full commit ID used as a reference for which version of the folder content is returned.</p>
    */
  var commitId: String = js.native
  /**
    * <p>The list of files that exist in the specified folder, if any.</p>
    */
  var files: js.UndefOr[js.Array[UnmarshalledFile]] = js.native
  /**
    * <p>The fully-qualified path of the folder whose contents are returned.</p>
    */
  var folderPath: String = js.native
  /**
    * <p>The list of folders that exist beneath the specified folder, if any.</p>
    */
  var subFolders: js.UndefOr[js.Array[UnmarshalledFolder]] = js.native
  /**
    * <p>The list of submodules that exist in the specified folder, if any.</p>
    */
  var subModules: js.UndefOr[js.Array[UnmarshalledSubModule]] = js.native
  /**
    * <p>The list of symbolic links to other files and folders that exist in the specified folder, if any.</p>
    */
  var symbolicLinks: js.UndefOr[js.Array[UnmarshalledSymbolicLink]] = js.native
  /**
    * <p>The full SHA-1 pointer of the tree information for the commit that contains the folder.</p>
    */
  var treeId: js.UndefOr[String] = js.native
}

object GetFolderOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, commitId: String, folderPath: String): GetFolderOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderOutput]
  }
  @scala.inline
  implicit class GetFolderOutputOps[Self <: GetFolderOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[UnmarshalledFile]): Self = {
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
    def withSubFolders(value: js.Array[UnmarshalledFolder]): Self = {
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
    def withSubModules(value: js.Array[UnmarshalledSubModule]): Self = {
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
    def withSymbolicLinks(value: js.Array[UnmarshalledSymbolicLink]): Self = {
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
    def withTreeId(value: String): Self = {
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

