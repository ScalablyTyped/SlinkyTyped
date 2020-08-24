package typingsSlinky.expressGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expressGraphql.renderGraphiQLMod.GraphiQLOptions
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLAbstractType
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.executeMod.ExecutionArgs
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.formatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.Source
import typingsSlinky.graphql.mod.ValidationContext
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import typingsSlinky.graphql.validationContextMod.ValidationRule
import typingsSlinky.graphql.visitorMod.ASTVisitor
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsData extends js.Object {
  /**
    * A value to pass as the context to the graphql() function.
    */
  var context: js.UndefOr[js.Any] = js.native
  /**
    * An optional function which will be used to execute instead of default `execute`
    * from `graphql-js`.
    */
  var customExecuteFn: js.UndefOr[
    js.Function1[
      /* args */ ExecutionArgs, 
      MaybePromise[ExecutionResult[StringDictionary[_], StringDictionary[_]]]
    ]
  ] = js.native
  /**
    * An optional function which will be used to format any errors produced by
    * fulfilling a GraphQL operation. If no function is provided, GraphQL's
    * default spec-compliant `formatError` function will be used.
    */
  var customFormatErrorFn: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.native
  /**
    * An optional function which will be used to create a document instead of
    * the default `parse` from `graphql-js`.
    */
  var customParseFn: js.UndefOr[js.Function1[/* source */ Source, DocumentNode]] = js.native
  /**
    * An optional function which will be used to validate instead of default `validate`
    * from `graphql-js`.
    */
  var customValidateFn: js.UndefOr[
    js.Function3[
      /* schema */ GraphQLSchema, 
      /* documentAST */ DocumentNode, 
      /* rules */ js.Array[ValidationRule], 
      js.Array[GraphQLError]
    ]
  ] = js.native
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
  var extensions: js.UndefOr[
    js.Function1[/* info */ RequestInfo, MaybePromise[js.UndefOr[StringDictionary[_]]]]
  ] = js.native
  /**
    * A resolver function to use when one is not provided by the schema.
    * If not provided, the default field resolver is used (which looks for a
    * value or method on the source value with the field's name).
    */
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, _, StringDictionary[_]]] = js.native
  /**
    * `formatError` is deprecated and replaced by `customFormatErrorFn`. It will
    *  be removed in version 1.0.0.
    */
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.native
  /**
    * A boolean to optionally enable GraphiQL mode.
    * Alternatively, instead of `true` you can pass in an options object.
    */
  var graphiql: js.UndefOr[Boolean | GraphiQLOptions] = js.native
  /**
    * A boolean to configure whether the output should be pretty-printed.
    */
  var pretty: js.UndefOr[Boolean] = js.native
  /**
    * An object to pass as the rootValue to the graphql() function.
    */
  var rootValue: js.UndefOr[js.Any] = js.native
  /**
    * A GraphQL schema from graphql-js.
    */
  var schema: GraphQLSchema = js.native
  /**
    * A type resolver function to use when none is provided by the schema.
    * If not provided, the default type resolver is used (which looks for a
    * `__typename` field or alternatively calls the `isTypeOf` method).
    */
  var typeResolver: js.UndefOr[GraphQLTypeResolver[_, _]] = js.native
  /**
    * An optional array of validation rules that will be applied on the document
    * in additional to those defined by the GraphQL spec.
    */
  var validationRules: js.UndefOr[js.Array[js.Function1[/* ctx */ ValidationContext, ASTVisitor]]] = js.native
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setCustomExecuteFn(
      value: /* args */ ExecutionArgs => MaybePromise[ExecutionResult[StringDictionary[_], StringDictionary[_]]]
    ): Self = this.set("customExecuteFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomExecuteFn: Self = this.set("customExecuteFn", js.undefined)
    @scala.inline
    def setCustomFormatErrorFn(value: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]]): Self = this.set("customFormatErrorFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomFormatErrorFn: Self = this.set("customFormatErrorFn", js.undefined)
    @scala.inline
    def setCustomParseFn(value: /* source */ Source => DocumentNode): Self = this.set("customParseFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomParseFn: Self = this.set("customParseFn", js.undefined)
    @scala.inline
    def setCustomValidateFn(
      value: (/* schema */ GraphQLSchema, /* documentAST */ DocumentNode, /* rules */ js.Array[ValidationRule]) => js.Array[GraphQLError]
    ): Self = this.set("customValidateFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCustomValidateFn: Self = this.set("customValidateFn", js.undefined)
    @scala.inline
    def setExtensions(value: /* info */ RequestInfo => MaybePromise[js.UndefOr[StringDictionary[_]]]): Self = this.set("extensions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFieldResolver(value: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("fieldResolver", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFieldResolver: Self = this.set("fieldResolver", js.undefined)
    @scala.inline
    def setFormatError(value: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]]): Self = this.set("formatError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatError: Self = this.set("formatError", js.undefined)
    @scala.inline
    def setGraphiql(value: Boolean | GraphiQLOptions): Self = this.set("graphiql", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphiql: Self = this.set("graphiql", js.undefined)
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    @scala.inline
    def setRootValue(value: js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    @scala.inline
    def setTypeResolver(
      value: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _]) | String]]
    ): Self = this.set("typeResolver", js.Any.fromFunction4(value))
    @scala.inline
    def deleteTypeResolver: Self = this.set("typeResolver", js.undefined)
    @scala.inline
    def setValidationRulesVarargs(value: (js.Function1[/* ctx */ ValidationContext, ASTVisitor])*): Self = this.set("validationRules", js.Array(value :_*))
    @scala.inline
    def setValidationRules(value: js.Array[js.Function1[/* ctx */ ValidationContext, ASTVisitor]]): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
  }
  
}

