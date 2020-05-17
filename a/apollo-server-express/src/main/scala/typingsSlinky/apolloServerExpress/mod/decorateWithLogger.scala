package typingsSlinky.apolloServerExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphqlTools.interfacesMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "decorateWithLogger")
@js.native
object decorateWithLogger extends js.Object {
  def apply(fn: js.UndefOr[GraphQLFieldResolver[_, _, StringDictionary[_]]], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
}

