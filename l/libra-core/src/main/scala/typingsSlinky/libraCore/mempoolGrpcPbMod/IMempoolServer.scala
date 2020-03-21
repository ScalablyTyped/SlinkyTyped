package typingsSlinky.libraCore.mempoolGrpcPbMod

import typingsSlinky.grpc.mod.ServerUnaryCall
import typingsSlinky.grpc.mod.handleUnaryCall
import typingsSlinky.grpc.mod.sendUnaryData
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

