package typingsSlinky.graphqlConfig.endpointsExtensionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlConfig.typesMod.IntrospectionResult
import typingsSlinky.graphqlRequest.mod.GraphQLClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-config/lib/extensions/endpoints/EndpointsExtension", "GraphQLEndpoint")
@js.native
class GraphQLEndpoint protected () extends js.Object {
  def this(resolvedConfig: GraphQLConfigEnpointConfig) = this()
  
  def getClient(): GraphQLClient = js.native
  def getClient(clientOptions: js.Any): GraphQLClient = js.native
  
  var headers: StringDictionary[String] = js.native
  
  def resolveIntrospection(): js.Promise[IntrospectionResult] = js.native
  
  def resolveSchema(): js.Promise[GraphQLSchema] = js.native
  
  def resolveSchemaSDL(): js.Promise[String] = js.native
  
  var subscription: GraphQLConfigEnpointsSubscription = js.native
  
  var url: String = js.native
}
