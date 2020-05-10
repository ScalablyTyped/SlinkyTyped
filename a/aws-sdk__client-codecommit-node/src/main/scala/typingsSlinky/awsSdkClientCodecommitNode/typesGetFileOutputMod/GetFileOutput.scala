package typingsSlinky.awsSdkClientCodecommitNode.typesGetFileOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The blob ID of the object that represents the file content.</p>
    */
  var blobId: String = js.native
  /**
    * <p>The full commit ID of the commit that contains the content returned by GetFile.</p>
    */
  var commitId: String = js.native
  /**
    * <p>The base-64 encoded binary data object that represents the content of the file.</p>
    */
  var fileContent: js.typedarray.Uint8Array = js.native
  /**
    * <p>The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and not numeric values.</p> <note> <p>The file mode permissions returned by this API are not the standard file mode permission values, such as 100644, but rather extrapolated values. See below for a full list of supported return values.</p> </note>
    */
  var fileMode: EXECUTABLE | NORMAL | SYMLINK | String = js.native
  /**
    * <p>The fully qualified path to the specified file. This returns the name and extension of the file.</p>
    */
  var filePath: String = js.native
  /**
    * <p>The size of the contents of the file, in bytes.</p>
    */
  var fileSize: Double = js.native
}

object GetFileOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    blobId: String,
    commitId: String,
    fileContent: js.typedarray.Uint8Array,
    fileMode: EXECUTABLE | NORMAL | SYMLINK | String,
    filePath: String,
    fileSize: Double
  ): GetFileOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileOutput]
  }
  @scala.inline
  implicit class GetFileOutputOps[Self <: GetFileOutput] (val x: Self) extends AnyVal {
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
    def withBlobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileContent(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileMode(value: EXECUTABLE | NORMAL | SYMLINK | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

