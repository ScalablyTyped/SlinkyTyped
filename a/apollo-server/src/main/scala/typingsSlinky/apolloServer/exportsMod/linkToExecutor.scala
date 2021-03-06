package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.graphqlToolsLinks.anon.Context
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "linkToExecutor")
@js.native
object linkToExecutor extends js.Object {
  
  def apply(link: ApolloLink): js.Function1[
    /* hasDocumentVariablesContextInfo */ Context[_, _], 
    js.Promise[FetchResult[_, Record[String, _], Record[String, _]]]
  ] = js.native
}
