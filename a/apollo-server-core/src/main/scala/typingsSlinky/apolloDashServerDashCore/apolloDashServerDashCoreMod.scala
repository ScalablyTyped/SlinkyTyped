package typingsSlinky.apolloDashServerDashCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.apolloDashServerDashCore.distPlaygroundMod.PlaygroundConfig
import typingsSlinky.apolloDashServerDashCore.distRunHttpQueryMod.HttpQueryRequest
import typingsSlinky.apolloDashServerDashCore.distRunHttpQueryMod.HttpQueryResponse
import typingsSlinky.apolloDashServerDashCore.distTypesMod.Config
import typingsSlinky.apolloDashServerDashEnv.apolloDashServerDashEnvMod.Request
import typingsSlinky.apolloDashServerDashErrors.Anon_Debug
import typingsSlinky.apolloDashServerDashErrors.Anon_Extensions
import typingsSlinky.apolloDashServerDashErrors.Anon_ExtensionsAny
import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
import typingsSlinky.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.RenderPageOptions
import typingsSlinky.graphql.graphqlMod.GraphQLError
import typingsSlinky.graphql.graphqlMod.GraphQLScalarType
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.std.Record
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core", JSImport.Namespace)
@js.native
object apolloDashServerDashCoreMod extends js.Object {
  @js.native
  class ApolloError protected ()
    extends typingsSlinky.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.ApolloError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: String, code: String, extensions: Record[String, _]) = this()
  }
  
  @js.native
  class ApolloServerBase protected ()
    extends typingsSlinky.apolloDashServerDashCore.distApolloServerMod.ApolloServerBase {
    def this(config: Config) = this()
  }
  
  @js.native
  class AuthenticationError protected ()
    extends typingsSlinky.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.AuthenticationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ForbiddenError protected ()
    extends typingsSlinky.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.ForbiddenError {
    def this(message: String) = this()
  }
  
  @js.native
  class GraphQLExtension[TContext] ()
    extends typingsSlinky.graphqlDashExtensions.graphqlDashExtensionsMod.GraphQLExtension[TContext]
  
  @js.native
  class HttpQueryError protected ()
    extends typingsSlinky.apolloDashServerDashCore.distRunHttpQueryMod.HttpQueryError {
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, isGraphQLError: Boolean) = this()
    def this(statusCode: Double, message: String, isGraphQLError: Boolean, headers: StringDictionary[String]) = this()
  }
  
  @js.native
  class InvalidGraphQLRequestError () extends GraphQLError
  
  @js.native
  class SyntaxError protected ()
    extends typingsSlinky.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.SyntaxError {
    def this(message: String) = this()
  }
  
  @js.native
  class UserInputError protected ()
    extends typingsSlinky.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.UserInputError {
    def this(message: String) = this()
    def this(message: String, properties: Record[String, _]) = this()
  }
  
  @js.native
  class ValidationError protected ()
    extends typingsSlinky.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.ValidationError {
    def this(message: String) = this()
  }
  
  val GraphQLUpload: js.UndefOr[GraphQLScalarType] = js.native
  val processFileUploads: js.UndefOr[Fn_Request] = js.native
  def convertNodeHttpToRequest(req: IncomingMessage): Request = js.native
  def createPlaygroundOptions(): js.UndefOr[RenderPageOptions] = js.native
  def createPlaygroundOptions(playground: PlaygroundConfig): js.UndefOr[RenderPageOptions] = js.native
  def formatApolloErrors(errors: js.Array[js.Error]): js.Array[
    typingsSlinky.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.ApolloError
  ] = js.native
  def formatApolloErrors(errors: js.Array[js.Error], options: Anon_Debug): js.Array[
    typingsSlinky.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.ApolloError
  ] = js.native
  def gql(template: String, substitutions: js.Any*): DocumentNode = js.native
  def gql(template: TemplateStringsArray, substitutions: js.Any*): DocumentNode = js.native
  def resolveGraphqlOptions(
    options: js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]],
    args: js.Any*
  ): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def resolveGraphqlOptions(options: GraphQLServerOptions[Record[String, _], _], args: js.Any*): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def runHttpQuery(handlerArguments: js.Array[_], request: HttpQueryRequest): js.Promise[HttpQueryResponse] = js.native
  def toApolloError(error: js.Error with Anon_Extensions): js.Error with Anon_ExtensionsAny = js.native
  def toApolloError(error: js.Error with Anon_Extensions, code: String): js.Error with Anon_ExtensionsAny = js.native
  @js.native
  object defaultPlaygroundOptions extends js.Object {
    var settings: Anon_EditorcursorShape = js.native
    var version: String = js.native
  }
  
}

