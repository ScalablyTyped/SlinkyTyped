package typingsSlinky.awsGreengrassCoreSdk

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.AllOrError
import typingsSlinky.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.BestEffort
import typingsSlinky.node.Buffer
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aws-greengrass-core-sdk", "IotData")
  @js.native
  class IotData () extends StObject {
    
    def publish(params: PublishParams, callback: IotCallback): Unit = js.native
  }
  
  type IotCallback = js.Function2[/* error */ js.Error | Null, /* data */ IotCallbackData | Null, Unit]
  
  @js.native
  trait IotCallbackData extends StObject {
    
    var payload: Buffer | Blob | String | ArrayLike[_] = js.native
  }
  object IotCallbackData {
    
    @scala.inline
    def apply(payload: Buffer | Blob | String | ArrayLike[_]): IotCallbackData = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[IotCallbackData]
    }
    
    @scala.inline
    implicit class IotCallbackDataMutableBuilder[Self <: IotCallbackData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Buffer | Blob | String | ArrayLike[_]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadBlob(value: Blob): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PublishParams extends StObject {
    
    var payload: Buffer | Blob | String | ArrayLike[_] = js.native
    
    var queueFullPolicy: js.UndefOr[AllOrError | BestEffort] = js.native
    
    var topic: String = js.native
  }
  object PublishParams {
    
    @scala.inline
    def apply(payload: Buffer | Blob | String | ArrayLike[_], topic: String): PublishParams = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishParams]
    }
    
    @scala.inline
    implicit class PublishParamsMutableBuilder[Self <: PublishParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Buffer | Blob | String | ArrayLike[_]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadBlob(value: Blob): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueFullPolicy(value: AllOrError | BestEffort): Self = StObject.set(x, "queueFullPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueFullPolicyUndefined: Self = StObject.set(x, "queueFullPolicy", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
}
