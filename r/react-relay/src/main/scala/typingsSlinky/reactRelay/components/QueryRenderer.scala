package typingsSlinky.reactRelay.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRelay.anon.Error
import typingsSlinky.reactRelay.mod.FetchPolicy
import typingsSlinky.reactRelay.mod.QueryRendererProps
import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QueryRenderer {
  
  @JSImport("react-relay", "QueryRenderer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TOperation /* <: OperationType */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRelay.mod.QueryRenderer[TOperation]] {
    
    @scala.inline
    def cacheConfig(value: CacheConfig): this.type = set("cacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cacheConfigNull: this.type = set("cacheConfig", null)
    
    @scala.inline
    def fetchPolicy(value: FetchPolicy): this.type = set("fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def queryFunction0(value: () => ReaderFragment | ConcreteRequest): this.type = set("query", js.Any.fromFunction0(value))
    
    @scala.inline
    def query(value: GraphQLTaggedNode): this.type = set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def queryNull: this.type = set("query", null)
  }
  
  def withProps[TOperation /* <: OperationType */](p: typingsSlinky.reactRelay.anon.CacheConfig with QueryRendererProps[TOperation]): Builder[TOperation] = new Builder[TOperation](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[TOperation /* <: OperationType */](
    environment: Environment,
    render: Error[TOperation] => ReactElement,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  ): Builder[TOperation] = {
    val __props = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
    new Builder[TOperation](js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactRelay.anon.CacheConfig with QueryRendererProps[TOperation]]))
  }
}
