package typingsSlinky.libraCore.admissionControlGrpcPbMod

import typingsSlinky.grpc.mod.ServerUnaryCall
import typingsSlinky.grpc.mod.handleUnaryCall
import typingsSlinky.grpc.mod.sendUnaryData
import typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionRequest
import typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse
import typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest
import typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAdmissionControlServer extends js.Object {
  
  def submitTransaction(
    call: ServerUnaryCall[SubmitTransactionRequest],
    callback: sendUnaryData[SubmitTransactionResponse]
  ): Unit = js.native
  @JSName("submitTransaction")
  var submitTransaction_Original: handleUnaryCall[SubmitTransactionRequest, SubmitTransactionResponse] = js.native
  
  def updateToLatestLedger(
    call: ServerUnaryCall[UpdateToLatestLedgerRequest],
    callback: sendUnaryData[UpdateToLatestLedgerResponse]
  ): Unit = js.native
  @JSName("updateToLatestLedger")
  var updateToLatestLedger_Original: handleUnaryCall[UpdateToLatestLedgerRequest, UpdateToLatestLedgerResponse] = js.native
}
