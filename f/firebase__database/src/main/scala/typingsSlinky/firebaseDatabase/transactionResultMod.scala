package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.dataSnapshotMod.DataSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionResultMod {
  
  @JSImport("@firebase/database/dist/src/api/TransactionResult", "TransactionResult")
  @js.native
  class TransactionResult protected () extends StObject {
    /**
      * A type for the resolve value of Firebase.transaction.
      * @constructor
      * @dict
      * @param {boolean} committed
      * @param {DataSnapshot} snapshot
      */
    def this(committed: Boolean, snapshot: DataSnapshot) = this()
    
    var committed: Boolean = js.native
    
    var snapshot: DataSnapshot = js.native
    
    def toJSON(): js.Object = js.native
  }
}
