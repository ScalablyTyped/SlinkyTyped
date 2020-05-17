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
@js.native
trait GraphQLDirectiveConfigarg extends js.Object {
  var args: js.UndefOr[Maybe[GraphQLFieldConfigArgumentMap] with GraphQLFieldConfigArgumentMap] = js.native
  var astNode: js.UndefOr[Maybe[DirectiveDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.native
  var isRepeatable: js.UndefOr[Maybe[Boolean] with Boolean] = js.native
  var locations: js.Array[DirectiveLocationEnum] = js.native
  var name: String = js.native
}

object GraphQLDirectiveConfigarg {
  @scala.inline
  def apply(locations: js.Array[DirectiveLocationEnum], name: String): GraphQLDirectiveConfigarg = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirectiveConfigarg]
  }
  @scala.inline
  implicit class GraphQLDirectiveConfigargOps[Self <: GraphQLDirectiveConfigarg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocations(value: js.Array[DirectiveLocationEnum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: Maybe[GraphQLFieldConfigArgumentMap] with GraphQLFieldConfigArgumentMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNode(value: Maybe[DirectiveDefinitionNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAstNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(null)
        ret
    }
    @scala.inline
    def withDescription(value: Maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withExtensions(value: Maybe[Record[String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(null)
        ret
    }
    @scala.inline
    def withIsRepeatable(value: Maybe[Boolean] with Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRepeatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRepeatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRepeatable")(js.undefined)
        ret
    }
  }
  
}

