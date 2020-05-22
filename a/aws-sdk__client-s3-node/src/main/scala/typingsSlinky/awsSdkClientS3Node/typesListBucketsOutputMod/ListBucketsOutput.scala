package typingsSlinky.awsSdkClientS3Node.typesListBucketsOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesBucketMod.UnmarshalledBucket
import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBucketsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _Buckets shape
    */
  var Buckets: js.UndefOr[js.Array[UnmarshalledBucket]] = js.undefined
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[UnmarshalledOwner] = js.undefined
}

object ListBucketsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Buckets: js.Array[UnmarshalledBucket] = null,
    Owner: UnmarshalledOwner = null
  ): ListBucketsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Buckets != null) __obj.updateDynamic("Buckets")(Buckets.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketsOutput]
  }
}

