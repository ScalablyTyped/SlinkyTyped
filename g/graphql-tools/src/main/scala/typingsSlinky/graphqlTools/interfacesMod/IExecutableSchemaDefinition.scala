package typingsSlinky.graphqlTools.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphqlTools.anon.TypeofSchemaDirectiveVisi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExecutableSchemaDefinition[TContext] extends js.Object {
  var allowUndefinedInResolve: js.UndefOr[Boolean] = js.native
  var connectors: js.UndefOr[IConnectors[TContext]] = js.native
  var directiveResolvers: js.UndefOr[IDirectiveResolvers[_, TContext]] = js.native
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.native
  var logger: js.UndefOr[ILogger] = js.native
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.native
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.native
  var resolvers: js.UndefOr[(IResolvers[_, TContext]) | (js.Array[IResolvers[_, TContext]])] = js.native
  var schemaDirectives: js.UndefOr[StringDictionary[TypeofSchemaDirectiveVisi]] = js.native
  var typeDefs: ITypeDefinitions = js.native
}

object IExecutableSchemaDefinition {
  @scala.inline
  def apply[TContext](typeDefs: ITypeDefinitions): IExecutableSchemaDefinition[TContext] = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecutableSchemaDefinition[TContext]]
  }
  @scala.inline
  implicit class IExecutableSchemaDefinitionOps[Self[tcontext] <: IExecutableSchemaDefinition[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withTypeDefsFunction0(
      value: () => js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias graphql-tools.graphql-tools/dist/Interfaces.ITypedef */ js.Object
        ]
    ): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTypeDefs(value: ITypeDefinitions): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowUndefinedInResolve(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUndefinedInResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUndefinedInResolve: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUndefinedInResolve")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectors(value: IConnectors[TContext]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectors: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectors")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectiveResolvers(value: IDirectiveResolvers[_, TContext]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directiveResolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectiveResolvers: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directiveResolvers")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritResolversFromInterfaces(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritResolversFromInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritResolversFromInterfaces: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritResolversFromInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: ILogger): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withParseOptions(value: GraphQLParseOptions): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseOptions: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withResolverValidationOptions(value: IResolverValidationOptions): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverValidationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverValidationOptions: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverValidationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvers(value: (IResolvers[_, TContext]) | (js.Array[IResolvers[_, TContext]])): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvers: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaDirectives(value: StringDictionary[TypeofSchemaDirectiveVisi]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaDirectives: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDirectives")(js.undefined)
        ret
    }
  }
  
}

