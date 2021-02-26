package typingsSlinky.googleCloudDatastore

import typingsSlinky.googleCloudDatastore.mod.^
import typingsSlinky.googleCloudDatastore.queryMod.Query
import typingsSlinky.googleCloudDatastore.requestMod.CommitCallback
import typingsSlinky.googleCloudDatastore.requestMod.CommitResult
import typingsSlinky.googleCloudDatastore.requestMod.DatastoreRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionMod {
  
  @JSImport("@google-cloud/datastore/transaction", "DatastoreTransaction")
  @js.native
  class DatastoreTransaction protected () extends DatastoreRequest {
    def this(datastore: ^) = this()
    
    def commit(): js.Promise[CommitResult] = js.native
    def commit(callback: CommitCallback): Unit = js.native
    
    def createQuery(kind: String): Query = js.native
    // tslint:disable-next-line unified-signatures (Arg is semantically different)
    def createQuery(namespace: String, kind: String): Query = js.native
    
    def rollback(): js.Promise[RollbackResult] = js.native
    def rollback(callback: RollbackCallback): Unit = js.native
    
    def run(): js.Promise[TransactionResult] = js.native
    def run(callback: TransactionCallback): Unit = js.native
  }
  
  @js.native
  trait BeginTransactionResponse extends StObject {
    
    var transaction: String = js.native
  }
  object BeginTransactionResponse {
    
    @scala.inline
    def apply(transaction: String): BeginTransactionResponse = {
      val __obj = js.Dynamic.literal(transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeginTransactionResponse]
    }
    
    @scala.inline
    implicit class BeginTransactionResponseMutableBuilder[Self <: BeginTransactionResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
  
  type RollbackCallback = js.Function2[/* err */ js.Error, /* rollbackResponse */ js.Object, Unit]
  
  type RollbackResult = js.Array[js.Object]
  
  type TransactionCallback = js.Function3[
    /* err */ js.Error, 
    /* tx */ DatastoreTransaction, 
    /* beginTxResponse */ BeginTransactionResponse, 
    Unit
  ]
  
  type TransactionResult = js.Tuple2[DatastoreTransaction, BeginTransactionResponse]
}
