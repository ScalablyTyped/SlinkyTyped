package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.graphqlToolsLinks.anon.Context
import typingsSlinky.std.AsyncIterator
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-express", "linkToSubscriber")
@js.native
object linkToSubscriber extends js.Object {
  
  def apply(link: ApolloLink): js.Function1[
    /* hasDocumentVariablesContextInfo */ Context[_, _], 
    js.Promise[
      (AsyncIterator[FetchResult[_, Record[String, _], Record[String, _]], _, js.UndefOr[scala.Nothing]]) with typingsSlinky.graphqlToolsLinks.anon.AsyncIterator[_]
    ]
  ] = js.native
}
