package typingsSlinky.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object relayStoreTypesMod {
  
  type AsyncLoadCallback = js.Function1[
    /* loadingState */ typingsSlinky.relayRuntime.relayStoreTypesMod.LoadingState, 
    scala.Unit
  ]
  
  type FragmentMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment]
  
  type FragmentReference = js.Any
  
  type FragmentSpecResults = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type LogFunction = js.Function1[/* logEvent */ typingsSlinky.relayRuntime.relayStoreTypesMod.LogEvent, scala.Unit]
  
  type OperationTracker = typingsSlinky.relayRuntime.relayOperationTrackerMod.RelayOperationTracker
  
  type Primitive = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
  
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Record = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type RecordMap = // theoretically, this should be `[dataID: DataID]`, but `DataID` is a string.
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[typingsSlinky.relayRuntime.relayStoreTypesMod.Record | scala.Null]]
  
  type RequiredFieldLogger = js.Function1[
    /* arg */ typingsSlinky.relayRuntime.anon.Readonlykindmissingfieldl | typingsSlinky.relayRuntime.anon.Readonlykindmissingfieldt, 
    scala.Unit
  ]
  
  type Scheduler = js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]
  
  type SelectorData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type SelectorStoreUpdater[T] = js.Function2[
    /* store */ typingsSlinky.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy[T], 
    /* data */ T, 
    scala.Unit
  ]
  
  type Snapshot = typingsSlinky.relayRuntime.relayStoreTypesMod.TypedSnapshot[typingsSlinky.relayRuntime.relayStoreTypesMod.SelectorData]
  
  type StoreUpdater = js.Function1[
    /* store */ typingsSlinky.relayRuntime.relayStoreTypesMod.RecordSourceProxy, 
    scala.Unit
  ]
  
  type Unarray[T] = T
  
  type UpdatedRecords = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
