package typingsSlinky.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesServerSideEncryptionConfigurationMod.UnmarshalledServerSideEncryptionConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketEncryptionOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * <p>Container for server-side encryption configuration rules. Currently S3 supports one rule only.</p>
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[UnmarshalledServerSideEncryptionConfiguration] = js.native
}

object GetBucketEncryptionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketEncryptionOutput]
  }
  @scala.inline
  implicit class GetBucketEncryptionOutputOps[Self <: GetBucketEncryptionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerSideEncryptionConfiguration(value: UnmarshalledServerSideEncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryptionConfiguration")(js.undefined)
        ret
    }
  }
  
}

