package typingsSlinky.graphqlToolsLinks

import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.graphql.mod.GraphQLScalarType
import typingsSlinky.graphqlToolsLinks.anon.Context
import typingsSlinky.std.AsyncIterator
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/links", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val GraphQLUpload: GraphQLScalarType = js.native
  
  def createServerHttpLink(options: js.Any): ApolloLink = js.native
  
  def linkToExecutor(link: ApolloLink): js.Function1[
    /* hasDocumentVariablesContextInfo */ Context[_, _], 
    js.Promise[FetchResult[_, Record[String, _], Record[String, _]]]
  ] = js.native
  
  def linkToSubscriber(link: ApolloLink): js.Function1[
    /* hasDocumentVariablesContextInfo */ Context[_, _], 
    js.Promise[
      (AsyncIterator[FetchResult[_, Record[String, _], Record[String, _]], _, js.UndefOr[scala.Nothing]]) with typingsSlinky.graphqlToolsLinks.anon.AsyncIterator[_]
    ]
  ] = js.native
  
  @js.native
  class AwaitVariablesLink ()
    extends typingsSlinky.graphqlToolsLinks.awaitVariablesLinkMod.AwaitVariablesLink
}
