package typingsSlinky.graphql.anon

import typingsSlinky.graphql.astMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.astMod.UnionTypeExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLAbstractType
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.definitionMod.Thunk
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<graphql.graphql/type/definition.GraphQLUnionTypeConfig<any, any>> */
@js.native
trait ReadonlyGraphQLUnionTypeC extends js.Object {
  
  val astNode: js.UndefOr[Maybe[UnionTypeDefinitionNode]] = js.native
  
  val description: js.UndefOr[Maybe[String]] = js.native
  
  val extensionASTNodes: js.UndefOr[Maybe[js.Array[UnionTypeExtensionNode]]] = js.native
  
  val extensions: js.UndefOr[Maybe[js.Object]] = js.native
  
  val name: String = js.native
  
  val resolveType: js.UndefOr[Maybe[GraphQLTypeResolver[_, _]]] = js.native
  
  val types: Thunk[js.Array[GraphQLObjectType[_, _]]] = js.native
}
object ReadonlyGraphQLUnionTypeC {
  
  @scala.inline
  def apply(name: String, types: Thunk[js.Array[GraphQLObjectType[_, _]]]): ReadonlyGraphQLUnionTypeC = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyGraphQLUnionTypeC]
  }
  
  @scala.inline
  implicit class ReadonlyGraphQLUnionTypeCOps[Self <: ReadonlyGraphQLUnionTypeC] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: (GraphQLObjectType[js.Any, js.Any])*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypesFunction0(value: () => js.Array[GraphQLObjectType[_, _]]): Self = this.set("types", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTypes(value: Thunk[js.Array[GraphQLObjectType[_, _]]]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstNode(value: Maybe[UnionTypeDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setExtensionASTNodesVarargs(value: UnionTypeExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    
    @scala.inline
    def setExtensionASTNodes(value: Maybe[js.Array[UnionTypeExtensionNode]]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionASTNodes: Self = this.set("extensionASTNodes", js.undefined)
    
    @scala.inline
    def setExtensionASTNodesNull: Self = this.set("extensionASTNodes", null)
    
    @scala.inline
    def setExtensions(value: Maybe[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    
    @scala.inline
    def setResolveType(
      value: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _]) | String]]
    ): Self = this.set("resolveType", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteResolveType: Self = this.set("resolveType", js.undefined)
    
    @scala.inline
    def setResolveTypeNull: Self = this.set("resolveType", null)
  }
}
