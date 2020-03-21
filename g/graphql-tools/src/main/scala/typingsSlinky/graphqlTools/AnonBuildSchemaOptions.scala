package typingsSlinky.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.executeMod.ExecutionResultDataDefault
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.schemaPrinterMod.Options
import typingsSlinky.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import typingsSlinky.graphqlTools.makeRemoteExecutableSchemaMod.FetcherOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuildSchemaOptions extends js.Object {
  var buildSchemaOptions: js.UndefOr[BuildSchemaOptions] = js.undefined
  var createResolver: js.UndefOr[
    js.Function1[/* fetcher */ Fetcher, GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ] = js.undefined
  var fetcher: js.UndefOr[Fetcher] = js.undefined
  var link: js.UndefOr[ApolloLink] = js.undefined
  var printSchemaOptions: js.UndefOr[Options] = js.undefined
  var schema: GraphQLSchema | String
}

object AnonBuildSchemaOptions {
  @scala.inline
  def apply(
    schema: GraphQLSchema | String,
    buildSchemaOptions: BuildSchemaOptions = null,
    createResolver: /* fetcher */ Fetcher => GraphQLFieldResolver[_, _, StringDictionary[_]] = null,
    fetcher: /* operation */ FetcherOperation => js.Promise[ExecutionResult[ExecutionResultDataDefault]] = null,
    link: ApolloLink = null,
    printSchemaOptions: Options = null
  ): AnonBuildSchemaOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (buildSchemaOptions != null) __obj.updateDynamic("buildSchemaOptions")(buildSchemaOptions.asInstanceOf[js.Any])
    if (createResolver != null) __obj.updateDynamic("createResolver")(js.Any.fromFunction1(createResolver))
    if (fetcher != null) __obj.updateDynamic("fetcher")(js.Any.fromFunction1(fetcher))
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (printSchemaOptions != null) __obj.updateDynamic("printSchemaOptions")(printSchemaOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuildSchemaOptions]
  }
}

