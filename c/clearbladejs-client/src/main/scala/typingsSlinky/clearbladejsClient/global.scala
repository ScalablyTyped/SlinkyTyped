package typingsSlinky.clearbladejsClient

import typingsSlinky.clearbladejsClient.CbClient.ClearBladeGlobal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var ClearBlade: ClearBladeGlobal = js.native
  @js.native
  object CbClient extends js.Object {
    var ClearBlade: ClearBladeGlobal = js.native
    @js.native
    object MessagingQOS extends js.Object {
      /* 1 */ val MESSAGING_QOS_AT_LEAST_ONCE: typingsSlinky.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE with Double = js.native
      /* 0 */ val MESSAGING_QOS_AT_MOST_ONCE: typingsSlinky.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE with Double = js.native
      /* 2 */ val MESSAGING_QOS_EXACTLY_ONCE: typingsSlinky.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.clearbladejsClient.CbClient.MessagingQOS with Double] = js.native
    }
    
    @js.native
    object QueryConditions extends js.Object {
      /* "EQ" */ val QUERY_EQUAL: typingsSlinky.clearbladejsClient.CbClient.QueryConditions.QUERY_EQUAL with String = js.native
      /* "GT" */ val QUERY_GREATERTHAN: typingsSlinky.clearbladejsClient.CbClient.QueryConditions.QUERY_GREATERTHAN with String = js.native
      /* "GTE" */ val QUERY_GREATERTHAN_EQUAL: typingsSlinky.clearbladejsClient.CbClient.QueryConditions.QUERY_GREATERTHAN_EQUAL with String = js.native
      /* "LT" */ val QUERY_LESSTHAN: typingsSlinky.clearbladejsClient.CbClient.QueryConditions.QUERY_LESSTHAN with String = js.native
      /* "LTE" */ val QUERY_LESSTHAN_EQUAL: typingsSlinky.clearbladejsClient.CbClient.QueryConditions.QUERY_LESSTHAN_EQUAL with String = js.native
      /* "RE" */ val QUERY_MATCHES: typingsSlinky.clearbladejsClient.CbClient.QueryConditions.QUERY_MATCHES with String = js.native
      /* "NEQ" */ val QUERY_NOTEQUAL: typingsSlinky.clearbladejsClient.CbClient.QueryConditions.QUERY_NOTEQUAL with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.clearbladejsClient.CbClient.QueryConditions with String] = js.native
    }
    
    @js.native
    object QuerySortDirections extends js.Object {
      /* "ASC" */ val QUERY_SORT_ASCENDING: typingsSlinky.clearbladejsClient.CbClient.QuerySortDirections.QUERY_SORT_ASCENDING with String = js.native
      /* "DESC" */ val QUERY_SORT_DESCENDING: typingsSlinky.clearbladejsClient.CbClient.QuerySortDirections.QUERY_SORT_DESCENDING with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.clearbladejsClient.CbClient.QuerySortDirections with String] = js.native
    }
    
  }
  
}

