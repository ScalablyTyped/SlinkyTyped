package typingsSlinky.koaGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expressGraphql.mod.RequestInfo
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.ValidationContext
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsData extends OptionsResult {
  /**
    * A value to pass as the context to this middleware.
    */
  var context: js.UndefOr[js.Any] = js.native
  /**
    * An optional function for adding additional metadata to the GraphQL response
    * as a key-value object. The result will be added to "extensions" field in
    * the resulting JSON. This is often a useful place to add development time
    * info such as the runtime of a query or the amount of resources consumed.
    *
    * Information about the request is provided to be used.
    *
    * This function may be async.
    */
  var extensions: js.UndefOr[js.Function1[/* info */ RequestInfo, StringDictionary[_]]] = js.native
  /**
    * A resolver function to use when one is not provided by the schema.
    * If not provided, the default field resolver is used (which looks for a
    * value or method on the source value with the field's name).
    */
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, _, StringDictionary[_]]] = js.native
  /**
    * An optional function which will be used to format any errors produced by
    * fulfilling a GraphQL operation. If no function is provided, GraphQL's
    * default spec-compliant `formatError` function will be used.
    */
  var formatError: js.UndefOr[js.Function2[/* error */ GraphQLError, /* context */ js.UndefOr[js.Any], _]] = js.native
  /**
    * A boolean to optionally enable GraphiQL mode.
    */
  var graphiql: js.UndefOr[Boolean] = js.native
  /**
    * A boolean to configure whether the output should be pretty-printed.
    */
  var pretty: js.UndefOr[Boolean] = js.native
  /**
    * An object to pass as the rootvalue to the graphql() function.
    */
  var rootValue: js.UndefOr[js.Any] = js.native
  /**
    * A GraphQL schema from graphql-js.
    */
  var schema: GraphQLSchema = js.native
  /**
    * An optional array of validation rules that will be applied on the document
    * in addition to those defined by the GraphQL spec.
    */
  var validationRules: js.UndefOr[js.Array[js.Function1[/* arg0 */ ValidationContext, ASTVisitor]]] = js.native
}

object OptionsData {
  @scala.inline
  def apply(schema: GraphQLSchema): OptionsData = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsData]
  }
  @scala.inline
  implicit class OptionsDataOps[Self <: OptionsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: /* info */ RequestInfo => StringDictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldResolver(value: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldResolver")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFieldResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatError(value: (/* error */ GraphQLError, /* context */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphiql(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphiql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphiql: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphiql")(js.undefined)
        ret
    }
    @scala.inline
    def withPretty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(js.undefined)
        ret
    }
    @scala.inline
    def withRootValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Array[js.Function1[/* arg0 */ ValidationContext, ASTVisitor]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
  }
  
}

