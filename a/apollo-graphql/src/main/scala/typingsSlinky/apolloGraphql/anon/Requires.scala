package typingsSlinky.apolloGraphql.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Requires[TContext] extends js.Object {
  
  var requires: js.UndefOr[String] = js.native
  
  def resolve(source: js.Any, args: StringDictionary[js.Any], context: TContext, info: GraphQLResolveInfo): js.Any = js.native
  @JSName("resolve")
  var resolve_Original: GraphQLFieldResolver[_, TContext, StringDictionary[_]] = js.native
}
