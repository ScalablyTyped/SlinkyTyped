package typingsSlinky.libraCore.mempoolGrpcPbMod

import typingsSlinky.grpc.mod.ClientUnaryCall
import typingsSlinky.grpc.mod.Metadata
import typingsSlinky.grpc.mod.ServiceError
import typingsSlinky.libraCore.PartialCallOptions
import typingsSlinky.libraCore.mempoolPbMod.AddTransactionWithValidationRequest
import typingsSlinky.libraCore.mempoolPbMod.AddTransactionWithValidationResponse
import typingsSlinky.libraCore.mempoolPbMod.CommitTransactionsRequest
import typingsSlinky.libraCore.mempoolPbMod.CommitTransactionsResponse
import typingsSlinky.libraCore.mempoolPbMod.GetBlockRequest
import typingsSlinky.libraCore.mempoolPbMod.GetBlockResponse
import typingsSlinky.libraCore.mempoolPbMod.HealthCheckRequest
import typingsSlinky.libraCore.mempoolPbMod.HealthCheckResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMempoolClient extends js.Object {
  def addTransactionWithValidation(
    request: AddTransactionWithValidationRequest,
    callback: js.Function2[
      /* error */ ServiceError | Null, 
      /* response */ AddTransactionWithValidationResponse, 
      Unit
    ]
  ): ClientUnaryCall = js.native
  def addTransactionWithValidation(
    request: AddTransactionWithValidationRequest,
    metadata: Metadata,
    callback: js.Function2[
      /* error */ ServiceError | Null, 
      /* response */ AddTransactionWithValidationResponse, 
      Unit
    ]
  ): ClientUnaryCall = js.native
  def addTransactionWithValidation(
    request: AddTransactionWithValidationRequest,
    metadata: Metadata,
    options: PartialCallOptions,
    callback: js.Function2[
      /* error */ ServiceError | Null, 
      /* response */ AddTransactionWithValidationResponse, 
      Unit
    ]
  ): ClientUnaryCall = js.native
  def commitTransactions(
    request: CommitTransactionsRequest,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
  ): ClientUnaryCall = js.native
  def commitTransactions(
    request: CommitTransactionsRequest,
    metadata: Metadata,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
  ): ClientUnaryCall = js.native
  def commitTransactions(
    request: CommitTransactionsRequest,
    metadata: Metadata,
    options: PartialCallOptions,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
  ): ClientUnaryCall = js.native
  def getBlock(
    request: GetBlockRequest,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
  ): ClientUnaryCall = js.native
  def getBlock(
    request: GetBlockRequest,
    metadata: Metadata,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
  ): ClientUnaryCall = js.native
  def getBlock(
    request: GetBlockRequest,
    metadata: Metadata,
    options: PartialCallOptions,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
  ): ClientUnaryCall = js.native
  def healthCheck(
    request: HealthCheckRequest,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
  ): ClientUnaryCall = js.native
  def healthCheck(
    request: HealthCheckRequest,
    metadata: Metadata,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
  ): ClientUnaryCall = js.native
  def healthCheck(
    request: HealthCheckRequest,
    metadata: Metadata,
    options: PartialCallOptions,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
  ): ClientUnaryCall = js.native
}

