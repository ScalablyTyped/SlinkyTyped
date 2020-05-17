package typingsSlinky.graphql.valuesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.anon.Directives
import typingsSlinky.graphql.directivesMod.GraphQLDirective
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/values", "getDirectiveValues")
@js.native
object getDirectiveValues extends js.Object {
  def apply(directiveDef: GraphQLDirective, node: Directives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def apply(directiveDef: GraphQLDirective, node: Directives, variableValues: Maybe[StringDictionary[_]]): js.UndefOr[StringDictionary[js.Any]] = js.native
}

