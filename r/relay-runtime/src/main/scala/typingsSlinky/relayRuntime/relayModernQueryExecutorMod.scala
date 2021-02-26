package typingsSlinky.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayRuntime.relayObservableMod.RelayObservable
import typingsSlinky.relayRuntime.relayObservableMod.Sink
import typingsSlinky.relayRuntime.relayResponseNormalizerMod.GetDataID
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationLoader
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationTracker
import typingsSlinky.relayRuntime.relayStoreTypesMod.OptimisticResponseConfig
import typingsSlinky.relayRuntime.relayStoreTypesMod.PublishQueue
import typingsSlinky.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernQueryExecutorMod {
  
  @js.native
  trait ExecuteConfig extends StObject {
    
    def getDataID(fieldValue: StringDictionary[js.Any], typeName: String): js.Any = js.native
    @JSName("getDataID")
    var getDataID_Original: GetDataID = js.native
    
    var operation: OperationDescriptor = js.native
    
    var operationLoader: OperationLoader = js.native
    
    var operationTracker: js.UndefOr[OperationTracker] = js.native
    
    var optimisticConfig: OptimisticResponseConfig = js.native
    
    var publishQueue: PublishQueue = js.native
    
    var scheduler: js.UndefOr[TaskScheduler] = js.native
    
    var sink: Sink[GraphQLResponse] = js.native
    
    var source: RelayObservable[GraphQLResponse] = js.native
    
    var updater: js.UndefOr[SelectorStoreUpdater[js.Object]] = js.native
  }
  
  @js.native
  trait TaskScheduler extends StObject {
    
    def cancel(id: String): Unit = js.native
    
    def schedule(fn: js.Function0[Unit]): String = js.native
  }
  object TaskScheduler {
    
    @scala.inline
    def apply(cancel: String => Unit, schedule: js.Function0[Unit] => String): TaskScheduler = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), schedule = js.Any.fromFunction1(schedule))
      __obj.asInstanceOf[TaskScheduler]
    }
    
    @scala.inline
    implicit class TaskSchedulerMutableBuilder[Self <: TaskScheduler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: String => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSchedule(value: js.Function0[Unit] => String): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
    }
  }
}
