package typingsSlinky.graphql.anon

import typingsSlinky.graphql.astMod.DirectiveDefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typingsSlinky.graphql.directiveLocationMod.DirectiveLocationEnum
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/directives.GraphQLDirectiveConfig & {  args  :graphql.graphql/type/definition.GraphQLFieldConfigArgumentMap,   extensions ? :graphql.graphql/tsutils/Maybe.default<std.Readonly<std.Record<string, any>>>,   isRepeatable  :boolean} */
trait GraphQLDirectiveConfigarg extends js.Object {
  var args: js.UndefOr[Maybe[GraphQLFieldConfigArgumentMap] with GraphQLFieldConfigArgumentMap] = js.undefined
  var astNode: js.UndefOr[Maybe[DirectiveDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var isRepeatable: js.UndefOr[Maybe[Boolean] with Boolean] = js.undefined
  var locations: js.Array[DirectiveLocationEnum]
  var name: String
}

object GraphQLDirectiveConfigarg {
  @scala.inline
  def apply(
    locations: js.Array[DirectiveLocationEnum],
    name: String,
    args: Maybe[GraphQLFieldConfigArgumentMap] with GraphQLFieldConfigArgumentMap = null,
    astNode: js.UndefOr[Null | Maybe[DirectiveDefinitionNode]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined,
    isRepeatable: js.UndefOr[Maybe[Boolean] with Boolean] = js.undefined
  ): GraphQLDirectiveConfigarg = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(isRepeatable)) __obj.updateDynamic("isRepeatable")(isRepeatable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirectiveConfigarg]
  }
}

