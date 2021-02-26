package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.anon.GcReleaseBufferSize
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typingsSlinky.relayRuntime.relayStoreTypesMod.Store
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernStoreMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernStore", JSImport.Default)
  @js.native
  class default protected () extends RelayModernStore {
    def this(source: MutableRecordSource) = this()
    def this(source: MutableRecordSource, options: GcReleaseBufferSize) = this()
  }
  
  @js.native
  trait InvalidationState extends StObject {
    
    var dataIDs: js.Array[DataID] = js.native
    
    var invalidations: Map[DataID, js.UndefOr[Double | Null]] = js.native
  }
  object InvalidationState {
    
    @scala.inline
    def apply(dataIDs: js.Array[DataID], invalidations: Map[DataID, js.UndefOr[Double | Null]]): InvalidationState = {
      val __obj = js.Dynamic.literal(dataIDs = dataIDs.asInstanceOf[js.Any], invalidations = invalidations.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidationState]
    }
    
    @scala.inline
    implicit class InvalidationStateMutableBuilder[Self <: InvalidationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataIDs(value: js.Array[DataID]): Self = StObject.set(x, "dataIDs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataIDsVarargs(value: DataID*): Self = StObject.set(x, "dataIDs", js.Array(value :_*))
      
      @scala.inline
      def setInvalidations(value: Map[DataID, js.UndefOr[Double | Null]]): Self = StObject.set(x, "invalidations", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RelayModernStore extends Store {
    
    def scheduleGC(): Unit = js.native
    
    def toJSON(): js.Any = js.native
  }
}
