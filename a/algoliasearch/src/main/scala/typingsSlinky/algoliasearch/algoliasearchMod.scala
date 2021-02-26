package typingsSlinky.algoliasearch

import typingsSlinky.algoliaClientAnalytics.mod.ABTest
import typingsSlinky.algoliaClientAnalytics.mod.GetABTestsOptions
import typingsSlinky.algoliaClientCommon.mod.ClientTransporterOptions
import typingsSlinky.algoliaClientRecommendation.mod.PersonalizationStrategy
import typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
import typingsSlinky.algoliaClientSearch.mod.ApiKeyACLType
import typingsSlinky.algoliaClientSearch.mod.BatchRequest
import typingsSlinky.algoliaClientSearch.mod.BrowseOptions
import typingsSlinky.algoliaClientSearch.mod.ChunkOptions
import typingsSlinky.algoliaClientSearch.mod.ClearRulesOptions
import typingsSlinky.algoliaClientSearch.mod.ClearSynonymsOptions
import typingsSlinky.algoliaClientSearch.mod.CopyIndexOptions
import typingsSlinky.algoliaClientSearch.mod.DeleteByFiltersOptions
import typingsSlinky.algoliaClientSearch.mod.DeleteSynonymOptions
import typingsSlinky.algoliaClientSearch.mod.FindAnswersOptions
import typingsSlinky.algoliaClientSearch.mod.FindObjectOptions
import typingsSlinky.algoliaClientSearch.mod.FindObjectResponse
import typingsSlinky.algoliaClientSearch.mod.GetObjectOptions
import typingsSlinky.algoliaClientSearch.mod.GetObjectsOptions
import typingsSlinky.algoliaClientSearch.mod.GetObjectsResponse
import typingsSlinky.algoliaClientSearch.mod.HasPendingMappingsOptions
import typingsSlinky.algoliaClientSearch.mod.ListUserIDsOptions
import typingsSlinky.algoliaClientSearch.mod.MultipleBatchRequest
import typingsSlinky.algoliaClientSearch.mod.MultipleGetObject
import typingsSlinky.algoliaClientSearch.mod.MultipleGetObjectsResponse
import typingsSlinky.algoliaClientSearch.mod.MultipleQueriesOptions
import typingsSlinky.algoliaClientSearch.mod.MultipleQueriesQuery
import typingsSlinky.algoliaClientSearch.mod.MultipleQueriesResponse
import typingsSlinky.algoliaClientSearch.mod.ObjectWithObjectID
import typingsSlinky.algoliaClientSearch.mod.PartialUpdateObjectsOptions
import typingsSlinky.algoliaClientSearch.mod.ReplaceAllObjectsOptions
import typingsSlinky.algoliaClientSearch.mod.Rule
import typingsSlinky.algoliaClientSearch.mod.SaveObjectsOptions
import typingsSlinky.algoliaClientSearch.mod.SaveRulesOptions
import typingsSlinky.algoliaClientSearch.mod.SaveSynonymsOptions
import typingsSlinky.algoliaClientSearch.mod.SearchOptions
import typingsSlinky.algoliaClientSearch.mod.SearchResponse
import typingsSlinky.algoliaClientSearch.mod.SearchRulesOptions
import typingsSlinky.algoliaClientSearch.mod.SearchSynonymsOptions
import typingsSlinky.algoliaClientSearch.mod.SearchUserIDsOptions
import typingsSlinky.algoliaClientSearch.mod.SecuredApiKeyRestrictions
import typingsSlinky.algoliaClientSearch.mod.Settings
import typingsSlinky.algoliaClientSearch.mod.Synonym
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import typingsSlinky.algoliaTransporter.mod.Transporter
import typingsSlinky.algoliasearch.algoliasearchStrings.apiKey
import typingsSlinky.algoliasearch.algoliasearchStrings.appId
import typingsSlinky.algoliasearch.anon.AddApiKeyOptionsPickReque
import typingsSlinky.algoliasearch.anon.IndexName
import typingsSlinky.algoliasearch.anon.OptionalCredentialsAnalyt
import typingsSlinky.algoliasearch.anon.OptionalCredentialsRecomm
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseAddABTestR
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseArraySearc
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseAssignUser
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseAssignUserCatch
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseDeleteABTe
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseFindAnswer
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseGetABTestR
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseGetABTests
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseGetApiKeyR
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseGetLogsRes
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseGetPersona
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseGetTopUser
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseHasPending
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseListApiKey
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseListCluste
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseListIndice
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseListUserID
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseRemoveUser
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseRule
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSearchForF
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSearchResp
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSearchSyno
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSearchUser
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSetPersona
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSettings
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseStopABTest
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSynonym
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseUserIDResp
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseboolean
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseAd
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseBa
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseCh
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseDe
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseDeCatch
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseIn
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseMu
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromisePa
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseRe
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSa
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSaCatch
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSaFinally
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSaThen
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSaWait
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSe
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseUp
import typingsSlinky.algoliasearch.anon.RequestOptionsPickSaveSyn
import typingsSlinky.algoliasearch.anon.UpdateApiKeyOptionsPickRe
import typingsSlinky.algoliasearch.anon.WithoutCredentialsSearchC
import typingsSlinky.std.Omit
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algoliasearchMod {
  
  object default {
    
    @JSImport("algoliasearch/dist/algoliasearch", JSImport.Default)
    @js.native
    def apply(appId: String, apiKey: String): SearchClient = js.native
    @JSImport("algoliasearch/dist/algoliasearch", JSImport.Default)
    @js.native
    def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = js.native
    @JSImport("algoliasearch/dist/algoliasearch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("algoliasearch/dist/algoliasearch", "default.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  type AlgoliaSearchOptions = Partial[ClientTransporterOptions] with WithoutCredentialsSearchC
  
  /* Inlined @algolia/client-analytics.@algolia/client-analytics.AnalyticsClient & {readonly addABTest (abTest : @algolia/client-analytics.@algolia/client-analytics.ABTest, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.AddABTestResponse>>, readonly getABTest (abTestID : number, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.GetABTestResponse>>, readonly getABTests (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-analytics.@algolia/client-analytics.GetABTestsOptions | undefined): std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.GetABTestsResponse>>, readonly stopABTest (abTestID : number, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.StopABTestResponse>>, readonly deleteABTest (abTestID : number, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.DeleteABTestResponse>>} */
  @js.native
  trait AnalyticsClient extends StObject {
    
    def addABTest(abTest: ABTest): ReadonlyPromiseAddABTestR = js.native
    def addABTest(abTest: ABTest, requestOptions: RequestOptions): ReadonlyPromiseAddABTestR = js.native
    
    /**
      * The application id.
      */
    val appId: String = js.native
    
    def deleteABTest(abTestID: Double): ReadonlyPromiseDeleteABTe = js.native
    def deleteABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseDeleteABTe = js.native
    
    def getABTest(abTestID: Double): ReadonlyPromiseGetABTestR = js.native
    def getABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseGetABTestR = js.native
    
    def getABTests(): ReadonlyPromiseGetABTests = js.native
    def getABTests(requestOptions: RequestOptions with GetABTestsOptions): ReadonlyPromiseGetABTests = js.native
    
    def stopABTest(abTestID: Double): ReadonlyPromiseStopABTest = js.native
    def stopABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseStopABTest = js.native
    
    /**
      * The underlying transporter.
      */
    val transporter: Transporter = js.native
  }
  
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
  
  type InitAnalyticsOptions = Partial[ClientTransporterOptions] with OptionalCredentialsAnalyt
  
  type InitRecommendationOptions = Partial[ClientTransporterOptions] with OptionalCredentialsRecomm
  
  type OptionalCredentials[TClientOptions /* <: Credentials */] = (Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ appId | apiKey
  ]) with (Pick[
    Partial[TClientOptions], 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ appId | apiKey
  ])
  
  /* Inlined @algolia/client-recommendation.@algolia/client-recommendation.RecommendationClient & {readonly getPersonalizationStrategy (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-recommendation.@algolia/client-recommendation.GetPersonalizationStrategyResponse>>, readonly setPersonalizationStrategy (personalizationStrategy : @algolia/client-recommendation.@algolia/client-recommendation.PersonalizationStrategy, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-recommendation.@algolia/client-recommendation.SetPersonalizationStrategyResponse>>} */
  @js.native
  trait RecommendationClient extends StObject {
    
    /**
      * The application id.
      */
    val appId: String = js.native
    
    def getPersonalizationStrategy(): ReadonlyPromiseGetPersona = js.native
    def getPersonalizationStrategy(requestOptions: RequestOptions): ReadonlyPromiseGetPersona = js.native
    
    def setPersonalizationStrategy(personalizationStrategy: PersonalizationStrategy): ReadonlyPromiseSetPersona = js.native
    def setPersonalizationStrategy(personalizationStrategy: PersonalizationStrategy, requestOptions: RequestOptions): ReadonlyPromiseSetPersona = js.native
    
    /**
      * The underlying transporter.
      */
    val transporter: Transporter = js.native
  }
  
  /* Inlined @algolia/client-search.@algolia/client-search.SearchClient & {readonly initIndex (indexName : string): algoliasearch.algoliasearch/dist/algoliasearch.SearchIndex, readonly search <TObject>(queries : std.Array<@algolia/client-search.@algolia/client-search.MultipleQueriesQuery>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.MultipleQueriesOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.MultipleQueriesResponse<TObject>>>, readonly searchForFacetValues (queries : std.ReadonlyArray<{ readonly indexName :string,  readonly params :@algolia/client-search.@algolia/client-search.SearchForFacetValuesQueryParams & @algolia/client-search.@algolia/client-search.SearchOptions}>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<std.Array<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>>, readonly multipleBatch (requests : std.Array<@algolia/client-search.@algolia/client-search.MultipleBatchRequest>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.MultipleBatchResponse>>, readonly multipleGetObjects <TObject>(requests : std.Array<@algolia/client-search.@algolia/client-search.MultipleGetObject>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.MultipleGetObjectsResponse<TObject>>>, readonly multipleQueries <TObject>(queries : std.Array<@algolia/client-search.@algolia/client-search.MultipleQueriesQuery>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.MultipleQueriesOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.MultipleQueriesResponse<TObject>>>, readonly copyIndex (from : string, to : string, requestOptions : @algolia/client-search.@algolia/client-search.CopyIndexOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>>, readonly copySettings (from : string, to : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>>, readonly copyRules (from : string, to : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>>, readonly copySynonyms (from : string, to : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>>, readonly moveIndex (from : string, to : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>>, readonly listIndices (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListIndicesResponse>>, readonly getLogs (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetLogsResponse>>, readonly listClusters (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListClustersResponse>>, readonly multipleSearchForFacetValues (queries : std.ReadonlyArray<{ readonly indexName :string,  readonly params :@algolia/client-search.@algolia/client-search.SearchForFacetValuesQueryParams & @algolia/client-search.@algolia/client-search.SearchOptions}>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<std.Array<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>>, readonly getApiKey (apiKey : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetApiKeyResponse>>, readonly addApiKey (acl : std.Array<@algolia/client-search.@algolia/client-search.ApiKeyACLType>, requestOptions : @algolia/client-search.@algolia/client-search.AddApiKeyOptions & std.Pick<@algolia/transporter.@algolia/transporter.RequestOptions, std.Exclude<keyof @algolia/transporter.@algolia/transporter.RequestOptions, 'queryParameters'>> | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.AddApiKeyResponse>>, readonly listApiKeys (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListApiKeysResponse>>, readonly updateApiKey (apiKey : string, requestOptions : @algolia/client-search.@algolia/client-search.UpdateApiKeyOptions & std.Pick<@algolia/transporter.@algolia/transporter.RequestOptions, std.Exclude<keyof @algolia/transporter.@algolia/transporter.RequestOptions, 'queryParameters'>> | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.UpdateApiKeyResponse>>, readonly deleteApiKey (apiKey : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteApiKeyResponse>>, readonly restoreApiKey (apiKey : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.RestoreApiKeyResponse>>, readonly assignUserID (userID : string, clusterName : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.AssignUserIDResponse>>, readonly assignUserIDs (userIDs : std.Array<string>, clusterName : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.AssignUserIDsResponse>>, readonly getUserID (userID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.UserIDResponse>>, readonly searchUserIDs (query : string, requestOptions : @algolia/client-search.@algolia/client-search.SearchUserIDsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchUserIDsResponse>>, readonly listUserIDs (requestOptions : @algolia/client-search.@algolia/client-search.ListUserIDsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListUserIDsResponse>>, readonly getTopUserIDs (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetTopUserIDsResponse>>, readonly removeUserID (userID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.RemoveUserIDResponse>>, readonly hasPendingMappings (requestOptions : @algolia/client-search.@algolia/client-search.HasPendingMappingsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.HasPendingMappingsResponse>>, readonly generateSecuredApiKey (parentApiKey : string, restrictions : @algolia/client-search.@algolia/client-search.SecuredApiKeyRestrictions): string, readonly getSecuredApiKeyRemainingValidity (securedApiKey : string): number, readonly initAnalytics (options : algoliasearch.algoliasearch/dist/algoliasearch.InitAnalyticsOptions | undefined): algoliasearch.algoliasearch/dist/algoliasearch.AnalyticsClient, readonly initRecommendation (options : algoliasearch.algoliasearch/dist/algoliasearch.InitRecommendationOptions | undefined): algoliasearch.algoliasearch/dist/algoliasearch.RecommendationClient} & @algolia/requester-common.@algolia/requester-common.Destroyable */
  @js.native
  trait SearchClient extends StObject {
    
    /**
      * Mutates the transporter, adding the given user agent.
      */
    def addAlgoliaAgent(segment: String): Unit = js.native
    def addAlgoliaAgent(segment: String, version: String): Unit = js.native
    
    def addApiKey(acl: js.Array[ApiKeyACLType]): ReadonlyWaitablePromiseAd = js.native
    def addApiKey(acl: js.Array[ApiKeyACLType], requestOptions: AddApiKeyOptionsPickReque): ReadonlyWaitablePromiseAd = js.native
    
    /**
      * The application id.
      */
    val appId: String = js.native
    
    def assignUserID(userID: String, clusterName: String): ReadonlyPromiseAssignUser = js.native
    def assignUserID(userID: String, clusterName: String, requestOptions: RequestOptions): ReadonlyPromiseAssignUser = js.native
    
    def assignUserIDs(userIDs: js.Array[String], clusterName: String): ReadonlyPromiseAssignUserCatch = js.native
    def assignUserIDs(userIDs: js.Array[String], clusterName: String, requestOptions: RequestOptions): ReadonlyPromiseAssignUserCatch = js.native
    
    /**
      * Clears both requests and responses caches.
      */
    def clearCache(): ReadonlyPromisevoid = js.native
    
    def copyIndex(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copyIndex(from: String, to: String, requestOptions: CopyIndexOptions with RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def copyRules(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copyRules(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def copySettings(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copySettings(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def copySynonyms(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copySynonyms(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def deleteApiKey(apiKey: String): ReadonlyWaitablePromiseDe = js.native
    def deleteApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseDe = js.native
    
    /**
      * Destroy any sockets that are currently in use by the agent.
      *
      * It is usually not necessary to do this. However, if using an agent with keepAlive enabled, then
      * it is best to explicitly shut down the agent when it will no longer be used. Otherwise, sockets
      * may hang open for quite a long time before the server terminates them.
      */
    def destroy(): typingsSlinky.algoliaRequesterCommon.anon.ReadonlyPromisevoid = js.native
    
    def generateSecuredApiKey(parentApiKey: String, restrictions: SecuredApiKeyRestrictions): String = js.native
    
    def getApiKey(apiKey: String): ReadonlyPromiseGetApiKeyR = js.native
    def getApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyPromiseGetApiKeyR = js.native
    
    def getLogs(): ReadonlyPromiseGetLogsRes = js.native
    def getLogs(requestOptions: RequestOptions): ReadonlyPromiseGetLogsRes = js.native
    
    def getSecuredApiKeyRemainingValidity(securedApiKey: String): Double = js.native
    
    def getTopUserIDs(): ReadonlyPromiseGetTopUser = js.native
    def getTopUserIDs(requestOptions: RequestOptions): ReadonlyPromiseGetTopUser = js.native
    
    def getUserID(userID: String): ReadonlyPromiseUserIDResp = js.native
    def getUserID(userID: String, requestOptions: RequestOptions): ReadonlyPromiseUserIDResp = js.native
    
    def hasPendingMappings(): ReadonlyPromiseHasPending = js.native
    def hasPendingMappings(requestOptions: HasPendingMappingsOptions with RequestOptions): ReadonlyPromiseHasPending = js.native
    
    def initAnalytics(): AnalyticsClient = js.native
    def initAnalytics(options: InitAnalyticsOptions): AnalyticsClient = js.native
    
    def initIndex(indexName: String): SearchIndex = js.native
    
    def initRecommendation(): RecommendationClient = js.native
    def initRecommendation(options: InitRecommendationOptions): RecommendationClient = js.native
    
    def listApiKeys(): ReadonlyPromiseListApiKey = js.native
    def listApiKeys(requestOptions: RequestOptions): ReadonlyPromiseListApiKey = js.native
    
    def listClusters(): ReadonlyPromiseListCluste = js.native
    def listClusters(requestOptions: RequestOptions): ReadonlyPromiseListCluste = js.native
    
    def listIndices(): ReadonlyPromiseListIndice = js.native
    def listIndices(requestOptions: RequestOptions): ReadonlyPromiseListIndice = js.native
    
    def listUserIDs(): ReadonlyPromiseListUserID = js.native
    def listUserIDs(requestOptions: ListUserIDsOptions with RequestOptions): ReadonlyPromiseListUserID = js.native
    
    def moveIndex(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def moveIndex(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def multipleBatch(requests: js.Array[MultipleBatchRequest]): ReadonlyWaitablePromiseMu = js.native
    def multipleBatch(requests: js.Array[MultipleBatchRequest], requestOptions: RequestOptions): ReadonlyWaitablePromiseMu = js.native
    
    def multipleGetObjects[TObject](requests: js.Array[MultipleGetObject]): js.Promise[MultipleGetObjectsResponse[TObject]] = js.native
    def multipleGetObjects[TObject](requests: js.Array[MultipleGetObject], requestOptions: RequestOptions): js.Promise[MultipleGetObjectsResponse[TObject]] = js.native
    
    def multipleQueries[TObject](queries: js.Array[MultipleQueriesQuery]): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    def multipleQueries[TObject](
      queries: js.Array[MultipleQueriesQuery],
      requestOptions: RequestOptions with MultipleQueriesOptions
    ): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    
    def multipleSearchForFacetValues(queries: js.Array[IndexName]): ReadonlyPromiseArraySearc = js.native
    def multipleSearchForFacetValues(queries: js.Array[IndexName], requestOptions: RequestOptions): ReadonlyPromiseArraySearc = js.native
    
    def removeUserID(userID: String): ReadonlyPromiseRemoveUser = js.native
    def removeUserID(userID: String, requestOptions: RequestOptions): ReadonlyPromiseRemoveUser = js.native
    
    def restoreApiKey(apiKey: String): ReadonlyWaitablePromiseRe = js.native
    def restoreApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseRe = js.native
    
    def search[TObject](queries: js.Array[MultipleQueriesQuery]): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    def search[TObject](
      queries: js.Array[MultipleQueriesQuery],
      requestOptions: RequestOptions with MultipleQueriesOptions
    ): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    
    def searchForFacetValues(queries: js.Array[IndexName]): ReadonlyPromiseArraySearc = js.native
    def searchForFacetValues(queries: js.Array[IndexName], requestOptions: RequestOptions): ReadonlyPromiseArraySearc = js.native
    
    def searchUserIDs(query: String): ReadonlyPromiseSearchUser = js.native
    def searchUserIDs(query: String, requestOptions: SearchUserIDsOptions with RequestOptions): ReadonlyPromiseSearchUser = js.native
    
    /**
      * The underlying transporter.
      */
    val transporter: Transporter = js.native
    
    def updateApiKey(apiKey: String): ReadonlyWaitablePromiseUp = js.native
    def updateApiKey(apiKey: String, requestOptions: UpdateApiKeyOptionsPickRe): ReadonlyWaitablePromiseUp = js.native
  }
  
  /* Inlined @algolia/client-search.@algolia/client-search.SearchIndex & {readonly search <TObject>(query : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SearchOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchResponse<TObject>>>, readonly searchForFacetValues (facetName : string, facetQuery : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SearchOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>, readonly findAnswers (query : string, queryLanguages : std.Array<string>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.FindAnswersOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.FindAnswersResponse<{}>>>, readonly batch (requests : std.Array<@algolia/client-search.@algolia/client-search.BatchRequest>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.BatchResponse>>, readonly delete (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly getObject <TObject>(objectID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.GetObjectOptions | undefined): std.Readonly<std.Promise<TObject & @algolia/client-search.@algolia/client-search.ObjectWithObjectID>>, readonly getObjects <TObject>(objectIDs : std.Array<string>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.GetObjectsOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetObjectsResponse<TObject>>>, readonly saveObject (object : std.Readonly<std.Record<string, any>>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ChunkOptions & @algolia/client-search.@algolia/client-search.SaveObjectsOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveObjectResponse>>, readonly saveObjects (objects : std.ReadonlyArray<std.Readonly<std.Record<string, any>>>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ChunkOptions & @algolia/client-search.@algolia/client-search.SaveObjectsOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>>, readonly waitTask (taskID : number, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<void>>, readonly setSettings (settings : @algolia/client-search.@algolia/client-search.Settings, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SetSettingsResponse>>, readonly getSettings (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Settings>>, readonly partialUpdateObject (object : std.Record<string, any>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ChunkOptions & @algolia/client-search.@algolia/client-search.PartialUpdateObjectsOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.PartialUpdateObjectResponse>>, readonly partialUpdateObjects (objects : std.ReadonlyArray<std.Record<string, any>>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ChunkOptions & @algolia/client-search.@algolia/client-search.PartialUpdateObjectsOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>>, readonly deleteObject (objectID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly deleteObjects (objectIDs : std.Array<string>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ChunkOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>>, readonly deleteBy (filters : @algolia/client-search.@algolia/client-search.DeleteByFiltersOptions, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly clearObjects (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly browseObjects <TObject>(requestOptions : @algolia/client-search.@algolia/client-search.SearchOptions & @algolia/client-search.@algolia/client-search.BrowseOptions<TObject> & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<void>>, readonly getObjectPosition (searchResponse : @algolia/client-search.@algolia/client-search.SearchResponse<{}>, objectID : string): number, readonly findObject <TObject>(callback : (object : TObject & @algolia/client-search.@algolia/client-search.ObjectWithObjectID): boolean, requestOptions : @algolia/client-search.@algolia/client-search.FindObjectOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.FindObjectResponse<TObject>>>, readonly exists (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<boolean>>, readonly saveSynonym (synonym : @algolia/client-search.@algolia/client-search.Synonym, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SaveSynonymsOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveSynonymResponse>>, readonly saveSynonyms (synonyms : std.Array<@algolia/client-search.@algolia/client-search.Synonym>, requestOptions : @algolia/client-search.@algolia/client-search.SaveSynonymsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveSynonymsResponse>>, readonly getSynonym (objectID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Synonym>>, readonly searchSynonyms (query : string, requestOptions : @algolia/client-search.@algolia/client-search.SearchSynonymsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchSynonymsResponse>>, readonly browseSynonyms (requestOptions : @algolia/client-search.@algolia/client-search.SearchSynonymsOptions & @algolia/client-search.@algolia/client-search.BrowseOptions<@algolia/client-search.@algolia/client-search.Synonym> & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<void>>, readonly deleteSynonym (objectID : string, requestOptions : @algolia/client-search.@algolia/client-search.DeleteSynonymOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly clearSynonyms (requestOptions : @algolia/client-search.@algolia/client-search.ClearSynonymsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly replaceAllObjects (objects : std.ReadonlyArray<std.Readonly<std.Record<string, any>>>, requestOptions : @algolia/client-search.@algolia/client-search.ReplaceAllObjectsOptions & @algolia/client-search.@algolia/client-search.ChunkOptions & @algolia/client-search.@algolia/client-search.SaveObjectsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>>, readonly replaceAllSynonyms (synonyms : std.Array<@algolia/client-search.@algolia/client-search.Synonym>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & std.Pick<@algolia/client-search.@algolia/client-search.SaveSynonymsOptions, std.Exclude<keyof @algolia/client-search.@algolia/client-search.SaveSynonymsOptions, 'clearExistingSynonyms' | 'replaceExistingSynonyms'>> | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveSynonymsResponse>>, readonly searchRules (query : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SearchRulesOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchResponse<@algolia/client-search.@algolia/client-search.Rule>>>, readonly getRule (objectID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Rule>>, readonly deleteRule (objectID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly saveRule (rule : @algolia/client-search.@algolia/client-search.Rule, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SaveRulesOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRuleResponse>>, readonly saveRules (rules : std.Array<@algolia/client-search.@algolia/client-search.Rule>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SaveRulesOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRulesResponse>>, readonly replaceAllRules (rules : std.Array<@algolia/client-search.@algolia/client-search.Rule>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SaveRulesOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRulesResponse>>, readonly browseRules (requestOptions : @algolia/client-search.@algolia/client-search.SearchRulesOptions & @algolia/client-search.@algolia/client-search.BrowseOptions<@algolia/client-search.@algolia/client-search.Rule> & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<void>>, readonly clearRules (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ClearRulesOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>} */
  @js.native
  trait SearchIndex extends StObject {
    
    /**
      * The application id.
      */
    val appId: String = js.native
    
    def batch(requests: js.Array[BatchRequest]): ReadonlyWaitablePromiseBa = js.native
    def batch(requests: js.Array[BatchRequest], requestOptions: RequestOptions): ReadonlyWaitablePromiseBa = js.native
    
    def browseObjects[TObject](): typingsSlinky.algoliasearch.anon.ReadonlyPromisevoid = js.native
    def browseObjects[TObject](requestOptions: SearchOptions with BrowseOptions[TObject] with RequestOptions): typingsSlinky.algoliasearch.anon.ReadonlyPromisevoid = js.native
    
    def browseRules(): typingsSlinky.algoliasearch.anon.ReadonlyPromisevoid = js.native
    def browseRules(requestOptions: SearchRulesOptions with BrowseOptions[Rule] with RequestOptions): typingsSlinky.algoliasearch.anon.ReadonlyPromisevoid = js.native
    
    def browseSynonyms(): typingsSlinky.algoliasearch.anon.ReadonlyPromisevoid = js.native
    def browseSynonyms(requestOptions: SearchSynonymsOptions with BrowseOptions[Synonym] with RequestOptions): typingsSlinky.algoliasearch.anon.ReadonlyPromisevoid = js.native
    
    def clearObjects(): ReadonlyWaitablePromiseDeCatch = js.native
    def clearObjects(requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def clearRules(): ReadonlyWaitablePromiseDeCatch = js.native
    def clearRules(requestOptions: RequestOptions with ClearRulesOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def clearSynonyms(): ReadonlyWaitablePromiseDeCatch = js.native
    def clearSynonyms(requestOptions: ClearSynonymsOptions with RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def delete(): ReadonlyWaitablePromiseDeCatch = js.native
    def delete(requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteBy(filters: DeleteByFiltersOptions): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteBy(filters: DeleteByFiltersOptions, requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteObject(objectID: String): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteObject(objectID: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteObjects(objectIDs: js.Array[String]): ReadonlyWaitablePromiseCh = js.native
    def deleteObjects(objectIDs: js.Array[String], requestOptions: RequestOptions with ChunkOptions): ReadonlyWaitablePromiseCh = js.native
    
    def deleteRule(objectID: String): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteRule(objectID: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteSynonym(objectID: String): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteSynonym(objectID: String, requestOptions: DeleteSynonymOptions with RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def exists(): ReadonlyPromiseboolean = js.native
    def exists(requestOptions: RequestOptions): ReadonlyPromiseboolean = js.native
    
    def findAnswers(query: String, queryLanguages: js.Array[String]): ReadonlyPromiseFindAnswer = js.native
    def findAnswers(
      query: String,
      queryLanguages: js.Array[String],
      requestOptions: RequestOptions with FindAnswersOptions
    ): ReadonlyPromiseFindAnswer = js.native
    
    def findObject[TObject](callback: js.Function1[/* object */ TObject with ObjectWithObjectID, Boolean]): js.Promise[FindObjectResponse[TObject]] = js.native
    def findObject[TObject](
      callback: js.Function1[/* object */ TObject with ObjectWithObjectID, Boolean],
      requestOptions: FindObjectOptions with RequestOptions
    ): js.Promise[FindObjectResponse[TObject]] = js.native
    
    def getObject[TObject](objectID: String): js.Promise[TObject with ObjectWithObjectID] = js.native
    def getObject[TObject](objectID: String, requestOptions: RequestOptions with GetObjectOptions): js.Promise[TObject with ObjectWithObjectID] = js.native
    
    def getObjectPosition(searchResponse: SearchResponse[js.Object], objectID: String): Double = js.native
    
    def getObjects[TObject](objectIDs: js.Array[String]): js.Promise[GetObjectsResponse[TObject]] = js.native
    def getObjects[TObject](objectIDs: js.Array[String], requestOptions: RequestOptions with GetObjectsOptions): js.Promise[GetObjectsResponse[TObject]] = js.native
    
    def getRule(objectID: String): ReadonlyPromiseRule = js.native
    def getRule(objectID: String, requestOptions: RequestOptions): ReadonlyPromiseRule = js.native
    
    def getSettings(): ReadonlyPromiseSettings = js.native
    def getSettings(requestOptions: RequestOptions): ReadonlyPromiseSettings = js.native
    
    def getSynonym(objectID: String): ReadonlyPromiseSynonym = js.native
    def getSynonym(objectID: String, requestOptions: RequestOptions): ReadonlyPromiseSynonym = js.native
    
    /**
      * The index name.
      */
    val indexName: String = js.native
    
    def partialUpdateObject(`object`: Record[String, _]): ReadonlyWaitablePromisePa = js.native
    def partialUpdateObject(
      `object`: Record[String, _],
      requestOptions: RequestOptions with ChunkOptions with PartialUpdateObjectsOptions
    ): ReadonlyWaitablePromisePa = js.native
    
    def partialUpdateObjects(objects: js.Array[Record[String, _]]): ReadonlyWaitablePromiseCh = js.native
    def partialUpdateObjects(
      objects: js.Array[Record[String, _]],
      requestOptions: RequestOptions with ChunkOptions with PartialUpdateObjectsOptions
    ): ReadonlyWaitablePromiseCh = js.native
    
    def replaceAllObjects(objects: js.Array[Record[String, _]]): ReadonlyWaitablePromiseCh = js.native
    def replaceAllObjects(
      objects: js.Array[Record[String, _]],
      requestOptions: ReplaceAllObjectsOptions with ChunkOptions with SaveObjectsOptions with RequestOptions
    ): ReadonlyWaitablePromiseCh = js.native
    
    def replaceAllRules(rules: js.Array[Rule]): ReadonlyWaitablePromiseSaWait = js.native
    def replaceAllRules(rules: js.Array[Rule], requestOptions: RequestOptions with SaveRulesOptions): ReadonlyWaitablePromiseSaWait = js.native
    
    def replaceAllSynonyms(synonyms: js.Array[Synonym]): ReadonlyWaitablePromiseSaFinally = js.native
    def replaceAllSynonyms(synonyms: js.Array[Synonym], requestOptions: RequestOptionsPickSaveSyn): ReadonlyWaitablePromiseSaFinally = js.native
    
    def saveObject(`object`: Record[String, _]): ReadonlyWaitablePromiseSa = js.native
    def saveObject(
      `object`: Record[String, _],
      requestOptions: RequestOptions with ChunkOptions with SaveObjectsOptions
    ): ReadonlyWaitablePromiseSa = js.native
    
    def saveObjects(objects: js.Array[Record[String, _]]): ReadonlyWaitablePromiseCh = js.native
    def saveObjects(
      objects: js.Array[Record[String, _]],
      requestOptions: RequestOptions with ChunkOptions with SaveObjectsOptions
    ): ReadonlyWaitablePromiseCh = js.native
    
    def saveRule(rule: Rule): ReadonlyWaitablePromiseSaThen = js.native
    def saveRule(rule: Rule, requestOptions: RequestOptions with SaveRulesOptions): ReadonlyWaitablePromiseSaThen = js.native
    
    def saveRules(rules: js.Array[Rule]): ReadonlyWaitablePromiseSaWait = js.native
    def saveRules(rules: js.Array[Rule], requestOptions: RequestOptions with SaveRulesOptions): ReadonlyWaitablePromiseSaWait = js.native
    
    def saveSynonym(synonym: Synonym): ReadonlyWaitablePromiseSaCatch = js.native
    def saveSynonym(synonym: Synonym, requestOptions: RequestOptions with SaveSynonymsOptions): ReadonlyWaitablePromiseSaCatch = js.native
    
    def saveSynonyms(synonyms: js.Array[Synonym]): ReadonlyWaitablePromiseSaFinally = js.native
    def saveSynonyms(synonyms: js.Array[Synonym], requestOptions: SaveSynonymsOptions with RequestOptions): ReadonlyWaitablePromiseSaFinally = js.native
    
    def search[TObject](query: String): js.Promise[SearchResponse[TObject]] = js.native
    def search[TObject](query: String, requestOptions: RequestOptions with SearchOptions): js.Promise[SearchResponse[TObject]] = js.native
    
    def searchForFacetValues(facetName: String, facetQuery: String): ReadonlyPromiseSearchForF = js.native
    def searchForFacetValues(facetName: String, facetQuery: String, requestOptions: RequestOptions with SearchOptions): ReadonlyPromiseSearchForF = js.native
    
    def searchRules(query: String): ReadonlyPromiseSearchResp = js.native
    def searchRules(query: String, requestOptions: RequestOptions with SearchRulesOptions): ReadonlyPromiseSearchResp = js.native
    
    def searchSynonyms(query: String): ReadonlyPromiseSearchSyno = js.native
    def searchSynonyms(query: String, requestOptions: SearchSynonymsOptions with RequestOptions): ReadonlyPromiseSearchSyno = js.native
    
    def setSettings(settings: Settings): ReadonlyWaitablePromiseSe = js.native
    def setSettings(settings: Settings, requestOptions: RequestOptions): ReadonlyWaitablePromiseSe = js.native
    
    /**
      * The underlying transporter.
      */
    val transporter: Transporter = js.native
    
    def waitTask(taskID: Double): typingsSlinky.algoliasearch.anon.ReadonlyPromisevoid = js.native
    def waitTask(taskID: Double, requestOptions: RequestOptions): typingsSlinky.algoliasearch.anon.ReadonlyPromisevoid = js.native
  }
  
  type WithoutCredentials[TClientOptions /* <: Credentials */] = Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ appId | apiKey
  ]
}
