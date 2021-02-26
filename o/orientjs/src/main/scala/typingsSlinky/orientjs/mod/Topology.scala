package typingsSlinky.orientjs.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Topology {
  
  @JSImport("orientjs", "Topology.OCluster")
  @js.native
  class OCluster () extends EventEmitter {
    def this(config: OClusterConfig) = this()
    
    def acquireFrom(selection: js.Function1[/* cluster */ this.type, OServerNode]): js.Promise[OServerNode] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def connect(): js.Promise[OServerNode] = js.native
    
    var servers: js.Array[OServerNode] = js.native
  }
  
  @JSImport("orientjs", "Topology.OServerNode")
  @js.native
  class OServerNode () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def acquireConnection(): js.Promise[OConnection] = js.native
    
    def acquireForSubscribe(): js.Promise[OConnection] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def connect(): js.Promise[OServerNode] = js.native
    
    def subscribeCluster(): js.Promise[OConnection] = js.native
    def subscribeCluster(data: js.Any): js.Promise[OConnection] = js.native
  }
  
  @js.native
  trait OClusterConfig extends StObject {
    
    def selectionStrategy(cluster: typingsSlinky.orientjs.mod.Topology.OCluster): OServerNode = js.native
  }
  object OClusterConfig {
    
    @scala.inline
    def apply(selectionStrategy: typingsSlinky.orientjs.mod.Topology.OCluster => OServerNode): OClusterConfig = {
      val __obj = js.Dynamic.literal(selectionStrategy = js.Any.fromFunction1(selectionStrategy))
      __obj.asInstanceOf[OClusterConfig]
    }
    
    @scala.inline
    implicit class OClusterConfigMutableBuilder[Self <: OClusterConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectionStrategy(value: typingsSlinky.orientjs.mod.Topology.OCluster => OServerNode): Self = StObject.set(x, "selectionStrategy", js.Any.fromFunction1(value))
    }
  }
}
