package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.typesLoggingEnabledMod.LoggingEnabled
import typingsSlinky.awsSdkClientS3Browser.typesLoggingEnabledMod.UnmarshalledLoggingEnabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBucketLoggingStatusMod {
  
  @js.native
  trait BucketLoggingStatus extends StObject {
    
    /**
      * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
      */
    var LoggingEnabled: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesLoggingEnabledMod.LoggingEnabled] = js.native
  }
  object BucketLoggingStatus {
    
    @scala.inline
    def apply(): BucketLoggingStatus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketLoggingStatus]
    }
    
    @scala.inline
    implicit class BucketLoggingStatusMutableBuilder[Self <: BucketLoggingStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoggingEnabled(value: LoggingEnabled): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledBucketLoggingStatus extends BucketLoggingStatus {
    
    /**
      * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
      */
    @JSName("LoggingEnabled")
    var LoggingEnabled_UnmarshalledBucketLoggingStatus: js.UndefOr[UnmarshalledLoggingEnabled] = js.native
  }
  object UnmarshalledBucketLoggingStatus {
    
    @scala.inline
    def apply(): UnmarshalledBucketLoggingStatus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledBucketLoggingStatus]
    }
    
    @scala.inline
    implicit class UnmarshalledBucketLoggingStatusMutableBuilder[Self <: UnmarshalledBucketLoggingStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoggingEnabled(value: UnmarshalledLoggingEnabled): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
    }
  }
}
