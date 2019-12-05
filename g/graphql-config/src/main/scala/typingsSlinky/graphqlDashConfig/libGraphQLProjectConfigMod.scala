package typingsSlinky.graphqlDashConfig

import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphqlDashConfig.libExtensionsMod.GraphQLEndpointsExtension
import typingsSlinky.graphqlDashConfig.libTypesMod.GraphQLConfigData
import typingsSlinky.graphqlDashConfig.libTypesMod.GraphQLConfigExtensions
import typingsSlinky.graphqlDashConfig.libTypesMod.GraphQLResolvedConfigData
import typingsSlinky.graphqlDashConfig.libTypesMod.IntrospectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/GraphQLProjectConfig", JSImport.Namespace)
@js.native
object libGraphQLProjectConfigMod extends js.Object {
  @js.native
  class GraphQLProjectConfig protected () extends js.Object {
    def this(config: GraphQLConfigData, configPath: String) = this()
    def this(config: GraphQLConfigData, configPath: String, projectName: String) = this()
    var config: GraphQLResolvedConfigData = js.native
    val configDir: String = js.native
    var configPath: String = js.native
    val endpointsExtension: GraphQLEndpointsExtension | Null = js.native
    val excludes: js.Array[String] = js.native
    val extensions: GraphQLConfigExtensions = js.native
    val includes: js.Array[String] = js.native
    var projectName: js.UndefOr[String] = js.native
    val schemaPath: String | Null = js.native
    def getSchema(): GraphQLSchema = js.native
    def getSchemaSDL(): String = js.native
    def includesFile(fileUri: String): Boolean = js.native
    def resolveConfigPath(relativePath: String): String = js.native
    def resolveIntrospection(): js.Promise[IntrospectionResult] = js.native
  }
  
}

