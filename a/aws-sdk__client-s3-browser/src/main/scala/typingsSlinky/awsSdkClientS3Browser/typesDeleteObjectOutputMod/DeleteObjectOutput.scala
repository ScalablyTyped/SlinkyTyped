package typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectOutputMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * <p>Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.</p>
    */
  var DeleteMarker: js.UndefOr[Boolean] = js.native
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.native
  /**
    * <p>Returns the version ID of the delete marker created as a result of the DELETE operation.</p>
    */
  var VersionId: js.UndefOr[String] = js.native
}

object DeleteObjectOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectOutput]
  }
  @scala.inline
  implicit class DeleteObjectOutputOps[Self <: DeleteObjectOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteMarker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCharged(value: requester_ | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCharged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
  }
  
}

