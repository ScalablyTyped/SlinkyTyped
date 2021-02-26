package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typingsSlinky.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repoTransactionMod {
  
  @js.native
  sealed trait TransactionStatus extends StObject
  @JSImport("@firebase/database/dist/src/core/Repo_transaction", "TransactionStatus")
  @js.native
  object TransactionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransactionStatus with Double] = js.native
    
    @js.native
    sealed trait COMPLETED extends TransactionStatus
    /* 2 */ val COMPLETED: typingsSlinky.firebaseDatabase.repoTransactionMod.TransactionStatus.COMPLETED with Double = js.native
    
    @js.native
    sealed trait NEEDS_ABORT extends TransactionStatus
    /* 4 */ val NEEDS_ABORT: typingsSlinky.firebaseDatabase.repoTransactionMod.TransactionStatus.NEEDS_ABORT with Double = js.native
    
    @js.native
    sealed trait RUN extends TransactionStatus
    /* 0 */ val RUN: typingsSlinky.firebaseDatabase.repoTransactionMod.TransactionStatus.RUN with Double = js.native
    
    @js.native
    sealed trait SENT extends TransactionStatus
    /* 1 */ val SENT: typingsSlinky.firebaseDatabase.repoTransactionMod.TransactionStatus.SENT with Double = js.native
    
    @js.native
    sealed trait SENT_NEEDS_ABORT extends TransactionStatus
    /* 3 */ val SENT_NEEDS_ABORT: typingsSlinky.firebaseDatabase.repoTransactionMod.TransactionStatus.SENT_NEEDS_ABORT with Double = js.native
  }
  
  /* augmented module */
  object firebaseDatabaseDistSrcCoreRepoAugmentingMod {
    
    @js.native
    trait Repo extends StObject {
      
      def startTransaction(
        path: Path,
        transactionUpdate: js.Function1[/* a */ js.Any, Unit],
        onComplete: js.Function3[/* a */ js.Error, /* b */ Boolean, /* c */ DataSnapshot, Unit],
        applyLocally: Boolean
      ): Unit = js.native
      def startTransaction(
        path: Path,
        transactionUpdate: js.Function1[/* a */ js.Any, Unit],
        onComplete: Null,
        applyLocally: Boolean
      ): Unit = js.native
    }
  }
}
