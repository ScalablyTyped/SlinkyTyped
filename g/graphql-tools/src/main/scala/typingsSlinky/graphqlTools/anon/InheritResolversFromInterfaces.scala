package typingsSlinky.graphqlTools.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.IResolvers
import typingsSlinky.graphqlTools.interfacesMod.IResolversParameter
import typingsSlinky.graphqlTools.interfacesMod.MergeInfo
import typingsSlinky.graphqlTools.mergeSchemasMod.OnTypeConflict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InheritResolversFromInterfaces extends js.Object {
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.native
  var mergeDirectives: js.UndefOr[Boolean] = js.native
  var onTypeConflict: js.UndefOr[OnTypeConflict] = js.native
  var resolvers: js.UndefOr[IResolversParameter] = js.native
  var schemaDirectives: js.UndefOr[StringDictionary[TypeofSchemaDirectiveVisi]] = js.native
  var schemas: js.Array[String | GraphQLSchema | DocumentNode | js.Array[GraphQLNamedType]] = js.native
}

object InheritResolversFromInterfaces {
  @scala.inline
  def apply(schemas: js.Array[String | GraphQLSchema | DocumentNode | js.Array[GraphQLNamedType]]): InheritResolversFromInterfaces = {
    val __obj = js.Dynamic.literal(schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritResolversFromInterfaces]
  }
  @scala.inline
  implicit class InheritResolversFromInterfacesOps[Self <: InheritResolversFromInterfaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchemas(value: js.Array[String | GraphQLSchema | DocumentNode | js.Array[GraphQLNamedType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInheritResolversFromInterfaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritResolversFromInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritResolversFromInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritResolversFromInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeDirectives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeDirectives")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTypeConflict(
      value: (/* left */ GraphQLNamedType, /* right */ GraphQLNamedType, /* info */ js.UndefOr[Left]) => GraphQLNamedType
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTypeConflict")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTypeConflict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTypeConflict")(js.undefined)
        ret
    }
    @scala.inline
    def withResolversFunction1(value: /* mergeInfo */ MergeInfo => IResolvers[js.Any, js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolvers(value: IResolversParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaDirectives(value: StringDictionary[TypeofSchemaDirectiveVisi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDirectives")(js.undefined)
        ret
    }
  }
  
}

