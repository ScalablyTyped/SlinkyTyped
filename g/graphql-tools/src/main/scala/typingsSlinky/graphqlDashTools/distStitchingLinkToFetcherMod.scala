package typingsSlinky.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashLink.apolloDashLinkMod.ApolloLink
import typingsSlinky.apolloDashLink.libTypesMod.FetchResult
import typingsSlinky.apolloDashLink.libTypesMod.GraphQLRequest
import typingsSlinky.graphqlDashTools.distStitchingMakeRemoteExecutableSchemaMod.Fetcher
import typingsSlinky.std.Record
import typingsSlinky.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/linkToFetcher", JSImport.Namespace)
@js.native
object distStitchingLinkToFetcherMod extends js.Object {
  def default(link: ApolloLink): Fetcher = js.native
  def execute(link: typingsSlinky.apolloDashLink.libLinkMod.ApolloLink, operation: GraphQLRequest): Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
}

