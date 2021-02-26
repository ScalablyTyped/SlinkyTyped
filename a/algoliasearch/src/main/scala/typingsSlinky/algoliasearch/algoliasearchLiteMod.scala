package typingsSlinky.algoliasearch

import typingsSlinky.algoliaClientCommon.mod.ClientTransporterOptions
import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
import typingsSlinky.algoliaClientSearch.mod.FindAnswersOptions
import typingsSlinky.algoliaClientSearch.mod.MultipleQueriesOptions
import typingsSlinky.algoliaClientSearch.mod.MultipleQueriesQuery
import typingsSlinky.algoliaClientSearch.mod.MultipleQueriesResponse
import typingsSlinky.algoliaClientSearch.mod.SearchOptions
import typingsSlinky.algoliaClientSearch.mod.SearchResponse
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import typingsSlinky.algoliaTransporter.mod.Transporter
import typingsSlinky.algoliasearch.algoliasearchStrings.apiKey
import typingsSlinky.algoliasearch.algoliasearchStrings.appId
import typingsSlinky.algoliasearch.anon.IndexName
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseArraySearc
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseFindAnswer
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSearchForF
import typingsSlinky.algoliasearch.anon.WithoutCredentialsSearchC
import typingsSlinky.std.Omit
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algoliasearchLiteMod {
  
  object default {
    
    @JSImport("algoliasearch/dist/algoliasearch-lite", JSImport.Default)
    @js.native
    def apply(appId: String, apiKey: String): SearchClient = js.native
    @JSImport("algoliasearch/dist/algoliasearch-lite", JSImport.Default)
    @js.native
    def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = js.native
    @JSImport("algoliasearch/dist/algoliasearch-lite", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("algoliasearch/dist/algoliasearch-lite", "default.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  type AlgoliaSearchOptions = Partial[ClientTransporterOptions] with WithoutCredentialsSearchC
  
  @js.native
  trait Credentials extends StObject {
    
    val apiKey: String = js.native
    
    val appId: String = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(apiKey: String, appId: String): Credentials = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @algolia/client-search.@algolia/client-search.SearchClient & {readonly initIndex (indexName : string): algoliasearch.algoliasearch/dist/algoliasearch-lite.SearchIndex, readonly search <TObject>(queries : std.Array<@algolia/client-search.@algolia/client-search.MultipleQueriesQuery>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.MultipleQueriesOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.MultipleQueriesResponse<TObject>>>, readonly searchForFacetValues (queries : std.ReadonlyArray<{ readonly indexName :string,  readonly params :@algolia/client-search.@algolia/client-search.SearchForFacetValuesQueryParams & @algolia/client-search.@algolia/client-search.SearchOptions}>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<std.Array<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>>} */
  @js.native
  trait SearchClient extends StObject {
    
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
  
  /* Inlined @algolia/client-search.@algolia/client-search.SearchIndex & {readonly search <TObject>(query : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SearchOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchResponse<TObject>>>, readonly searchForFacetValues (facetName : string, facetQuery : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SearchOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>, readonly findAnswers (query : string, queryLanguages : std.Array<string>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.FindAnswersOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.FindAnswersResponse<{}>>>} */
  @js.native
  trait SearchIndex extends StObject {
    
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
  
  type WithoutCredentials[TClientOptions /* <: Credentials */] = Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch-lite.Credentials */ appId | apiKey
  ]
}
