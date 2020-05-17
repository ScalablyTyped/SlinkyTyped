package typingsSlinky.graphql.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.ObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.ObjectTypeExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigMap
import typingsSlinky.graphql.definitionMod.GraphQLInterfaceType
import typingsSlinky.graphql.definitionMod.GraphQLIsTypeOfFn
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.Thunk
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLObjectTypeConfig<any, any, {[key: string] : any}> & {  interfaces  :std.Array<graphql.graphql/type/definition.GraphQLInterfaceType>,   fields  :graphql.graphql/type/definition.GraphQLFieldConfigMap<any, any, {[key: string] : any}>,   extensionASTNodes  :std.ReadonlyArray<graphql.graphql/language/ast.ObjectTypeExtensionNode>} */
@js.native
trait GraphQLObjectTypeConfigan extends js.Object {
  var astNode: js.UndefOr[Maybe[ObjectTypeDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[ObjectTypeExtensionNode]] with js.Array[ObjectTypeExtensionNode]] = js.native
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.native
  var fields: (Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) with (GraphQLFieldConfigMap[_, _, StringDictionary[_]]) = js.native
  var interfaces: js.UndefOr[Thunk[Maybe[js.Array[GraphQLInterfaceType]]] with js.Array[GraphQLInterfaceType]] = js.native
  var isTypeOf: js.UndefOr[Maybe[GraphQLIsTypeOfFn[_, _]]] = js.native
  var name: String = js.native
}

object GraphQLObjectTypeConfigan {
  @scala.inline
  def apply(
    fields: (Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) with (GraphQLFieldConfigMap[_, _, StringDictionary[_]]),
    name: String
  ): GraphQLObjectTypeConfigan = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLObjectTypeConfigan]
  }
  @scala.inline
  implicit class GraphQLObjectTypeConfiganOps[Self <: GraphQLObjectTypeConfigan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(
      value: (Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) with (GraphQLFieldConfigMap[_, _, StringDictionary[_]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAstNode(value: Maybe[ObjectTypeDefinitionNode]): Self = {
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
    def withExtensionASTNodes(value: Maybe[js.Array[ObjectTypeExtensionNode]] with js.Array[ObjectTypeExtensionNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionASTNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(js.undefined)
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
    def withInterfaces(value: Thunk[Maybe[js.Array[GraphQLInterfaceType]]] with js.Array[GraphQLInterfaceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTypeOf(value: (_, _, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutIsTypeOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTypeOfNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(null)
        ret
    }
  }
  
}

