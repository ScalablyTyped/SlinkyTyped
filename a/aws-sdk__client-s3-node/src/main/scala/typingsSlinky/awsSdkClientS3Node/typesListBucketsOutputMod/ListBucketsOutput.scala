package typingsSlinky.awsSdkClientS3Node.typesListBucketsOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesBucketMod.UnmarshalledBucket
import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketsOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * _Buckets shape
    */
  var Buckets: js.UndefOr[js.Array[UnmarshalledBucket]] = js.native
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[UnmarshalledOwner] = js.native
}

object ListBucketsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListBucketsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketsOutput]
  }
  @scala.inline
  implicit class ListBucketsOutputOps[Self <: ListBucketsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: js.Array[UnmarshalledBucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buckets")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: UnmarshalledOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
  }
  
}

