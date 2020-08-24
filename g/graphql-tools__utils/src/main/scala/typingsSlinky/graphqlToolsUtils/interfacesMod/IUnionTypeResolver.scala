package typingsSlinky.graphqlToolsUtils.interfacesMod

import typingsSlinky.graphql.astMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.astMod.UnionTypeExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLAbstractType
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUnionTypeResolver extends js.Object {
  var __astNode: js.UndefOr[UnionTypeDefinitionNode] = js.native
  var __description: js.UndefOr[String] = js.native
  var __extensionASTNodes: js.UndefOr[js.Array[UnionTypeExtensionNode]] = js.native
  var __extensions: js.UndefOr[Record[String, _]] = js.native
  var __name: js.UndefOr[String] = js.native
  var __resolveType: js.UndefOr[GraphQLTypeResolver[_, _]] = js.native
}

object IUnionTypeResolver {
  @scala.inline
  def apply(): IUnionTypeResolver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUnionTypeResolver]
  }
  @scala.inline
  implicit class IUnionTypeResolverOps[Self <: IUnionTypeResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set__astNode(value: UnionTypeDefinitionNode): Self = this.set("__astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__astNode: Self = this.set("__astNode", js.undefined)
    @scala.inline
    def set__description(value: String): Self = this.set("__description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__description: Self = this.set("__description", js.undefined)
    @scala.inline
    def set__extensionASTNodesVarargs(value: UnionTypeExtensionNode*): Self = this.set("__extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def set__extensionASTNodes(value: js.Array[UnionTypeExtensionNode]): Self = this.set("__extensionASTNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__extensionASTNodes: Self = this.set("__extensionASTNodes", js.undefined)
    @scala.inline
    def set__extensions(value: Record[String, _]): Self = this.set("__extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__extensions: Self = this.set("__extensions", js.undefined)
    @scala.inline
    def set__name(value: String): Self = this.set("__name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__name: Self = this.set("__name", js.undefined)
    @scala.inline
    def set__resolveType(
      value: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _]) | String]]
    ): Self = this.set("__resolveType", js.Any.fromFunction4(value))
    @scala.inline
    def delete__resolveType: Self = this.set("__resolveType", js.undefined)
  }
  
}

