package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageExportLocation extends StObject {
  
  /**
    * The name of an existing bucket in Cloud Storage where the usage report object is stored. The Google Service Account is granted write access to this bucket. This can either be the
    * bucket name by itself, such as example-bucket, or the bucket name with gs:// or https://storage.googleapis.com/ in front of it, such as gs://example-bucket.
    */
  var bucketName: js.UndefOr[String] = js.native
  
  /**
    * An optional prefix for the name of the usage report object stored in bucketName. If not supplied, defaults to usage. The report is stored as a CSV file named
    * report_name_prefix_gce_YYYYMMDD.csv where YYYYMMDD is the day of the usage according to Pacific Time. If you supply a prefix, it should conform to Cloud Storage object naming
    * conventions.
    */
  var reportNamePrefix: js.UndefOr[String] = js.native
}
object UsageExportLocation {
  
  @scala.inline
  def apply(): UsageExportLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageExportLocation]
  }
  
  @scala.inline
  implicit class UsageExportLocationMutableBuilder[Self <: UsageExportLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    @scala.inline
    def setReportNamePrefix(value: String): Self = StObject.set(x, "reportNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportNamePrefixUndefined: Self = StObject.set(x, "reportNamePrefix", js.undefined)
  }
}
