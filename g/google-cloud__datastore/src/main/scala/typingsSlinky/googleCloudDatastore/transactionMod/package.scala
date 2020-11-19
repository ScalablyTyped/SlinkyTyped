package typingsSlinky.googleCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object transactionMod {
  
  type RollbackCallback = js.Function2[/* err */ js.Error, /* rollbackResponse */ js.Object, scala.Unit]
  
  type RollbackResult = js.Array[js.Object]
  
  type TransactionCallback = js.Function3[
    /* err */ js.Error, 
    /* tx */ typingsSlinky.googleCloudDatastore.transactionMod.DatastoreTransaction, 
    /* beginTxResponse */ typingsSlinky.googleCloudDatastore.transactionMod.BeginTransactionResponse, 
    scala.Unit
  ]
  
  type TransactionResult = js.Tuple2[
    typingsSlinky.googleCloudDatastore.transactionMod.DatastoreTransaction, 
    typingsSlinky.googleCloudDatastore.transactionMod.BeginTransactionResponse
  ]
}
