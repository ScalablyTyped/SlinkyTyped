package typingsSlinky.libraCore

import typingsSlinky.grpc.mod.ChannelCredentials
import typingsSlinky.grpc.mod.Client
import typingsSlinky.grpc.mod.ClientUnaryCall
import typingsSlinky.grpc.mod.Metadata
import typingsSlinky.grpc.mod.MethodDefinition
import typingsSlinky.grpc.mod.ServerUnaryCall
import typingsSlinky.grpc.mod.ServiceError
import typingsSlinky.grpc.mod.handleUnaryCall
import typingsSlinky.grpc.mod.sendUnaryData
import typingsSlinky.libraCore.anon.PartialCallOptions
import typingsSlinky.libraCore.mempoolPbMod.AddTransactionWithValidationRequest
import typingsSlinky.libraCore.mempoolPbMod.AddTransactionWithValidationResponse
import typingsSlinky.libraCore.mempoolPbMod.CommitTransactionsRequest
import typingsSlinky.libraCore.mempoolPbMod.CommitTransactionsResponse
import typingsSlinky.libraCore.mempoolPbMod.GetBlockRequest
import typingsSlinky.libraCore.mempoolPbMod.GetBlockResponse
import typingsSlinky.libraCore.mempoolPbMod.HealthCheckRequest
import typingsSlinky.libraCore.mempoolPbMod.HealthCheckResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mempoolGrpcPbMod {
  
  @JSImport("libra-core/lib/@/generated/mempool_grpc_pb", "MempoolClient")
  @js.native
  class MempoolClient protected ()
    extends Client
       with IMempoolClient {
    def this(address: String, credentials: ChannelCredentials) = this()
    def this(address: String, credentials: ChannelCredentials, options: js.Object) = this()
  }
  
  @JSImport("libra-core/lib/@/generated/mempool_grpc_pb", "MempoolService")
  @js.native
  val MempoolService: IMempoolService = js.native
  
  @js.native
  trait IMempoolClient extends StObject {
    
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
  
  @js.native
  trait IMempoolServer extends StObject {
    
    def addTransactionWithValidation(
      call: ServerUnaryCall[AddTransactionWithValidationRequest],
      callback: sendUnaryData[AddTransactionWithValidationResponse]
    ): Unit = js.native
    @JSName("addTransactionWithValidation")
    var addTransactionWithValidation_Original: handleUnaryCall[AddTransactionWithValidationRequest, AddTransactionWithValidationResponse] = js.native
    
    def commitTransactions(
      call: ServerUnaryCall[CommitTransactionsRequest],
      callback: sendUnaryData[CommitTransactionsResponse]
    ): Unit = js.native
    @JSName("commitTransactions")
    var commitTransactions_Original: handleUnaryCall[CommitTransactionsRequest, CommitTransactionsResponse] = js.native
    
    def getBlock(call: ServerUnaryCall[GetBlockRequest], callback: sendUnaryData[GetBlockResponse]): Unit = js.native
    @JSName("getBlock")
    var getBlock_Original: handleUnaryCall[GetBlockRequest, GetBlockResponse] = js.native
    
    def healthCheck(call: ServerUnaryCall[HealthCheckRequest], callback: sendUnaryData[HealthCheckResponse]): Unit = js.native
    @JSName("healthCheck")
    var healthCheck_Original: handleUnaryCall[HealthCheckRequest, HealthCheckResponse] = js.native
  }
  
  /* Inlined parent grpc.grpc.ServiceDefinition<grpc.grpc.UntypedServiceImplementation> */
  @js.native
  trait IMempoolService extends StObject {
    
    var addTransactionWithValidation: IMempoolServiceIAddTransactionWithValidation = js.native
    
    var commitTransactions: IMempoolServiceICommitTransactions = js.native
    
    var getBlock: IMempoolServiceIGetBlock = js.native
    
    var healthCheck: IMempoolServiceIHealthCheck = js.native
  }
  object IMempoolService {
    
    @scala.inline
    def apply(
      addTransactionWithValidation: IMempoolServiceIAddTransactionWithValidation,
      commitTransactions: IMempoolServiceICommitTransactions,
      getBlock: IMempoolServiceIGetBlock,
      healthCheck: IMempoolServiceIHealthCheck
    ): IMempoolService = {
      val __obj = js.Dynamic.literal(addTransactionWithValidation = addTransactionWithValidation.asInstanceOf[js.Any], commitTransactions = commitTransactions.asInstanceOf[js.Any], getBlock = getBlock.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMempoolService]
    }
    
    @scala.inline
    implicit class IMempoolServiceMutableBuilder[Self <: IMempoolService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddTransactionWithValidation(value: IMempoolServiceIAddTransactionWithValidation): Self = StObject.set(x, "addTransactionWithValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitTransactions(value: IMempoolServiceICommitTransactions): Self = StObject.set(x, "commitTransactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetBlock(value: IMempoolServiceIGetBlock): Self = StObject.set(x, "getBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheck(value: IMempoolServiceIHealthCheck): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IMempoolServiceIAddTransactionWithValidation extends MethodDefinition[AddTransactionWithValidationRequest, AddTransactionWithValidationResponse]
  
  @js.native
  trait IMempoolServiceICommitTransactions extends MethodDefinition[CommitTransactionsRequest, CommitTransactionsResponse]
  
  @js.native
  trait IMempoolServiceIGetBlock extends MethodDefinition[GetBlockRequest, GetBlockResponse]
  
  @js.native
  trait IMempoolServiceIHealthCheck extends MethodDefinition[HealthCheckRequest, HealthCheckResponse]
}
