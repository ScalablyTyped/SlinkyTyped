package typingsSlinky.algoliasearch.algoliasearchLiteMod

import typingsSlinky.algoliaClientSearch.mod.FindAnswersOptions
import typingsSlinky.algoliaClientSearch.mod.SearchOptions
import typingsSlinky.algoliaClientSearch.mod.SearchResponse
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import typingsSlinky.algoliaTransporter.mod.Transporter
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseFindAnswer
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSearchForF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-search.@algolia/client-search.SearchIndex & {readonly search <TObject>(query : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SearchOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchResponse<TObject>>>, readonly searchForFacetValues (facetName : string, facetQuery : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SearchOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>, readonly findAnswers (query : string, queryLanguages : std.Array<string>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.FindAnswersOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.FindAnswersResponse<{}>>>} */
@js.native
trait SearchIndex extends js.Object {
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  def findAnswers(query: String, queryLanguages: js.Array[String]): ReadonlyPromiseFindAnswer = js.native
  def findAnswers(
    query: String,
    queryLanguages: js.Array[String],
    requestOptions: RequestOptions with FindAnswersOptions
  ): ReadonlyPromiseFindAnswer = js.native
  
  /**
    * The index name.
    */
  val indexName: String = js.native
  
  def search[TObject](query: String): js.Promise[SearchResponse[TObject]] = js.native
  def search[TObject](query: String, requestOptions: RequestOptions with SearchOptions): js.Promise[SearchResponse[TObject]] = js.native
  
  def searchForFacetValues(facetName: String, facetQuery: String): ReadonlyPromiseSearchForF = js.native
  def searchForFacetValues(facetName: String, facetQuery: String, requestOptions: RequestOptions with SearchOptions): ReadonlyPromiseSearchForF = js.native
  
  /**
    * The underlying transporter.
    */
  val transporter: Transporter = js.native
}
