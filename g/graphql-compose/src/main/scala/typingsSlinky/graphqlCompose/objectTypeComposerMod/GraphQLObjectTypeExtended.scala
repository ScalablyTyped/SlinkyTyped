package typingsSlinky.graphqlCompose.objectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.GraphQLObjectTypeConfigan
import typingsSlinky.graphql.astMod.ObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.ObjectTypeExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldMap
import typingsSlinky.graphql.definitionMod.GraphQLInterfaceType
import typingsSlinky.graphql.definitionMod.GraphQLIsTypeOfFn
import typingsSlinky.graphql.definitionMod.GraphQLObjectTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typingsSlinky.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceType
import typingsSlinky.graphqlCompose.resolverMod.Resolver
import typingsSlinky.std.Map
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLObjectType<any, any, {[key: string] : any}> & {  _gqcInputTypeComposer ? :graphql-compose.graphql-compose/lib/InputTypeComposer.InputTypeComposer<TContext>,   _gqcResolvers ? :std.Map<string, graphql-compose.graphql-compose/lib/Resolver.Resolver<TSource, TContext, graphql-compose.graphql-compose/lib/ObjectTypeComposer.ArgsMap, any>>,   _gqcGetRecordIdFn ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.GetRecordIdFn<TSource, TContext>,   _gqcRelations ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.RelationThunkMap<TSource, TContext>,   _gqcFields ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeFieldConfigMap<TSource, TContext>,   _gqcInterfaces ? :std.Array<graphql-compose.graphql-compose/lib/InterfaceTypeComposer.ComposeInterfaceType>,   _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions,   description  :string | null} */
@js.native
trait GraphQLObjectTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.native
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.native
  var _gqcGetRecordIdFn: js.UndefOr[GetRecordIdFn[TSource, TContext]] = js.native
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.native
  var _gqcInterfaces: js.UndefOr[js.Array[ComposeInterfaceType]] = js.native
  var _gqcRelations: js.UndefOr[RelationThunkMap[TSource, TContext]] = js.native
  var _gqcResolvers: js.UndefOr[Map[String, Resolver[TSource, TContext, ArgsMap, _]]] = js.native
  var astNode: Maybe[ObjectTypeDefinitionNode] = js.native
  var description: Maybe[String] with (String | Null) = js.native
  var extensionASTNodes: Maybe[js.Array[ObjectTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var isTypeOf: Maybe[GraphQLIsTypeOfFn[_, _]] = js.native
  var name: String = js.native
  def getFields(): GraphQLFieldMap[_, _, StringDictionary[_]] = js.native
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLObjectTypeConfigan = js.native
  def toJSON(): String = js.native
}

object GraphQLObjectTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    description: Maybe[String] with (String | Null),
    getFields: () => GraphQLFieldMap[_, _, StringDictionary[_]],
    getInterfaces: () => js.Array[GraphQLInterfaceType],
    inspect: () => String,
    name: String,
    toConfig: () => GraphQLObjectTypeConfigan,
    toJSON: () => String
  ): GraphQLObjectTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getFields = js.Any.fromFunction0(getFields), getInterfaces = js.Any.fromFunction0(getInterfaces), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GraphQLObjectTypeExtended[TSource, TContext]]
  }
  @scala.inline
  implicit class GraphQLObjectTypeExtendedOps[Self[tsource, tcontext] <: GraphQLObjectTypeExtended[tsource, tcontext], TSource, TContext] (val x: Self[TSource, TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext]) with Other]
    @scala.inline
    def withDescription(value: Maybe[String] with (String | Null)): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFields(value: () => GraphQLFieldMap[_, _, StringDictionary[_]]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInterfaces(value: () => js.Array[GraphQLInterfaceType]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInterfaces")(js.Any.fromFunction0(value))
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
    def withToConfig(value: () => GraphQLObjectTypeConfigan): Self[TSource, TContext] = {
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
    def with_gqcGetRecordIdFn(value: (TSource, /* args */ js.Any, TContext) => String): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcGetRecordIdFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def without_gqcGetRecordIdFn: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcGetRecordIdFn")(js.undefined)
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
    def with_gqcInterfaces(value: js.Array[ComposeInterfaceType]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gqcInterfaces: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def with_gqcRelations(value: RelationThunkMap[TSource, TContext]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcRelations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gqcRelations: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcRelations")(js.undefined)
        ret
    }
    @scala.inline
    def with_gqcResolvers(value: Map[String, Resolver[TSource, TContext, ArgsMap, _]]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcResolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gqcResolvers: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gqcResolvers")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNode(value: Maybe[ObjectTypeDefinitionNode]): Self[TSource, TContext] = {
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
    def withExtensionASTNodes(value: Maybe[js.Array[ObjectTypeExtensionNode]]): Self[TSource, TContext] = {
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
    def withIsTypeOf(value: (_, _, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutIsTypeOf: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTypeOfNull: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(null)
        ret
    }
  }
  
}

