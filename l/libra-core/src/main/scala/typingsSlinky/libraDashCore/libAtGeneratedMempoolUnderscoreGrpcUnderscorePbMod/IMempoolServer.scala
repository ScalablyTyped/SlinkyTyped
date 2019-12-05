package typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscoreGrpcUnderscorePbMod

import typingsSlinky.grpc.grpcMod.ServerUnaryCall
import typingsSlinky.grpc.grpcMod.handleUnaryCall
import typingsSlinky.grpc.grpcMod.sendUnaryData
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.AddTransactionWithValidationRequest
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.AddTransactionWithValidationResponse
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.CommitTransactionsRequest
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.CommitTransactionsResponse
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.GetBlockRequest
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.GetBlockResponse
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckRequest
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMempoolServer extends js.Object {
  @JSName("addTransactionWithValidation")
  var addTransactionWithValidation_Original: handleUnaryCall[AddTransactionWithValidationRequest, AddTransactionWithValidationResponse] = js.native
  @JSName("commitTransactions")
  var commitTransactions_Original: handleUnaryCall[CommitTransactionsRequest, CommitTransactionsResponse] = js.native
  @JSName("getBlock")
  var getBlock_Original: handleUnaryCall[GetBlockRequest, GetBlockResponse] = js.native
  @JSName("healthCheck")
  var healthCheck_Original: handleUnaryCall[HealthCheckRequest, HealthCheckResponse] = js.native
  def addTransactionWithValidation(
    call: ServerUnaryCall[AddTransactionWithValidationRequest],
    callback: sendUnaryData[AddTransactionWithValidationResponse]
  ): Unit = js.native
  def commitTransactions(
    call: ServerUnaryCall[CommitTransactionsRequest],
    callback: sendUnaryData[CommitTransactionsResponse]
  ): Unit = js.native
  def getBlock(call: ServerUnaryCall[GetBlockRequest], callback: sendUnaryData[GetBlockResponse]): Unit = js.native
  def healthCheck(call: ServerUnaryCall[HealthCheckRequest], callback: sendUnaryData[HealthCheckResponse]): Unit = js.native
}

