package typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscoreGrpcUnderscorePbMod

import typingsSlinky.grpc.grpcMod.CallOptions
import typingsSlinky.grpc.grpcMod.ClientUnaryCall
import typingsSlinky.grpc.grpcMod.Metadata
import typingsSlinky.grpc.grpcMod.ServiceError
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.AddTransactionWithValidationRequest
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.AddTransactionWithValidationResponse
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.CommitTransactionsRequest
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.CommitTransactionsResponse
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.GetBlockRequest
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.GetBlockResponse
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckRequest
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckResponse
import typingsSlinky.std.Partial
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
    options: Partial[CallOptions],
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
    options: Partial[CallOptions],
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
    options: Partial[CallOptions],
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
    options: Partial[CallOptions],
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
  ): ClientUnaryCall = js.native
}

