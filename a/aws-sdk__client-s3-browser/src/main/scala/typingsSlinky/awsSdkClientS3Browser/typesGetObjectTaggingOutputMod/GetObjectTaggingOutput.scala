package typingsSlinky.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectTaggingOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * _TagSet shape
    */
  var TagSet: js.Array[UnmarshalledTag] = js.native
  /**
    * _ObjectVersionId shape
    */
  var VersionId: js.UndefOr[String] = js.native
}

object GetObjectTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): GetObjectTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTaggingOutput]
  }
  @scala.inline
  implicit class GetObjectTaggingOutputOps[Self <: GetObjectTaggingOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagSet(value: js.Array[UnmarshalledTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSet")(value.asInstanceOf[js.Any])
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

