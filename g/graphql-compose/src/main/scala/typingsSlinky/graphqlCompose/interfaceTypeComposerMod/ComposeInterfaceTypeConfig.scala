package typingsSlinky.graphqlCompose.interfaceTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLAbstractType
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.graphqlCompose.definitionsMod.Thunk
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeInterfaceTypeConfig[TSource, TContext] extends InterfaceTypeComposeDefinition[TSource, TContext] {
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var fields: js.UndefOr[Thunk[ComposeFieldConfigMap[TSource, TContext]]] = js.native
  var name: String = js.native
  var resolveType: js.UndefOr[(GraphQLTypeResolver[TSource, TContext, StringDictionary[_]]) | Null] = js.native
}

object ComposeInterfaceTypeConfig {
  @scala.inline
  def apply[TSource, TContext](name: String): ComposeInterfaceTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeInterfaceTypeConfig[TSource, TContext]]
  }
  @scala.inline
  implicit class ComposeInterfaceTypeConfigOps[Self[tsource, tcontext] <: ComposeInterfaceTypeConfig[tsource, tcontext], TSource, TContext] (val x: Self[TSource, TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext]) with Other]
    @scala.inline
    def withName(value: String): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self[TSource, TContext] = {
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
    def withExtensions(value: Extensions): Self[TSource, TContext] = {
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
    def withFieldsFunction0(value: () => ComposeFieldConfigMap[TSource, TContext]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFields(value: Thunk[ComposeFieldConfigMap[TSource, TContext]]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveType(
      value: (TSource, TContext, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[TSource, TContext, StringDictionary[_]]) | String]]
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

