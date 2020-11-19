package typingsSlinky.libraCore.admissionControlGrpcPbMod

import typingsSlinky.grpc.mod.ClientUnaryCall
import typingsSlinky.grpc.mod.Metadata
import typingsSlinky.grpc.mod.ServiceError
import typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionRequest
import typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse
import typingsSlinky.libraCore.anon.PartialCallOptions
import typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest
import typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAdmissionControlClient extends js.Object {
  
  def submitTransaction(
    request: SubmitTransactionRequest,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
  ): ClientUnaryCall = js.native
  def submitTransaction(
    request: SubmitTransactionRequest,
    metadata: Metadata,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
  ): ClientUnaryCall = js.native
  def submitTransaction(
    request: SubmitTransactionRequest,
    metadata: Metadata,
    options: PartialCallOptions,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
  ): ClientUnaryCall = js.native
  
  def updateToLatestLedger(
    request: UpdateToLatestLedgerRequest,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
  ): ClientUnaryCall = js.native
  def updateToLatestLedger(
    request: UpdateToLatestLedgerRequest,
    metadata: Metadata,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
  ): ClientUnaryCall = js.native
  def updateToLatestLedger(
    request: UpdateToLatestLedgerRequest,
    metadata: Metadata,
    options: PartialCallOptions,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
  ): ClientUnaryCall = js.native
}
