package typingsSlinky.pulumiAws.reportDefinitionMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportDefinitionState extends js.Object {
  /**
    * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT.
    */
  val additionalArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of schema elements. Valid values are: RESOURCES.
    */
  val additionalSchemaElements: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Compression format for report. Valid values are: GZIP, ZIP.
    */
  val compression: js.UndefOr[Input[String]] = js.native
  /**
    * Format for report. Valid values are: textORcsv.
    */
  val format: js.UndefOr[Input[String]] = js.native
  /**
    * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
    */
  val reportName: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the existing S3 bucket to hold generated reports.
    */
  val s3Bucket: js.UndefOr[Input[String]] = js.native
  /**
    * Report path prefix. Limited to 256 characters.
    */
  val s3Prefix: js.UndefOr[Input[String]] = js.native
  /**
    * Region of the existing S3 bucket to hold generated reports.
    */
  val s3Region: js.UndefOr[Input[String]] = js.native
  /**
    * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
    */
  val timeUnit: js.UndefOr[Input[String]] = js.native
}

object ReportDefinitionState {
  @scala.inline
  def apply(): ReportDefinitionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportDefinitionState]
  }
  @scala.inline
  implicit class ReportDefinitionStateOps[Self <: ReportDefinitionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalArtifacts(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalSchemaElements(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSchemaElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalSchemaElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSchemaElements")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withReportName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportName")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Bucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Prefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Region(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Region: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Region")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeUnit(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(js.undefined)
        ret
    }
  }
  
}

