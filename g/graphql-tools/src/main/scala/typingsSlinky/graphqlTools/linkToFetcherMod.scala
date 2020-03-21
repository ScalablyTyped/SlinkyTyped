package typingsSlinky.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloLink.mod.ApolloLink
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.apolloLink.typesMod.GraphQLRequest
import typingsSlinky.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import typingsSlinky.std.Record
import typingsSlinky.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/linkToFetcher", JSImport.Namespace)
@js.native
object linkToFetcherMod extends js.Object {
  def default(link: ApolloLink): Fetcher = js.native
  def execute(link: typingsSlinky.apolloLink.linkMod.ApolloLink, operation: GraphQLRequest): Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
}

