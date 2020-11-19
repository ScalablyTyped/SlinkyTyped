package typingsSlinky.apolloServer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphqlToolsSchema.typesMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "decorateWithLogger")
@js.native
object decorateWithLogger extends js.Object {
  
  def apply(fn: GraphQLFieldResolver[_, _, StringDictionary[_]], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
}
