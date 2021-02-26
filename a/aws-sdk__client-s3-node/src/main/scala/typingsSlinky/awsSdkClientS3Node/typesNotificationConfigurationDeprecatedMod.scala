package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.CloudFunctionConfiguration
import typingsSlinky.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typingsSlinky.awsSdkClientS3Node.typesQueueConfigurationDeprecatedMod.QueueConfigurationDeprecated
import typingsSlinky.awsSdkClientS3Node.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typingsSlinky.awsSdkClientS3Node.typesTopicConfigurationDeprecatedMod.TopicConfigurationDeprecated
import typingsSlinky.awsSdkClientS3Node.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNotificationConfigurationDeprecatedMod {
  
  @js.native
  trait NotificationConfigurationDeprecated extends StObject {
    
    /**
      * _CloudFunctionConfiguration shape
      */
    var CloudFunctionConfiguration: js.UndefOr[
        typingsSlinky.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.CloudFunctionConfiguration
      ] = js.native
    
    /**
      * _QueueConfigurationDeprecated shape
      */
    var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.native
    
    /**
      * _TopicConfigurationDeprecated shape
      */
    var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.native
  }
  object NotificationConfigurationDeprecated {
    
    @scala.inline
    def apply(): NotificationConfigurationDeprecated = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationConfigurationDeprecated]
    }
    
    @scala.inline
    implicit class NotificationConfigurationDeprecatedMutableBuilder[Self <: NotificationConfigurationDeprecated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudFunctionConfiguration(value: CloudFunctionConfiguration): Self = StObject.set(x, "CloudFunctionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudFunctionConfigurationUndefined: Self = StObject.set(x, "CloudFunctionConfiguration", js.undefined)
      
      @scala.inline
      def setQueueConfiguration(value: QueueConfigurationDeprecated): Self = StObject.set(x, "QueueConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueConfigurationUndefined: Self = StObject.set(x, "QueueConfiguration", js.undefined)
      
      @scala.inline
      def setTopicConfiguration(value: TopicConfigurationDeprecated): Self = StObject.set(x, "TopicConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicConfigurationUndefined: Self = StObject.set(x, "TopicConfiguration", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledNotificationConfigurationDeprecated extends NotificationConfigurationDeprecated {
    
    /**
      * _CloudFunctionConfiguration shape
      */
    @JSName("CloudFunctionConfiguration")
    var CloudFunctionConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledCloudFunctionConfiguration] = js.native
    
    /**
      * _QueueConfigurationDeprecated shape
      */
    @JSName("QueueConfiguration")
    var QueueConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledQueueConfigurationDeprecated] = js.native
    
    /**
      * _TopicConfigurationDeprecated shape
      */
    @JSName("TopicConfiguration")
    var TopicConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledTopicConfigurationDeprecated] = js.native
  }
  object UnmarshalledNotificationConfigurationDeprecated {
    
    @scala.inline
    def apply(): UnmarshalledNotificationConfigurationDeprecated = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledNotificationConfigurationDeprecated]
    }
    
    @scala.inline
    implicit class UnmarshalledNotificationConfigurationDeprecatedMutableBuilder[Self <: UnmarshalledNotificationConfigurationDeprecated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudFunctionConfiguration(value: UnmarshalledCloudFunctionConfiguration): Self = StObject.set(x, "CloudFunctionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudFunctionConfigurationUndefined: Self = StObject.set(x, "CloudFunctionConfiguration", js.undefined)
      
      @scala.inline
      def setQueueConfiguration(value: UnmarshalledQueueConfigurationDeprecated): Self = StObject.set(x, "QueueConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueConfigurationUndefined: Self = StObject.set(x, "QueueConfiguration", js.undefined)
      
      @scala.inline
      def setTopicConfiguration(value: UnmarshalledTopicConfigurationDeprecated): Self = StObject.set(x, "TopicConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicConfigurationUndefined: Self = StObject.set(x, "TopicConfiguration", js.undefined)
    }
  }
}
