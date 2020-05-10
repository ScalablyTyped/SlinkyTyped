package typingsSlinky.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportDefinition extends js.Object {
  /**
    * A list of manifests that you want Amazon Web Services to create for this report.
    */
  var AdditionalArtifacts: js.UndefOr[AdditionalArtifactList] = js.native
  /**
    * A list of strings that indicate additional content that Amazon Web Services includes in the report, such as individual resource IDs. 
    */
  var AdditionalSchemaElements: SchemaElementList = js.native
  var Compression: CompressionFormat = js.native
  var Format: ReportFormat = js.native
  /**
    * Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web Services detects charges related to previous months. These charges can include refunds, credits, or support fees.
    */
  var RefreshClosedReports: js.UndefOr[typingsSlinky.awsSdk.curMod.RefreshClosedReports] = js.native
  var ReportName: typingsSlinky.awsSdk.curMod.ReportName = js.native
  /**
    * Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the report in addition to the previous versions.
    */
  var ReportVersioning: js.UndefOr[typingsSlinky.awsSdk.curMod.ReportVersioning] = js.native
  var S3Bucket: typingsSlinky.awsSdk.curMod.S3Bucket = js.native
  var S3Prefix: typingsSlinky.awsSdk.curMod.S3Prefix = js.native
  var S3Region: AWSRegion = js.native
  var TimeUnit: typingsSlinky.awsSdk.curMod.TimeUnit = js.native
}

object ReportDefinition {
  @scala.inline
  def apply(
    AdditionalSchemaElements: SchemaElementList,
    Compression: CompressionFormat,
    Format: ReportFormat,
    ReportName: ReportName,
    S3Bucket: S3Bucket,
    S3Prefix: S3Prefix,
    S3Region: AWSRegion,
    TimeUnit: TimeUnit
  ): ReportDefinition = {
    val __obj = js.Dynamic.literal(AdditionalSchemaElements = AdditionalSchemaElements.asInstanceOf[js.Any], Compression = Compression.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ReportName = ReportName.asInstanceOf[js.Any], S3Bucket = S3Bucket.asInstanceOf[js.Any], S3Prefix = S3Prefix.asInstanceOf[js.Any], S3Region = S3Region.asInstanceOf[js.Any], TimeUnit = TimeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDefinition]
  }
  @scala.inline
  implicit class ReportDefinitionOps[Self <: ReportDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalSchemaElements(value: SchemaElementList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalSchemaElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompression(value: CompressionFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: ReportFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportName(value: ReportName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Bucket(value: S3Bucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Prefix(value: S3Prefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Region(value: AWSRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeUnit(value: TimeUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalArtifacts(value: AdditionalArtifactList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshClosedReports(value: RefreshClosedReports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshClosedReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshClosedReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshClosedReports")(js.undefined)
        ret
    }
    @scala.inline
    def withReportVersioning(value: ReportVersioning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportVersioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportVersioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportVersioning")(js.undefined)
        ret
    }
  }
  
}

