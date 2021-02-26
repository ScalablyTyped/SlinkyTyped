package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventbridgeMod {
  
  @js.native
  trait EventBridgeEvent[TDetailType /* <: String */, TDetail] extends StObject {
    
    var account: String = js.native
    
    var detail: TDetail = js.native
    
    var `detail-type`: TDetailType = js.native
    
    var id: String = js.native
    
    var region: String = js.native
    
    var resources: js.Array[String] = js.native
    
    var source: String = js.native
    
    var time: String = js.native
    
    var version: String = js.native
  }
  object EventBridgeEvent {
    
    @scala.inline
    def apply[TDetailType /* <: String */, TDetail](
      account: String,
      detail: TDetail,
      `detail-type`: TDetailType,
      id: String,
      region: String,
      resources: js.Array[String],
      source: String,
      time: String,
      version: String
    ): EventBridgeEvent[TDetailType, TDetail] = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventBridgeEvent[TDetailType, TDetail]]
    }
    
    @scala.inline
    implicit class EventBridgeEventMutableBuilder[Self <: EventBridgeEvent[_, _], TDetailType /* <: String */, TDetail] (val x: Self with (EventBridgeEvent[TDetailType, TDetail])) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: TDetail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDetail-type`(value: TDetailType): Self = StObject.set(x, "detail-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type EventBridgeHandler[TDetailType /* <: String */, TDetail, TResult] = Handler[EventBridgeEvent[TDetailType, TDetail], TResult]
}
