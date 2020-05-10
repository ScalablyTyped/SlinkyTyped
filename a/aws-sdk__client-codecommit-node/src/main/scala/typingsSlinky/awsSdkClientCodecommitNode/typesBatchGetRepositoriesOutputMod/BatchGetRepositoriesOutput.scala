package typingsSlinky.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryMetadataMod.UnmarshalledRepositoryMetadata
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetRepositoriesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>A list of repositories returned by the batch get repositories operation.</p>
    */
  var repositories: js.UndefOr[js.Array[UnmarshalledRepositoryMetadata]] = js.native
  /**
    * <p>Returns a list of repository names for which information could not be found.</p>
    */
  var repositoriesNotFound: js.UndefOr[js.Array[String]] = js.native
}

object BatchGetRepositoriesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): BatchGetRepositoriesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetRepositoriesOutput]
  }
  @scala.inline
  implicit class BatchGetRepositoriesOutputOps[Self <: BatchGetRepositoriesOutput] (val x: Self) extends AnyVal {
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
    def withRepositories(value: js.Array[UnmarshalledRepositoryMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoriesNotFound(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoriesNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoriesNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoriesNotFound")(js.undefined)
        ret
    }
  }
  
}

