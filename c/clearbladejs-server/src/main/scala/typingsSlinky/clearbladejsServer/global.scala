package typingsSlinky.clearbladejsServer

import typingsSlinky.clearbladejsServer.CbServer.ClearBladeGlobal
import typingsSlinky.clearbladejsServer.CbServer.ReqTypes
import typingsSlinky.clearbladejsServer.CbServer.Resp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CbServer {
    
    @JSGlobal("CbServer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CbServer.ClearBlade")
    @js.native
    def ClearBlade: ClearBladeGlobal = js.native
    @scala.inline
    def ClearBlade_=(x: ClearBladeGlobal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearBlade")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CbServer.MessagingQOS")
    @js.native
    object MessagingQOS extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.clearbladejsServer.CbServer.MessagingQOS with Double] = js.native
      
      /* 1 */ val MESSAGING_QOS_AT_LEAST_ONCE: typingsSlinky.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE with Double = js.native
      
      /* 0 */ val MESSAGING_QOS_AT_MOST_ONCE: typingsSlinky.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE with Double = js.native
      
      /* 2 */ val MESSAGING_QOS_EXACTLY_ONCE: typingsSlinky.clearbladejsServer.CbServer.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE with Double = js.native
    }
    
    @JSGlobal("CbServer.QueryConditions")
    @js.native
    object QueryConditions extends StObject {
      
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
    
    @JSGlobal("CbServer.QuerySortDirections")
    @js.native
    object QuerySortDirections extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.clearbladejsServer.CbServer.QuerySortDirections with String] = js.native
      
      /* "ASC" */ val QUERY_SORT_ASCENDING: typingsSlinky.clearbladejsServer.CbServer.QuerySortDirections.QUERY_SORT_ASCENDING with String = js.native
      
      /* "DESC" */ val QUERY_SORT_DESCENDING: typingsSlinky.clearbladejsServer.CbServer.QuerySortDirections.QUERY_SORT_DESCENDING with String = js.native
    }
    
    @JSGlobal("CbServer.TriggerModule")
    @js.native
    object TriggerModule extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.clearbladejsServer.CbServer.TriggerModule with String] = js.native
      
      /* "Device" */ val DEVICE: typingsSlinky.clearbladejsServer.CbServer.TriggerModule.DEVICE with String = js.native
      
      /* "Data" */ val Data: typingsSlinky.clearbladejsServer.CbServer.TriggerModule.Data with String = js.native
      
      /* "Messaging" */ val MESSAGING: typingsSlinky.clearbladejsServer.CbServer.TriggerModule.MESSAGING with String = js.native
      
      /* "User" */ val USER: typingsSlinky.clearbladejsServer.CbServer.TriggerModule.USER with String = js.native
    }
    
    @JSGlobal("CbServer.req")
    @js.native
    def req: ReqTypes = js.native
    @scala.inline
    def req_=(x: ReqTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("req")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CbServer.resp")
    @js.native
    def resp: Resp = js.native
    @scala.inline
    def resp_=(x: Resp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resp")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("ClearBlade")
  @js.native
  def ClearBlade: ClearBladeGlobal = js.native
  @scala.inline
  def ClearBlade_=(x: ClearBladeGlobal): Unit = js.Dynamic.global.updateDynamic("ClearBlade")(x.asInstanceOf[js.Any])
}
