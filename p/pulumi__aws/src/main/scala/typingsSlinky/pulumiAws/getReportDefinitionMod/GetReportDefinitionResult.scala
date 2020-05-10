package typingsSlinky.pulumiAws.getReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReportDefinitionResult extends js.Object {
  /**
    * A list of additional artifacts.
    */
  val additionalArtifacts: js.Array[String] = js.native
  /**
    * A list of schema elements.
    */
  val additionalSchemaElements: js.Array[String] = js.native
  /**
    * Preferred format for report.
    */
  val compression: String = js.native
  /**
    * Preferred compression format for report.
    */
  val format: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val reportName: String = js.native
  /**
    * Name of customer S3 bucket.
    */
  val s3Bucket: String = js.native
  /**
    * Preferred report path prefix.
    */
  val s3Prefix: String = js.native
  /**
    * Region of customer S3 bucket.
    */
  val s3Region: String = js.native
  /**
    * The frequency on which report data are measured and displayed.
    */
  val timeUnit: String = js.native
}

object GetReportDefinitionResult {
  @scala.inline
  def apply(
    additionalArtifacts: js.Array[String],
    additionalSchemaElements: js.Array[String],
    compression: String,
    format: String,
    id: String,
    reportName: String,
    s3Bucket: String,
    s3Prefix: String,
    s3Region: String,
    timeUnit: String
  ): GetReportDefinitionResult = {
    val __obj = js.Dynamic.literal(additionalArtifacts = additionalArtifacts.asInstanceOf[js.Any], additionalSchemaElements = additionalSchemaElements.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reportName = reportName.asInstanceOf[js.Any], s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Prefix = s3Prefix.asInstanceOf[js.Any], s3Region = s3Region.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReportDefinitionResult]
  }
  @scala.inline
  implicit class GetReportDefinitionResultOps[Self <: GetReportDefinitionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalArtifacts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalSchemaElements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSchemaElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Bucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Region(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

