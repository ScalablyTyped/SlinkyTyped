package typingsSlinky.awsSdkClientS3Node.typesDeleteObjectsOutputMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesDeletedObjectMod.UnmarshalledDeletedObject
import typingsSlinky.awsSdkClientS3Node.typesErrorMod.UnmarshalledError
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectsOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * _DeletedObjects shape
    */
  var Deleted: js.UndefOr[js.Array[UnmarshalledDeletedObject]] = js.native
  /**
    * _Errors shape
    */
  var Errors: js.UndefOr[js.Array[UnmarshalledError]] = js.native
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.native
}

object DeleteObjectsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteObjectsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsOutput]
  }
  @scala.inline
  implicit class DeleteObjectsOutputOps[Self <: DeleteObjectsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: js.Array[UnmarshalledDeletedObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[UnmarshalledError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(js.undefined)
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
  }
  
}

