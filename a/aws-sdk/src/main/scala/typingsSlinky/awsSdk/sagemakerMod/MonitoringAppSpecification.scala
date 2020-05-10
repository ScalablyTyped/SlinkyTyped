package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringAppSpecification extends js.Object {
  /**
    * An array of arguments for the container used to run the monitoring job.
    */
  var ContainerArguments: js.UndefOr[MonitoringContainerArguments] = js.native
  /**
    * Specifies the entrypoint for a container used to run the monitoring job.
    */
  var ContainerEntrypoint: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContainerEntrypoint] = js.native
  /**
    * The container image to be run by the monitoring job.
    */
  var ImageUri: typingsSlinky.awsSdk.sagemakerMod.ImageUri = js.native
  /**
    * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
    */
  var PostAnalyticsProcessorSourceUri: js.UndefOr[S3Uri] = js.native
  /**
    * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers.
    */
  var RecordPreprocessorSourceUri: js.UndefOr[S3Uri] = js.native
}

object MonitoringAppSpecification {
  @scala.inline
  def apply(ImageUri: ImageUri): MonitoringAppSpecification = {
    val __obj = js.Dynamic.literal(ImageUri = ImageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringAppSpecification]
  }
  @scala.inline
  implicit class MonitoringAppSpecificationOps[Self <: MonitoringAppSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageUri(value: ImageUri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerArguments(value: MonitoringContainerArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerEntrypoint(value: ContainerEntrypoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerEntrypoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerEntrypoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerEntrypoint")(js.undefined)
        ret
    }
    @scala.inline
    def withPostAnalyticsProcessorSourceUri(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostAnalyticsProcessorSourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostAnalyticsProcessorSourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostAnalyticsProcessorSourceUri")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordPreprocessorSourceUri(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordPreprocessorSourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordPreprocessorSourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordPreprocessorSourceUri")(js.undefined)
        ret
    }
  }
  
}

