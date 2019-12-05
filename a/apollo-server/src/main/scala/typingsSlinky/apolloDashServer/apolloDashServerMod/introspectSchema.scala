package typingsSlinky.apolloDashServer.apolloDashServerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashLink.apolloDashLinkMod.ApolloLink
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphqlDashTools.distStitchingMakeRemoteExecutableSchemaMod.Fetcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "introspectSchema")
@js.native
object introspectSchema extends js.Object {
  def apply(fetcher: ApolloLink): js.Promise[GraphQLSchema] = js.native
  def apply(fetcher: ApolloLink, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def apply(fetcher: Fetcher): js.Promise[GraphQLSchema] = js.native
  def apply(fetcher: Fetcher, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
}

