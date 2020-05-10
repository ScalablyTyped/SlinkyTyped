package typingsSlinky.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.executeMod.ExecutionResultDataDefault
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import typingsSlinky.graphqlTools.makeRemoteExecutableSchemaMod.FetcherOperation
import typingsSlinky.graphqlTools.makeRemoteExecutableSchemaMod.PrintSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBuildSchemaOptions extends js.Object {
  var buildSchemaOptions: js.UndefOr[BuildSchemaOptions] = js.native
  var createResolver: js.UndefOr[
    js.Function1[/* fetcher */ Fetcher, GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ] = js.native
  var fetcher: js.UndefOr[Fetcher] = js.native
  var link: js.UndefOr[ApolloLink] = js.native
  var printSchemaOptions: js.UndefOr[PrintSchemaOptions] = js.native
  var schema: GraphQLSchema | String = js.native
}

object AnonBuildSchemaOptions {
  @scala.inline
  def apply(schema: GraphQLSchema | String): AnonBuildSchemaOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuildSchemaOptions]
  }
  @scala.inline
  implicit class AnonBuildSchemaOptionsOps[Self <: AnonBuildSchemaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchema(value: GraphQLSchema | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildSchemaOptions(value: BuildSchemaOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildSchemaOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildSchemaOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildSchemaOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateResolver(value: /* fetcher */ Fetcher => GraphQLFieldResolver[_, _, StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createResolver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withFetcher(value: /* operation */ FetcherOperation => js.Promise[ExecutionResult[ExecutionResultDataDefault]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetcher")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFetcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetcher")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: ApolloLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintSchemaOptions(value: PrintSchemaOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printSchemaOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintSchemaOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printSchemaOptions")(js.undefined)
        ret
    }
  }
  
}

