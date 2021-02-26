package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.anon.Bucket
import typingsSlinky.awsLambda.anon.PrincipalId
import typingsSlinky.awsLambda.anon.SourceIPAddress
import typingsSlinky.awsLambda.anon.Xamzid2
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3Mod {
  
  type S3CreateEvent = S3Event
  
  @js.native
  trait S3Event extends StObject {
    
    var Records: js.Array[S3EventRecord] = js.native
  }
  object S3Event {
    
    @scala.inline
    def apply(Records: js.Array[S3EventRecord]): S3Event = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3Event]
    }
    
    @scala.inline
    implicit class S3EventMutableBuilder[Self <: S3Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[S3EventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: S3EventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  @js.native
  trait S3EventRecord extends StObject {
    
    var awsRegion: String = js.native
    
    var eventName: String = js.native
    
    var eventSource: String = js.native
    
    var eventTime: String = js.native
    
    var eventVersion: String = js.native
    
    var glacierEventData: js.UndefOr[S3EventRecordGlacierEventData] = js.native
    
    var requestParameters: SourceIPAddress = js.native
    
    var responseElements: Xamzid2 = js.native
    
    var s3: Bucket = js.native
    
    var userIdentity: PrincipalId = js.native
  }
  object S3EventRecord {
    
    @scala.inline
    def apply(
      awsRegion: String,
      eventName: String,
      eventSource: String,
      eventTime: String,
      eventVersion: String,
      requestParameters: SourceIPAddress,
      responseElements: Xamzid2,
      s3: Bucket,
      userIdentity: PrincipalId
    ): S3EventRecord = {
      val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], responseElements = responseElements.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3EventRecord]
    }
    
    @scala.inline
    implicit class S3EventRecordMutableBuilder[Self <: S3EventRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlacierEventData(value: S3EventRecordGlacierEventData): Self = StObject.set(x, "glacierEventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlacierEventDataUndefined: Self = StObject.set(x, "glacierEventData", js.undefined)
      
      @scala.inline
      def setRequestParameters(value: SourceIPAddress): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseElements(value: Xamzid2): Self = StObject.set(x, "responseElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3(value: Bucket): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdentity(value: PrincipalId): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait S3EventRecordGlacierEventData extends StObject {
    
    var restoreEventData: S3EventRecordGlacierRestoreEventData = js.native
  }
  object S3EventRecordGlacierEventData {
    
    @scala.inline
    def apply(restoreEventData: S3EventRecordGlacierRestoreEventData): S3EventRecordGlacierEventData = {
      val __obj = js.Dynamic.literal(restoreEventData = restoreEventData.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3EventRecordGlacierEventData]
    }
    
    @scala.inline
    implicit class S3EventRecordGlacierEventDataMutableBuilder[Self <: S3EventRecordGlacierEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRestoreEventData(value: S3EventRecordGlacierRestoreEventData): Self = StObject.set(x, "restoreEventData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait S3EventRecordGlacierRestoreEventData extends StObject {
    
    var lifecycleRestorationExpiryTime: String = js.native
    
    var lifecycleRestoreStorageClass: String = js.native
  }
  object S3EventRecordGlacierRestoreEventData {
    
    @scala.inline
    def apply(lifecycleRestorationExpiryTime: String, lifecycleRestoreStorageClass: String): S3EventRecordGlacierRestoreEventData = {
      val __obj = js.Dynamic.literal(lifecycleRestorationExpiryTime = lifecycleRestorationExpiryTime.asInstanceOf[js.Any], lifecycleRestoreStorageClass = lifecycleRestoreStorageClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3EventRecordGlacierRestoreEventData]
    }
    
    @scala.inline
    implicit class S3EventRecordGlacierRestoreEventDataMutableBuilder[Self <: S3EventRecordGlacierRestoreEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLifecycleRestorationExpiryTime(value: String): Self = StObject.set(x, "lifecycleRestorationExpiryTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecycleRestoreStorageClass(value: String): Self = StObject.set(x, "lifecycleRestoreStorageClass", value.asInstanceOf[js.Any])
    }
  }
  
  type S3Handler = Handler[S3Event, Unit]
}
