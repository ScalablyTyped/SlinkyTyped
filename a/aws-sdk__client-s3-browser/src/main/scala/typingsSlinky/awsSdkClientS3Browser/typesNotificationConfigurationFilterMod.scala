package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.typesS3KeyFilterMod.S3KeyFilter
import typingsSlinky.awsSdkClientS3Browser.typesS3KeyFilterMod.UnmarshalledS3KeyFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNotificationConfigurationFilterMod {
  
  @js.native
  trait NotificationConfigurationFilter extends StObject {
    
    /**
      * <p>Container for object key name prefix and suffix filtering rules.</p>
      */
    var Key: js.UndefOr[S3KeyFilter] = js.native
  }
  object NotificationConfigurationFilter {
    
    @scala.inline
    def apply(): NotificationConfigurationFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationConfigurationFilter]
    }
    
    @scala.inline
    implicit class NotificationConfigurationFilterMutableBuilder[Self <: NotificationConfigurationFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: S3KeyFilter): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledNotificationConfigurationFilter extends NotificationConfigurationFilter {
    
    /**
      * <p>Container for object key name prefix and suffix filtering rules.</p>
      */
    @JSName("Key")
    var Key_UnmarshalledNotificationConfigurationFilter: js.UndefOr[UnmarshalledS3KeyFilter] = js.native
  }
  object UnmarshalledNotificationConfigurationFilter {
    
    @scala.inline
    def apply(): UnmarshalledNotificationConfigurationFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledNotificationConfigurationFilter]
    }
    
    @scala.inline
    implicit class UnmarshalledNotificationConfigurationFilterMutableBuilder[Self <: UnmarshalledNotificationConfigurationFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: UnmarshalledS3KeyFilter): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    }
  }
}
