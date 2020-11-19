package typingsSlinky.libraCore.getWithProofPbMod.ResponseItem

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResponseItemsCase extends js.Object
@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem.ResponseItemsCase")
@js.native
object ResponseItemsCase extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseItemsCase with Double] = js.native
  
  @js.native
  sealed trait GET_ACCOUNT_STATE_RESPONSE extends ResponseItemsCase
  /* 3 */ @js.native
  object GET_ACCOUNT_STATE_RESPONSE extends TopLevel[GET_ACCOUNT_STATE_RESPONSE with Double]
  
  @js.native
  sealed trait GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE extends ResponseItemsCase
  /* 4 */ @js.native
  object GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE extends TopLevel[GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE with Double]
  
  @js.native
  sealed trait GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE extends ResponseItemsCase
  /* 5 */ @js.native
  object GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE extends TopLevel[GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE with Double]
  
  @js.native
  sealed trait GET_TRANSACTIONS_RESPONSE extends ResponseItemsCase
  /* 6 */ @js.native
  object GET_TRANSACTIONS_RESPONSE extends TopLevel[GET_TRANSACTIONS_RESPONSE with Double]
  
  @js.native
  sealed trait RESPONSEITEMS_NOT_SET extends ResponseItemsCase
  /* 0 */ @js.native
  object RESPONSEITEMS_NOT_SET extends TopLevel[RESPONSEITEMS_NOT_SET with Double]
}
