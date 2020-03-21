package typingsSlinky.apolloServerCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.apolloServerCore.playgroundMod.PlaygroundConfig
import typingsSlinky.apolloServerCore.runHttpQueryMod.HttpQueryRequest
import typingsSlinky.apolloServerCore.runHttpQueryMod.HttpQueryResponse
import typingsSlinky.apolloServerCore.typesMod.Config
import typingsSlinky.apolloServerEnv.mod.Request
import typingsSlinky.apolloServerErrors.AnonDebug
import typingsSlinky.apolloServerErrors.ErrorextensionsRecordstri
import typingsSlinky.apolloServerErrors.ErrorextensionsRecordstriExtensions
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.RenderPageOptions
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLScalarType
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.std.Record
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ApolloError protected ()
    extends typingsSlinky.apolloServerErrors.mod.ApolloError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: String, code: String, extensions: Record[String, _]) = this()
  }
  
  @js.native
  class ApolloServerBase protected ()
    extends typingsSlinky.apolloServerCore.apolloServerMod.ApolloServerBase {
    def this(config: Config) = this()
  }
  
  @js.native
  class AuthenticationError protected ()
    extends typingsSlinky.apolloServerErrors.mod.AuthenticationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ForbiddenError protected ()
    extends typingsSlinky.apolloServerErrors.mod.ForbiddenError {
    def this(message: String) = this()
  }
  
  @js.native
  class GraphQLExtension[TContext] ()
    extends typingsSlinky.graphqlExtensions.mod.GraphQLExtension[TContext]
  
  @js.native
  class HttpQueryError protected ()
    extends typingsSlinky.apolloServerCore.runHttpQueryMod.HttpQueryError {
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, isGraphQLError: Boolean) = this()
    def this(statusCode: Double, message: String, isGraphQLError: Boolean, headers: StringDictionary[String]) = this()
  }
  
  @js.native
  class InvalidGraphQLRequestError () extends GraphQLError
  
  @js.native
  class SyntaxError protected ()
    extends typingsSlinky.apolloServerErrors.mod.SyntaxError {
    def this(message: String) = this()
  }
  
  @js.native
  class UserInputError protected ()
    extends typingsSlinky.apolloServerErrors.mod.UserInputError {
    def this(message: String) = this()
    def this(message: String, properties: Record[String, _]) = this()
  }
  
  @js.native
  class ValidationError protected ()
    extends typingsSlinky.apolloServerErrors.mod.ValidationError {
    def this(message: String) = this()
  }
  
  val GraphQLUpload: js.UndefOr[GraphQLScalarType] = js.native
  val processFileUploads: js.UndefOr[FnCall] = js.native
  def convertNodeHttpToRequest(req: IncomingMessage): Request = js.native
  def createPlaygroundOptions(): js.UndefOr[RenderPageOptions] = js.native
  def createPlaygroundOptions(playground: PlaygroundConfig): js.UndefOr[RenderPageOptions] = js.native
  def formatApolloErrors(errors: js.Array[js.Error]): js.Array[typingsSlinky.apolloServerErrors.mod.ApolloError] = js.native
  def formatApolloErrors(errors: js.Array[js.Error], options: AnonDebug): js.Array[typingsSlinky.apolloServerErrors.mod.ApolloError] = js.native
  def gql(template: String, substitutions: js.Any*): DocumentNode = js.native
  def gql(template: TemplateStringsArray, substitutions: js.Any*): DocumentNode = js.native
  def resolveGraphqlOptions(
    options: js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]],
    args: js.Any*
  ): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def resolveGraphqlOptions(options: GraphQLServerOptions[Record[String, _], _], args: js.Any*): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def runHttpQuery(handlerArguments: js.Array[_], request: HttpQueryRequest): js.Promise[HttpQueryResponse] = js.native
  def toApolloError(error: ErrorextensionsRecordstri): ErrorextensionsRecordstriExtensions = js.native
  def toApolloError(error: ErrorextensionsRecordstri, code: String): ErrorextensionsRecordstriExtensions = js.native
  @js.native
  object defaultPlaygroundOptions extends js.Object {
    var settings: AnonEditorcursorShape = js.native
    var version: String = js.native
  }
  
}

