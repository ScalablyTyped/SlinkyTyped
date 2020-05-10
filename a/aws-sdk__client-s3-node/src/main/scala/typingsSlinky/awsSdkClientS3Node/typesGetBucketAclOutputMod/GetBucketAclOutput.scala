package typingsSlinky.awsSdkClientS3Node.typesGetBucketAclOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesGrantMod.UnmarshalledGrant
import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketAclOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>A list of grants.</p>
    */
  var Grants: js.UndefOr[js.Array[UnmarshalledGrant]] = js.native
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[UnmarshalledOwner] = js.native
}

object GetBucketAclOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketAclOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAclOutput]
  }
  @scala.inline
  implicit class GetBucketAclOutputOps[Self <: GetBucketAclOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrants(value: js.Array[UnmarshalledGrant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grants")(js.undefined)
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

