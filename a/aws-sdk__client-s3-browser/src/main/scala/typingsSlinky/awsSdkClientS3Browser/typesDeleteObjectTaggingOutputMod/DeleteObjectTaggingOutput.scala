package typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectTaggingOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * <p>The versionId of the object the tag-set was removed from.</p>
    */
  var VersionId: js.UndefOr[String] = js.native
}

object DeleteObjectTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteObjectTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectTaggingOutput]
  }
  @scala.inline
  implicit class DeleteObjectTaggingOutputOps[Self <: DeleteObjectTaggingOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

