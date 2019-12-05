package typingsSlinky.graphqlDashConfig

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphqlDashConfig.graphqlDashConfigStrings.DOTgraphqlconfig
import typingsSlinky.graphqlDashConfig.graphqlDashConfigStrings.DOTgraphqlconfigDOTyaml
import typingsSlinky.graphqlDashConfig.libExtensionsEndpointsEndpointsExtensionMod.GraphQLConfigEnpointConfig
import typingsSlinky.graphqlDashConfig.libExtensionsEndpointsEndpointsExtensionMod.GraphQLConfigEnpointsMapData
import typingsSlinky.graphqlDashConfig.libTypesMod.GraphQLConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config", JSImport.Namespace)
@js.native
object graphqlDashConfigMod extends js.Object {
  @js.native
  class ConfigNotFoundError protected ()
    extends typingsSlinky.graphqlDashConfig.libErrorsMod.ConfigNotFoundError {
    def this(message: String) = this()
  }
  
  @js.native
  class GraphQLConfig protected ()
    extends typingsSlinky.graphqlDashConfig.libGraphQLConfigMod.GraphQLConfig {
    def this(config: GraphQLConfigData, configPath: String) = this()
  }
  
  @js.native
  class GraphQLEndpoint protected ()
    extends typingsSlinky.graphqlDashConfig.libExtensionsMod.GraphQLEndpoint {
    def this(resolvedConfig: GraphQLConfigEnpointConfig) = this()
  }
  
  @js.native
  class GraphQLEndpointsExtension protected ()
    extends typingsSlinky.graphqlDashConfig.libExtensionsMod.GraphQLEndpointsExtension {
    def this(endpointConfig: GraphQLConfigEnpointsMapData, configPath: String) = this()
  }
  
  @js.native
  class GraphQLProjectConfig protected ()
    extends typingsSlinky.graphqlDashConfig.libGraphQLProjectConfigMod.GraphQLProjectConfig {
    def this(config: GraphQLConfigData, configPath: String) = this()
    def this(config: GraphQLConfigData, configPath: String, projectName: String) = this()
  }
  
  val GRAPHQL_CONFIG_NAME: DOTgraphqlconfig = js.native
  val GRAPHQL_CONFIG_YAML_NAME: DOTgraphqlconfigDOTyaml = js.native
  def findGraphQLConfigFile(filePath: String): String = js.native
  def getGraphQLConfig(): typingsSlinky.graphqlDashConfig.libGraphQLConfigMod.GraphQLConfig = js.native
  def getGraphQLConfig(rootDir: String): typingsSlinky.graphqlDashConfig.libGraphQLConfigMod.GraphQLConfig = js.native
  def getGraphQLProjectConfig(): typingsSlinky.graphqlDashConfig.libGraphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String): typingsSlinky.graphqlDashConfig.libGraphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String, projectName: String): typingsSlinky.graphqlDashConfig.libGraphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getSchemaExtensions(path: String): StringDictionary[String] = js.native
  def getUsedEnvs(config: js.Any): StringDictionary[String] = js.native
  def resolveEnvsInValues[T /* <: StringDictionary[js.Any] */](config: T, env: StringDictionary[js.UndefOr[String]]): T = js.native
  def resolveRefString(str: String): String = js.native
  def resolveRefString(str: String, values: js.Object): String = js.native
  def validateConfig(config: GraphQLConfigData): Unit = js.native
  def writeSchema(path: String, schema: GraphQLSchema): js.Promise[Unit] = js.native
  def writeSchema(path: String, schema: GraphQLSchema, schemaExtensions: StringDictionary[String]): js.Promise[Unit] = js.native
}

