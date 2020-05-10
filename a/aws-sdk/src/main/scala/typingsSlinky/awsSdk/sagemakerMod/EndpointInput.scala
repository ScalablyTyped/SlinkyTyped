package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointInput extends js.Object {
  /**
    * An endpoint in customer's account which has enabled DataCaptureConfig enabled.
    */
  var EndpointName: typingsSlinky.awsSdk.sagemakerMod.EndpointName = js.native
  /**
    * Path to the filesystem where the endpoint data is available to the container.
    */
  var LocalPath: ProcessingLocalPath = js.native
  /**
    * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated 
    */
  var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType] = js.native
  /**
    * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
    */
  var S3InputMode: js.UndefOr[ProcessingS3InputMode] = js.native
}

object EndpointInput {
  @scala.inline
  def apply(EndpointName: EndpointName, LocalPath: ProcessingLocalPath): EndpointInput = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any], LocalPath = LocalPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointInput]
  }
  @scala.inline
  implicit class EndpointInputOps[Self <: EndpointInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointName(value: EndpointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalPath(value: ProcessingLocalPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3DataDistributionType(value: ProcessingS3DataDistributionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataDistributionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DataDistributionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataDistributionType")(js.undefined)
        ret
    }
    @scala.inline
    def withS3InputMode(value: ProcessingS3InputMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3InputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3InputMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3InputMode")(js.undefined)
        ret
    }
  }
  
}

