package typingsSlinky.algoliasearch.algoliasearchMod

import typingsSlinky.algoliaClientSearch.mod.BatchRequest
import typingsSlinky.algoliaClientSearch.mod.BrowseOptions
import typingsSlinky.algoliaClientSearch.mod.ChunkOptions
import typingsSlinky.algoliaClientSearch.mod.ClearRulesOptions
import typingsSlinky.algoliaClientSearch.mod.ClearSynonymsOptions
import typingsSlinky.algoliaClientSearch.mod.DeleteByFiltersOptions
import typingsSlinky.algoliaClientSearch.mod.DeleteSynonymOptions
import typingsSlinky.algoliaClientSearch.mod.FindAnswersOptions
import typingsSlinky.algoliaClientSearch.mod.FindObjectOptions
import typingsSlinky.algoliaClientSearch.mod.FindObjectResponse
import typingsSlinky.algoliaClientSearch.mod.GetObjectOptions
import typingsSlinky.algoliaClientSearch.mod.GetObjectsOptions
import typingsSlinky.algoliaClientSearch.mod.GetObjectsResponse
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
import typingsSlinky.algoliaClientSearch.mod.Settings
import typingsSlinky.algoliaClientSearch.mod.Synonym
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import typingsSlinky.algoliaTransporter.mod.Transporter
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseFindAnswer
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseRule
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSearchForF
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSearchResp
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSearchSyno
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSettings
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSynonym
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseboolean
import typingsSlinky.algoliasearch.anon.ReadonlyPromisevoid
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseBa
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseCh
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseDeCatch
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromisePa
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSa
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSaCatch
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSaFinally
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSaThen
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSaWait
import typingsSlinky.algoliasearch.anon.ReadonlyWaitablePromiseSe
import typingsSlinky.algoliasearch.anon.RequestOptionsPickSaveSyn
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-search.@algolia/client-search.SearchIndex & {readonly search <TObject>(query : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SearchOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchResponse<TObject>>>, readonly searchForFacetValues (facetName : string, facetQuery : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SearchOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>, readonly findAnswers (query : string, queryLanguages : std.Array<string>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.FindAnswersOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.FindAnswersResponse<{}>>>, readonly batch (requests : std.Array<@algolia/client-search.@algolia/client-search.BatchRequest>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.BatchResponse>>, readonly delete (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly getObject <TObject>(objectID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.GetObjectOptions | undefined): std.Readonly<std.Promise<TObject & @algolia/client-search.@algolia/client-search.ObjectWithObjectID>>, readonly getObjects <TObject>(objectIDs : std.Array<string>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.GetObjectsOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetObjectsResponse<TObject>>>, readonly saveObject (object : std.Readonly<std.Record<string, any>>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ChunkOptions & @algolia/client-search.@algolia/client-search.SaveObjectsOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveObjectResponse>>, readonly saveObjects (objects : std.ReadonlyArray<std.Readonly<std.Record<string, any>>>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ChunkOptions & @algolia/client-search.@algolia/client-search.SaveObjectsOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>>, readonly waitTask (taskID : number, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<void>>, readonly setSettings (settings : @algolia/client-search.@algolia/client-search.Settings, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SetSettingsResponse>>, readonly getSettings (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Settings>>, readonly partialUpdateObject (object : std.Record<string, any>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ChunkOptions & @algolia/client-search.@algolia/client-search.PartialUpdateObjectsOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.PartialUpdateObjectResponse>>, readonly partialUpdateObjects (objects : std.ReadonlyArray<std.Record<string, any>>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ChunkOptions & @algolia/client-search.@algolia/client-search.PartialUpdateObjectsOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>>, readonly deleteObject (objectID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly deleteObjects (objectIDs : std.Array<string>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ChunkOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>>, readonly deleteBy (filters : @algolia/client-search.@algolia/client-search.DeleteByFiltersOptions, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly clearObjects (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly browseObjects <TObject>(requestOptions : @algolia/client-search.@algolia/client-search.SearchOptions & @algolia/client-search.@algolia/client-search.BrowseOptions<TObject> & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<void>>, readonly getObjectPosition (searchResponse : @algolia/client-search.@algolia/client-search.SearchResponse<{}>, objectID : string): number, readonly findObject <TObject>(callback : (object : TObject & @algolia/client-search.@algolia/client-search.ObjectWithObjectID): boolean, requestOptions : @algolia/client-search.@algolia/client-search.FindObjectOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.FindObjectResponse<TObject>>>, readonly exists (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<boolean>>, readonly saveSynonym (synonym : @algolia/client-search.@algolia/client-search.Synonym, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SaveSynonymsOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveSynonymResponse>>, readonly saveSynonyms (synonyms : std.Array<@algolia/client-search.@algolia/client-search.Synonym>, requestOptions : @algolia/client-search.@algolia/client-search.SaveSynonymsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveSynonymsResponse>>, readonly getSynonym (objectID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Synonym>>, readonly searchSynonyms (query : string, requestOptions : @algolia/client-search.@algolia/client-search.SearchSynonymsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchSynonymsResponse>>, readonly browseSynonyms (requestOptions : @algolia/client-search.@algolia/client-search.SearchSynonymsOptions & @algolia/client-search.@algolia/client-search.BrowseOptions<@algolia/client-search.@algolia/client-search.Synonym> & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<void>>, readonly deleteSynonym (objectID : string, requestOptions : @algolia/client-search.@algolia/client-search.DeleteSynonymOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly clearSynonyms (requestOptions : @algolia/client-search.@algolia/client-search.ClearSynonymsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly replaceAllObjects (objects : std.ReadonlyArray<std.Readonly<std.Record<string, any>>>, requestOptions : @algolia/client-search.@algolia/client-search.ReplaceAllObjectsOptions & @algolia/client-search.@algolia/client-search.ChunkOptions & @algolia/client-search.@algolia/client-search.SaveObjectsOptions & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>>, readonly replaceAllSynonyms (synonyms : std.Array<@algolia/client-search.@algolia/client-search.Synonym>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & std.Pick<@algolia/client-search.@algolia/client-search.SaveSynonymsOptions, std.Exclude<keyof @algolia/client-search.@algolia/client-search.SaveSynonymsOptions, 'clearExistingSynonyms' | 'replaceExistingSynonyms'>> | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveSynonymsResponse>>, readonly searchRules (query : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SearchRulesOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchResponse<@algolia/client-search.@algolia/client-search.Rule>>>, readonly getRule (objectID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Rule>>, readonly deleteRule (objectID : string, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>, readonly saveRule (rule : @algolia/client-search.@algolia/client-search.Rule, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SaveRulesOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRuleResponse>>, readonly saveRules (rules : std.Array<@algolia/client-search.@algolia/client-search.Rule>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SaveRulesOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRulesResponse>>, readonly replaceAllRules (rules : std.Array<@algolia/client-search.@algolia/client-search.Rule>, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.SaveRulesOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRulesResponse>>, readonly browseRules (requestOptions : @algolia/client-search.@algolia/client-search.SearchRulesOptions & @algolia/client-search.@algolia/client-search.BrowseOptions<@algolia/client-search.@algolia/client-search.Rule> & @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<void>>, readonly clearRules (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions & @algolia/client-search.@algolia/client-search.ClearRulesOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>>} */
@js.native
trait SearchIndex extends js.Object {
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  def batch(requests: js.Array[BatchRequest]): ReadonlyWaitablePromiseBa = js.native
  def batch(requests: js.Array[BatchRequest], requestOptions: RequestOptions): ReadonlyWaitablePromiseBa = js.native
  
  def browseObjects[TObject](): ReadonlyPromisevoid = js.native
  def browseObjects[TObject](requestOptions: SearchOptions with BrowseOptions[TObject] with RequestOptions): ReadonlyPromisevoid = js.native
  
  def browseRules(): ReadonlyPromisevoid = js.native
  def browseRules(requestOptions: SearchRulesOptions with BrowseOptions[Rule] with RequestOptions): ReadonlyPromisevoid = js.native
  
  def browseSynonyms(): ReadonlyPromisevoid = js.native
  def browseSynonyms(requestOptions: SearchSynonymsOptions with BrowseOptions[Synonym] with RequestOptions): ReadonlyPromisevoid = js.native
  
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
  
  def waitTask(taskID: Double): ReadonlyPromisevoid = js.native
  def waitTask(taskID: Double, requestOptions: RequestOptions): ReadonlyPromisevoid = js.native
}
