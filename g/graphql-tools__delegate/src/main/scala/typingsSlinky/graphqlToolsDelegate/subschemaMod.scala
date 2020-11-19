package typingsSlinky.graphqlToolsDelegate

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.CreateProxyingResolverFn
import typingsSlinky.graphqlToolsDelegate.typesMod.Executor
import typingsSlinky.graphqlToolsDelegate.typesMod.MergedTypeConfig
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import typingsSlinky.graphqlToolsDelegate.typesMod.Subscriber
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate/Subschema", JSImport.Namespace)
@js.native
object subschemaMod extends js.Object {
  
  def getSubschema(result: js.Any, responseKey: String): GraphQLSchema | SubschemaConfig = js.native
  
  def isSubschema(value: js.Any): /* is @graphql-tools/delegate.@graphql-tools/delegate/Subschema.Subschema */ Boolean = js.native
  
  def isSubschemaConfig(value: js.Any): Boolean = js.native
  
  def setObjectSubschema(result: js.Any, subschema: GraphQLSchema): Unit = js.native
  def setObjectSubschema(result: js.Any, subschema: SubschemaConfig): Unit = js.native
  
  @js.native
  class Subschema protected () extends js.Object {
    def this(config: SubschemaConfig) = this()
    
    var createProxyingResolver: js.UndefOr[CreateProxyingResolverFn] = js.native
    
    var executor: js.UndefOr[Executor] = js.native
    
    var merge: js.UndefOr[Record[String, MergedTypeConfig]] = js.native
    
    var rootValue: js.UndefOr[Record[String, _]] = js.native
    
    var schema: GraphQLSchema = js.native
    
    var subscriber: js.UndefOr[Subscriber] = js.native
    
    var transformedSchema: GraphQLSchema = js.native
    
    var transforms: js.Array[Transform[Record[String, _]]] = js.native
  }
}
