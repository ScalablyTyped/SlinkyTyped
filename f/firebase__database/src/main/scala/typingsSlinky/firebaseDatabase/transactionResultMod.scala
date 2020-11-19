package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.dataSnapshotMod.DataSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/api/TransactionResult", JSImport.Namespace)
@js.native
object transactionResultMod extends js.Object {
  
  @js.native
  class TransactionResult protected () extends js.Object {
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
