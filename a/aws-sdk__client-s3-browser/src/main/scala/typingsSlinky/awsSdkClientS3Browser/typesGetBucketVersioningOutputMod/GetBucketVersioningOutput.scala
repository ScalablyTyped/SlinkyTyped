package typingsSlinky.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Suspended
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketVersioningOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.</p>
    */
  var MFADelete: js.UndefOr[Enabled | Disabled | String] = js.native
  /**
    * <p>The versioning state of the bucket.</p>
    */
  var Status: js.UndefOr[Enabled | Suspended | String] = js.native
}

object GetBucketVersioningOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketVersioningOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketVersioningOutput]
  }
  @scala.inline
  implicit class GetBucketVersioningOutputOps[Self <: GetBucketVersioningOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMFADelete(value: Enabled | Disabled | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFADelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMFADelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFADelete")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Enabled | Suspended | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

