package typingsSlinky.graphqlCompose.unionTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.GraphQLUnionTypeConfigany
import typingsSlinky.graphql.astMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.astMod.UnionTypeExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLAbstractType
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.definitionMod.GraphQLUnionTypeConfig
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeObjectType
import typingsSlinky.std.Map
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLUnionType & {  _gqcTypeMap  :std.Map<string, graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeObjectType>,   _gqcTypeResolvers ? :graphql-compose.graphql-compose/lib/UnionTypeComposer.UnionTypeResolversMap<TSource, TContext>,   _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
@js.native
trait GraphQLUnionTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.native
  var _gqcTypeMap: Map[String, ComposeObjectType] = js.native
  var _gqcTypeResolvers: js.UndefOr[UnionTypeResolversMap[TSource, TContext]] = js.native
  var astNode: Maybe[UnionTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[UnionTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  var resolveType: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]] = js.native
  def getTypes(): js.Array[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLUnionTypeConfigany = js.native
  def toJSON(): String = js.native
}

object GraphQLUnionTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    _gqcTypeMap: Map[String, ComposeObjectType],
    getTypes: () => js.Array[GraphQLObjectType[_, _, StringDictionary[_]]],
    inspect: () => String,
    name: String,
    toConfig: () => GraphQLUnionTypeConfigany,
    toJSON: () => String
  ): GraphQLUnionTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(_gqcTypeMap = _gqcTypeMap.asInstanceOf[js.Any], getTypes = js.Any.fromFunction0(getTypes), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GraphQLUnionTypeExtended[TSource, TContext]]
  }
  @scala.inline
  implicit class GraphQLUnionTypeExtendedOps[Self[tsource, tcontext] <: GraphQLUnionTypeExtended[tsource, tcontext], TSource, TContext] (val x: Self[TSource, TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext]) with Other]
    @scala.inline
    def with_gqcTypeMap(value: Map[String, ComposeObjectType]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcTypeMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTypes(value: () => js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInspect(value: () => String): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToConfig(value: () => GraphQLUnionTypeConfigany): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => String): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_gqcExtensions(value: Extensions): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gqcExtensions: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def with_gqcTypeResolvers(value: UnionTypeResolversMap[TSource, TContext]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcTypeResolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gqcTypeResolvers: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcTypeResolvers")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNode(value: Maybe[UnionTypeDefinitionNode]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAstNode: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNodeNull: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(null)
        ret
    }
    @scala.inline
    def withDescription(value: Maybe[String]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withExtensionASTNodes(value: Maybe[js.Array[UnionTypeExtensionNode]]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionASTNodes: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionASTNodesNull: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(null)
        ret
    }
    @scala.inline
    def withExtensions(value: Maybe[Record[String, _]]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionsNull: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(null)
        ret
    }
    @scala.inline
    def withResolveType(
      value: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _, StringDictionary[_]]) | String]]
    ): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveType")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutResolveType: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveType")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveTypeNull: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveType")(null)
        ret
    }
  }
  
}

