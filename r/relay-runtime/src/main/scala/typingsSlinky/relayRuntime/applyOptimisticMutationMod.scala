package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsSlinky.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyOptimisticMutationMod {
  
  @JSImport("relay-runtime/lib/mutations/applyOptimisticMutation", "applyOptimisticMutation")
  @js.native
  def applyOptimisticMutation(environment: Environment, config: OptimisticMutationConfig): Disposable = js.native
  
  @js.native
  trait OptimisticMutationConfig extends StObject {
    
    var configs: js.UndefOr[js.Array[DeclarativeMutationConfig] | Null] = js.native
    
    var mutation: GraphQLTaggedNode = js.native
    
    var optimisticResponse: js.UndefOr[js.Object] = js.native
    
    var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
    
    var variables: Variables = js.native
  }
  object OptimisticMutationConfig {
    
    @scala.inline
    def apply(mutation: GraphQLTaggedNode, variables: Variables): OptimisticMutationConfig = {
      val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimisticMutationConfig]
    }
    
    @scala.inline
    implicit class OptimisticMutationConfigMutableBuilder[Self <: OptimisticMutationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigsNull: Self = StObject.set(x, "configs", null)
      
      @scala.inline
      def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      @scala.inline
      def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = StObject.set(x, "configs", js.Array(value :_*))
      
      @scala.inline
      def setMutation(value: GraphQLTaggedNode): Self = StObject.set(x, "mutation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutationFunction0(value: () => ReaderFragment | ConcreteRequest): Self = StObject.set(x, "mutation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptimisticResponse(value: js.Object): Self = StObject.set(x, "optimisticResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimisticResponseUndefined: Self = StObject.set(x, "optimisticResponse", js.undefined)
      
      @scala.inline
      def setOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptimisticUpdaterNull: Self = StObject.set(x, "optimisticUpdater", null)
      
      @scala.inline
      def setOptimisticUpdaterUndefined: Self = StObject.set(x, "optimisticUpdater", js.undefined)
      
      @scala.inline
      def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
