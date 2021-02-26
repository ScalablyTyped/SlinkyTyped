package typingsSlinky.algoliaClientSearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def ApiKeyACLEnum: typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaClientSearch.mod.ApiKeyACLType] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ApiKeyACLEnum").asInstanceOf[typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaClientSearch.mod.ApiKeyACLType]]
  
  @scala.inline
  def BatchActionEnum: typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaClientSearch.mod.BatchActionType] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("BatchActionEnum").asInstanceOf[typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaClientSearch.mod.BatchActionType]]
  
  type CreateIndex = js.Function2[
    /* indexName */ java.lang.String, 
    /* options */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.anon.Methods[
        org.scalablytyped.runtime.StringDictionary[
          js.Function1[
            /* base */ typingsSlinky.algoliaClientSearch.mod.SearchIndex, 
            js.Function1[/* args */ js.Any, js.Any]
          ]
        ]
      ]
    ], 
    typingsSlinky.algoliaClientSearch.mod.SearchIndex with typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.CreateIndex with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
  
  type HighlightResult[THit] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KAttribute in keyof THit ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @algolia/client-search.@algolia/client-search.HighlightResult<THit[KAttribute]> * / object}
    */ typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.HighlightResult with org.scalablytyped.runtime.TopLevel[js.Any]) | typingsSlinky.algoliaClientSearch.mod.HighlightMatch
  
  type Hit[THit] = THit with typingsSlinky.algoliaClientSearch.anon.DistinctSeqID[THit]
  
  @scala.inline
  def ScopeEnum: typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaClientSearch.mod.ScopeType] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ScopeEnum").asInstanceOf[typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaClientSearch.mod.ScopeType]]
  
  type SnippetResult[THit] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KAttribute in keyof THit ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @algolia/client-search.@algolia/client-search.SnippetResult<THit[KAttribute]> * / object}
    */ typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.SnippetResult with org.scalablytyped.runtime.TopLevel[js.Any]) | typingsSlinky.algoliaClientSearch.mod.SnippetMatch
  
  @scala.inline
  def StrategyEnum: typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaClientSearch.mod.StrategyType] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("StrategyEnum").asInstanceOf[typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaClientSearch.mod.StrategyType]]
  
  @scala.inline
  def SynonymEnum: typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaClientSearch.mod.SynonymType] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SynonymEnum").asInstanceOf[typingsSlinky.std.Record[java.lang.String, typingsSlinky.algoliaClientSearch.mod.SynonymType]]
  
  @scala.inline
  def addApiKey(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* acl */ js.Array[typingsSlinky.algoliaClientSearch.mod.ApiKeyACLType], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.AddApiKeyOptions with (typingsSlinky.std.Pick[
        typingsSlinky.algoliaTransporter.mod.RequestOptions, 
        java.lang.String | scala.Double
      ])
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseAd
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* acl */ js.Array[typingsSlinky.algoliaClientSearch.mod.ApiKeyACLType], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.AddApiKeyOptions with (typingsSlinky.std.Pick[
        typingsSlinky.algoliaTransporter.mod.RequestOptions, 
        java.lang.String | scala.Double
      ])
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseAd
  ]]
  
  @scala.inline
  def assignUserID(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function3[
    /* userID */ java.lang.String, 
    /* clusterName */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseAssignUser
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assignUserID")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* userID */ java.lang.String, 
    /* clusterName */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseAssignUser
  ]]
  
  @scala.inline
  def assignUserIDs(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function3[
    /* userIDs */ js.Array[java.lang.String], 
    /* clusterName */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseAssignUserCatch
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assignUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* userIDs */ js.Array[java.lang.String], 
    /* clusterName */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseAssignUserCatch
  ]]
  
  @scala.inline
  def batch(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* requests */ js.Array[typingsSlinky.algoliaClientSearch.mod.BatchRequest], 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseBa
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("batch")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* requests */ js.Array[typingsSlinky.algoliaClientSearch.mod.BatchRequest], 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseBa
  ]]
  
  @scala.inline
  def browseObjects(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SearchOptions with typingsSlinky.algoliaClientSearch.mod.BrowseOptions[_] with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("browseObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SearchOptions with typingsSlinky.algoliaClientSearch.mod.BrowseOptions[_] with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
  ]]
  
  @scala.inline
  def browseRules(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SearchRulesOptions with typingsSlinky.algoliaClientSearch.mod.BrowseOptions[typingsSlinky.algoliaClientSearch.mod.Rule] with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("browseRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SearchRulesOptions with typingsSlinky.algoliaClientSearch.mod.BrowseOptions[typingsSlinky.algoliaClientSearch.mod.Rule] with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
  ]]
  
  @scala.inline
  def browseSynonyms(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SearchSynonymsOptions with typingsSlinky.algoliaClientSearch.mod.BrowseOptions[typingsSlinky.algoliaClientSearch.mod.Synonym] with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("browseSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SearchSynonymsOptions with typingsSlinky.algoliaClientSearch.mod.BrowseOptions[typingsSlinky.algoliaClientSearch.mod.Synonym] with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
  ]]
  
  @scala.inline
  def chunkedBatch(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function3[
    /* bodies */ js.Array[js.Object], 
    /* action */ typingsSlinky.algoliaClientSearch.mod.BatchActionType, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chunkedBatch")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* bodies */ js.Array[js.Object], 
    /* action */ typingsSlinky.algoliaClientSearch.mod.BatchActionType, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
  ]]
  
  @scala.inline
  def clearObjects(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ]]
  
  @scala.inline
  def clearRules(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ClearRulesOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ClearRulesOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ]]
  
  @scala.inline
  def clearSynonyms(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.ClearSynonymsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.ClearSynonymsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ]]
  
  @scala.inline
  def copyIndex(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function3[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.CopyIndexOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyIndex")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.CopyIndexOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
  ]]
  
  @scala.inline
  def copyRules(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function3[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
  ]]
  
  @scala.inline
  def copySettings(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function3[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copySettings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
  ]]
  
  @scala.inline
  def copySynonyms(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function3[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copySynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
  ]]
  
  @scala.inline
  def createBrowsablePromise[TObject](
    options: typingsSlinky.algoliaClientSearch.anon.Request[TObject] with typingsSlinky.algoliaClientSearch.mod.BrowseOptions[TObject]
  ): typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBrowsablePromise")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid]
  
  @scala.inline
  def createMissingObjectIDError(): js.Error = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMissingObjectIDError")().asInstanceOf[js.Error]
  
  @scala.inline
  def createObjectNotFoundError(): js.Error = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createObjectNotFoundError")().asInstanceOf[js.Error]
  
  @scala.inline
  def createSearchClient: typingsSlinky.algoliaClientCommon.mod.CreateClient[
    typingsSlinky.algoliaClientSearch.mod.SearchClient, 
    typingsSlinky.algoliaClientSearch.mod.SearchClientOptions with typingsSlinky.algoliaClientCommon.mod.ClientTransporterOptions
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].selectDynamic("createSearchClient").asInstanceOf[typingsSlinky.algoliaClientCommon.mod.CreateClient[
    typingsSlinky.algoliaClientSearch.mod.SearchClient, 
    typingsSlinky.algoliaClientSearch.mod.SearchClientOptions with typingsSlinky.algoliaClientCommon.mod.ClientTransporterOptions
  ]]
  
  @scala.inline
  def createValidUntilNotFoundError(): js.Error = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createValidUntilNotFoundError")().asInstanceOf[js.Error]
  
  @scala.inline
  def deleteApiKey(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* apiKey */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDeCatch
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* apiKey */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDeCatch
  ]]
  
  @scala.inline
  def deleteBy(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* filters */ typingsSlinky.algoliaClientSearch.mod.DeleteByFiltersOptions, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteBy")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* filters */ typingsSlinky.algoliaClientSearch.mod.DeleteByFiltersOptions, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ]]
  
  @scala.inline
  def deleteIndex(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteIndex")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ]]
  
  @scala.inline
  def deleteObject(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ]]
  
  @scala.inline
  def deleteObjects(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* objectIDs */ js.Array[java.lang.String], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* objectIDs */ js.Array[java.lang.String], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
  ]]
  
  @scala.inline
  def deleteRule(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteRule")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ]]
  
  @scala.inline
  def deleteSynonym(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.DeleteSynonymOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteSynonym")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.DeleteSynonymOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
  ]]
  
  @scala.inline
  def exists(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseboolean
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exists")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseboolean
  ]]
  
  @scala.inline
  def findAnswers(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function3[
    /* query */ java.lang.String, 
    /* queryLanguages */ js.Array[java.lang.String], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.FindAnswersOptions
    ], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.FindAnswersResponse[_]]
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findAnswers")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* query */ java.lang.String, 
    /* queryLanguages */ js.Array[java.lang.String], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.FindAnswersOptions
    ], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.FindAnswersResponse[_]]
  ]]
  
  @scala.inline
  def findObject(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* callback */ js.Function1[
      /* object */ js.Any with typingsSlinky.algoliaClientSearch.mod.ObjectWithObjectID, 
      scala.Boolean
    ], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.FindObjectOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.FindObjectResponse[_]]
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* callback */ js.Function1[
      /* object */ js.Any with typingsSlinky.algoliaClientSearch.mod.ObjectWithObjectID, 
      scala.Boolean
    ], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.FindObjectOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.FindObjectResponse[_]]
  ]]
  
  @scala.inline
  def generateSecuredApiKey(): js.Function2[
    /* parentApiKey */ java.lang.String, 
    /* restrictions */ typingsSlinky.algoliaClientSearch.mod.SecuredApiKeyRestrictions, 
    java.lang.String
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecuredApiKey")().asInstanceOf[js.Function2[
    /* parentApiKey */ java.lang.String, 
    /* restrictions */ typingsSlinky.algoliaClientSearch.mod.SecuredApiKeyRestrictions, 
    java.lang.String
  ]]
  
  @scala.inline
  def getApiKey(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* apiKey */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseGetApiKeyR
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* apiKey */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseGetApiKeyR
  ]]
  
  @scala.inline
  def getLogs(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseGetLogsRes
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLogs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseGetLogsRes
  ]]
  
  @scala.inline
  def getObject(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.GetObjectOptions
    ], 
    js.Promise[js.Any with typingsSlinky.algoliaClientSearch.mod.ObjectWithObjectID]
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.GetObjectOptions
    ], 
    js.Promise[js.Any with typingsSlinky.algoliaClientSearch.mod.ObjectWithObjectID]
  ]]
  
  @scala.inline
  def getObjectPosition[TObject](): js.Function2[
    /* searchResponse */ typingsSlinky.algoliaClientSearch.mod.SearchResponse[TObject], 
    /* objectID */ java.lang.String, 
    scala.Double
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getObjectPosition")().asInstanceOf[js.Function2[
    /* searchResponse */ typingsSlinky.algoliaClientSearch.mod.SearchResponse[TObject], 
    /* objectID */ java.lang.String, 
    scala.Double
  ]]
  
  @scala.inline
  def getObjects(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* objectIDs */ js.Array[java.lang.String], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.GetObjectsOptions
    ], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.GetObjectsResponse[_]]
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* objectIDs */ js.Array[java.lang.String], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.GetObjectsOptions
    ], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.GetObjectsResponse[_]]
  ]]
  
  @scala.inline
  def getRule(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseRule
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getRule")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseRule
  ]]
  
  @scala.inline
  def getSecuredApiKeyRemainingValidity(): js.Function1[/* securedApiKey */ java.lang.String, scala.Double] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSecuredApiKeyRemainingValidity")().asInstanceOf[js.Function1[/* securedApiKey */ java.lang.String, scala.Double]]
  
  @scala.inline
  def getSettings(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSettings
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSettings
  ]]
  
  @scala.inline
  def getSynonym(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSynonym
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSynonym")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* objectID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSynonym
  ]]
  
  @scala.inline
  def getTask(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* taskID */ scala.Double, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseTaskStatus
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTask")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* taskID */ scala.Double, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseTaskStatus
  ]]
  
  @scala.inline
  def getTopUserIDs(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseGetTopUser
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTopUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseGetTopUser
  ]]
  
  @scala.inline
  def getUserID(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* userID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseUserIDResp
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUserID")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* userID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseUserIDResp
  ]]
  
  @scala.inline
  def hasPendingMappings(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.HasPendingMappingsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseHasPending
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasPendingMappings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.HasPendingMappingsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseHasPending
  ]]
  
  @scala.inline
  def initIndex(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): typingsSlinky.algoliaClientSearch.mod.CreateIndex = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initIndex")(base.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.algoliaClientSearch.mod.CreateIndex]
  
  @scala.inline
  def listApiKeys(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseListApiKey
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("listApiKeys")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseListApiKey
  ]]
  
  @scala.inline
  def listClusters(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseListCluste
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("listClusters")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseListCluste
  ]]
  
  @scala.inline
  def listIndices(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseListIndice
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("listIndices")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseListIndice
  ]]
  
  @scala.inline
  def listUserIDs(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.ListUserIDsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseListUserID
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("listUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.ListUserIDsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseListUserID
  ]]
  
  @scala.inline
  def moveIndex(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function3[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveIndex")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseIn
  ]]
  
  @scala.inline
  def multipleBatch(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* requests */ js.Array[typingsSlinky.algoliaClientSearch.mod.MultipleBatchRequest], 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseMu
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("multipleBatch")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* requests */ js.Array[typingsSlinky.algoliaClientSearch.mod.MultipleBatchRequest], 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseMu
  ]]
  
  @scala.inline
  def multipleGetObjects(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* requests */ js.Array[typingsSlinky.algoliaClientSearch.mod.MultipleGetObject], 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.MultipleGetObjectsResponse[_]]
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("multipleGetObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* requests */ js.Array[typingsSlinky.algoliaClientSearch.mod.MultipleGetObject], 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.MultipleGetObjectsResponse[_]]
  ]]
  
  @scala.inline
  def multipleQueries(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* queries */ js.Array[typingsSlinky.algoliaClientSearch.mod.MultipleQueriesQuery], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.MultipleQueriesOptions
    ], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.MultipleQueriesResponse[_]]
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("multipleQueries")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* queries */ js.Array[typingsSlinky.algoliaClientSearch.mod.MultipleQueriesQuery], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.MultipleQueriesOptions
    ], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.MultipleQueriesResponse[_]]
  ]]
  
  @scala.inline
  def multipleSearchForFacetValues(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* queries */ js.Array[typingsSlinky.algoliaClientSearch.anon.IndexName_], 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseArraySearc
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("multipleSearchForFacetValues")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* queries */ js.Array[typingsSlinky.algoliaClientSearch.anon.IndexName_], 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseArraySearc
  ]]
  
  @scala.inline
  def partialUpdateObject(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* object */ typingsSlinky.std.Record[java.lang.String, _], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions with typingsSlinky.algoliaClientSearch.mod.PartialUpdateObjectsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromisePa
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("partialUpdateObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* object */ typingsSlinky.std.Record[java.lang.String, _], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions with typingsSlinky.algoliaClientSearch.mod.PartialUpdateObjectsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromisePa
  ]]
  
  @scala.inline
  def partialUpdateObjects(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* objects */ js.Array[typingsSlinky.std.Record[java.lang.String, _]], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions with typingsSlinky.algoliaClientSearch.mod.PartialUpdateObjectsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("partialUpdateObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* objects */ js.Array[typingsSlinky.std.Record[java.lang.String, _]], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions with typingsSlinky.algoliaClientSearch.mod.PartialUpdateObjectsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
  ]]
  
  @scala.inline
  def removeUserID(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* userID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseRemoveUser
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeUserID")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* userID */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseRemoveUser
  ]]
  
  @scala.inline
  def replaceAllObjects(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* objects */ js.Array[typingsSlinky.std.Record[java.lang.String, _]], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.ReplaceAllObjectsOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions with typingsSlinky.algoliaClientSearch.mod.SaveObjectsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replaceAllObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* objects */ js.Array[typingsSlinky.std.Record[java.lang.String, _]], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.ReplaceAllObjectsOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions with typingsSlinky.algoliaClientSearch.mod.SaveObjectsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
  ]]
  
  @scala.inline
  def replaceAllRules(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* rules */ js.Array[typingsSlinky.algoliaClientSearch.mod.Rule], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SaveRulesOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSa
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replaceAllRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* rules */ js.Array[typingsSlinky.algoliaClientSearch.mod.Rule], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SaveRulesOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSa
  ]]
  
  @scala.inline
  def replaceAllSynonyms(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* synonyms */ js.Array[typingsSlinky.algoliaClientSearch.mod.Synonym], 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaClientSearch.anon.RequestOptionsPickSaveSyn], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replaceAllSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* synonyms */ js.Array[typingsSlinky.algoliaClientSearch.mod.Synonym], 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaClientSearch.anon.RequestOptionsPickSaveSyn], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch
  ]]
  
  @scala.inline
  def restoreApiKey(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* apiKey */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseRe
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("restoreApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* apiKey */ java.lang.String, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseRe
  ]]
  
  @scala.inline
  def saveObject(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* object */ typingsSlinky.std.Record[java.lang.String, _], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions with typingsSlinky.algoliaClientSearch.mod.SaveObjectsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaFinally
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* object */ typingsSlinky.std.Record[java.lang.String, _], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions with typingsSlinky.algoliaClientSearch.mod.SaveObjectsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaFinally
  ]]
  
  @scala.inline
  def saveObjects(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* objects */ js.Array[typingsSlinky.std.Record[java.lang.String, _]], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions with typingsSlinky.algoliaClientSearch.mod.SaveObjectsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveObjects")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* objects */ js.Array[typingsSlinky.std.Record[java.lang.String, _]], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.ChunkOptions with typingsSlinky.algoliaClientSearch.mod.SaveObjectsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
  ]]
  
  @scala.inline
  def saveRule(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* rule */ typingsSlinky.algoliaClientSearch.mod.Rule, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SaveRulesOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaThen
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveRule")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* rule */ typingsSlinky.algoliaClientSearch.mod.Rule, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SaveRulesOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaThen
  ]]
  
  @scala.inline
  def saveRules(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* rules */ js.Array[typingsSlinky.algoliaClientSearch.mod.Rule], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SaveRulesOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSa
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* rules */ js.Array[typingsSlinky.algoliaClientSearch.mod.Rule], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SaveRulesOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSa
  ]]
  
  @scala.inline
  def saveSynonym(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* synonym */ typingsSlinky.algoliaClientSearch.mod.Synonym, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SaveSynonymsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaWait
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveSynonym")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* synonym */ typingsSlinky.algoliaClientSearch.mod.Synonym, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SaveSynonymsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaWait
  ]]
  
  @scala.inline
  def saveSynonyms(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* synonyms */ js.Array[typingsSlinky.algoliaClientSearch.mod.Synonym], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SaveSynonymsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("saveSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* synonyms */ js.Array[typingsSlinky.algoliaClientSearch.mod.Synonym], 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SaveSynonymsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch
  ]]
  
  @scala.inline
  def search(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* query */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SearchOptions
    ], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.SearchResponse[_]]
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("search")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* query */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SearchOptions
    ], 
    js.Promise[typingsSlinky.algoliaClientSearch.mod.SearchResponse[_]]
  ]]
  
  @scala.inline
  def searchForFacetValues(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function3[
    /* facetName */ java.lang.String, 
    /* facetQuery */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SearchOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchForF
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("searchForFacetValues")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* facetName */ java.lang.String, 
    /* facetQuery */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SearchOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchForF
  ]]
  
  @scala.inline
  def searchRules(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* query */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SearchRulesOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchResp
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("searchRules")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* query */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SearchRulesOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchResp
  ]]
  
  @scala.inline
  def searchSynonyms(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* query */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SearchSynonymsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchSyno
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("searchSynonyms")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* query */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SearchSynonymsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchSyno
  ]]
  
  @scala.inline
  def searchUserIDs(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* query */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SearchUserIDsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchUser
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("searchUserIDs")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* query */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.SearchUserIDsOptions with typingsSlinky.algoliaTransporter.mod.RequestOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromiseSearchUser
  ]]
  
  @scala.inline
  def setSettings(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* settings */ typingsSlinky.algoliaClientSearch.mod.Settings, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SetSettingsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSe
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setSettings")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* settings */ typingsSlinky.algoliaClientSearch.mod.Settings, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaTransporter.mod.RequestOptions with typingsSlinky.algoliaClientSearch.mod.SetSettingsOptions
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseSe
  ]]
  
  @scala.inline
  def updateApiKey(base: typingsSlinky.algoliaClientSearch.mod.SearchClient): js.Function2[
    /* apiKey */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.UpdateApiKeyOptions with (typingsSlinky.std.Pick[
        typingsSlinky.algoliaTransporter.mod.RequestOptions, 
        java.lang.String | scala.Double
      ])
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseUp
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateApiKey")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* apiKey */ java.lang.String, 
    /* requestOptions */ js.UndefOr[
      typingsSlinky.algoliaClientSearch.mod.UpdateApiKeyOptions with (typingsSlinky.std.Pick[
        typingsSlinky.algoliaTransporter.mod.RequestOptions, 
        java.lang.String | scala.Double
      ])
    ], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyWaitablePromiseUp
  ]]
  
  @scala.inline
  def waitTask(base: typingsSlinky.algoliaClientSearch.mod.SearchIndex): js.Function2[
    /* taskID */ scala.Double, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
  ] = typingsSlinky.algoliaClientSearch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("waitTask")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* taskID */ scala.Double, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientSearch.anon.ReadonlyPromisevoid
  ]]
}
