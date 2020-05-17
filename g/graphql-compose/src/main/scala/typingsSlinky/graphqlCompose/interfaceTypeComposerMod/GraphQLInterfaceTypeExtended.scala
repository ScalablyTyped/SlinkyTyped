package typingsSlinky.graphqlCompose.interfaceTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.anon.GraphQLInterfaceTypeConfi
import typingsSlinky.graphql.astMod.InterfaceTypeDefinitionNode
import typingsSlinky.graphql.astMod.InterfaceTypeExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLAbstractType
import typingsSlinky.graphql.definitionMod.GraphQLFieldMap
import typingsSlinky.graphql.definitionMod.GraphQLInterfaceTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigMap
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLInterfaceType & {  _gqcFields ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeFieldConfigMap<TSource, TContext>,   _gqcInputTypeComposer ? :graphql-compose.graphql-compose/lib/InputTypeComposer.InputTypeComposer<TContext>,   _gqcTypeResolvers ? :graphql-compose.graphql-compose/lib/InterfaceTypeComposer.InterfaceTypeResolversMap<TContext>,   _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
@js.native
trait GraphQLInterfaceTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.native
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.native
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.native
  var _gqcTypeResolvers: js.UndefOr[InterfaceTypeResolversMap[TContext]] = js.native
  var astNode: js.UndefOr[Maybe[InterfaceTypeDefinitionNode]] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  var resolveType: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]] = js.native
  def getFields(): GraphQLFieldMap[_, _, StringDictionary[_]] = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLInterfaceTypeConfi = js.native
  def toJSON(): String = js.native
}

object GraphQLInterfaceTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    getFields: () => GraphQLFieldMap[_, _, StringDictionary[_]],
    inspect: () => String,
    name: String,
    toConfig: () => GraphQLInterfaceTypeConfi,
    toJSON: () => String
  ): GraphQLInterfaceTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(getFields = js.Any.fromFunction0(getFields), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GraphQLInterfaceTypeExtended[TSource, TContext]]
  }
  @scala.inline
  implicit class GraphQLInterfaceTypeExtendedOps[Self[tsource, tcontext] <: GraphQLInterfaceTypeExtended[tsource, tcontext], TSource, TContext] (val x: Self[TSource, TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext]) with Other]
    @scala.inline
    def withGetFields(value: () => GraphQLFieldMap[_, _, StringDictionary[_]]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.Any.fromFunction0(value))
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
    def withToConfig(value: () => GraphQLInterfaceTypeConfi): Self[TSource, TContext] = {
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
    def with_gqcFields(value: ComposeFieldConfigMap[TSource, TContext]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gqcFields: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcFields")(js.undefined)
        ret
    }
    @scala.inline
    def with_gqcInputTypeComposer(value: InputTypeComposer[TContext]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcInputTypeComposer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gqcInputTypeComposer: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcInputTypeComposer")(js.undefined)
        ret
    }
    @scala.inline
    def with_gqcTypeResolvers(value: InterfaceTypeResolversMap[TContext]): Self[TSource, TContext] = {
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
    def withAstNode(value: Maybe[InterfaceTypeDefinitionNode]): Self[TSource, TContext] = {
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
    def withExtensionASTNodes(value: Maybe[js.Array[InterfaceTypeExtensionNode]]): Self[TSource, TContext] = {
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

