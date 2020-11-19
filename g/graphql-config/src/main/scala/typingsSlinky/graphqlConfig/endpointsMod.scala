package typingsSlinky.graphqlConfig

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphqlConfig.endpointsExtensionMod.GraphQLConfigEnpointConfig
import typingsSlinky.graphqlConfig.endpointsExtensionMod.GraphQLConfigEnpointsMapData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-config/lib/extensions/endpoints", JSImport.Namespace)
@js.native
object endpointsMod extends js.Object {
  
  def getUsedEnvs(config: js.Any): StringDictionary[String] = js.native
  
  def resolveEnvsInValues[T /* <: StringDictionary[js.Any] */](config: T, env: StringDictionary[js.UndefOr[String]]): T = js.native
  
  def resolveRefString(str: String): String = js.native
  def resolveRefString(str: String, values: js.Object): String = js.native
  
  @js.native
  class GraphQLEndpoint protected ()
    extends typingsSlinky.graphqlConfig.endpointsExtensionMod.GraphQLEndpoint {
    def this(resolvedConfig: GraphQLConfigEnpointConfig) = this()
  }
  
  @js.native
  class GraphQLEndpointsExtension protected ()
    extends typingsSlinky.graphqlConfig.endpointsExtensionMod.GraphQLEndpointsExtension {
    def this(endpointConfig: GraphQLConfigEnpointsMapData, configPath: String) = this()
  }
}
