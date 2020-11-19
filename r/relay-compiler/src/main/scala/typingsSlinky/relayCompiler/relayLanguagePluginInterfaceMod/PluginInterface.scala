package typingsSlinky.relayCompiler.relayLanguagePluginInterfaceMod

import typingsSlinky.relayCompiler.anon.ConcreteText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginInterface extends js.Object {
  
  def findGraphQLTags(text: String, filePath: String): js.Array[GraphQLTag] = js.native
  @JSName("findGraphQLTags")
  var findGraphQLTags_Original: GraphQLTagFinder = js.native
  
  def formatModule(options: ConcreteText): String = js.native
  @JSName("formatModule")
  var formatModule_Original: FormatModule = js.native
  
  var inputExtensions: js.Array[String] = js.native
  
  var outputExtension: String = js.native
  
  var typeGenerator: TypeGenerator = js.native
}
