package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.CSV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAnalyticsS3BucketDestinationMod {
  
  @js.native
  trait AnalyticsS3BucketDestination extends StObject {
    
    /**
      * <p>The Amazon resource name (ARN) of the bucket to which data is exported.</p>
      */
    var Bucket: String = js.native
    
    /**
      * <p>The account ID that owns the destination bucket. If no account ID is provided, the owner will not be validated prior to exporting data.</p>
      */
    var BucketAccountId: js.UndefOr[String] = js.native
    
    /**
      * <p>The file format used when exporting data to Amazon S3.</p>
      */
    var Format: CSV | String = js.native
    
    /**
      * <p>The prefix to use when exporting data. The exported data begins with this prefix.</p>
      */
    var Prefix: js.UndefOr[String] = js.native
  }
  object AnalyticsS3BucketDestination {
    
    @scala.inline
    def apply(Bucket: String, Format: CSV | String): AnalyticsS3BucketDestination = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsS3BucketDestination]
    }
    
    @scala.inline
    implicit class AnalyticsS3BucketDestinationMutableBuilder[Self <: AnalyticsS3BucketDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketAccountId(value: String): Self = StObject.set(x, "BucketAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketAccountIdUndefined: Self = StObject.set(x, "BucketAccountId", js.undefined)
      
      @scala.inline
      def setFormat(value: CSV | String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    }
  }
  
  type UnmarshalledAnalyticsS3BucketDestination = AnalyticsS3BucketDestination
}
