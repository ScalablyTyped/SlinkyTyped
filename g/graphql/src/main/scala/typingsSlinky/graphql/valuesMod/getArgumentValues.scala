package typingsSlinky.graphql.valuesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DirectiveNode
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.directivesMod.GraphQLDirective
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/values", "getArgumentValues")
@js.native
object getArgumentValues extends js.Object {
  def apply(`def`: GraphQLField[_, _, StringDictionary[_]], node: DirectiveNode): StringDictionary[js.Any] = js.native
  def apply(
    `def`: GraphQLField[_, _, StringDictionary[_]],
    node: DirectiveNode,
    variableValues: Maybe[StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  def apply(`def`: GraphQLField[_, _, StringDictionary[_]], node: FieldNode): StringDictionary[js.Any] = js.native
  def apply(
    `def`: GraphQLField[_, _, StringDictionary[_]],
    node: FieldNode,
    variableValues: Maybe[StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  def apply(`def`: GraphQLDirective, node: DirectiveNode): StringDictionary[js.Any] = js.native
  def apply(`def`: GraphQLDirective, node: DirectiveNode, variableValues: Maybe[StringDictionary[_]]): StringDictionary[js.Any] = js.native
  def apply(`def`: GraphQLDirective, node: FieldNode): StringDictionary[js.Any] = js.native
  def apply(`def`: GraphQLDirective, node: FieldNode, variableValues: Maybe[StringDictionary[_]]): StringDictionary[js.Any] = js.native
}

