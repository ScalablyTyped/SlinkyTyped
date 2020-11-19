package typingsSlinky.graphqlToolsLinks

import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.graphqlToolsLinks.anon.Context
import typingsSlinky.std.AsyncIterator
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/links/linkToSubscriber", JSImport.Namespace)
@js.native
object linkToSubscriberMod extends js.Object {
  
  def linkToSubscriber(link: ApolloLink): js.Function1[
    /* hasDocumentVariablesContextInfo */ Context[_, _], 
    js.Promise[
      (AsyncIterator[FetchResult[_, Record[String, _], Record[String, _]], _, js.UndefOr[scala.Nothing]]) with typingsSlinky.graphqlToolsLinks.anon.AsyncIterator[_]
    ]
  ] = js.native
}
