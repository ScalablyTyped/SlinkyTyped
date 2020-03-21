package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesBranchInfoMod.UnmarshalledBranchInfo
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/DeleteBranchOutput", JSImport.Namespace)
@js.native
object typesDeleteBranchOutputMod extends js.Object {
  @js.native
  trait DeleteBranchOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Information about the branch deleted by the operation, including the branch name and the commit ID that was the tip of the branch.</p>
      */
    var deletedBranch: js.UndefOr[UnmarshalledBranchInfo] = js.native
  }
  
}

