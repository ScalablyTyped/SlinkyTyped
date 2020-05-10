package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional annotations that can be used to guide the usage of a metric.
  */
@js.native
trait SchemaMetricDescriptorMetadata extends js.Object {
  /**
    * The delay of data points caused by ingestion. Data points older than this
    * age are guaranteed to be ingested and available to be read, excluding
    * data loss due to errors.
    */
  var ingestDelay: js.UndefOr[String] = js.native
  /**
    * The launch stage of the metric definition.
    */
  var launchStage: js.UndefOr[String] = js.native
  /**
    * The sampling period of metric data points. For metrics which are written
    * periodically, consecutive data points are stored at this time interval,
    * excluding data loss due to errors. Metrics with a higher granularity have
    * a smaller sampling period.
    */
  var samplePeriod: js.UndefOr[String] = js.native
}

object SchemaMetricDescriptorMetadata {
  @scala.inline
  def apply(): SchemaMetricDescriptorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricDescriptorMetadata]
  }
  @scala.inline
  implicit class SchemaMetricDescriptorMetadataOps[Self <: SchemaMetricDescriptorMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIngestDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngestDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchStage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchStage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchStage")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplePeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplePeriod")(js.undefined)
        ret
    }
  }
  
}

