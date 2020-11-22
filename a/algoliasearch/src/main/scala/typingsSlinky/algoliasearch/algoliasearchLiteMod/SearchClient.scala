package typingsSlinky.algoliasearch.algoliasearchLiteMod

import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
import typingsSlinky.algoliaClientSearch.mod.MultipleQueriesOptions
import typingsSlinky.algoliaClientSearch.mod.MultipleQueriesQuery
import typingsSlinky.algoliaClientSearch.mod.MultipleQueriesResponse
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import typingsSlinky.algoliaTransporter.mod.Transporter
import typingsSlinky.algoliasearch.anon.IndexName
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseArraySearc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-search.@algolia/client-search.SearchClient & {readonly initIndex (indexName : string): algoliasearch.algoliasearch/dist/algoliasearch-lite.SearchIndex, readonly search <TObject>(queries : std.Array<@algolia/client-search.@algolia/client-search.MultipleQueriesQuery>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.MultipleQueriesOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.MultipleQueriesResponse<TObject>>>, readonly searchForFacetValues (queries : std.ReadonlyArray<{ readonly indexName :string,  readonly params :@algolia/client-search.@algolia/client-search.SearchForFacetValuesQueryParams & @algolia/client-search.@algolia/client-search.SearchOptions}>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<std.Array<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>>} */
@js.native
trait SearchClient extends js.Object {
  
  /**
    * Mutates the transporter, adding the given user agent.
    */
  def addAlgoliaAgent(segment: String): Unit = js.native
  def addAlgoliaAgent(segment: String, version: String): Unit = js.native
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  /**
    * Clears both requests and responses caches.
    */
  def clearCache(): ReadonlyPromisevoid = js.native
  
  def initIndex(indexName: String): SearchIndex = js.native
  
  def search[TObject](queries: js.Array[MultipleQueriesQuery]): js.Promise[MultipleQueriesResponse[TObject]] = js.native
  def search[TObject](
    queries: js.Array[MultipleQueriesQuery],
    requestOptions: RequestOptions with MultipleQueriesOptions
  ): js.Promise[MultipleQueriesResponse[TObject]] = js.native
  
  def searchForFacetValues(queries: js.Array[IndexName]): ReadonlyPromiseArraySearc = js.native
  def searchForFacetValues(queries: js.Array[IndexName], requestOptions: RequestOptions): ReadonlyPromiseArraySearc = js.native
  
  /**
    * The underlying transporter.
    */
  val transporter: Transporter = js.native
}
