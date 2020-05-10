package typingsSlinky.awsSdkClientS3Browser.typesRestoreObjectOutputMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreObjectOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.native
  /**
    * <p>Indicates the path in the provided S3 output location where Select results will be restored to.</p>
    */
  var RestoreOutputPath: js.UndefOr[String] = js.native
}

object RestoreObjectOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): RestoreObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreObjectOutput]
  }
  @scala.inline
  implicit class RestoreObjectOutputOps[Self <: RestoreObjectOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRestoreOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreOutputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreOutputPath")(js.undefined)
        ret
    }
  }
  
}

