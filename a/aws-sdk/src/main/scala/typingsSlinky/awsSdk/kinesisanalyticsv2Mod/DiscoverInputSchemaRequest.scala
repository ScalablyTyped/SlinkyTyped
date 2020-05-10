package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverInputSchemaRequest extends js.Object {
  /**
    * The InputProcessingConfiguration to use to preprocess the records before discovering the schema of the records.
    */
  var InputProcessingConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfiguration] = js.native
  /**
    * The point at which you want Kinesis Data Analytics to start reading records from the specified streaming source discovery purposes.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputStartingPositionConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) of the streaming source.
    */
  var ResourceARN: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ResourceARN] = js.native
  /**
    * Specify this parameter to discover a schema from data in an Amazon S3 object.
    */
  var S3Configuration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.S3Configuration] = js.native
  /**
    * The ARN of the role that is used to access the streaming source.
    */
  var ServiceExecutionRole: RoleARN = js.native
}

object DiscoverInputSchemaRequest {
  @scala.inline
  def apply(ServiceExecutionRole: RoleARN): DiscoverInputSchemaRequest = {
    val __obj = js.Dynamic.literal(ServiceExecutionRole = ServiceExecutionRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverInputSchemaRequest]
  }
  @scala.inline
  implicit class DiscoverInputSchemaRequestOps[Self <: DiscoverInputSchemaRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceExecutionRole(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceExecutionRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputProcessingConfiguration(value: InputProcessingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputProcessingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProcessingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputProcessingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputStartingPositionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStartingPositionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputStartingPositionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Configuration(value: S3Configuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Configuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Configuration")(js.undefined)
        ret
    }
  }
  
}

