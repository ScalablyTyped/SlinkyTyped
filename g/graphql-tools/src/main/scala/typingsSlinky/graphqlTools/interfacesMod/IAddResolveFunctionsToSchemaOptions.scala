package typingsSlinky.graphqlTools.interfacesMod

import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddResolveFunctionsToSchemaOptions extends js.Object {
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.native
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.native
  var resolvers: IResolvers[_, _] = js.native
  var schema: GraphQLSchema = js.native
}

object IAddResolveFunctionsToSchemaOptions {
  @scala.inline
  def apply(resolvers: IResolvers[_, _], schema: GraphQLSchema): IAddResolveFunctionsToSchemaOptions = {
    val __obj = js.Dynamic.literal(resolvers = resolvers.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddResolveFunctionsToSchemaOptions]
  }
  @scala.inline
  implicit class IAddResolveFunctionsToSchemaOptionsOps[Self <: IAddResolveFunctionsToSchemaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolvers(value: IResolvers[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
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
    def withResolverValidationOptions(value: IResolverValidationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverValidationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverValidationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverValidationOptions")(js.undefined)
        ret
    }
  }
  
}

