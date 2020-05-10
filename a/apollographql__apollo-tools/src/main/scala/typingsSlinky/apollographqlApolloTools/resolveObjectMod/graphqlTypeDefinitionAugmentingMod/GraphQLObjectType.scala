package typingsSlinky.apollographqlApolloTools.resolveObjectMod.graphqlTypeDefinitionAugmentingMod

import typingsSlinky.apollographqlApolloTools.resolveObjectMod.GraphQLObjectResolver
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLObjectType extends js.Object {
  var resolveObject: js.UndefOr[GraphQLObjectResolver[_, _]] = js.native
}

object GraphQLObjectType {
  @scala.inline
  def apply(): GraphQLObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLObjectType]
  }
  @scala.inline
  implicit class GraphQLObjectTypeOps[Self <: GraphQLObjectType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolveObject(
      value: (_, /* fields */ Record[String, js.Array[FieldNode]], _, /* info */ GraphQLResolveInfo) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveObject")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutResolveObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveObject")(js.undefined)
        ret
    }
  }
  
}

