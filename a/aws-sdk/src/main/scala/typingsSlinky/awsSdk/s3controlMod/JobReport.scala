package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobReport extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.
    */
  var Bucket: js.UndefOr[S3BucketArnString] = js.native
  
  /**
    * Indicates whether the specified job will generate a job-completion report.
    */
  var Enabled: Boolean = js.native
  
  /**
    * The format of the specified job-completion report.
    */
  var Format: js.UndefOr[JobReportFormat] = js.native
  
  /**
    * An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3 stores the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.
    */
  var Prefix: js.UndefOr[ReportPrefixString] = js.native
  
  /**
    * Indicates whether the job-completion report will include details of all tasks or only failed tasks.
    */
  var ReportScope: js.UndefOr[JobReportScope] = js.native
}
object JobReport {
  
  @scala.inline
  def apply(Enabled: Boolean): JobReport = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobReport]
  }
  
  @scala.inline
  implicit class JobReportMutableBuilder[Self <: JobReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: S3BucketArnString): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: JobReportFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setPrefix(value: ReportPrefixString): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setReportScope(value: JobReportScope): Self = StObject.set(x, "ReportScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportScopeUndefined: Self = StObject.set(x, "ReportScope", js.undefined)
  }
}
