package typingsSlinky.keystonejsKeystone.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLExtension[Source, Context] extends js.Object {
  
  var access: js.UndefOr[Access] = js.native
  
  def resolver(source: Source, args: StringDictionary[js.Any], context: Context, info: GraphQLResolveInfo): js.Any = js.native
  @JSName("resolver")
  var resolver_Original: GraphQLFieldResolver[Source, Context, StringDictionary[_]] = js.native
  
  var schema: String = js.native
}
