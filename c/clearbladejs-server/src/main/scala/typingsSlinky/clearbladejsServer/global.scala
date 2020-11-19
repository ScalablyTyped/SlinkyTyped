package typingsSlinky.clearbladejsServer

import typingsSlinky.clearbladejsServer.CbServer.ClearBladeGlobal
import typingsSlinky.clearbladejsServer.CbServer.ReqTypes
import typingsSlinky.clearbladejsServer.CbServer.Resp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var ClearBlade: ClearBladeGlobal = js.native
  
  @js.native
  object CbServer extends js.Object {
    
    var ClearBlade: ClearBladeGlobal = js.native
    
    var req: ReqTypes = js.native
    
    var resp: Resp = js.native
    
    @js.native
    object MessagingQOS extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.clearbladejsServer.CbServer.MessagingQOS with Double] = js.native
      
      /* 1 */ val MESSAGING_QOS_AT_LEAST_ONCE: typingsSlinky.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE with Double = js.native
      
      /* 0 */ val MESSAGING_QOS_AT_MOST_ONCE: typingsSlinky.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE with Double = js.native
      
      /* 2 */ val MESSAGING_QOS_EXACTLY_ONCE: typingsSlinky.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE with Double = js.native
    }
    
    @js.native
    object QueryConditions extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.clearbladejsServer.CbServer.QueryConditions with String] = js.native
      
      /* "EQ" */ val QUERY_EQUAL: typingsSlinky.clearbladejsServer.CbServer.QueryConditions.QUERY_EQUAL with String = js.native
      
      /* "GT" */ val QUERY_GREATERTHAN: typingsSlinky.clearbladejsServer.CbServer.QueryConditions.QUERY_GREATERTHAN with String = js.native
      
      /* "GTE" */ val QUERY_GREATERTHAN_EQUAL: typingsSlinky.clearbladejsServer.CbServer.QueryConditions.QUERY_GREATERTHAN_EQUAL with String = js.native
      
      /* "LT" */ val QUERY_LESSTHAN: typingsSlinky.clearbladejsServer.CbServer.QueryConditions.QUERY_LESSTHAN with String = js.native
      
      /* "LTE" */ val QUERY_LESSTHAN_EQUAL: typingsSlinky.clearbladejsServer.CbServer.QueryConditions.QUERY_LESSTHAN_EQUAL with String = js.native
      
      /* "RE" */ val QUERY_MATCHES: typingsSlinky.clearbladejsServer.CbServer.QueryConditions.QUERY_MATCHES with String = js.native
      
      /* "NEQ" */ val QUERY_NOTEQUAL: typingsSlinky.clearbladejsServer.CbServer.QueryConditions.QUERY_NOTEQUAL with String = js.native
    }
    
    @js.native
    object QuerySortDirections extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.clearbladejsServer.CbServer.QuerySortDirections with String] = js.native
      
      /* "ASC" */ val QUERY_SORT_ASCENDING: typingsSlinky.clearbladejsServer.CbServer.QuerySortDirections.QUERY_SORT_ASCENDING with String = js.native
      
      /* "DESC" */ val QUERY_SORT_DESCENDING: typingsSlinky.clearbladejsServer.CbServer.QuerySortDirections.QUERY_SORT_DESCENDING with String = js.native
    }
    
    @js.native
    object TriggerModule extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.clearbladejsServer.CbServer.TriggerModule with String] = js.native
      
      /* "Device" */ val DEVICE: typingsSlinky.clearbladejsServer.CbServer.TriggerModule.DEVICE with String = js.native
      
      /* "Data" */ val Data: typingsSlinky.clearbladejsServer.CbServer.TriggerModule.Data with String = js.native
      
      /* "Messaging" */ val MESSAGING: typingsSlinky.clearbladejsServer.CbServer.TriggerModule.MESSAGING with String = js.native
      
      /* "User" */ val USER: typingsSlinky.clearbladejsServer.CbServer.TriggerModule.USER with String = js.native
    }
  }
}
