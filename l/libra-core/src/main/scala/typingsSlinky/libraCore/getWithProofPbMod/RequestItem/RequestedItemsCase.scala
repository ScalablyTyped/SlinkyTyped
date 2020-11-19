package typingsSlinky.libraCore.getWithProofPbMod.RequestItem

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RequestedItemsCase extends js.Object
@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.RequestedItemsCase")
@js.native
object RequestedItemsCase extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RequestedItemsCase with Double] = js.native
  
  @js.native
  sealed trait GET_ACCOUNT_STATE_REQUEST extends RequestedItemsCase
  /* 1 */ @js.native
  object GET_ACCOUNT_STATE_REQUEST extends TopLevel[GET_ACCOUNT_STATE_REQUEST with Double]
  
  @js.native
  sealed trait GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST extends RequestedItemsCase
  /* 2 */ @js.native
  object GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST extends TopLevel[GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST with Double]
  
  @js.native
  sealed trait GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST extends RequestedItemsCase
  /* 3 */ @js.native
  object GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST extends TopLevel[GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST with Double]
  
  @js.native
  sealed trait GET_TRANSACTIONS_REQUEST extends RequestedItemsCase
  /* 4 */ @js.native
  object GET_TRANSACTIONS_REQUEST extends TopLevel[GET_TRANSACTIONS_REQUEST with Double]
  
  @js.native
  sealed trait REQUESTEDITEMS_NOT_SET extends RequestedItemsCase
  /* 0 */ @js.native
  object REQUESTEDITEMS_NOT_SET extends TopLevel[REQUESTEDITEMS_NOT_SET with Double]
}
