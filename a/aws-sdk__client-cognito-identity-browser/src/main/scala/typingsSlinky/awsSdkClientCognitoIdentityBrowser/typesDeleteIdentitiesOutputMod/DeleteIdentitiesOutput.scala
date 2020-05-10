package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesOutputMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnprocessedIdentityIdMod.UnmarshalledUnprocessedIdentityId
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIdentitiesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.</p>
    */
  var UnprocessedIdentityIds: js.UndefOr[js.Array[UnmarshalledUnprocessedIdentityId]] = js.native
}

object DeleteIdentitiesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteIdentitiesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentitiesOutput]
  }
  @scala.inline
  implicit class DeleteIdentitiesOutputOps[Self <: DeleteIdentitiesOutput] (val x: Self) extends AnyVal {
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
    def withUnprocessedIdentityIds(value: js.Array[UnmarshalledUnprocessedIdentityId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedIdentityIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedIdentityIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedIdentityIds")(js.undefined)
        ret
    }
  }
  
}

