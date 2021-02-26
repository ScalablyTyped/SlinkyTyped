package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.commonMod.common.IVoidCallback
import typingsSlinky.mendixmodelsdk.deltasDeltasMod.Delta
import typingsSlinky.mendixmodelsdk.transactionManagerMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaManagerMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas/DeltaManager", "DeltaManager")
  @js.native
  class DeltaManager protected () extends IDeltaManager {
    def this(model: AbstractModel) = this()
    
    var callErrorCallbacks: js.Any = js.native
    
    var callFlushCallbacks: js.Any = js.native
    
    var deltaProcessor: js.Any = js.native
    
    var deltaReverser: js.Any = js.native
    
    var deltaSender: js.Any = js.native
    
    var errorCallbacks: js.Any = js.native
    
    var eventEmitter: js.Any = js.native
    
    var flushCallbacks: js.Any = js.native
    
    var getReverseDelta: js.Any = js.native
    
    var handleTransactionCommited: js.Any = js.native
    
    var handleTransactionRollback: js.Any = js.native
    
    var model: js.Any = js.native
    
    var transactionManager: js.Any = js.native
  }
  
  @js.native
  trait IDeltaChange extends StObject {
    
    var delta: Delta = js.native
    
    var reverseDelta: Delta | js.Error = js.native
  }
  object IDeltaChange {
    
    @scala.inline
    def apply(delta: Delta, reverseDelta: Delta | js.Error): IDeltaChange = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], reverseDelta = reverseDelta.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDeltaChange]
    }
    
    @scala.inline
    implicit class IDeltaChangeMutableBuilder[Self <: IDeltaChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Delta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseDelta(value: Delta | js.Error): Self = StObject.set(x, "reverseDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseDeltaError(value: js.Error): Self = StObject.set(x, "reverseDelta", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDeltaManager extends StObject {
    
    def beginTransaction(): Transaction = js.native
    def beginTransaction(commitCurrentImplicitTransaction: Boolean): Transaction = js.native
    
    def closeConnection(callback: IVoidCallback): Unit = js.native
    def closeConnection(callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def flushChanges(callback: IVoidCallback): Unit = js.native
    def flushChanges(callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def onNewDelta(callback: js.Function1[/* delta */ Delta, Unit]): Unit = js.native
    
    def onTransactionCommitted(callback: js.Function0[Unit]): Unit = js.native
    
    def onTransactionRollback(callback: js.Function0[Unit]): Unit = js.native
    
    def processDeltas(deltas: js.Array[Delta]): Unit = js.native
    
    def push(delta: Delta): Unit = js.native
    
    def reverseDelta(delta: Delta): Delta = js.native
  }
}
