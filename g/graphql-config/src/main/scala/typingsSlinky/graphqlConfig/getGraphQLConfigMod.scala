package typingsSlinky.graphqlConfig

import typingsSlinky.graphqlConfig.graphQLConfigMod.GraphQLConfig
import typingsSlinky.graphqlConfig.graphQLProjectConfigMod.GraphQLProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-config/lib/getGraphQLConfig", JSImport.Namespace)
@js.native
object getGraphQLConfigMod extends js.Object {
  
  def getGraphQLConfig(): GraphQLConfig = js.native
  def getGraphQLConfig(rootDir: String): GraphQLConfig = js.native
  
  def getGraphQLProjectConfig(): GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: js.UndefOr[scala.Nothing], projectName: String): GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String): GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String, projectName: String): GraphQLProjectConfig = js.native
}
