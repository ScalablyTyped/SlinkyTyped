package typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscoreGrpcUnderscorePbMod

import typingsSlinky.grpc.grpcMod.ServerUnaryCall
import typingsSlinky.grpc.grpcMod.handleUnaryCall
import typingsSlinky.grpc.grpcMod.sendUnaryData
import typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionRequest
import typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionResponse
import typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.UpdateToLatestLedgerRequest
import typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.UpdateToLatestLedgerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAdmissionControlServer extends js.Object {
  @JSName("submitTransaction")
  var submitTransaction_Original: handleUnaryCall[SubmitTransactionRequest, SubmitTransactionResponse] = js.native
  @JSName("updateToLatestLedger")
  var updateToLatestLedger_Original: handleUnaryCall[UpdateToLatestLedgerRequest, UpdateToLatestLedgerResponse] = js.native
  def submitTransaction(
    call: ServerUnaryCall[SubmitTransactionRequest],
    callback: sendUnaryData[SubmitTransactionResponse]
  ): Unit = js.native
  def updateToLatestLedger(
    call: ServerUnaryCall[UpdateToLatestLedgerRequest],
    callback: sendUnaryData[UpdateToLatestLedgerResponse]
  ): Unit = js.native
}

