package typingsSlinky.devtoolsProtocol.protocolMappingMod.ProtocolMapping

import typingsSlinky.devtoolsProtocol.anon.ParamsType
import typingsSlinky.devtoolsProtocol.anon.ParamsTypeReturnType
import typingsSlinky.devtoolsProtocol.anon.ParamsTypeReturnTypeCaptureSnapshotResponse
import typingsSlinky.devtoolsProtocol.anon.ParamsTypeReturnTypeGetCookiesResponse
import typingsSlinky.devtoolsProtocol.anon.ParamsTypeReturnTypeGetResponseBodyResponse
import typingsSlinky.devtoolsProtocol.anon.ParamsTypeReturnTypeGetSamplingProfileResponse
import typingsSlinky.devtoolsProtocol.anon.ParamsTypeReturnTypeVoid
import typingsSlinky.devtoolsProtocol.anon.ReturnType
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeAddRuleResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeAddScriptToEvaluateOnLoadResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeAddScriptToEvaluateOnNewDocumentResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeAddVirtualAuthenticatorResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeAttachToBrowserTargetResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeAttachToTargetResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeAwaitPromiseResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeBeginFrameResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCallFunctionOnResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCanClearBrowserCacheResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCanClearBrowserCookiesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCanEmulateNetworkConditionsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCanEmulateResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCaptureScreenshotResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCaptureSnapshotResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCloseTargetResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCollectClassNamesFromSubtreeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCollectClassNamesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCompileScriptResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCompositingReasonsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCopyToResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCreateBrowserContextResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCreateIsolatedWorldResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCreateStyleSheetResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeCreateTargetResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeDescribeNodeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeEvaluateOnCallFrameResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeEvaluateResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeExecuteSQLResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeExecuteWasmEvaluatorResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetAllCookiesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetAllTimeSamplingProfileResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetAppManifestResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetApplicationCacheForFrameResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetAttributesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetBackgroundColorsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetBestEffortCoverageResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetBoxModelResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetBrowserCommandLineResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetBrowserContextsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetBrowserSamplingProfileResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetCategoriesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetCertificateResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetComputedStyleForNodeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetContentQuadsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetCookiesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetCredentialResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetCredentialsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetCurrentTimeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetDOMCountersResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetDOMStorageItemsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetDatabaseTableNamesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetDocumentResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetDomainsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetEncodedResponseResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetEventListenersResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetFileInfoResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetFlattenedDocumentResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetFrameOwnerResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetFrameTreeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetFramesWithManifestsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetFullAXTreeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetHeapObjectIdResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetHeapUsageResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetHighlightObjectForTestResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetHistogramResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetHistogramsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetInfoResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetInlineStylesForNodeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetInstallabilityErrorsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetIsolateIdResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetLayoutMetricsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetManifestForFrameResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetManifestIconsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetMatchedStylesForNodeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetMediaQueriesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetMetadataResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetMetricsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetNavigationHistoryResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetNodeForLocationResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetNodeStackTracesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetObjectByHeapObjectIdResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetOuterHTMLResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetPartialAXTreeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetPlatformFontsForNodeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetPlaybackRateResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetPossibleBreakpointsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetProcessInfoResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetPropertiesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetRealtimeDataResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetRelayoutBoundaryResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetRequestPostDataResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetResourceContentResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetResourceTreeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetResponseBodyForInterceptionResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetResponseBodyResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetRuntimeCallStatsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetSamplingProfileResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetScriptSourceResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetSearchResultsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetSnapshotResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetStackTraceResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetStyleSheetTextResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetTargetInfoResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetTargetsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetUsageAndQuotaResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetVersionResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetWasmBytecodeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetWindowBoundsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGetWindowForTargetResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeGlobalLexicalScopeNamesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeLoadSnapshotResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeMakeSnapshotResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeMoveToResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeNavigateResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypePerformSearchResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypePrintToPDFResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeProfileSnapshotResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypePushNodeByPathToFrontendResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypePushNodesByBackendIdsToFrontendResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeQueryObjectsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeQuerySelectorAllResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeQuerySelectorResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeReadResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeReplaySnapshotResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeRequestCacheNamesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeRequestCachedResponseResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeRequestDataResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeRequestDatabaseNamesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeRequestDatabaseResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeRequestEntriesResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeRequestMemoryDumpResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeRequestNodeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeResolveAnimationResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeResolveBlobResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeResolveNodeResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeRestartFrameResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeRunScriptResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSearchInContentResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSearchInResourceResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSearchInResponseBodyResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetBreakpointByUrlResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetBreakpointOnFunctionCallResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetBreakpointResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetCookieResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetInstrumentationBreakpointResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetKeyframeKeyResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetMediaTextResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetNodeNameResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetRuleSelectorResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetScriptSourceResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetStyleSheetTextResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetStyleTextsResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSetVirtualTimePolicyResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeSnapshotCommandLogResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeStartPreciseCoverageResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeStopResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeStopRuleUsageTrackingResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeStopSamplingResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeTakeCoverageDeltaResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeTakePreciseCoverageResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeTakeResponseBodyAsStreamResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeTakeTypeProfileResponse
import typingsSlinky.devtoolsProtocol.anon.ReturnTypeVoid
import typingsSlinky.devtoolsProtocol.anon.`0`
import typingsSlinky.devtoolsProtocol.anon.`100`
import typingsSlinky.devtoolsProtocol.anon.`101`
import typingsSlinky.devtoolsProtocol.anon.`102`
import typingsSlinky.devtoolsProtocol.anon.`103`
import typingsSlinky.devtoolsProtocol.anon.`104`
import typingsSlinky.devtoolsProtocol.anon.`105`
import typingsSlinky.devtoolsProtocol.anon.`106`
import typingsSlinky.devtoolsProtocol.anon.`107`
import typingsSlinky.devtoolsProtocol.anon.`108`
import typingsSlinky.devtoolsProtocol.anon.`109`
import typingsSlinky.devtoolsProtocol.anon.`10`
import typingsSlinky.devtoolsProtocol.anon.`110`
import typingsSlinky.devtoolsProtocol.anon.`111`
import typingsSlinky.devtoolsProtocol.anon.`112`
import typingsSlinky.devtoolsProtocol.anon.`113`
import typingsSlinky.devtoolsProtocol.anon.`114`
import typingsSlinky.devtoolsProtocol.anon.`115`
import typingsSlinky.devtoolsProtocol.anon.`116`
import typingsSlinky.devtoolsProtocol.anon.`117`
import typingsSlinky.devtoolsProtocol.anon.`118`
import typingsSlinky.devtoolsProtocol.anon.`119`
import typingsSlinky.devtoolsProtocol.anon.`11`
import typingsSlinky.devtoolsProtocol.anon.`120`
import typingsSlinky.devtoolsProtocol.anon.`121`
import typingsSlinky.devtoolsProtocol.anon.`122`
import typingsSlinky.devtoolsProtocol.anon.`123`
import typingsSlinky.devtoolsProtocol.anon.`124`
import typingsSlinky.devtoolsProtocol.anon.`125`
import typingsSlinky.devtoolsProtocol.anon.`126`
import typingsSlinky.devtoolsProtocol.anon.`127`
import typingsSlinky.devtoolsProtocol.anon.`128`
import typingsSlinky.devtoolsProtocol.anon.`129`
import typingsSlinky.devtoolsProtocol.anon.`12`
import typingsSlinky.devtoolsProtocol.anon.`130`
import typingsSlinky.devtoolsProtocol.anon.`131`
import typingsSlinky.devtoolsProtocol.anon.`132`
import typingsSlinky.devtoolsProtocol.anon.`133`
import typingsSlinky.devtoolsProtocol.anon.`134`
import typingsSlinky.devtoolsProtocol.anon.`135`
import typingsSlinky.devtoolsProtocol.anon.`136`
import typingsSlinky.devtoolsProtocol.anon.`137`
import typingsSlinky.devtoolsProtocol.anon.`138`
import typingsSlinky.devtoolsProtocol.anon.`139`
import typingsSlinky.devtoolsProtocol.anon.`13`
import typingsSlinky.devtoolsProtocol.anon.`140`
import typingsSlinky.devtoolsProtocol.anon.`141`
import typingsSlinky.devtoolsProtocol.anon.`142`
import typingsSlinky.devtoolsProtocol.anon.`143`
import typingsSlinky.devtoolsProtocol.anon.`144`
import typingsSlinky.devtoolsProtocol.anon.`145`
import typingsSlinky.devtoolsProtocol.anon.`146`
import typingsSlinky.devtoolsProtocol.anon.`147`
import typingsSlinky.devtoolsProtocol.anon.`148`
import typingsSlinky.devtoolsProtocol.anon.`149`
import typingsSlinky.devtoolsProtocol.anon.`14`
import typingsSlinky.devtoolsProtocol.anon.`150`
import typingsSlinky.devtoolsProtocol.anon.`151`
import typingsSlinky.devtoolsProtocol.anon.`152`
import typingsSlinky.devtoolsProtocol.anon.`153`
import typingsSlinky.devtoolsProtocol.anon.`154`
import typingsSlinky.devtoolsProtocol.anon.`155`
import typingsSlinky.devtoolsProtocol.anon.`156`
import typingsSlinky.devtoolsProtocol.anon.`157`
import typingsSlinky.devtoolsProtocol.anon.`158`
import typingsSlinky.devtoolsProtocol.anon.`159`
import typingsSlinky.devtoolsProtocol.anon.`15`
import typingsSlinky.devtoolsProtocol.anon.`160`
import typingsSlinky.devtoolsProtocol.anon.`161`
import typingsSlinky.devtoolsProtocol.anon.`162`
import typingsSlinky.devtoolsProtocol.anon.`163`
import typingsSlinky.devtoolsProtocol.anon.`164`
import typingsSlinky.devtoolsProtocol.anon.`165`
import typingsSlinky.devtoolsProtocol.anon.`166`
import typingsSlinky.devtoolsProtocol.anon.`167`
import typingsSlinky.devtoolsProtocol.anon.`168`
import typingsSlinky.devtoolsProtocol.anon.`169`
import typingsSlinky.devtoolsProtocol.anon.`16`
import typingsSlinky.devtoolsProtocol.anon.`170`
import typingsSlinky.devtoolsProtocol.anon.`171`
import typingsSlinky.devtoolsProtocol.anon.`172`
import typingsSlinky.devtoolsProtocol.anon.`173`
import typingsSlinky.devtoolsProtocol.anon.`174`
import typingsSlinky.devtoolsProtocol.anon.`175`
import typingsSlinky.devtoolsProtocol.anon.`176`
import typingsSlinky.devtoolsProtocol.anon.`177`
import typingsSlinky.devtoolsProtocol.anon.`178`
import typingsSlinky.devtoolsProtocol.anon.`179`
import typingsSlinky.devtoolsProtocol.anon.`17`
import typingsSlinky.devtoolsProtocol.anon.`180`
import typingsSlinky.devtoolsProtocol.anon.`181`
import typingsSlinky.devtoolsProtocol.anon.`182`
import typingsSlinky.devtoolsProtocol.anon.`183`
import typingsSlinky.devtoolsProtocol.anon.`184`
import typingsSlinky.devtoolsProtocol.anon.`185`
import typingsSlinky.devtoolsProtocol.anon.`186`
import typingsSlinky.devtoolsProtocol.anon.`187`
import typingsSlinky.devtoolsProtocol.anon.`188`
import typingsSlinky.devtoolsProtocol.anon.`189`
import typingsSlinky.devtoolsProtocol.anon.`18`
import typingsSlinky.devtoolsProtocol.anon.`190`
import typingsSlinky.devtoolsProtocol.anon.`191`
import typingsSlinky.devtoolsProtocol.anon.`192`
import typingsSlinky.devtoolsProtocol.anon.`193`
import typingsSlinky.devtoolsProtocol.anon.`194`
import typingsSlinky.devtoolsProtocol.anon.`195`
import typingsSlinky.devtoolsProtocol.anon.`196`
import typingsSlinky.devtoolsProtocol.anon.`197`
import typingsSlinky.devtoolsProtocol.anon.`198`
import typingsSlinky.devtoolsProtocol.anon.`199`
import typingsSlinky.devtoolsProtocol.anon.`19`
import typingsSlinky.devtoolsProtocol.anon.`1`
import typingsSlinky.devtoolsProtocol.anon.`200`
import typingsSlinky.devtoolsProtocol.anon.`201`
import typingsSlinky.devtoolsProtocol.anon.`202`
import typingsSlinky.devtoolsProtocol.anon.`203`
import typingsSlinky.devtoolsProtocol.anon.`20`
import typingsSlinky.devtoolsProtocol.anon.`21`
import typingsSlinky.devtoolsProtocol.anon.`22`
import typingsSlinky.devtoolsProtocol.anon.`23`
import typingsSlinky.devtoolsProtocol.anon.`24`
import typingsSlinky.devtoolsProtocol.anon.`25`
import typingsSlinky.devtoolsProtocol.anon.`26`
import typingsSlinky.devtoolsProtocol.anon.`27`
import typingsSlinky.devtoolsProtocol.anon.`28`
import typingsSlinky.devtoolsProtocol.anon.`29`
import typingsSlinky.devtoolsProtocol.anon.`2`
import typingsSlinky.devtoolsProtocol.anon.`30`
import typingsSlinky.devtoolsProtocol.anon.`31`
import typingsSlinky.devtoolsProtocol.anon.`32`
import typingsSlinky.devtoolsProtocol.anon.`33`
import typingsSlinky.devtoolsProtocol.anon.`34`
import typingsSlinky.devtoolsProtocol.anon.`35`
import typingsSlinky.devtoolsProtocol.anon.`36`
import typingsSlinky.devtoolsProtocol.anon.`37`
import typingsSlinky.devtoolsProtocol.anon.`38`
import typingsSlinky.devtoolsProtocol.anon.`39`
import typingsSlinky.devtoolsProtocol.anon.`3`
import typingsSlinky.devtoolsProtocol.anon.`40`
import typingsSlinky.devtoolsProtocol.anon.`41`
import typingsSlinky.devtoolsProtocol.anon.`42`
import typingsSlinky.devtoolsProtocol.anon.`43`
import typingsSlinky.devtoolsProtocol.anon.`44`
import typingsSlinky.devtoolsProtocol.anon.`45`
import typingsSlinky.devtoolsProtocol.anon.`46`
import typingsSlinky.devtoolsProtocol.anon.`47`
import typingsSlinky.devtoolsProtocol.anon.`48`
import typingsSlinky.devtoolsProtocol.anon.`49`
import typingsSlinky.devtoolsProtocol.anon.`4`
import typingsSlinky.devtoolsProtocol.anon.`50`
import typingsSlinky.devtoolsProtocol.anon.`51`
import typingsSlinky.devtoolsProtocol.anon.`52`
import typingsSlinky.devtoolsProtocol.anon.`53`
import typingsSlinky.devtoolsProtocol.anon.`54`
import typingsSlinky.devtoolsProtocol.anon.`55`
import typingsSlinky.devtoolsProtocol.anon.`56`
import typingsSlinky.devtoolsProtocol.anon.`57`
import typingsSlinky.devtoolsProtocol.anon.`58`
import typingsSlinky.devtoolsProtocol.anon.`59`
import typingsSlinky.devtoolsProtocol.anon.`5`
import typingsSlinky.devtoolsProtocol.anon.`60`
import typingsSlinky.devtoolsProtocol.anon.`61`
import typingsSlinky.devtoolsProtocol.anon.`62`
import typingsSlinky.devtoolsProtocol.anon.`63`
import typingsSlinky.devtoolsProtocol.anon.`64`
import typingsSlinky.devtoolsProtocol.anon.`65`
import typingsSlinky.devtoolsProtocol.anon.`66`
import typingsSlinky.devtoolsProtocol.anon.`67`
import typingsSlinky.devtoolsProtocol.anon.`68`
import typingsSlinky.devtoolsProtocol.anon.`69`
import typingsSlinky.devtoolsProtocol.anon.`6`
import typingsSlinky.devtoolsProtocol.anon.`70`
import typingsSlinky.devtoolsProtocol.anon.`71`
import typingsSlinky.devtoolsProtocol.anon.`72`
import typingsSlinky.devtoolsProtocol.anon.`73`
import typingsSlinky.devtoolsProtocol.anon.`74`
import typingsSlinky.devtoolsProtocol.anon.`75`
import typingsSlinky.devtoolsProtocol.anon.`76`
import typingsSlinky.devtoolsProtocol.anon.`77`
import typingsSlinky.devtoolsProtocol.anon.`78`
import typingsSlinky.devtoolsProtocol.anon.`79`
import typingsSlinky.devtoolsProtocol.anon.`7`
import typingsSlinky.devtoolsProtocol.anon.`80`
import typingsSlinky.devtoolsProtocol.anon.`81`
import typingsSlinky.devtoolsProtocol.anon.`82`
import typingsSlinky.devtoolsProtocol.anon.`83`
import typingsSlinky.devtoolsProtocol.anon.`84`
import typingsSlinky.devtoolsProtocol.anon.`85`
import typingsSlinky.devtoolsProtocol.anon.`86`
import typingsSlinky.devtoolsProtocol.anon.`87`
import typingsSlinky.devtoolsProtocol.anon.`88`
import typingsSlinky.devtoolsProtocol.anon.`89`
import typingsSlinky.devtoolsProtocol.anon.`8`
import typingsSlinky.devtoolsProtocol.anon.`90`
import typingsSlinky.devtoolsProtocol.anon.`91`
import typingsSlinky.devtoolsProtocol.anon.`92`
import typingsSlinky.devtoolsProtocol.anon.`93`
import typingsSlinky.devtoolsProtocol.anon.`94`
import typingsSlinky.devtoolsProtocol.anon.`95`
import typingsSlinky.devtoolsProtocol.anon.`96`
import typingsSlinky.devtoolsProtocol.anon.`97`
import typingsSlinky.devtoolsProtocol.anon.`98`
import typingsSlinky.devtoolsProtocol.anon.`99`
import typingsSlinky.devtoolsProtocol.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commands extends js.Object {
  
  /**
    * Disables the accessibility domain.
    */
  @JSName("Accessibility.disable")
  var AccessibilityDotdisable: ParamsType = js.native
  
  /**
    * Enables the accessibility domain which causes `AXNodeId`s to remain consistent between method calls.
    * This turns on accessibility for the page, which can impact performance until accessibility is disabled.
    */
  @JSName("Accessibility.enable")
  var AccessibilityDotenable: ParamsType = js.native
  
  /**
    * Fetches the entire accessibility tree
    */
  @JSName("Accessibility.getFullAXTree")
  var AccessibilityDotgetFullAXTree: ReturnTypeGetFullAXTreeResponse = js.native
  
  /**
    * Fetches the accessibility node and partial accessibility tree for this DOM node, if it exists.
    */
  @JSName("Accessibility.getPartialAXTree")
  var AccessibilityDotgetPartialAXTree: ReturnTypeGetPartialAXTreeResponse = js.native
  
  /**
    * Disables animation domain notifications.
    */
  @JSName("Animation.disable")
  var AnimationDotdisable: ParamsType = js.native
  
  /**
    * Enables animation domain notifications.
    */
  @JSName("Animation.enable")
  var AnimationDotenable: ParamsType = js.native
  
  /**
    * Returns the current time of the an animation.
    */
  @JSName("Animation.getCurrentTime")
  var AnimationDotgetCurrentTime: ReturnTypeGetCurrentTimeResponse = js.native
  
  /**
    * Gets the playback rate of the document timeline.
    */
  @JSName("Animation.getPlaybackRate")
  var AnimationDotgetPlaybackRate: ReturnTypeGetPlaybackRateResponse = js.native
  
  /**
    * Releases a set of animations to no longer be manipulated.
    */
  @JSName("Animation.releaseAnimations")
  var AnimationDotreleaseAnimations: `23` = js.native
  
  /**
    * Gets the remote object of the Animation.
    */
  @JSName("Animation.resolveAnimation")
  var AnimationDotresolveAnimation: ReturnTypeResolveAnimationResponse = js.native
  
  /**
    * Seek a set of animations to a particular time within each animation.
    */
  @JSName("Animation.seekAnimations")
  var AnimationDotseekAnimations: `24` = js.native
  
  /**
    * Sets the paused state of a set of animations.
    */
  @JSName("Animation.setPaused")
  var AnimationDotsetPaused: `25` = js.native
  
  /**
    * Sets the playback rate of the document timeline.
    */
  @JSName("Animation.setPlaybackRate")
  var AnimationDotsetPlaybackRate: `26` = js.native
  
  /**
    * Sets the timing of an animation node.
    */
  @JSName("Animation.setTiming")
  var AnimationDotsetTiming: `27` = js.native
  
  /**
    * Enables application cache domain notifications.
    */
  @JSName("ApplicationCache.enable")
  var ApplicationCacheDotenable: ParamsType = js.native
  
  /**
    * Returns relevant application cache data for the document in given frame.
    */
  @JSName("ApplicationCache.getApplicationCacheForFrame")
  var ApplicationCacheDotgetApplicationCacheForFrame: ReturnTypeGetApplicationCacheForFrameResponse = js.native
  
  /**
    * Returns array of frame identifiers with manifest urls for each frame containing a document
    * associated with some application cache.
    */
  @JSName("ApplicationCache.getFramesWithManifests")
  var ApplicationCacheDotgetFramesWithManifests: ReturnTypeGetFramesWithManifestsResponse = js.native
  
  /**
    * Returns manifest URL for document in the given frame.
    */
  @JSName("ApplicationCache.getManifestForFrame")
  var ApplicationCacheDotgetManifestForFrame: ReturnTypeGetManifestForFrameResponse = js.native
  
  /**
    * Disables issues domain, prevents further issues from being reported to the client.
    */
  @JSName("Audits.disable")
  var AuditsDotdisable: ParamsType = js.native
  
  /**
    * Enables issues domain, sends the issues collected so far to the client by means of the
    * `issueAdded` event.
    */
  @JSName("Audits.enable")
  var AuditsDotenable: ParamsType = js.native
  
  /**
    * Returns the response body and size if it were re-encoded with the specified settings. Only
    * applies to images.
    */
  @JSName("Audits.getEncodedResponse")
  var AuditsDotgetEncodedResponse: ReturnTypeGetEncodedResponseResponse = js.native
  
  /**
    * Clears all stored data for the service.
    */
  @JSName("BackgroundService.clearEvents")
  var BackgroundServiceDotclearEvents: `31` = js.native
  
  /**
    * Set the recording state for the service.
    */
  @JSName("BackgroundService.setRecording")
  var BackgroundServiceDotsetRecording: `30` = js.native
  
  /**
    * Enables event updates for the service.
    */
  @JSName("BackgroundService.startObserving")
  var BackgroundServiceDotstartObserving: `28` = js.native
  
  /**
    * Disables event updates for the service.
    */
  @JSName("BackgroundService.stopObserving")
  var BackgroundServiceDotstopObserving: `29` = js.native
  
  /**
    * Close browser gracefully.
    */
  @JSName("Browser.close")
  var BrowserDotclose: ParamsType = js.native
  
  /**
    * Crashes browser on the main thread.
    */
  @JSName("Browser.crash")
  var BrowserDotcrash: ParamsType = js.native
  
  /**
    * Crashes GPU process.
    */
  @JSName("Browser.crashGpuProcess")
  var BrowserDotcrashGpuProcess: ParamsType = js.native
  
  /**
    * Returns the command line switches for the browser process if, and only if
    * --enable-automation is on the commandline.
    */
  @JSName("Browser.getBrowserCommandLine")
  var BrowserDotgetBrowserCommandLine: ReturnTypeGetBrowserCommandLineResponse = js.native
  
  /**
    * Get a Chrome histogram by name.
    */
  @JSName("Browser.getHistogram")
  var BrowserDotgetHistogram: ReturnTypeGetHistogramResponse = js.native
  
  /**
    * Get Chrome histograms.
    */
  @JSName("Browser.getHistograms")
  var BrowserDotgetHistograms: ReturnTypeGetHistogramsResponse = js.native
  
  /**
    * Returns version information.
    */
  @JSName("Browser.getVersion")
  var BrowserDotgetVersion: ReturnTypeGetVersionResponse = js.native
  
  /**
    * Get position and size of the browser window.
    */
  @JSName("Browser.getWindowBounds")
  var BrowserDotgetWindowBounds: ReturnTypeGetWindowBoundsResponse = js.native
  
  /**
    * Get the browser window that contains the devtools target.
    */
  @JSName("Browser.getWindowForTarget")
  var BrowserDotgetWindowForTarget: ReturnTypeGetWindowForTargetResponse = js.native
  
  /**
    * Grant specific permissions to the given origin and reject all others.
    */
  @JSName("Browser.grantPermissions")
  var BrowserDotgrantPermissions: `33` = js.native
  
  /**
    * Reset all permission management for all origins.
    */
  @JSName("Browser.resetPermissions")
  var BrowserDotresetPermissions: `34` = js.native
  
  /**
    * Set dock tile details, platform-specific.
    */
  @JSName("Browser.setDockTile")
  var BrowserDotsetDockTile: `37` = js.native
  
  /**
    * Set the behavior when downloading a file.
    */
  @JSName("Browser.setDownloadBehavior")
  var BrowserDotsetDownloadBehavior: `35` = js.native
  
  /**
    * Set permission settings for given origin.
    */
  @JSName("Browser.setPermission")
  var BrowserDotsetPermission: `32` = js.native
  
  /**
    * Set position and/or size of the browser window.
    */
  @JSName("Browser.setWindowBounds")
  var BrowserDotsetWindowBounds: `36` = js.native
  
  /**
    * Inserts a new rule with the given `ruleText` in a stylesheet with given `styleSheetId`, at the
    * position specified by `location`.
    */
  @JSName("CSS.addRule")
  var CSSDotaddRule: ReturnTypeAddRuleResponse = js.native
  
  /**
    * Returns all class names from specified stylesheet.
    */
  @JSName("CSS.collectClassNames")
  var CSSDotcollectClassNames: ReturnTypeCollectClassNamesResponse = js.native
  
  /**
    * Creates a new special "via-inspector" stylesheet in the frame with given `frameId`.
    */
  @JSName("CSS.createStyleSheet")
  var CSSDotcreateStyleSheet: ReturnTypeCreateStyleSheetResponse = js.native
  
  /**
    * Disables the CSS agent for the given page.
    */
  @JSName("CSS.disable")
  var CSSDotdisable: ParamsType = js.native
  
  /**
    * Enables the CSS agent for the given page. Clients should not assume that the CSS agent has been
    * enabled until the result of this command is received.
    */
  @JSName("CSS.enable")
  var CSSDotenable: ParamsType = js.native
  
  /**
    * Ensures that the given node will have specified pseudo-classes whenever its style is computed by
    * the browser.
    */
  @JSName("CSS.forcePseudoState")
  var CSSDotforcePseudoState: `38` = js.native
  
  @JSName("CSS.getBackgroundColors")
  var CSSDotgetBackgroundColors: ReturnTypeGetBackgroundColorsResponse = js.native
  
  /**
    * Returns the computed style for a DOM node identified by `nodeId`.
    */
  @JSName("CSS.getComputedStyleForNode")
  var CSSDotgetComputedStyleForNode: ReturnTypeGetComputedStyleForNodeResponse = js.native
  
  /**
    * Returns the styles defined inline (explicitly in the "style" attribute and implicitly, using DOM
    * attributes) for a DOM node identified by `nodeId`.
    */
  @JSName("CSS.getInlineStylesForNode")
  var CSSDotgetInlineStylesForNode: ReturnTypeGetInlineStylesForNodeResponse = js.native
  
  /**
    * Returns requested styles for a DOM node identified by `nodeId`.
    */
  @JSName("CSS.getMatchedStylesForNode")
  var CSSDotgetMatchedStylesForNode: ReturnTypeGetMatchedStylesForNodeResponse = js.native
  
  /**
    * Returns all media queries parsed by the rendering engine.
    */
  @JSName("CSS.getMediaQueries")
  var CSSDotgetMediaQueries: ReturnTypeGetMediaQueriesResponse = js.native
  
  /**
    * Requests information about platform fonts which we used to render child TextNodes in the given
    * node.
    */
  @JSName("CSS.getPlatformFontsForNode")
  var CSSDotgetPlatformFontsForNode: ReturnTypeGetPlatformFontsForNodeResponse = js.native
  
  /**
    * Returns the current textual content for a stylesheet.
    */
  @JSName("CSS.getStyleSheetText")
  var CSSDotgetStyleSheetText: ReturnTypeGetStyleSheetTextResponse = js.native
  
  /**
    * Find a rule with the given active property for the given node and set the new value for this
    * property
    */
  @JSName("CSS.setEffectivePropertyValueForNode")
  var CSSDotsetEffectivePropertyValueForNode: `39` = js.native
  
  /**
    * Modifies the keyframe rule key text.
    */
  @JSName("CSS.setKeyframeKey")
  var CSSDotsetKeyframeKey: ReturnTypeSetKeyframeKeyResponse = js.native
  
  /**
    * Modifies the rule selector.
    */
  @JSName("CSS.setMediaText")
  var CSSDotsetMediaText: ReturnTypeSetMediaTextResponse = js.native
  
  /**
    * Modifies the rule selector.
    */
  @JSName("CSS.setRuleSelector")
  var CSSDotsetRuleSelector: ReturnTypeSetRuleSelectorResponse = js.native
  
  /**
    * Sets the new stylesheet text.
    */
  @JSName("CSS.setStyleSheetText")
  var CSSDotsetStyleSheetText: ReturnTypeSetStyleSheetTextResponse = js.native
  
  /**
    * Applies specified style edits one after another in the given order.
    */
  @JSName("CSS.setStyleTexts")
  var CSSDotsetStyleTexts: ReturnTypeSetStyleTextsResponse = js.native
  
  /**
    * Enables the selector recording.
    */
  @JSName("CSS.startRuleUsageTracking")
  var CSSDotstartRuleUsageTracking: ParamsType = js.native
  
  /**
    * Stop tracking rule usage and return the list of rules that were used since last call to
    * `takeCoverageDelta` (or since start of coverage instrumentation)
    */
  @JSName("CSS.stopRuleUsageTracking")
  var CSSDotstopRuleUsageTracking: ReturnTypeStopRuleUsageTrackingResponse = js.native
  
  /**
    * Obtain list of rules that became used since last call to this method (or since start of coverage
    * instrumentation)
    */
  @JSName("CSS.takeCoverageDelta")
  var CSSDottakeCoverageDelta: ReturnTypeTakeCoverageDeltaResponse = js.native
  
  /**
    * Deletes a cache.
    */
  @JSName("CacheStorage.deleteCache")
  var CacheStorageDotdeleteCache: `40` = js.native
  
  /**
    * Deletes a cache entry.
    */
  @JSName("CacheStorage.deleteEntry")
  var CacheStorageDotdeleteEntry: `41` = js.native
  
  /**
    * Requests cache names.
    */
  @JSName("CacheStorage.requestCacheNames")
  var CacheStorageDotrequestCacheNames: ReturnTypeRequestCacheNamesResponse = js.native
  
  /**
    * Fetches cache entry.
    */
  @JSName("CacheStorage.requestCachedResponse")
  var CacheStorageDotrequestCachedResponse: ReturnTypeRequestCachedResponseResponse = js.native
  
  /**
    * Requests data from cache.
    */
  @JSName("CacheStorage.requestEntries")
  var CacheStorageDotrequestEntries: ReturnTypeRequestEntriesResponse = js.native
  
  /**
    * Stops observing for sinks and issues.
    */
  @JSName("Cast.disable")
  var CastDotdisable: ParamsType = js.native
  
  /**
    * Starts observing for sinks that can be used for tab mirroring, and if set,
    * sinks compatible with |presentationUrl| as well. When sinks are found, a
    * |sinksUpdated| event is fired.
    * Also starts observing for issue messages. When an issue is added or removed,
    * an |issueUpdated| event is fired.
    */
  @JSName("Cast.enable")
  var CastDotenable: `42` = js.native
  
  /**
    * Sets a sink to be used when the web page requests the browser to choose a
    * sink via Presentation API, Remote Playback API, or Cast SDK.
    */
  @JSName("Cast.setSinkToUse")
  var CastDotsetSinkToUse: `43` = js.native
  
  /**
    * Starts mirroring the tab to the sink.
    */
  @JSName("Cast.startTabMirroring")
  var CastDotstartTabMirroring: `44` = js.native
  
  /**
    * Stops the active Cast session on the sink.
    */
  @JSName("Cast.stopCasting")
  var CastDotstopCasting: `45` = js.native
  
  /**
    * Does nothing.
    */
  @JSName("Console.clearMessages")
  var ConsoleDotclearMessages: ParamsType = js.native
  
  /**
    * Disables console domain, prevents further console messages from being reported to the client.
    */
  @JSName("Console.disable")
  var ConsoleDotdisable: ParamsType = js.native
  
  /**
    * Enables console domain, sends the messages collected so far to the client by means of the
    * `messageAdded` notification.
    */
  @JSName("Console.enable")
  var ConsoleDotenable: ParamsType = js.native
  
  /**
    * Returns event listeners of the given object.
    */
  @JSName("DOMDebugger.getEventListeners")
  var DOMDebuggerDotgetEventListeners: ReturnTypeGetEventListenersResponse = js.native
  
  /**
    * Removes DOM breakpoint that was set using `setDOMBreakpoint`.
    */
  @JSName("DOMDebugger.removeDOMBreakpoint")
  var DOMDebuggerDotremoveDOMBreakpoint: `59` = js.native
  
  /**
    * Removes breakpoint on particular DOM event.
    */
  @JSName("DOMDebugger.removeEventListenerBreakpoint")
  var DOMDebuggerDotremoveEventListenerBreakpoint: `60` = js.native
  
  /**
    * Removes breakpoint on particular native event.
    */
  @JSName("DOMDebugger.removeInstrumentationBreakpoint")
  var DOMDebuggerDotremoveInstrumentationBreakpoint: `61` = js.native
  
  /**
    * Removes breakpoint from XMLHttpRequest.
    */
  @JSName("DOMDebugger.removeXHRBreakpoint")
  var DOMDebuggerDotremoveXHRBreakpoint: `62` = js.native
  
  /**
    * Sets breakpoint on particular operation with DOM.
    */
  @JSName("DOMDebugger.setDOMBreakpoint")
  var DOMDebuggerDotsetDOMBreakpoint: `63` = js.native
  
  /**
    * Sets breakpoint on particular DOM event.
    */
  @JSName("DOMDebugger.setEventListenerBreakpoint")
  var DOMDebuggerDotsetEventListenerBreakpoint: `64` = js.native
  
  /**
    * Sets breakpoint on particular native event.
    */
  @JSName("DOMDebugger.setInstrumentationBreakpoint")
  var DOMDebuggerDotsetInstrumentationBreakpoint: `65` = js.native
  
  /**
    * Sets breakpoint on XMLHttpRequest.
    */
  @JSName("DOMDebugger.setXHRBreakpoint")
  var DOMDebuggerDotsetXHRBreakpoint: `66` = js.native
  
  /**
    * Collects class names for the node with given id and all of it's child nodes.
    */
  @JSName("DOM.collectClassNamesFromSubtree")
  var DOMDotcollectClassNamesFromSubtree: ReturnTypeCollectClassNamesFromSubtreeResponse = js.native
  
  /**
    * Creates a deep copy of the specified node and places it into the target container before the
    * given anchor.
    */
  @JSName("DOM.copyTo")
  var DOMDotcopyTo: ReturnTypeCopyToResponse = js.native
  
  /**
    * Describes node given its id, does not require domain to be enabled. Does not start tracking any
    * objects, can be used for automation.
    */
  @JSName("DOM.describeNode")
  var DOMDotdescribeNode: ReturnTypeDescribeNodeResponse = js.native
  
  /**
    * Disables DOM agent for the given page.
    */
  @JSName("DOM.disable")
  var DOMDotdisable: ParamsType = js.native
  
  /**
    * Discards search results from the session with the given id. `getSearchResults` should no longer
    * be called for that search.
    */
  @JSName("DOM.discardSearchResults")
  var DOMDotdiscardSearchResults: `47` = js.native
  
  /**
    * Enables DOM agent for the given page.
    */
  @JSName("DOM.enable")
  var DOMDotenable: ParamsType = js.native
  
  /**
    * Focuses the given element.
    */
  @JSName("DOM.focus")
  var DOMDotfocus: `48` = js.native
  
  /**
    * Returns attributes for the specified node.
    */
  @JSName("DOM.getAttributes")
  var DOMDotgetAttributes: ReturnTypeGetAttributesResponse = js.native
  
  /**
    * Returns boxes for the given node.
    */
  @JSName("DOM.getBoxModel")
  var DOMDotgetBoxModel: ReturnTypeGetBoxModelResponse = js.native
  
  /**
    * Returns quads that describe node position on the page. This method
    * might return multiple quads for inline nodes.
    */
  @JSName("DOM.getContentQuads")
  var DOMDotgetContentQuads: ReturnTypeGetContentQuadsResponse = js.native
  
  /**
    * Returns the root DOM node (and optionally the subtree) to the caller.
    */
  @JSName("DOM.getDocument")
  var DOMDotgetDocument: ReturnTypeGetDocumentResponse = js.native
  
  /**
    * Returns file information for the given
    * File wrapper.
    */
  @JSName("DOM.getFileInfo")
  var DOMDotgetFileInfo: ReturnTypeGetFileInfoResponse = js.native
  
  /**
    * Returns the root DOM node (and optionally the subtree) to the caller.
    */
  @JSName("DOM.getFlattenedDocument")
  var DOMDotgetFlattenedDocument: ReturnTypeGetFlattenedDocumentResponse = js.native
  
  /**
    * Returns iframe node that owns iframe with the given domain.
    */
  @JSName("DOM.getFrameOwner")
  var DOMDotgetFrameOwner: ReturnTypeGetFrameOwnerResponse = js.native
  
  /**
    * Returns node id at given location. Depending on whether DOM domain is enabled, nodeId is
    * either returned or not.
    */
  @JSName("DOM.getNodeForLocation")
  var DOMDotgetNodeForLocation: ReturnTypeGetNodeForLocationResponse = js.native
  
  /**
    * Gets stack traces associated with a Node. As of now, only provides stack trace for Node creation.
    */
  @JSName("DOM.getNodeStackTraces")
  var DOMDotgetNodeStackTraces: ReturnTypeGetNodeStackTracesResponse = js.native
  
  /**
    * Returns node's HTML markup.
    */
  @JSName("DOM.getOuterHTML")
  var DOMDotgetOuterHTML: ReturnTypeGetOuterHTMLResponse = js.native
  
  /**
    * Returns the id of the nearest ancestor that is a relayout boundary.
    */
  @JSName("DOM.getRelayoutBoundary")
  var DOMDotgetRelayoutBoundary: ReturnTypeGetRelayoutBoundaryResponse = js.native
  
  /**
    * Returns search results from given `fromIndex` to given `toIndex` from the search with the given
    * identifier.
    */
  @JSName("DOM.getSearchResults")
  var DOMDotgetSearchResults: ReturnTypeGetSearchResultsResponse = js.native
  
  /**
    * Hides any highlight.
    */
  @JSName("DOM.hideHighlight")
  var DOMDothideHighlight: ParamsType = js.native
  
  /**
    * Highlights DOM node.
    */
  @JSName("DOM.highlightNode")
  var DOMDothighlightNode: ParamsType = js.native
  
  /**
    * Highlights given rectangle.
    */
  @JSName("DOM.highlightRect")
  var DOMDothighlightRect: ParamsType = js.native
  
  /**
    * Marks last undoable state.
    */
  @JSName("DOM.markUndoableState")
  var DOMDotmarkUndoableState: ParamsType = js.native
  
  /**
    * Moves node into the new container, places it before the given anchor.
    */
  @JSName("DOM.moveTo")
  var DOMDotmoveTo: ReturnTypeMoveToResponse = js.native
  
  /**
    * Searches for a given string in the DOM tree. Use `getSearchResults` to access search results or
    * `cancelSearch` to end this search session.
    */
  @JSName("DOM.performSearch")
  var DOMDotperformSearch: ReturnTypePerformSearchResponse = js.native
  
  /**
    * Requests that the node is sent to the caller given its path. // FIXME, use XPath
    */
  @JSName("DOM.pushNodeByPathToFrontend")
  var DOMDotpushNodeByPathToFrontend: ReturnTypePushNodeByPathToFrontendResponse = js.native
  
  /**
    * Requests that a batch of nodes is sent to the caller given their backend node ids.
    */
  @JSName("DOM.pushNodesByBackendIdsToFrontend")
  var DOMDotpushNodesByBackendIdsToFrontend: ReturnTypePushNodesByBackendIdsToFrontendResponse = js.native
  
  /**
    * Executes `querySelector` on a given node.
    */
  @JSName("DOM.querySelector")
  var DOMDotquerySelector: ReturnTypeQuerySelectorResponse = js.native
  
  /**
    * Executes `querySelectorAll` on a given node.
    */
  @JSName("DOM.querySelectorAll")
  var DOMDotquerySelectorAll: ReturnTypeQuerySelectorAllResponse = js.native
  
  /**
    * Re-does the last undone action.
    */
  @JSName("DOM.redo")
  var DOMDotredo: ParamsType = js.native
  
  /**
    * Removes attribute with given name from an element with given id.
    */
  @JSName("DOM.removeAttribute")
  var DOMDotremoveAttribute: `49` = js.native
  
  /**
    * Removes node with given id.
    */
  @JSName("DOM.removeNode")
  var DOMDotremoveNode: `50` = js.native
  
  /**
    * Requests that children of the node with given id are returned to the caller in form of
    * `setChildNodes` events where not only immediate children are retrieved, but all children down to
    * the specified depth.
    */
  @JSName("DOM.requestChildNodes")
  var DOMDotrequestChildNodes: `51` = js.native
  
  /**
    * Requests that the node is sent to the caller given the JavaScript node object reference. All
    * nodes that form the path from the node to the root are also sent to the client as a series of
    * `setChildNodes` notifications.
    */
  @JSName("DOM.requestNode")
  var DOMDotrequestNode: ReturnTypeRequestNodeResponse = js.native
  
  /**
    * Resolves the JavaScript node object for a given NodeId or BackendNodeId.
    */
  @JSName("DOM.resolveNode")
  var DOMDotresolveNode: ReturnTypeResolveNodeResponse = js.native
  
  /**
    * Scrolls the specified rect of the given node into view if not already visible.
    * Note: exactly one between nodeId, backendNodeId and objectId should be passed
    * to identify the node.
    */
  @JSName("DOM.scrollIntoViewIfNeeded")
  var DOMDotscrollIntoViewIfNeeded: `46` = js.native
  
  /**
    * Sets attribute for an element with given id.
    */
  @JSName("DOM.setAttributeValue")
  var DOMDotsetAttributeValue: `52` = js.native
  
  /**
    * Sets attributes on element with given id. This method is useful when user edits some existing
    * attribute value and types in several attribute name/value pairs.
    */
  @JSName("DOM.setAttributesAsText")
  var DOMDotsetAttributesAsText: `53` = js.native
  
  /**
    * Sets files for the given file input element.
    */
  @JSName("DOM.setFileInputFiles")
  var DOMDotsetFileInputFiles: `54` = js.native
  
  /**
    * Enables console to refer to the node with given id via $x (see Command Line API for more details
    * $x functions).
    */
  @JSName("DOM.setInspectedNode")
  var DOMDotsetInspectedNode: `56` = js.native
  
  /**
    * Sets node name for a node with given id.
    */
  @JSName("DOM.setNodeName")
  var DOMDotsetNodeName: ReturnTypeSetNodeNameResponse = js.native
  
  /**
    * Sets if stack traces should be captured for Nodes. See `Node.getNodeStackTraces`. Default is disabled.
    */
  @JSName("DOM.setNodeStackTracesEnabled")
  var DOMDotsetNodeStackTracesEnabled: `55` = js.native
  
  /**
    * Sets node value for a node with given id.
    */
  @JSName("DOM.setNodeValue")
  var DOMDotsetNodeValue: `57` = js.native
  
  /**
    * Sets node HTML markup, returns new node id.
    */
  @JSName("DOM.setOuterHTML")
  var DOMDotsetOuterHTML: `58` = js.native
  
  /**
    * Undoes the last performed action.
    */
  @JSName("DOM.undo")
  var DOMDotundo: ParamsType = js.native
  
  /**
    * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
    * template contents, and imported documents) in a flattened array, as well as layout and
    * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
    * flattened.
    */
  @JSName("DOMSnapshot.captureSnapshot")
  var DOMSnapshotDotcaptureSnapshot: ReturnTypeCaptureSnapshotResponse = js.native
  
  /**
    * Disables DOM snapshot agent for the given page.
    */
  @JSName("DOMSnapshot.disable")
  var DOMSnapshotDotdisable: ParamsType = js.native
  
  /**
    * Enables DOM snapshot agent for the given page.
    */
  @JSName("DOMSnapshot.enable")
  var DOMSnapshotDotenable: ParamsType = js.native
  
  /**
    * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
    * template contents, and imported documents) in a flattened array, as well as layout and
    * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
    * flattened.
    */
  @JSName("DOMSnapshot.getSnapshot")
  var DOMSnapshotDotgetSnapshot: ReturnTypeGetSnapshotResponse = js.native
  
  @JSName("DOMStorage.clear")
  var DOMStorageDotclear: `67` = js.native
  
  /**
    * Disables storage tracking, prevents storage events from being sent to the client.
    */
  @JSName("DOMStorage.disable")
  var DOMStorageDotdisable: ParamsType = js.native
  
  /**
    * Enables storage tracking, storage events will now be delivered to the client.
    */
  @JSName("DOMStorage.enable")
  var DOMStorageDotenable: ParamsType = js.native
  
  @JSName("DOMStorage.getDOMStorageItems")
  var DOMStorageDotgetDOMStorageItems: ReturnTypeGetDOMStorageItemsResponse = js.native
  
  @JSName("DOMStorage.removeDOMStorageItem")
  var DOMStorageDotremoveDOMStorageItem: `68` = js.native
  
  @JSName("DOMStorage.setDOMStorageItem")
  var DOMStorageDotsetDOMStorageItem: `69` = js.native
  
  /**
    * Disables database tracking, prevents database events from being sent to the client.
    */
  @JSName("Database.disable")
  var DatabaseDotdisable: ParamsType = js.native
  
  /**
    * Enables database tracking, database events will now be delivered to the client.
    */
  @JSName("Database.enable")
  var DatabaseDotenable: ParamsType = js.native
  
  @JSName("Database.executeSQL")
  var DatabaseDotexecuteSQL: ReturnTypeExecuteSQLResponse = js.native
  
  @JSName("Database.getDatabaseTableNames")
  var DatabaseDotgetDatabaseTableNames: ReturnTypeGetDatabaseTableNamesResponse = js.native
  
  /**
    * Continues execution until specific location is reached.
    */
  @JSName("Debugger.continueToLocation")
  var DebuggerDotcontinueToLocation: ReturnType = js.native
  
  /**
    * Disables debugger for given page.
    */
  @JSName("Debugger.disable")
  var DebuggerDotdisable: ParamsType = js.native
  
  /**
    * Enables debugger for the given page. Clients should not assume that the debugging has been
    * enabled until the result for this command is received.
    */
  @JSName("Debugger.enable")
  var DebuggerDotenable: ParamsTypeReturnType = js.native
  
  /**
    * Evaluates expression on a given call frame.
    */
  @JSName("Debugger.evaluateOnCallFrame")
  var DebuggerDotevaluateOnCallFrame: ReturnTypeEvaluateOnCallFrameResponse = js.native
  
  /**
    * Execute a Wasm Evaluator module on a given call frame.
    */
  @JSName("Debugger.executeWasmEvaluator")
  var DebuggerDotexecuteWasmEvaluator: ReturnTypeExecuteWasmEvaluatorResponse = js.native
  
  /**
    * Returns possible locations for breakpoint. scriptId in start and end range locations should be
    * the same.
    */
  @JSName("Debugger.getPossibleBreakpoints")
  var DebuggerDotgetPossibleBreakpoints: ReturnTypeGetPossibleBreakpointsResponse = js.native
  
  /**
    * Returns source for the script with given id.
    */
  @JSName("Debugger.getScriptSource")
  var DebuggerDotgetScriptSource: ReturnTypeGetScriptSourceResponse = js.native
  
  /**
    * Returns stack trace with given `stackTraceId`.
    */
  @JSName("Debugger.getStackTrace")
  var DebuggerDotgetStackTrace: ReturnTypeGetStackTraceResponse = js.native
  
  /**
    * This command is deprecated. Use getScriptSource instead.
    */
  @JSName("Debugger.getWasmBytecode")
  var DebuggerDotgetWasmBytecode: ReturnTypeGetWasmBytecodeResponse = js.native
  
  /**
    * Stops on the next JavaScript statement.
    */
  @JSName("Debugger.pause")
  var DebuggerDotpause: ParamsType = js.native
  
  @JSName("Debugger.pauseOnAsyncCall")
  var DebuggerDotpauseOnAsyncCall: ReturnTypeVoid = js.native
  
  /**
    * Removes JavaScript breakpoint.
    */
  @JSName("Debugger.removeBreakpoint")
  var DebuggerDotremoveBreakpoint: ParamsTypeReturnTypeVoid = js.native
  
  /**
    * Restarts particular call frame from the beginning.
    */
  @JSName("Debugger.restartFrame")
  var DebuggerDotrestartFrame: ReturnTypeRestartFrameResponse = js.native
  
  /**
    * Resumes JavaScript execution.
    */
  @JSName("Debugger.resume")
  var DebuggerDotresume: `0` = js.native
  
  /**
    * Searches for given string in script content.
    */
  @JSName("Debugger.searchInContent")
  var DebuggerDotsearchInContent: ReturnTypeSearchInContentResponse = js.native
  
  /**
    * Enables or disables async call stacks tracking.
    */
  @JSName("Debugger.setAsyncCallStackDepth")
  var DebuggerDotsetAsyncCallStackDepth: `1` = js.native
  
  /**
    * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in
    * scripts with url matching one of the patterns. VM will try to leave blackboxed script by
    * performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    */
  @JSName("Debugger.setBlackboxPatterns")
  var DebuggerDotsetBlackboxPatterns: `2` = js.native
  
  /**
    * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted
    * scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    * Positions array contains positions where blackbox state is changed. First interval isn't
    * blackboxed. Array should be sorted.
    */
  @JSName("Debugger.setBlackboxedRanges")
  var DebuggerDotsetBlackboxedRanges: `3` = js.native
  
  /**
    * Sets JavaScript breakpoint at a given location.
    */
  @JSName("Debugger.setBreakpoint")
  var DebuggerDotsetBreakpoint: ReturnTypeSetBreakpointResponse = js.native
  
  /**
    * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this
    * command is issued, all existing parsed scripts will have breakpoints resolved and returned in
    * `locations` property. Further matching script parsing will result in subsequent
    * `breakpointResolved` events issued. This logical breakpoint will survive page reloads.
    */
  @JSName("Debugger.setBreakpointByUrl")
  var DebuggerDotsetBreakpointByUrl: ReturnTypeSetBreakpointByUrlResponse = js.native
  
  /**
    * Sets JavaScript breakpoint before each call to the given function.
    * If another function was created from the same source as a given one,
    * calling it will also trigger the breakpoint.
    */
  @JSName("Debugger.setBreakpointOnFunctionCall")
  var DebuggerDotsetBreakpointOnFunctionCall: ReturnTypeSetBreakpointOnFunctionCallResponse = js.native
  
  /**
    * Activates / deactivates all breakpoints on the page.
    */
  @JSName("Debugger.setBreakpointsActive")
  var DebuggerDotsetBreakpointsActive: `4` = js.native
  
  /**
    * Sets instrumentation breakpoint.
    */
  @JSName("Debugger.setInstrumentationBreakpoint")
  var DebuggerDotsetInstrumentationBreakpoint: ReturnTypeSetInstrumentationBreakpointResponse = js.native
  
  /**
    * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or
    * no exceptions. Initial pause on exceptions state is `none`.
    */
  @JSName("Debugger.setPauseOnExceptions")
  var DebuggerDotsetPauseOnExceptions: `5` = js.native
  
  /**
    * Changes return value in top frame. Available only at return break position.
    */
  @JSName("Debugger.setReturnValue")
  var DebuggerDotsetReturnValue: `6` = js.native
  
  /**
    * Edits JavaScript source live.
    */
  @JSName("Debugger.setScriptSource")
  var DebuggerDotsetScriptSource: ReturnTypeSetScriptSourceResponse = js.native
  
  /**
    * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
    */
  @JSName("Debugger.setSkipAllPauses")
  var DebuggerDotsetSkipAllPauses: `7` = js.native
  
  /**
    * Changes value of variable in a callframe. Object-based scopes are not supported and must be
    * mutated manually.
    */
  @JSName("Debugger.setVariableValue")
  var DebuggerDotsetVariableValue: `8` = js.native
  
  /**
    * Steps into the function call.
    */
  @JSName("Debugger.stepInto")
  var DebuggerDotstepInto: `9` = js.native
  
  /**
    * Steps out of the function call.
    */
  @JSName("Debugger.stepOut")
  var DebuggerDotstepOut: ParamsType = js.native
  
  /**
    * Steps over the statement.
    */
  @JSName("Debugger.stepOver")
  var DebuggerDotstepOver: ParamsType = js.native
  
  /**
    * Clears the overridden Device Orientation.
    */
  @JSName("DeviceOrientation.clearDeviceOrientationOverride")
  var DeviceOrientationDotclearDeviceOrientationOverride: ParamsType = js.native
  
  /**
    * Overrides the Device Orientation.
    */
  @JSName("DeviceOrientation.setDeviceOrientationOverride")
  var DeviceOrientationDotsetDeviceOrientationOverride: `70` = js.native
  
  /**
    * Tells whether emulation is supported.
    */
  @JSName("Emulation.canEmulate")
  var EmulationDotcanEmulate: ReturnTypeCanEmulateResponse = js.native
  
  /**
    * Clears the overriden device metrics.
    */
  @JSName("Emulation.clearDeviceMetricsOverride")
  var EmulationDotclearDeviceMetricsOverride: ParamsType = js.native
  
  /**
    * Clears the overriden Geolocation Position and Error.
    */
  @JSName("Emulation.clearGeolocationOverride")
  var EmulationDotclearGeolocationOverride: ParamsType = js.native
  
  /**
    * Requests that page scale factor is reset to initial values.
    */
  @JSName("Emulation.resetPageScaleFactor")
  var EmulationDotresetPageScaleFactor: ParamsType = js.native
  
  /**
    * Enables CPU throttling to emulate slow CPUs.
    */
  @JSName("Emulation.setCPUThrottlingRate")
  var EmulationDotsetCPUThrottlingRate: `72` = js.native
  
  /**
    * Sets or clears an override of the default background color of the frame. This override is used
    * if the content does not specify one.
    */
  @JSName("Emulation.setDefaultBackgroundColorOverride")
  var EmulationDotsetDefaultBackgroundColorOverride: `73` = js.native
  
  /**
    * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
    * window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
    * query results).
    */
  @JSName("Emulation.setDeviceMetricsOverride")
  var EmulationDotsetDeviceMetricsOverride: `74` = js.native
  
  @JSName("Emulation.setDocumentCookieDisabled")
  var EmulationDotsetDocumentCookieDisabled: `76` = js.native
  
  @JSName("Emulation.setEmitTouchEventsForMouse")
  var EmulationDotsetEmitTouchEventsForMouse: `77` = js.native
  
  /**
    * Emulates the given media type or media feature for CSS media queries.
    */
  @JSName("Emulation.setEmulatedMedia")
  var EmulationDotsetEmulatedMedia: `78` = js.native
  
  /**
    * Emulates the given vision deficiency.
    */
  @JSName("Emulation.setEmulatedVisionDeficiency")
  var EmulationDotsetEmulatedVisionDeficiency: `79` = js.native
  
  /**
    * Enables or disables simulating a focused and active page.
    */
  @JSName("Emulation.setFocusEmulationEnabled")
  var EmulationDotsetFocusEmulationEnabled: `71` = js.native
  
  /**
    * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
    * unavailable.
    */
  @JSName("Emulation.setGeolocationOverride")
  var EmulationDotsetGeolocationOverride: `80` = js.native
  
  /**
    * Overrides default host system locale with the specified one.
    */
  @JSName("Emulation.setLocaleOverride")
  var EmulationDotsetLocaleOverride: `85` = js.native
  
  /**
    * Overrides value returned by the javascript navigator object.
    */
  @JSName("Emulation.setNavigatorOverrides")
  var EmulationDotsetNavigatorOverrides: `81` = js.native
  
  /**
    * Sets a specified page scale factor.
    */
  @JSName("Emulation.setPageScaleFactor")
  var EmulationDotsetPageScaleFactor: `82` = js.native
  
  /**
    * Switches script execution in the page.
    */
  @JSName("Emulation.setScriptExecutionDisabled")
  var EmulationDotsetScriptExecutionDisabled: `83` = js.native
  
  @JSName("Emulation.setScrollbarsHidden")
  var EmulationDotsetScrollbarsHidden: `75` = js.native
  
  /**
    * Overrides default host system timezone with the specified one.
    */
  @JSName("Emulation.setTimezoneOverride")
  var EmulationDotsetTimezoneOverride: `86` = js.native
  
  /**
    * Enables touch on platforms which do not support them.
    */
  @JSName("Emulation.setTouchEmulationEnabled")
  var EmulationDotsetTouchEmulationEnabled: `84` = js.native
  
  /**
    * Allows overriding user agent with the given string.
    */
  @JSName("Emulation.setUserAgentOverride")
  var EmulationDotsetUserAgentOverride: `88` = js.native
  
  /**
    * Turns on virtual time for all frames (replacing real-time with a synthetic time source) and sets
    * the current virtual time policy.  Note this supersedes any previous time budget.
    */
  @JSName("Emulation.setVirtualTimePolicy")
  var EmulationDotsetVirtualTimePolicy: ReturnTypeSetVirtualTimePolicyResponse = js.native
  
  /**
    * Resizes the frame/viewport of the page. Note that this does not affect the frame's container
    * (e.g. browser window). Can be used to produce screenshots of the specified size. Not supported
    * on Android.
    */
  @JSName("Emulation.setVisibleSize")
  var EmulationDotsetVisibleSize: `87` = js.native
  
  /**
    * Continues the request, optionally modifying some of its parameters.
    */
  @JSName("Fetch.continueRequest")
  var FetchDotcontinueRequest: `197` = js.native
  
  /**
    * Continues a request supplying authChallengeResponse following authRequired event.
    */
  @JSName("Fetch.continueWithAuth")
  var FetchDotcontinueWithAuth: `198` = js.native
  
  /**
    * Disables the fetch domain.
    */
  @JSName("Fetch.disable")
  var FetchDotdisable: ParamsType = js.native
  
  /**
    * Enables issuing of requestPaused events. A request will be paused until client
    * calls one of failRequest, fulfillRequest or continueRequest/continueWithAuth.
    */
  @JSName("Fetch.enable")
  var FetchDotenable: `194` = js.native
  
  /**
    * Causes the request to fail with specified reason.
    */
  @JSName("Fetch.failRequest")
  var FetchDotfailRequest: `195` = js.native
  
  /**
    * Provides response to the request.
    */
  @JSName("Fetch.fulfillRequest")
  var FetchDotfulfillRequest: `196` = js.native
  
  /**
    * Causes the body of the response to be received from the server and
    * returned as a single string. May only be issued for a request that
    * is paused in the Response stage and is mutually exclusive with
    * takeResponseBodyForInterceptionAsStream. Calling other methods that
    * affect the request or disabling fetch domain before body is received
    * results in an undefined behavior.
    */
  @JSName("Fetch.getResponseBody")
  var FetchDotgetResponseBody: ParamsTypeReturnTypeGetResponseBodyResponse = js.native
  
  /**
    * Returns a handle to the stream representing the response body.
    * The request must be paused in the HeadersReceived stage.
    * Note that after this command the request can't be continued
    * as is -- client either needs to cancel it or to provide the
    * response body.
    * The stream only supports sequential read, IO.read will fail if the position
    * is specified.
    * This method is mutually exclusive with getResponseBody.
    * Calling other methods that affect the request or disabling fetch
    * domain before body is received results in an undefined behavior.
    */
  @JSName("Fetch.takeResponseBodyAsStream")
  var FetchDottakeResponseBodyAsStream: ReturnTypeTakeResponseBodyAsStreamResponse = js.native
  
  /**
    * Sends a BeginFrame to the target and returns when the frame was completed. Optionally captures a
    * screenshot from the resulting frame. Requires that the target was created with enabled
    * BeginFrameControl. Designed for use with --run-all-compositor-stages-before-draw, see also
    * https://goo.gl/3zHXhB for more background.
    */
  @JSName("HeadlessExperimental.beginFrame")
  var HeadlessExperimentalDotbeginFrame: ReturnTypeBeginFrameResponse = js.native
  
  /**
    * Disables headless events for the target.
    */
  @JSName("HeadlessExperimental.disable")
  var HeadlessExperimentalDotdisable: ParamsType = js.native
  
  /**
    * Enables headless events for the target.
    */
  @JSName("HeadlessExperimental.enable")
  var HeadlessExperimentalDotenable: ParamsType = js.native
  
  /**
    * Enables console to refer to the node with given id via $x (see Command Line API for more details
    * $x functions).
    */
  @JSName("HeapProfiler.addInspectedHeapObject")
  var HeapProfilerDotaddInspectedHeapObject: `10` = js.native
  
  @JSName("HeapProfiler.collectGarbage")
  var HeapProfilerDotcollectGarbage: ParamsType = js.native
  
  @JSName("HeapProfiler.disable")
  var HeapProfilerDotdisable: ParamsType = js.native
  
  @JSName("HeapProfiler.enable")
  var HeapProfilerDotenable: ParamsType = js.native
  
  @JSName("HeapProfiler.getHeapObjectId")
  var HeapProfilerDotgetHeapObjectId: ReturnTypeGetHeapObjectIdResponse = js.native
  
  @JSName("HeapProfiler.getObjectByHeapObjectId")
  var HeapProfilerDotgetObjectByHeapObjectId: ReturnTypeGetObjectByHeapObjectIdResponse = js.native
  
  @JSName("HeapProfiler.getSamplingProfile")
  var HeapProfilerDotgetSamplingProfile: ReturnTypeGetSamplingProfileResponse = js.native
  
  @JSName("HeapProfiler.startSampling")
  var HeapProfilerDotstartSampling: `11` = js.native
  
  @JSName("HeapProfiler.startTrackingHeapObjects")
  var HeapProfilerDotstartTrackingHeapObjects: `12` = js.native
  
  @JSName("HeapProfiler.stopSampling")
  var HeapProfilerDotstopSampling: ReturnTypeStopSamplingResponse = js.native
  
  @JSName("HeapProfiler.stopTrackingHeapObjects")
  var HeapProfilerDotstopTrackingHeapObjects: `13` = js.native
  
  @JSName("HeapProfiler.takeHeapSnapshot")
  var HeapProfilerDottakeHeapSnapshot: `14` = js.native
  
  /**
    * Close the stream, discard any temporary backing storage.
    */
  @JSName("IO.close")
  var IODotclose: `89` = js.native
  
  /**
    * Read a chunk of the stream
    */
  @JSName("IO.read")
  var IODotread: ReturnTypeReadResponse = js.native
  
  /**
    * Return UUID of Blob object specified by a remote object id.
    */
  @JSName("IO.resolveBlob")
  var IODotresolveBlob: ReturnTypeResolveBlobResponse = js.native
  
  /**
    * Clears all entries from an object store.
    */
  @JSName("IndexedDB.clearObjectStore")
  var IndexedDBDotclearObjectStore: `90` = js.native
  
  /**
    * Deletes a database.
    */
  @JSName("IndexedDB.deleteDatabase")
  var IndexedDBDotdeleteDatabase: `91` = js.native
  
  /**
    * Delete a range of entries from an object store
    */
  @JSName("IndexedDB.deleteObjectStoreEntries")
  var IndexedDBDotdeleteObjectStoreEntries: `92` = js.native
  
  /**
    * Disables events from backend.
    */
  @JSName("IndexedDB.disable")
  var IndexedDBDotdisable: ParamsType = js.native
  
  /**
    * Enables events from backend.
    */
  @JSName("IndexedDB.enable")
  var IndexedDBDotenable: ParamsType = js.native
  
  /**
    * Gets metadata of an object store
    */
  @JSName("IndexedDB.getMetadata")
  var IndexedDBDotgetMetadata: ReturnTypeGetMetadataResponse = js.native
  
  /**
    * Requests data from object store or index.
    */
  @JSName("IndexedDB.requestData")
  var IndexedDBDotrequestData: ReturnTypeRequestDataResponse = js.native
  
  /**
    * Requests database with given name in given frame.
    */
  @JSName("IndexedDB.requestDatabase")
  var IndexedDBDotrequestDatabase: ReturnTypeRequestDatabaseResponse = js.native
  
  /**
    * Requests database names for given security origin.
    */
  @JSName("IndexedDB.requestDatabaseNames")
  var IndexedDBDotrequestDatabaseNames: ReturnTypeRequestDatabaseNamesResponse = js.native
  
  /**
    * Dispatches a key event to the page.
    */
  @JSName("Input.dispatchKeyEvent")
  var InputDotdispatchKeyEvent: `93` = js.native
  
  /**
    * Dispatches a mouse event to the page.
    */
  @JSName("Input.dispatchMouseEvent")
  var InputDotdispatchMouseEvent: `95` = js.native
  
  /**
    * Dispatches a touch event to the page.
    */
  @JSName("Input.dispatchTouchEvent")
  var InputDotdispatchTouchEvent: `96` = js.native
  
  /**
    * Emulates touch event from the mouse event parameters.
    */
  @JSName("Input.emulateTouchFromMouseEvent")
  var InputDotemulateTouchFromMouseEvent: `97` = js.native
  
  /**
    * This method emulates inserting text that doesn't come from a key press,
    * for example an emoji keyboard or an IME.
    */
  @JSName("Input.insertText")
  var InputDotinsertText: `94` = js.native
  
  /**
    * Ignores input events (useful while auditing page).
    */
  @JSName("Input.setIgnoreInputEvents")
  var InputDotsetIgnoreInputEvents: `98` = js.native
  
  /**
    * Synthesizes a pinch gesture over a time period by issuing appropriate touch events.
    */
  @JSName("Input.synthesizePinchGesture")
  var InputDotsynthesizePinchGesture: `99` = js.native
  
  /**
    * Synthesizes a scroll gesture over a time period by issuing appropriate touch events.
    */
  @JSName("Input.synthesizeScrollGesture")
  var InputDotsynthesizeScrollGesture: `100` = js.native
  
  /**
    * Synthesizes a tap gesture over a time period by issuing appropriate touch events.
    */
  @JSName("Input.synthesizeTapGesture")
  var InputDotsynthesizeTapGesture: `101` = js.native
  
  /**
    * Disables inspector domain notifications.
    */
  @JSName("Inspector.disable")
  var InspectorDotdisable: ParamsType = js.native
  
  /**
    * Enables inspector domain notifications.
    */
  @JSName("Inspector.enable")
  var InspectorDotenable: ParamsType = js.native
  
  /**
    * Provides the reasons why the given layer was composited.
    */
  @JSName("LayerTree.compositingReasons")
  var LayerTreeDotcompositingReasons: ReturnTypeCompositingReasonsResponse = js.native
  
  /**
    * Disables compositing tree inspection.
    */
  @JSName("LayerTree.disable")
  var LayerTreeDotdisable: ParamsType = js.native
  
  /**
    * Enables compositing tree inspection.
    */
  @JSName("LayerTree.enable")
  var LayerTreeDotenable: ParamsType = js.native
  
  /**
    * Returns the snapshot identifier.
    */
  @JSName("LayerTree.loadSnapshot")
  var LayerTreeDotloadSnapshot: ReturnTypeLoadSnapshotResponse = js.native
  
  /**
    * Returns the layer snapshot identifier.
    */
  @JSName("LayerTree.makeSnapshot")
  var LayerTreeDotmakeSnapshot: ReturnTypeMakeSnapshotResponse = js.native
  
  @JSName("LayerTree.profileSnapshot")
  var LayerTreeDotprofileSnapshot: ReturnTypeProfileSnapshotResponse = js.native
  
  /**
    * Releases layer snapshot captured by the back-end.
    */
  @JSName("LayerTree.releaseSnapshot")
  var LayerTreeDotreleaseSnapshot: `102` = js.native
  
  /**
    * Replays the layer snapshot and returns the resulting bitmap.
    */
  @JSName("LayerTree.replaySnapshot")
  var LayerTreeDotreplaySnapshot: ReturnTypeReplaySnapshotResponse = js.native
  
  /**
    * Replays the layer snapshot and returns canvas log.
    */
  @JSName("LayerTree.snapshotCommandLog")
  var LayerTreeDotsnapshotCommandLog: ReturnTypeSnapshotCommandLogResponse = js.native
  
  /**
    * Clears the log.
    */
  @JSName("Log.clear")
  var LogDotclear: ParamsType = js.native
  
  /**
    * Disables log domain, prevents further log entries from being reported to the client.
    */
  @JSName("Log.disable")
  var LogDotdisable: ParamsType = js.native
  
  /**
    * Enables log domain, sends the entries collected so far to the client by means of the
    * `entryAdded` notification.
    */
  @JSName("Log.enable")
  var LogDotenable: ParamsType = js.native
  
  /**
    * start violation reporting.
    */
  @JSName("Log.startViolationsReport")
  var LogDotstartViolationsReport: `103` = js.native
  
  /**
    * Stop violation reporting.
    */
  @JSName("Log.stopViolationsReport")
  var LogDotstopViolationsReport: ParamsType = js.native
  
  /**
    * Disables the Media domain.
    */
  @JSName("Media.disable")
  var MediaDotdisable: ParamsType = js.native
  
  /**
    * Enables the Media domain
    */
  @JSName("Media.enable")
  var MediaDotenable: ParamsType = js.native
  
  /**
    * Simulate OomIntervention by purging V8 memory.
    */
  @JSName("Memory.forciblyPurgeJavaScriptMemory")
  var MemoryDotforciblyPurgeJavaScriptMemory: ParamsType = js.native
  
  /**
    * Retrieve native memory allocations profile
    * collected since renderer process startup.
    */
  @JSName("Memory.getAllTimeSamplingProfile")
  var MemoryDotgetAllTimeSamplingProfile: ReturnTypeGetAllTimeSamplingProfileResponse = js.native
  
  /**
    * Retrieve native memory allocations profile
    * collected since browser process startup.
    */
  @JSName("Memory.getBrowserSamplingProfile")
  var MemoryDotgetBrowserSamplingProfile: ReturnTypeGetBrowserSamplingProfileResponse = js.native
  
  @JSName("Memory.getDOMCounters")
  var MemoryDotgetDOMCounters: ReturnTypeGetDOMCountersResponse = js.native
  
  /**
    * Retrieve native memory allocations profile collected since last
    * `startSampling` call.
    */
  @JSName("Memory.getSamplingProfile")
  var MemoryDotgetSamplingProfile: ParamsTypeReturnTypeGetSamplingProfileResponse = js.native
  
  @JSName("Memory.prepareForLeakDetection")
  var MemoryDotprepareForLeakDetection: ParamsType = js.native
  
  /**
    * Enable/disable suppressing memory pressure notifications in all processes.
    */
  @JSName("Memory.setPressureNotificationsSuppressed")
  var MemoryDotsetPressureNotificationsSuppressed: `104` = js.native
  
  /**
    * Simulate a memory pressure notification in all processes.
    */
  @JSName("Memory.simulatePressureNotification")
  var MemoryDotsimulatePressureNotification: `105` = js.native
  
  /**
    * Start collecting native memory profile.
    */
  @JSName("Memory.startSampling")
  var MemoryDotstartSampling: `106` = js.native
  
  /**
    * Stop collecting native memory profile.
    */
  @JSName("Memory.stopSampling")
  var MemoryDotstopSampling: ParamsType = js.native
  
  /**
    * Tells whether clearing browser cache is supported.
    */
  @JSName("Network.canClearBrowserCache")
  var NetworkDotcanClearBrowserCache: ReturnTypeCanClearBrowserCacheResponse = js.native
  
  /**
    * Tells whether clearing browser cookies is supported.
    */
  @JSName("Network.canClearBrowserCookies")
  var NetworkDotcanClearBrowserCookies: ReturnTypeCanClearBrowserCookiesResponse = js.native
  
  /**
    * Tells whether emulation of network conditions is supported.
    */
  @JSName("Network.canEmulateNetworkConditions")
  var NetworkDotcanEmulateNetworkConditions: ReturnTypeCanEmulateNetworkConditionsResponse = js.native
  
  /**
    * Clears browser cache.
    */
  @JSName("Network.clearBrowserCache")
  var NetworkDotclearBrowserCache: ParamsType = js.native
  
  /**
    * Clears browser cookies.
    */
  @JSName("Network.clearBrowserCookies")
  var NetworkDotclearBrowserCookies: ParamsType = js.native
  
  /**
    * Response to Network.requestIntercepted which either modifies the request to continue with any
    * modifications, or blocks it, or completes it with the provided response bytes. If a network
    * fetch occurs as a result which encounters a redirect an additional Network.requestIntercepted
    * event will be sent with the same InterceptionId.
    * Deprecated, use Fetch.continueRequest, Fetch.fulfillRequest and Fetch.failRequest instead.
    */
  @JSName("Network.continueInterceptedRequest")
  var NetworkDotcontinueInterceptedRequest: `107` = js.native
  
  /**
    * Deletes browser cookies with matching name and url or domain/path pair.
    */
  @JSName("Network.deleteCookies")
  var NetworkDotdeleteCookies: `108` = js.native
  
  /**
    * Disables network tracking, prevents network events from being sent to the client.
    */
  @JSName("Network.disable")
  var NetworkDotdisable: ParamsType = js.native
  
  /**
    * Activates emulation of network conditions.
    */
  @JSName("Network.emulateNetworkConditions")
  var NetworkDotemulateNetworkConditions: `109` = js.native
  
  /**
    * Enables network tracking, network events will now be delivered to the client.
    */
  @JSName("Network.enable")
  var NetworkDotenable: `110` = js.native
  
  /**
    * Returns all browser cookies. Depending on the backend support, will return detailed cookie
    * information in the `cookies` field.
    */
  @JSName("Network.getAllCookies")
  var NetworkDotgetAllCookies: ReturnTypeGetAllCookiesResponse = js.native
  
  /**
    * Returns the DER-encoded certificate.
    */
  @JSName("Network.getCertificate")
  var NetworkDotgetCertificate: ReturnTypeGetCertificateResponse = js.native
  
  /**
    * Returns all browser cookies for the current URL. Depending on the backend support, will return
    * detailed cookie information in the `cookies` field.
    */
  @JSName("Network.getCookies")
  var NetworkDotgetCookies: ReturnTypeGetCookiesResponse = js.native
  
  /**
    * Returns post data sent with the request. Returns an error when no data was sent with the request.
    */
  @JSName("Network.getRequestPostData")
  var NetworkDotgetRequestPostData: ReturnTypeGetRequestPostDataResponse = js.native
  
  /**
    * Returns content served for the given request.
    */
  @JSName("Network.getResponseBody")
  var NetworkDotgetResponseBody: ReturnTypeGetResponseBodyResponse = js.native
  
  /**
    * Returns content served for the given currently intercepted request.
    */
  @JSName("Network.getResponseBodyForInterception")
  var NetworkDotgetResponseBodyForInterception: ReturnTypeGetResponseBodyForInterceptionResponse = js.native
  
  /**
    * This method sends a new XMLHttpRequest which is identical to the original one. The following
    * parameters should be identical: method, url, async, request body, extra headers, withCredentials
    * attribute, user, password.
    */
  @JSName("Network.replayXHR")
  var NetworkDotreplayXHR: `111` = js.native
  
  /**
    * Searches for given string in response content.
    */
  @JSName("Network.searchInResponseBody")
  var NetworkDotsearchInResponseBody: ReturnTypeSearchInResponseBodyResponse = js.native
  
  /**
    * Blocks URLs from loading.
    */
  @JSName("Network.setBlockedURLs")
  var NetworkDotsetBlockedURLs: `112` = js.native
  
  /**
    * Toggles ignoring of service worker for each request.
    */
  @JSName("Network.setBypassServiceWorker")
  var NetworkDotsetBypassServiceWorker: `113` = js.native
  
  /**
    * Toggles ignoring cache for each request. If `true`, cache will not be used.
    */
  @JSName("Network.setCacheDisabled")
  var NetworkDotsetCacheDisabled: `114` = js.native
  
  /**
    * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
    */
  @JSName("Network.setCookie")
  var NetworkDotsetCookie: ReturnTypeSetCookieResponse = js.native
  
  /**
    * Sets given cookies.
    */
  @JSName("Network.setCookies")
  var NetworkDotsetCookies: `115` = js.native
  
  /**
    * For testing.
    */
  @JSName("Network.setDataSizeLimitsForTest")
  var NetworkDotsetDataSizeLimitsForTest: `116` = js.native
  
  /**
    * Specifies whether to always send extra HTTP headers with the requests from this page.
    */
  @JSName("Network.setExtraHTTPHeaders")
  var NetworkDotsetExtraHTTPHeaders: `117` = js.native
  
  /**
    * Sets the requests to intercept that match the provided patterns and optionally resource types.
    * Deprecated, please use Fetch.enable instead.
    */
  @JSName("Network.setRequestInterception")
  var NetworkDotsetRequestInterception: `118` = js.native
  
  /**
    * Allows overriding user agent with the given string.
    */
  @JSName("Network.setUserAgentOverride")
  var NetworkDotsetUserAgentOverride: `119` = js.native
  
  /**
    * Returns a handle to the stream representing the response body. Note that after this command,
    * the intercepted request can't be continued as is -- you either need to cancel it or to provide
    * the response body. The stream only supports sequential read, IO.read will fail if the position
    * is specified.
    */
  @JSName("Network.takeResponseBodyForInterceptionAsStream")
  var NetworkDottakeResponseBodyForInterceptionAsStream: ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse = js.native
  
  /**
    * Disables domain notifications.
    */
  @JSName("Overlay.disable")
  var OverlayDotdisable: ParamsType = js.native
  
  /**
    * Enables domain notifications.
    */
  @JSName("Overlay.enable")
  var OverlayDotenable: ParamsType = js.native
  
  /**
    * For testing.
    */
  @JSName("Overlay.getHighlightObjectForTest")
  var OverlayDotgetHighlightObjectForTest: ReturnTypeGetHighlightObjectForTestResponse = js.native
  
  /**
    * Hides any highlight.
    */
  @JSName("Overlay.hideHighlight")
  var OverlayDothideHighlight: ParamsType = js.native
  
  /**
    * Highlights owner element of the frame with given id.
    */
  @JSName("Overlay.highlightFrame")
  var OverlayDothighlightFrame: `120` = js.native
  
  /**
    * Highlights DOM node with given id or with the given JavaScript object wrapper. Either nodeId or
    * objectId must be specified.
    */
  @JSName("Overlay.highlightNode")
  var OverlayDothighlightNode: `121` = js.native
  
  /**
    * Highlights given quad. Coordinates are absolute with respect to the main frame viewport.
    */
  @JSName("Overlay.highlightQuad")
  var OverlayDothighlightQuad: `122` = js.native
  
  /**
    * Highlights given rectangle. Coordinates are absolute with respect to the main frame viewport.
    */
  @JSName("Overlay.highlightRect")
  var OverlayDothighlightRect: `123` = js.native
  
  /**
    * Enters the 'inspect' mode. In this mode, elements that user is hovering over are highlighted.
    * Backend then generates 'inspectNodeRequested' event upon element selection.
    */
  @JSName("Overlay.setInspectMode")
  var OverlayDotsetInspectMode: `124` = js.native
  
  @JSName("Overlay.setPausedInDebuggerMessage")
  var OverlayDotsetPausedInDebuggerMessage: `126` = js.native
  
  /**
    * Highlights owner element of all frames detected to be ads.
    */
  @JSName("Overlay.setShowAdHighlights")
  var OverlayDotsetShowAdHighlights: `125` = js.native
  
  /**
    * Requests that backend shows debug borders on layers
    */
  @JSName("Overlay.setShowDebugBorders")
  var OverlayDotsetShowDebugBorders: `127` = js.native
  
  /**
    * Requests that backend shows the FPS counter
    */
  @JSName("Overlay.setShowFPSCounter")
  var OverlayDotsetShowFPSCounter: `128` = js.native
  
  /**
    * Add a dual screen device hinge
    */
  @JSName("Overlay.setShowHinge")
  var OverlayDotsetShowHinge: `134` = js.native
  
  /**
    * Requests that backend shows hit-test borders on layers
    */
  @JSName("Overlay.setShowHitTestBorders")
  var OverlayDotsetShowHitTestBorders: `132` = js.native
  
  /**
    * Requests that backend shows layout shift regions
    */
  @JSName("Overlay.setShowLayoutShiftRegions")
  var OverlayDotsetShowLayoutShiftRegions: `130` = js.native
  
  /**
    * Requests that backend shows paint rectangles
    */
  @JSName("Overlay.setShowPaintRects")
  var OverlayDotsetShowPaintRects: `129` = js.native
  
  /**
    * Requests that backend shows scroll bottleneck rects
    */
  @JSName("Overlay.setShowScrollBottleneckRects")
  var OverlayDotsetShowScrollBottleneckRects: `131` = js.native
  
  /**
    * Paints viewport size upon main frame resize.
    */
  @JSName("Overlay.setShowViewportSizeOnResize")
  var OverlayDotsetShowViewportSizeOnResize: `133` = js.native
  
  /**
    * Seeds compilation cache for given url. Compilation cache does not survive
    * cross-process navigation.
    */
  @JSName("Page.addCompilationCache")
  var PageDotaddCompilationCache: `156` = js.native
  
  /**
    * Deprecated, please use addScriptToEvaluateOnNewDocument instead.
    */
  @JSName("Page.addScriptToEvaluateOnLoad")
  var PageDotaddScriptToEvaluateOnLoad: ReturnTypeAddScriptToEvaluateOnLoadResponse = js.native
  
  /**
    * Evaluates given script in every frame upon creation (before loading frame's scripts).
    */
  @JSName("Page.addScriptToEvaluateOnNewDocument")
  var PageDotaddScriptToEvaluateOnNewDocument: ReturnTypeAddScriptToEvaluateOnNewDocumentResponse = js.native
  
  /**
    * Brings page to front (activates tab).
    */
  @JSName("Page.bringToFront")
  var PageDotbringToFront: ParamsType = js.native
  
  /**
    * Capture page screenshot.
    */
  @JSName("Page.captureScreenshot")
  var PageDotcaptureScreenshot: ReturnTypeCaptureScreenshotResponse = js.native
  
  /**
    * Returns a snapshot of the page as a string. For MHTML format, the serialization includes
    * iframes, shadow DOM, external resources, and element-inline styles.
    */
  @JSName("Page.captureSnapshot")
  var PageDotcaptureSnapshot: ParamsTypeReturnTypeCaptureSnapshotResponse = js.native
  
  /**
    * Clears seeded compilation cache.
    */
  @JSName("Page.clearCompilationCache")
  var PageDotclearCompilationCache: ParamsType = js.native
  
  /**
    * Clears the overriden device metrics.
    */
  @JSName("Page.clearDeviceMetricsOverride")
  var PageDotclearDeviceMetricsOverride: ParamsType = js.native
  
  /**
    * Clears the overridden Device Orientation.
    */
  @JSName("Page.clearDeviceOrientationOverride")
  var PageDotclearDeviceOrientationOverride: ParamsType = js.native
  
  /**
    * Clears the overriden Geolocation Position and Error.
    */
  @JSName("Page.clearGeolocationOverride")
  var PageDotclearGeolocationOverride: ParamsType = js.native
  
  /**
    * Tries to close page, running its beforeunload hooks, if any.
    */
  @JSName("Page.close")
  var PageDotclose: ParamsType = js.native
  
  /**
    * Crashes renderer on the IO thread, generates minidumps.
    */
  @JSName("Page.crash")
  var PageDotcrash: ParamsType = js.native
  
  /**
    * Creates an isolated world for the given frame.
    */
  @JSName("Page.createIsolatedWorld")
  var PageDotcreateIsolatedWorld: ReturnTypeCreateIsolatedWorldResponse = js.native
  
  /**
    * Deletes browser cookie with given name, domain and path.
    */
  @JSName("Page.deleteCookie")
  var PageDotdeleteCookie: `135` = js.native
  
  /**
    * Disables page domain notifications.
    */
  @JSName("Page.disable")
  var PageDotdisable: ParamsType = js.native
  
  /**
    * Enables page domain notifications.
    */
  @JSName("Page.enable")
  var PageDotenable: ParamsType = js.native
  
  /**
    * Generates a report for testing.
    */
  @JSName("Page.generateTestReport")
  var PageDotgenerateTestReport: `157` = js.native
  
  @JSName("Page.getAppManifest")
  var PageDotgetAppManifest: ReturnTypeGetAppManifestResponse = js.native
  
  /**
    * Returns all browser cookies. Depending on the backend support, will return detailed cookie
    * information in the `cookies` field.
    */
  @JSName("Page.getCookies")
  var PageDotgetCookies: ParamsTypeReturnTypeGetCookiesResponse = js.native
  
  /**
    * Returns present frame tree structure.
    */
  @JSName("Page.getFrameTree")
  var PageDotgetFrameTree: ReturnTypeGetFrameTreeResponse = js.native
  
  @JSName("Page.getInstallabilityErrors")
  var PageDotgetInstallabilityErrors: ReturnTypeGetInstallabilityErrorsResponse = js.native
  
  /**
    * Returns metrics relating to the layouting of the page, such as viewport bounds/scale.
    */
  @JSName("Page.getLayoutMetrics")
  var PageDotgetLayoutMetrics: ReturnTypeGetLayoutMetricsResponse = js.native
  
  @JSName("Page.getManifestIcons")
  var PageDotgetManifestIcons: ReturnTypeGetManifestIconsResponse = js.native
  
  /**
    * Returns navigation history for the current page.
    */
  @JSName("Page.getNavigationHistory")
  var PageDotgetNavigationHistory: ReturnTypeGetNavigationHistoryResponse = js.native
  
  /**
    * Returns content of the given resource.
    */
  @JSName("Page.getResourceContent")
  var PageDotgetResourceContent: ReturnTypeGetResourceContentResponse = js.native
  
  /**
    * Returns present frame / resource tree structure.
    */
  @JSName("Page.getResourceTree")
  var PageDotgetResourceTree: ReturnTypeGetResourceTreeResponse = js.native
  
  /**
    * Accepts or dismisses a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload).
    */
  @JSName("Page.handleJavaScriptDialog")
  var PageDothandleJavaScriptDialog: `136` = js.native
  
  /**
    * Navigates current page to the given URL.
    */
  @JSName("Page.navigate")
  var PageDotnavigate: ReturnTypeNavigateResponse = js.native
  
  /**
    * Navigates current page to the given history entry.
    */
  @JSName("Page.navigateToHistoryEntry")
  var PageDotnavigateToHistoryEntry: `137` = js.native
  
  /**
    * Print page as PDF.
    */
  @JSName("Page.printToPDF")
  var PageDotprintToPDF: ReturnTypePrintToPDFResponse = js.native
  
  /**
    * Reloads given page optionally ignoring the cache.
    */
  @JSName("Page.reload")
  var PageDotreload: `138` = js.native
  
  /**
    * Deprecated, please use removeScriptToEvaluateOnNewDocument instead.
    */
  @JSName("Page.removeScriptToEvaluateOnLoad")
  var PageDotremoveScriptToEvaluateOnLoad: `139` = js.native
  
  /**
    * Removes given script from the list.
    */
  @JSName("Page.removeScriptToEvaluateOnNewDocument")
  var PageDotremoveScriptToEvaluateOnNewDocument: `140` = js.native
  
  /**
    * Resets navigation history for the current page.
    */
  @JSName("Page.resetNavigationHistory")
  var PageDotresetNavigationHistory: ParamsType = js.native
  
  /**
    * Acknowledges that a screencast frame has been received by the frontend.
    */
  @JSName("Page.screencastFrameAck")
  var PageDotscreencastFrameAck: `141` = js.native
  
  /**
    * Searches for given string in resource content.
    */
  @JSName("Page.searchInResource")
  var PageDotsearchInResource: ReturnTypeSearchInResourceResponse = js.native
  
  /**
    * Enable Chrome's experimental ad filter on all sites.
    */
  @JSName("Page.setAdBlockingEnabled")
  var PageDotsetAdBlockingEnabled: `142` = js.native
  
  /**
    * Enable page Content Security Policy by-passing.
    */
  @JSName("Page.setBypassCSP")
  var PageDotsetBypassCSP: `143` = js.native
  
  /**
    * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
    * window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
    * query results).
    */
  @JSName("Page.setDeviceMetricsOverride")
  var PageDotsetDeviceMetricsOverride: `144` = js.native
  
  /**
    * Overrides the Device Orientation.
    */
  @JSName("Page.setDeviceOrientationOverride")
  var PageDotsetDeviceOrientationOverride: `145` = js.native
  
  /**
    * Sets given markup as the document's HTML.
    */
  @JSName("Page.setDocumentContent")
  var PageDotsetDocumentContent: `148` = js.native
  
  /**
    * Set the behavior when downloading a file.
    */
  @JSName("Page.setDownloadBehavior")
  var PageDotsetDownloadBehavior: `149` = js.native
  
  /**
    * Set generic font families.
    */
  @JSName("Page.setFontFamilies")
  var PageDotsetFontFamilies: `146` = js.native
  
  /**
    * Set default font sizes.
    */
  @JSName("Page.setFontSizes")
  var PageDotsetFontSizes: `147` = js.native
  
  /**
    * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
    * unavailable.
    */
  @JSName("Page.setGeolocationOverride")
  var PageDotsetGeolocationOverride: `150` = js.native
  
  /**
    * Intercept file chooser requests and transfer control to protocol clients.
    * When file chooser interception is enabled, native file chooser dialog is not shown.
    * Instead, a protocol event `Page.fileChooserOpened` is emitted.
    */
  @JSName("Page.setInterceptFileChooserDialog")
  var PageDotsetInterceptFileChooserDialog: `158` = js.native
  
  /**
    * Controls whether page will emit lifecycle events.
    */
  @JSName("Page.setLifecycleEventsEnabled")
  var PageDotsetLifecycleEventsEnabled: `151` = js.native
  
  /**
    * Forces compilation cache to be generated for every subresource script.
    */
  @JSName("Page.setProduceCompilationCache")
  var PageDotsetProduceCompilationCache: `155` = js.native
  
  /**
    * Toggles mouse event-based touch event emulation.
    */
  @JSName("Page.setTouchEmulationEnabled")
  var PageDotsetTouchEmulationEnabled: `152` = js.native
  
  /**
    * Tries to update the web lifecycle state of the page.
    * It will transition the page to the given state according to:
    * https://github.com/WICG/web-lifecycle/
    */
  @JSName("Page.setWebLifecycleState")
  var PageDotsetWebLifecycleState: `154` = js.native
  
  /**
    * Starts sending each frame using the `screencastFrame` event.
    */
  @JSName("Page.startScreencast")
  var PageDotstartScreencast: `153` = js.native
  
  /**
    * Force the page stop all navigations and pending resource fetches.
    */
  @JSName("Page.stopLoading")
  var PageDotstopLoading: ParamsType = js.native
  
  /**
    * Stops sending each frame in the `screencastFrame`.
    */
  @JSName("Page.stopScreencast")
  var PageDotstopScreencast: ParamsType = js.native
  
  /**
    * Pauses page execution. Can be resumed using generic Runtime.runIfWaitingForDebugger.
    */
  @JSName("Page.waitForDebugger")
  var PageDotwaitForDebugger: ParamsType = js.native
  
  /**
    * Disable collecting and reporting metrics.
    */
  @JSName("Performance.disable")
  var PerformanceDotdisable: ParamsType = js.native
  
  /**
    * Enable collecting and reporting metrics.
    */
  @JSName("Performance.enable")
  var PerformanceDotenable: `159` = js.native
  
  /**
    * Retrieve current values of run-time metrics.
    */
  @JSName("Performance.getMetrics")
  var PerformanceDotgetMetrics: ReturnTypeGetMetricsResponse = js.native
  
  /**
    * Sets time domain to use for collecting and reporting duration metrics.
    * Note that this must be called before enabling metrics collection. Calling
    * this method while metrics collection is enabled returns an error.
    */
  @JSName("Performance.setTimeDomain")
  var PerformanceDotsetTimeDomain: `160` = js.native
  
  @JSName("Profiler.disable")
  var ProfilerDotdisable: ParamsType = js.native
  
  /**
    * Disable run time call stats collection.
    */
  @JSName("Profiler.disableRuntimeCallStats")
  var ProfilerDotdisableRuntimeCallStats: ParamsType = js.native
  
  @JSName("Profiler.enable")
  var ProfilerDotenable: ParamsType = js.native
  
  /**
    * Enable run time call stats collection.
    */
  @JSName("Profiler.enableRuntimeCallStats")
  var ProfilerDotenableRuntimeCallStats: ParamsType = js.native
  
  /**
    * Collect coverage data for the current isolate. The coverage data may be incomplete due to
    * garbage collection.
    */
  @JSName("Profiler.getBestEffortCoverage")
  var ProfilerDotgetBestEffortCoverage: ReturnTypeGetBestEffortCoverageResponse = js.native
  
  /**
    * Retrieve run time call stats.
    */
  @JSName("Profiler.getRuntimeCallStats")
  var ProfilerDotgetRuntimeCallStats: ReturnTypeGetRuntimeCallStatsResponse = js.native
  
  /**
    * Changes CPU profiler sampling interval. Must be called before CPU profiles recording started.
    */
  @JSName("Profiler.setSamplingInterval")
  var ProfilerDotsetSamplingInterval: `15` = js.native
  
  @JSName("Profiler.start")
  var ProfilerDotstart: ParamsType = js.native
  
  /**
    * Enable precise code coverage. Coverage data for JavaScript executed before enabling precise code
    * coverage may be incomplete. Enabling prevents running optimized code and resets execution
    * counters.
    */
  @JSName("Profiler.startPreciseCoverage")
  var ProfilerDotstartPreciseCoverage: ReturnTypeStartPreciseCoverageResponse = js.native
  
  /**
    * Enable type profile.
    */
  @JSName("Profiler.startTypeProfile")
  var ProfilerDotstartTypeProfile: ParamsType = js.native
  
  @JSName("Profiler.stop")
  var ProfilerDotstop: ReturnTypeStopResponse = js.native
  
  /**
    * Disable precise code coverage. Disabling releases unnecessary execution count records and allows
    * executing optimized code.
    */
  @JSName("Profiler.stopPreciseCoverage")
  var ProfilerDotstopPreciseCoverage: ParamsType = js.native
  
  /**
    * Disable type profile. Disabling releases type profile data collected so far.
    */
  @JSName("Profiler.stopTypeProfile")
  var ProfilerDotstopTypeProfile: ParamsType = js.native
  
  /**
    * Collect coverage data for the current isolate, and resets execution counters. Precise code
    * coverage needs to have started.
    */
  @JSName("Profiler.takePreciseCoverage")
  var ProfilerDottakePreciseCoverage: ReturnTypeTakePreciseCoverageResponse = js.native
  
  /**
    * Collect type profile.
    */
  @JSName("Profiler.takeTypeProfile")
  var ProfilerDottakeTypeProfile: ReturnTypeTakeTypeProfileResponse = js.native
  
  /**
    * If executionContextId is empty, adds binding with the given name on the
    * global objects of all inspected contexts, including those created later,
    * bindings survive reloads.
    * If executionContextId is specified, adds binding only on global object of
    * given execution context.
    * Binding function takes exactly one argument, this argument should be string,
    * in case of any other input, function throws an exception.
    * Each binding function call produces Runtime.bindingCalled notification.
    */
  @JSName("Runtime.addBinding")
  var RuntimeDotaddBinding: `21` = js.native
  
  /**
    * Add handler to promise with given promise object id.
    */
  @JSName("Runtime.awaitPromise")
  var RuntimeDotawaitPromise: ReturnTypeAwaitPromiseResponse = js.native
  
  /**
    * Calls function with given declaration on the given object. Object group of the result is
    * inherited from the target object.
    */
  @JSName("Runtime.callFunctionOn")
  var RuntimeDotcallFunctionOn: ReturnTypeCallFunctionOnResponse = js.native
  
  /**
    * Compiles expression.
    */
  @JSName("Runtime.compileScript")
  var RuntimeDotcompileScript: ReturnTypeCompileScriptResponse = js.native
  
  /**
    * Disables reporting of execution contexts creation.
    */
  @JSName("Runtime.disable")
  var RuntimeDotdisable: ParamsType = js.native
  
  /**
    * Discards collected exceptions and console API calls.
    */
  @JSName("Runtime.discardConsoleEntries")
  var RuntimeDotdiscardConsoleEntries: ParamsType = js.native
  
  /**
    * Enables reporting of execution contexts creation by means of `executionContextCreated` event.
    * When the reporting gets enabled the event will be sent immediately for each existing execution
    * context.
    */
  @JSName("Runtime.enable")
  var RuntimeDotenable: ParamsType = js.native
  
  /**
    * Evaluates expression on global object.
    */
  @JSName("Runtime.evaluate")
  var RuntimeDotevaluate: ReturnTypeEvaluateResponse = js.native
  
  /**
    * Returns the JavaScript heap usage.
    * It is the total usage of the corresponding isolate not scoped to a particular Runtime.
    */
  @JSName("Runtime.getHeapUsage")
  var RuntimeDotgetHeapUsage: ReturnTypeGetHeapUsageResponse = js.native
  
  /**
    * Returns the isolate id.
    */
  @JSName("Runtime.getIsolateId")
  var RuntimeDotgetIsolateId: ReturnTypeGetIsolateIdResponse = js.native
  
  /**
    * Returns properties of a given object. Object group of the result is inherited from the target
    * object.
    */
  @JSName("Runtime.getProperties")
  var RuntimeDotgetProperties: ReturnTypeGetPropertiesResponse = js.native
  
  /**
    * Returns all let, const and class variables from global scope.
    */
  @JSName("Runtime.globalLexicalScopeNames")
  var RuntimeDotglobalLexicalScopeNames: ReturnTypeGlobalLexicalScopeNamesResponse = js.native
  
  @JSName("Runtime.queryObjects")
  var RuntimeDotqueryObjects: ReturnTypeQueryObjectsResponse = js.native
  
  /**
    * Releases remote object with given id.
    */
  @JSName("Runtime.releaseObject")
  var RuntimeDotreleaseObject: `16` = js.native
  
  /**
    * Releases all remote objects that belong to a given group.
    */
  @JSName("Runtime.releaseObjectGroup")
  var RuntimeDotreleaseObjectGroup: `17` = js.native
  
  /**
    * This method does not remove binding function from global object but
    * unsubscribes current runtime agent from Runtime.bindingCalled notifications.
    */
  @JSName("Runtime.removeBinding")
  var RuntimeDotremoveBinding: `22` = js.native
  
  /**
    * Tells inspected instance to run if it was waiting for debugger to attach.
    */
  @JSName("Runtime.runIfWaitingForDebugger")
  var RuntimeDotrunIfWaitingForDebugger: ParamsType = js.native
  
  /**
    * Runs script with given id in a given context.
    */
  @JSName("Runtime.runScript")
  var RuntimeDotrunScript: ReturnTypeRunScriptResponse = js.native
  
  /**
    * Enables or disables async call stacks tracking.
    */
  @JSName("Runtime.setAsyncCallStackDepth")
  var RuntimeDotsetAsyncCallStackDepth: `18` = js.native
  
  @JSName("Runtime.setCustomObjectFormatterEnabled")
  var RuntimeDotsetCustomObjectFormatterEnabled: `19` = js.native
  
  @JSName("Runtime.setMaxCallStackSizeToCapture")
  var RuntimeDotsetMaxCallStackSizeToCapture: `20` = js.native
  
  /**
    * Terminate current or next JavaScript execution.
    * Will cancel the termination when the outer-most script execution ends.
    */
  @JSName("Runtime.terminateExecution")
  var RuntimeDotterminateExecution: ParamsType = js.native
  
  /**
    * Returns supported domains.
    */
  @JSName("Schema.getDomains")
  var SchemaDotgetDomains: ReturnTypeGetDomainsResponse = js.native
  
  /**
    * Disables tracking security state changes.
    */
  @JSName("Security.disable")
  var SecurityDotdisable: ParamsType = js.native
  
  /**
    * Enables tracking security state changes.
    */
  @JSName("Security.enable")
  var SecurityDotenable: ParamsType = js.native
  
  /**
    * Handles a certificate error that fired a certificateError event.
    */
  @JSName("Security.handleCertificateError")
  var SecurityDothandleCertificateError: `162` = js.native
  
  /**
    * Enable/disable whether all certificate errors should be ignored.
    */
  @JSName("Security.setIgnoreCertificateErrors")
  var SecurityDotsetIgnoreCertificateErrors: `161` = js.native
  
  /**
    * Enable/disable overriding certificate errors. If enabled, all certificate error events need to
    * be handled by the DevTools client and should be answered with `handleCertificateError` commands.
    */
  @JSName("Security.setOverrideCertificateErrors")
  var SecurityDotsetOverrideCertificateErrors: `163` = js.native
  
  @JSName("ServiceWorker.deliverPushMessage")
  var ServiceWorkerDotdeliverPushMessage: `164` = js.native
  
  @JSName("ServiceWorker.disable")
  var ServiceWorkerDotdisable: ParamsType = js.native
  
  @JSName("ServiceWorker.dispatchPeriodicSyncEvent")
  var ServiceWorkerDotdispatchPeriodicSyncEvent: `166` = js.native
  
  @JSName("ServiceWorker.dispatchSyncEvent")
  var ServiceWorkerDotdispatchSyncEvent: `165` = js.native
  
  @JSName("ServiceWorker.enable")
  var ServiceWorkerDotenable: ParamsType = js.native
  
  @JSName("ServiceWorker.inspectWorker")
  var ServiceWorkerDotinspectWorker: `167` = js.native
  
  @JSName("ServiceWorker.setForceUpdateOnPageLoad")
  var ServiceWorkerDotsetForceUpdateOnPageLoad: `168` = js.native
  
  @JSName("ServiceWorker.skipWaiting")
  var ServiceWorkerDotskipWaiting: `169` = js.native
  
  @JSName("ServiceWorker.startWorker")
  var ServiceWorkerDotstartWorker: `170` = js.native
  
  @JSName("ServiceWorker.stopAllWorkers")
  var ServiceWorkerDotstopAllWorkers: ParamsType = js.native
  
  @JSName("ServiceWorker.stopWorker")
  var ServiceWorkerDotstopWorker: `171` = js.native
  
  @JSName("ServiceWorker.unregister")
  var ServiceWorkerDotunregister: `172` = js.native
  
  @JSName("ServiceWorker.updateRegistration")
  var ServiceWorkerDotupdateRegistration: `173` = js.native
  
  /**
    * Clears cookies.
    */
  @JSName("Storage.clearCookies")
  var StorageDotclearCookies: `177` = js.native
  
  /**
    * Clears storage for origin.
    */
  @JSName("Storage.clearDataForOrigin")
  var StorageDotclearDataForOrigin: `174` = js.native
  
  /**
    * Returns all browser cookies.
    */
  @JSName("Storage.getCookies")
  var StorageDotgetCookies: `175` = js.native
  
  /**
    * Returns usage and quota in bytes.
    */
  @JSName("Storage.getUsageAndQuota")
  var StorageDotgetUsageAndQuota: ReturnTypeGetUsageAndQuotaResponse = js.native
  
  /**
    * Sets given cookies.
    */
  @JSName("Storage.setCookies")
  var StorageDotsetCookies: `176` = js.native
  
  /**
    * Registers origin to be notified when an update occurs to its cache storage list.
    */
  @JSName("Storage.trackCacheStorageForOrigin")
  var StorageDottrackCacheStorageForOrigin: `178` = js.native
  
  /**
    * Registers origin to be notified when an update occurs to its IndexedDB.
    */
  @JSName("Storage.trackIndexedDBForOrigin")
  var StorageDottrackIndexedDBForOrigin: `179` = js.native
  
  /**
    * Unregisters origin from receiving notifications for cache storage.
    */
  @JSName("Storage.untrackCacheStorageForOrigin")
  var StorageDotuntrackCacheStorageForOrigin: `180` = js.native
  
  /**
    * Unregisters origin from receiving notifications for IndexedDB.
    */
  @JSName("Storage.untrackIndexedDBForOrigin")
  var StorageDotuntrackIndexedDBForOrigin: `181` = js.native
  
  /**
    * Returns information about the system.
    */
  @JSName("SystemInfo.getInfo")
  var SystemInfoDotgetInfo: ReturnTypeGetInfoResponse = js.native
  
  /**
    * Returns information about all running processes.
    */
  @JSName("SystemInfo.getProcessInfo")
  var SystemInfoDotgetProcessInfo: ReturnTypeGetProcessInfoResponse = js.native
  
  /**
    * Activates (focuses) the target.
    */
  @JSName("Target.activateTarget")
  var TargetDotactivateTarget: `182` = js.native
  
  /**
    * Attaches to the browser target, only uses flat sessionId mode.
    */
  @JSName("Target.attachToBrowserTarget")
  var TargetDotattachToBrowserTarget: ReturnTypeAttachToBrowserTargetResponse = js.native
  
  /**
    * Attaches to the target with given id.
    */
  @JSName("Target.attachToTarget")
  var TargetDotattachToTarget: ReturnTypeAttachToTargetResponse = js.native
  
  /**
    * Closes the target. If the target is a page that gets closed too.
    */
  @JSName("Target.closeTarget")
  var TargetDotcloseTarget: ReturnTypeCloseTargetResponse = js.native
  
  /**
    * Creates a new empty BrowserContext. Similar to an incognito profile but you can have more than
    * one.
    */
  @JSName("Target.createBrowserContext")
  var TargetDotcreateBrowserContext: ReturnTypeCreateBrowserContextResponse = js.native
  
  /**
    * Creates a new page.
    */
  @JSName("Target.createTarget")
  var TargetDotcreateTarget: ReturnTypeCreateTargetResponse = js.native
  
  /**
    * Detaches session with given id.
    */
  @JSName("Target.detachFromTarget")
  var TargetDotdetachFromTarget: `184` = js.native
  
  /**
    * Deletes a BrowserContext. All the belonging pages will be closed without calling their
    * beforeunload hooks.
    */
  @JSName("Target.disposeBrowserContext")
  var TargetDotdisposeBrowserContext: `185` = js.native
  
  /**
    * Inject object to the target's main frame that provides a communication
    * channel with browser target.
    * 
    * Injected object will be available as `window[bindingName]`.
    * 
    * The object has the follwing API:
    * - `binding.send(json)` - a method to send messages over the remote debugging protocol
    * - `binding.onmessage = json => handleMessage(json)` - a callback that will be called for the protocol notifications and command responses.
    */
  @JSName("Target.exposeDevToolsProtocol")
  var TargetDotexposeDevToolsProtocol: `183` = js.native
  
  /**
    * Returns all browser contexts created with `Target.createBrowserContext` method.
    */
  @JSName("Target.getBrowserContexts")
  var TargetDotgetBrowserContexts: ReturnTypeGetBrowserContextsResponse = js.native
  
  /**
    * Returns information about a target.
    */
  @JSName("Target.getTargetInfo")
  var TargetDotgetTargetInfo: ReturnTypeGetTargetInfoResponse = js.native
  
  /**
    * Retrieves a list of available targets.
    */
  @JSName("Target.getTargets")
  var TargetDotgetTargets: ReturnTypeGetTargetsResponse = js.native
  
  /**
    * Sends protocol message over session with given id.
    * Consider using flat mode instead; see commands attachToTarget, setAutoAttach,
    * and crbug.com/991325.
    */
  @JSName("Target.sendMessageToTarget")
  var TargetDotsendMessageToTarget: `186` = js.native
  
  /**
    * Controls whether to automatically attach to new targets which are considered to be related to
    * this one. When turned on, attaches to all existing related targets as well. When turned off,
    * automatically detaches from all currently attached targets.
    */
  @JSName("Target.setAutoAttach")
  var TargetDotsetAutoAttach: `187` = js.native
  
  /**
    * Controls whether to discover available targets and notify via
    * `targetCreated/targetInfoChanged/targetDestroyed` events.
    */
  @JSName("Target.setDiscoverTargets")
  var TargetDotsetDiscoverTargets: `188` = js.native
  
  /**
    * Enables target discovery for the specified locations, when `setDiscoverTargets` was set to
    * `true`.
    */
  @JSName("Target.setRemoteLocations")
  var TargetDotsetRemoteLocations: `189` = js.native
  
  /**
    * Request browser port binding.
    */
  @JSName("Tethering.bind")
  var TetheringDotbind: `190` = js.native
  
  /**
    * Request browser port unbinding.
    */
  @JSName("Tethering.unbind")
  var TetheringDotunbind: `191` = js.native
  
  /**
    * Stop trace events collection.
    */
  @JSName("Tracing.end")
  var TracingDotend: ParamsType = js.native
  
  /**
    * Gets supported tracing categories.
    */
  @JSName("Tracing.getCategories")
  var TracingDotgetCategories: ReturnTypeGetCategoriesResponse = js.native
  
  /**
    * Record a clock sync marker in the trace.
    */
  @JSName("Tracing.recordClockSyncMarker")
  var TracingDotrecordClockSyncMarker: `192` = js.native
  
  /**
    * Request a global memory dump.
    */
  @JSName("Tracing.requestMemoryDump")
  var TracingDotrequestMemoryDump: ReturnTypeRequestMemoryDumpResponse = js.native
  
  /**
    * Start trace events collection.
    */
  @JSName("Tracing.start")
  var TracingDotstart: `193` = js.native
  
  /**
    * Disables the WebAudio domain.
    */
  @JSName("WebAudio.disable")
  var WebAudioDotdisable: ParamsType = js.native
  
  /**
    * Enables the WebAudio domain and starts sending context lifetime events.
    */
  @JSName("WebAudio.enable")
  var WebAudioDotenable: ParamsType = js.native
  
  /**
    * Fetch the realtime data from the registered contexts.
    */
  @JSName("WebAudio.getRealtimeData")
  var WebAudioDotgetRealtimeData: ReturnTypeGetRealtimeDataResponse = js.native
  
  /**
    * Adds the credential to the specified authenticator.
    */
  @JSName("WebAuthn.addCredential")
  var WebAuthnDotaddCredential: `200` = js.native
  
  /**
    * Creates and adds a virtual authenticator.
    */
  @JSName("WebAuthn.addVirtualAuthenticator")
  var WebAuthnDotaddVirtualAuthenticator: ReturnTypeAddVirtualAuthenticatorResponse = js.native
  
  /**
    * Clears all the credentials from the specified device.
    */
  @JSName("WebAuthn.clearCredentials")
  var WebAuthnDotclearCredentials: `202` = js.native
  
  /**
    * Disable the WebAuthn domain.
    */
  @JSName("WebAuthn.disable")
  var WebAuthnDotdisable: ParamsType = js.native
  
  /**
    * Enable the WebAuthn domain and start intercepting credential storage and
    * retrieval with a virtual authenticator.
    */
  @JSName("WebAuthn.enable")
  var WebAuthnDotenable: ParamsType = js.native
  
  /**
    * Returns a single credential stored in the given virtual authenticator that
    * matches the credential ID.
    */
  @JSName("WebAuthn.getCredential")
  var WebAuthnDotgetCredential: ReturnTypeGetCredentialResponse = js.native
  
  /**
    * Returns all the credentials stored in the given virtual authenticator.
    */
  @JSName("WebAuthn.getCredentials")
  var WebAuthnDotgetCredentials: ReturnTypeGetCredentialsResponse = js.native
  
  /**
    * Removes a credential from the authenticator.
    */
  @JSName("WebAuthn.removeCredential")
  var WebAuthnDotremoveCredential: `201` = js.native
  
  /**
    * Removes the given authenticator.
    */
  @JSName("WebAuthn.removeVirtualAuthenticator")
  var WebAuthnDotremoveVirtualAuthenticator: `199` = js.native
  
  /**
    * Sets whether User Verification succeeds or fails for an authenticator.
    * The default is true.
    */
  @JSName("WebAuthn.setUserVerified")
  var WebAuthnDotsetUserVerified: `203` = js.native
}
object Commands {
  
  @scala.inline
  def apply(
    AccessibilityDotdisable: ParamsType,
    AccessibilityDotenable: ParamsType,
    AccessibilityDotgetFullAXTree: ReturnTypeGetFullAXTreeResponse,
    AccessibilityDotgetPartialAXTree: ReturnTypeGetPartialAXTreeResponse,
    AnimationDotdisable: ParamsType,
    AnimationDotenable: ParamsType,
    AnimationDotgetCurrentTime: ReturnTypeGetCurrentTimeResponse,
    AnimationDotgetPlaybackRate: ReturnTypeGetPlaybackRateResponse,
    AnimationDotreleaseAnimations: `23`,
    AnimationDotresolveAnimation: ReturnTypeResolveAnimationResponse,
    AnimationDotseekAnimations: `24`,
    AnimationDotsetPaused: `25`,
    AnimationDotsetPlaybackRate: `26`,
    AnimationDotsetTiming: `27`,
    ApplicationCacheDotenable: ParamsType,
    ApplicationCacheDotgetApplicationCacheForFrame: ReturnTypeGetApplicationCacheForFrameResponse,
    ApplicationCacheDotgetFramesWithManifests: ReturnTypeGetFramesWithManifestsResponse,
    ApplicationCacheDotgetManifestForFrame: ReturnTypeGetManifestForFrameResponse,
    AuditsDotdisable: ParamsType,
    AuditsDotenable: ParamsType,
    AuditsDotgetEncodedResponse: ReturnTypeGetEncodedResponseResponse,
    BackgroundServiceDotclearEvents: `31`,
    BackgroundServiceDotsetRecording: `30`,
    BackgroundServiceDotstartObserving: `28`,
    BackgroundServiceDotstopObserving: `29`,
    BrowserDotclose: ParamsType,
    BrowserDotcrash: ParamsType,
    BrowserDotcrashGpuProcess: ParamsType,
    BrowserDotgetBrowserCommandLine: ReturnTypeGetBrowserCommandLineResponse,
    BrowserDotgetHistogram: ReturnTypeGetHistogramResponse,
    BrowserDotgetHistograms: ReturnTypeGetHistogramsResponse,
    BrowserDotgetVersion: ReturnTypeGetVersionResponse,
    BrowserDotgetWindowBounds: ReturnTypeGetWindowBoundsResponse,
    BrowserDotgetWindowForTarget: ReturnTypeGetWindowForTargetResponse,
    BrowserDotgrantPermissions: `33`,
    BrowserDotresetPermissions: `34`,
    BrowserDotsetDockTile: `37`,
    BrowserDotsetDownloadBehavior: `35`,
    BrowserDotsetPermission: `32`,
    BrowserDotsetWindowBounds: `36`,
    CSSDotaddRule: ReturnTypeAddRuleResponse,
    CSSDotcollectClassNames: ReturnTypeCollectClassNamesResponse,
    CSSDotcreateStyleSheet: ReturnTypeCreateStyleSheetResponse,
    CSSDotdisable: ParamsType,
    CSSDotenable: ParamsType,
    CSSDotforcePseudoState: `38`,
    CSSDotgetBackgroundColors: ReturnTypeGetBackgroundColorsResponse,
    CSSDotgetComputedStyleForNode: ReturnTypeGetComputedStyleForNodeResponse,
    CSSDotgetInlineStylesForNode: ReturnTypeGetInlineStylesForNodeResponse,
    CSSDotgetMatchedStylesForNode: ReturnTypeGetMatchedStylesForNodeResponse,
    CSSDotgetMediaQueries: ReturnTypeGetMediaQueriesResponse,
    CSSDotgetPlatformFontsForNode: ReturnTypeGetPlatformFontsForNodeResponse,
    CSSDotgetStyleSheetText: ReturnTypeGetStyleSheetTextResponse,
    CSSDotsetEffectivePropertyValueForNode: `39`,
    CSSDotsetKeyframeKey: ReturnTypeSetKeyframeKeyResponse,
    CSSDotsetMediaText: ReturnTypeSetMediaTextResponse,
    CSSDotsetRuleSelector: ReturnTypeSetRuleSelectorResponse,
    CSSDotsetStyleSheetText: ReturnTypeSetStyleSheetTextResponse,
    CSSDotsetStyleTexts: ReturnTypeSetStyleTextsResponse,
    CSSDotstartRuleUsageTracking: ParamsType,
    CSSDotstopRuleUsageTracking: ReturnTypeStopRuleUsageTrackingResponse,
    CSSDottakeCoverageDelta: ReturnTypeTakeCoverageDeltaResponse,
    CacheStorageDotdeleteCache: `40`,
    CacheStorageDotdeleteEntry: `41`,
    CacheStorageDotrequestCacheNames: ReturnTypeRequestCacheNamesResponse,
    CacheStorageDotrequestCachedResponse: ReturnTypeRequestCachedResponseResponse,
    CacheStorageDotrequestEntries: ReturnTypeRequestEntriesResponse,
    CastDotdisable: ParamsType,
    CastDotenable: `42`,
    CastDotsetSinkToUse: `43`,
    CastDotstartTabMirroring: `44`,
    CastDotstopCasting: `45`,
    ConsoleDotclearMessages: ParamsType,
    ConsoleDotdisable: ParamsType,
    ConsoleDotenable: ParamsType,
    DOMDebuggerDotgetEventListeners: ReturnTypeGetEventListenersResponse,
    DOMDebuggerDotremoveDOMBreakpoint: `59`,
    DOMDebuggerDotremoveEventListenerBreakpoint: `60`,
    DOMDebuggerDotremoveInstrumentationBreakpoint: `61`,
    DOMDebuggerDotremoveXHRBreakpoint: `62`,
    DOMDebuggerDotsetDOMBreakpoint: `63`,
    DOMDebuggerDotsetEventListenerBreakpoint: `64`,
    DOMDebuggerDotsetInstrumentationBreakpoint: `65`,
    DOMDebuggerDotsetXHRBreakpoint: `66`,
    DOMDotcollectClassNamesFromSubtree: ReturnTypeCollectClassNamesFromSubtreeResponse,
    DOMDotcopyTo: ReturnTypeCopyToResponse,
    DOMDotdescribeNode: ReturnTypeDescribeNodeResponse,
    DOMDotdisable: ParamsType,
    DOMDotdiscardSearchResults: `47`,
    DOMDotenable: ParamsType,
    DOMDotfocus: `48`,
    DOMDotgetAttributes: ReturnTypeGetAttributesResponse,
    DOMDotgetBoxModel: ReturnTypeGetBoxModelResponse,
    DOMDotgetContentQuads: ReturnTypeGetContentQuadsResponse,
    DOMDotgetDocument: ReturnTypeGetDocumentResponse,
    DOMDotgetFileInfo: ReturnTypeGetFileInfoResponse,
    DOMDotgetFlattenedDocument: ReturnTypeGetFlattenedDocumentResponse,
    DOMDotgetFrameOwner: ReturnTypeGetFrameOwnerResponse,
    DOMDotgetNodeForLocation: ReturnTypeGetNodeForLocationResponse,
    DOMDotgetNodeStackTraces: ReturnTypeGetNodeStackTracesResponse,
    DOMDotgetOuterHTML: ReturnTypeGetOuterHTMLResponse,
    DOMDotgetRelayoutBoundary: ReturnTypeGetRelayoutBoundaryResponse,
    DOMDotgetSearchResults: ReturnTypeGetSearchResultsResponse,
    DOMDothideHighlight: ParamsType,
    DOMDothighlightNode: ParamsType,
    DOMDothighlightRect: ParamsType,
    DOMDotmarkUndoableState: ParamsType,
    DOMDotmoveTo: ReturnTypeMoveToResponse,
    DOMDotperformSearch: ReturnTypePerformSearchResponse,
    DOMDotpushNodeByPathToFrontend: ReturnTypePushNodeByPathToFrontendResponse,
    DOMDotpushNodesByBackendIdsToFrontend: ReturnTypePushNodesByBackendIdsToFrontendResponse,
    DOMDotquerySelector: ReturnTypeQuerySelectorResponse,
    DOMDotquerySelectorAll: ReturnTypeQuerySelectorAllResponse,
    DOMDotredo: ParamsType,
    DOMDotremoveAttribute: `49`,
    DOMDotremoveNode: `50`,
    DOMDotrequestChildNodes: `51`,
    DOMDotrequestNode: ReturnTypeRequestNodeResponse,
    DOMDotresolveNode: ReturnTypeResolveNodeResponse,
    DOMDotscrollIntoViewIfNeeded: `46`,
    DOMDotsetAttributeValue: `52`,
    DOMDotsetAttributesAsText: `53`,
    DOMDotsetFileInputFiles: `54`,
    DOMDotsetInspectedNode: `56`,
    DOMDotsetNodeName: ReturnTypeSetNodeNameResponse,
    DOMDotsetNodeStackTracesEnabled: `55`,
    DOMDotsetNodeValue: `57`,
    DOMDotsetOuterHTML: `58`,
    DOMDotundo: ParamsType,
    DOMSnapshotDotcaptureSnapshot: ReturnTypeCaptureSnapshotResponse,
    DOMSnapshotDotdisable: ParamsType,
    DOMSnapshotDotenable: ParamsType,
    DOMSnapshotDotgetSnapshot: ReturnTypeGetSnapshotResponse,
    DOMStorageDotclear: `67`,
    DOMStorageDotdisable: ParamsType,
    DOMStorageDotenable: ParamsType,
    DOMStorageDotgetDOMStorageItems: ReturnTypeGetDOMStorageItemsResponse,
    DOMStorageDotremoveDOMStorageItem: `68`,
    DOMStorageDotsetDOMStorageItem: `69`,
    DatabaseDotdisable: ParamsType,
    DatabaseDotenable: ParamsType,
    DatabaseDotexecuteSQL: ReturnTypeExecuteSQLResponse,
    DatabaseDotgetDatabaseTableNames: ReturnTypeGetDatabaseTableNamesResponse,
    DebuggerDotcontinueToLocation: ReturnType,
    DebuggerDotdisable: ParamsType,
    DebuggerDotenable: ParamsTypeReturnType,
    DebuggerDotevaluateOnCallFrame: ReturnTypeEvaluateOnCallFrameResponse,
    DebuggerDotexecuteWasmEvaluator: ReturnTypeExecuteWasmEvaluatorResponse,
    DebuggerDotgetPossibleBreakpoints: ReturnTypeGetPossibleBreakpointsResponse,
    DebuggerDotgetScriptSource: ReturnTypeGetScriptSourceResponse,
    DebuggerDotgetStackTrace: ReturnTypeGetStackTraceResponse,
    DebuggerDotgetWasmBytecode: ReturnTypeGetWasmBytecodeResponse,
    DebuggerDotpause: ParamsType,
    DebuggerDotpauseOnAsyncCall: ReturnTypeVoid,
    DebuggerDotremoveBreakpoint: ParamsTypeReturnTypeVoid,
    DebuggerDotrestartFrame: ReturnTypeRestartFrameResponse,
    DebuggerDotresume: `0`,
    DebuggerDotsearchInContent: ReturnTypeSearchInContentResponse,
    DebuggerDotsetAsyncCallStackDepth: `1`,
    DebuggerDotsetBlackboxPatterns: `2`,
    DebuggerDotsetBlackboxedRanges: `3`,
    DebuggerDotsetBreakpoint: ReturnTypeSetBreakpointResponse,
    DebuggerDotsetBreakpointByUrl: ReturnTypeSetBreakpointByUrlResponse,
    DebuggerDotsetBreakpointOnFunctionCall: ReturnTypeSetBreakpointOnFunctionCallResponse,
    DebuggerDotsetBreakpointsActive: `4`,
    DebuggerDotsetInstrumentationBreakpoint: ReturnTypeSetInstrumentationBreakpointResponse,
    DebuggerDotsetPauseOnExceptions: `5`,
    DebuggerDotsetReturnValue: `6`,
    DebuggerDotsetScriptSource: ReturnTypeSetScriptSourceResponse,
    DebuggerDotsetSkipAllPauses: `7`,
    DebuggerDotsetVariableValue: `8`,
    DebuggerDotstepInto: `9`,
    DebuggerDotstepOut: ParamsType,
    DebuggerDotstepOver: ParamsType,
    DeviceOrientationDotclearDeviceOrientationOverride: ParamsType,
    DeviceOrientationDotsetDeviceOrientationOverride: `70`,
    EmulationDotcanEmulate: ReturnTypeCanEmulateResponse,
    EmulationDotclearDeviceMetricsOverride: ParamsType,
    EmulationDotclearGeolocationOverride: ParamsType,
    EmulationDotresetPageScaleFactor: ParamsType,
    EmulationDotsetCPUThrottlingRate: `72`,
    EmulationDotsetDefaultBackgroundColorOverride: `73`,
    EmulationDotsetDeviceMetricsOverride: `74`,
    EmulationDotsetDocumentCookieDisabled: `76`,
    EmulationDotsetEmitTouchEventsForMouse: `77`,
    EmulationDotsetEmulatedMedia: `78`,
    EmulationDotsetEmulatedVisionDeficiency: `79`,
    EmulationDotsetFocusEmulationEnabled: `71`,
    EmulationDotsetGeolocationOverride: `80`,
    EmulationDotsetLocaleOverride: `85`,
    EmulationDotsetNavigatorOverrides: `81`,
    EmulationDotsetPageScaleFactor: `82`,
    EmulationDotsetScriptExecutionDisabled: `83`,
    EmulationDotsetScrollbarsHidden: `75`,
    EmulationDotsetTimezoneOverride: `86`,
    EmulationDotsetTouchEmulationEnabled: `84`,
    EmulationDotsetUserAgentOverride: `88`,
    EmulationDotsetVirtualTimePolicy: ReturnTypeSetVirtualTimePolicyResponse,
    EmulationDotsetVisibleSize: `87`,
    FetchDotcontinueRequest: `197`,
    FetchDotcontinueWithAuth: `198`,
    FetchDotdisable: ParamsType,
    FetchDotenable: `194`,
    FetchDotfailRequest: `195`,
    FetchDotfulfillRequest: `196`,
    FetchDotgetResponseBody: ParamsTypeReturnTypeGetResponseBodyResponse,
    FetchDottakeResponseBodyAsStream: ReturnTypeTakeResponseBodyAsStreamResponse,
    HeadlessExperimentalDotbeginFrame: ReturnTypeBeginFrameResponse,
    HeadlessExperimentalDotdisable: ParamsType,
    HeadlessExperimentalDotenable: ParamsType,
    HeapProfilerDotaddInspectedHeapObject: `10`,
    HeapProfilerDotcollectGarbage: ParamsType,
    HeapProfilerDotdisable: ParamsType,
    HeapProfilerDotenable: ParamsType,
    HeapProfilerDotgetHeapObjectId: ReturnTypeGetHeapObjectIdResponse,
    HeapProfilerDotgetObjectByHeapObjectId: ReturnTypeGetObjectByHeapObjectIdResponse,
    HeapProfilerDotgetSamplingProfile: ReturnTypeGetSamplingProfileResponse,
    HeapProfilerDotstartSampling: `11`,
    HeapProfilerDotstartTrackingHeapObjects: `12`,
    HeapProfilerDotstopSampling: ReturnTypeStopSamplingResponse,
    HeapProfilerDotstopTrackingHeapObjects: `13`,
    HeapProfilerDottakeHeapSnapshot: `14`,
    IODotclose: `89`,
    IODotread: ReturnTypeReadResponse,
    IODotresolveBlob: ReturnTypeResolveBlobResponse,
    IndexedDBDotclearObjectStore: `90`,
    IndexedDBDotdeleteDatabase: `91`,
    IndexedDBDotdeleteObjectStoreEntries: `92`,
    IndexedDBDotdisable: ParamsType,
    IndexedDBDotenable: ParamsType,
    IndexedDBDotgetMetadata: ReturnTypeGetMetadataResponse,
    IndexedDBDotrequestData: ReturnTypeRequestDataResponse,
    IndexedDBDotrequestDatabase: ReturnTypeRequestDatabaseResponse,
    IndexedDBDotrequestDatabaseNames: ReturnTypeRequestDatabaseNamesResponse,
    InputDotdispatchKeyEvent: `93`,
    InputDotdispatchMouseEvent: `95`,
    InputDotdispatchTouchEvent: `96`,
    InputDotemulateTouchFromMouseEvent: `97`,
    InputDotinsertText: `94`,
    InputDotsetIgnoreInputEvents: `98`,
    InputDotsynthesizePinchGesture: `99`,
    InputDotsynthesizeScrollGesture: `100`,
    InputDotsynthesizeTapGesture: `101`,
    InspectorDotdisable: ParamsType,
    InspectorDotenable: ParamsType,
    LayerTreeDotcompositingReasons: ReturnTypeCompositingReasonsResponse,
    LayerTreeDotdisable: ParamsType,
    LayerTreeDotenable: ParamsType,
    LayerTreeDotloadSnapshot: ReturnTypeLoadSnapshotResponse,
    LayerTreeDotmakeSnapshot: ReturnTypeMakeSnapshotResponse,
    LayerTreeDotprofileSnapshot: ReturnTypeProfileSnapshotResponse,
    LayerTreeDotreleaseSnapshot: `102`,
    LayerTreeDotreplaySnapshot: ReturnTypeReplaySnapshotResponse,
    LayerTreeDotsnapshotCommandLog: ReturnTypeSnapshotCommandLogResponse
  ): Commands = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Accessibility.disable")(AccessibilityDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("Accessibility.enable")(AccessibilityDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("Accessibility.getFullAXTree")(AccessibilityDotgetFullAXTree.asInstanceOf[js.Any])
    __obj.updateDynamic("Accessibility.getPartialAXTree")(AccessibilityDotgetPartialAXTree.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.disable")(AnimationDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.enable")(AnimationDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.getCurrentTime")(AnimationDotgetCurrentTime.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.getPlaybackRate")(AnimationDotgetPlaybackRate.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.releaseAnimations")(AnimationDotreleaseAnimations.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.resolveAnimation")(AnimationDotresolveAnimation.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.seekAnimations")(AnimationDotseekAnimations.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.setPaused")(AnimationDotsetPaused.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.setPlaybackRate")(AnimationDotsetPlaybackRate.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.setTiming")(AnimationDotsetTiming.asInstanceOf[js.Any])
    __obj.updateDynamic("ApplicationCache.enable")(ApplicationCacheDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("ApplicationCache.getApplicationCacheForFrame")(ApplicationCacheDotgetApplicationCacheForFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("ApplicationCache.getFramesWithManifests")(ApplicationCacheDotgetFramesWithManifests.asInstanceOf[js.Any])
    __obj.updateDynamic("ApplicationCache.getManifestForFrame")(ApplicationCacheDotgetManifestForFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("Audits.disable")(AuditsDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("Audits.enable")(AuditsDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("Audits.getEncodedResponse")(AuditsDotgetEncodedResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("BackgroundService.clearEvents")(BackgroundServiceDotclearEvents.asInstanceOf[js.Any])
    __obj.updateDynamic("BackgroundService.setRecording")(BackgroundServiceDotsetRecording.asInstanceOf[js.Any])
    __obj.updateDynamic("BackgroundService.startObserving")(BackgroundServiceDotstartObserving.asInstanceOf[js.Any])
    __obj.updateDynamic("BackgroundService.stopObserving")(BackgroundServiceDotstopObserving.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.close")(BrowserDotclose.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.crash")(BrowserDotcrash.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.crashGpuProcess")(BrowserDotcrashGpuProcess.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.getBrowserCommandLine")(BrowserDotgetBrowserCommandLine.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.getHistogram")(BrowserDotgetHistogram.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.getHistograms")(BrowserDotgetHistograms.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.getVersion")(BrowserDotgetVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.getWindowBounds")(BrowserDotgetWindowBounds.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.getWindowForTarget")(BrowserDotgetWindowForTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.grantPermissions")(BrowserDotgrantPermissions.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.resetPermissions")(BrowserDotresetPermissions.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.setDockTile")(BrowserDotsetDockTile.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.setDownloadBehavior")(BrowserDotsetDownloadBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.setPermission")(BrowserDotsetPermission.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser.setWindowBounds")(BrowserDotsetWindowBounds.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.addRule")(CSSDotaddRule.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.collectClassNames")(CSSDotcollectClassNames.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.createStyleSheet")(CSSDotcreateStyleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.disable")(CSSDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.enable")(CSSDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.forcePseudoState")(CSSDotforcePseudoState.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.getBackgroundColors")(CSSDotgetBackgroundColors.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.getComputedStyleForNode")(CSSDotgetComputedStyleForNode.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.getInlineStylesForNode")(CSSDotgetInlineStylesForNode.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.getMatchedStylesForNode")(CSSDotgetMatchedStylesForNode.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.getMediaQueries")(CSSDotgetMediaQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.getPlatformFontsForNode")(CSSDotgetPlatformFontsForNode.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.getStyleSheetText")(CSSDotgetStyleSheetText.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.setEffectivePropertyValueForNode")(CSSDotsetEffectivePropertyValueForNode.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.setKeyframeKey")(CSSDotsetKeyframeKey.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.setMediaText")(CSSDotsetMediaText.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.setRuleSelector")(CSSDotsetRuleSelector.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.setStyleSheetText")(CSSDotsetStyleSheetText.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.setStyleTexts")(CSSDotsetStyleTexts.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.startRuleUsageTracking")(CSSDotstartRuleUsageTracking.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.stopRuleUsageTracking")(CSSDotstopRuleUsageTracking.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.takeCoverageDelta")(CSSDottakeCoverageDelta.asInstanceOf[js.Any])
    __obj.updateDynamic("CacheStorage.deleteCache")(CacheStorageDotdeleteCache.asInstanceOf[js.Any])
    __obj.updateDynamic("CacheStorage.deleteEntry")(CacheStorageDotdeleteEntry.asInstanceOf[js.Any])
    __obj.updateDynamic("CacheStorage.requestCacheNames")(CacheStorageDotrequestCacheNames.asInstanceOf[js.Any])
    __obj.updateDynamic("CacheStorage.requestCachedResponse")(CacheStorageDotrequestCachedResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("CacheStorage.requestEntries")(CacheStorageDotrequestEntries.asInstanceOf[js.Any])
    __obj.updateDynamic("Cast.disable")(CastDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("Cast.enable")(CastDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("Cast.setSinkToUse")(CastDotsetSinkToUse.asInstanceOf[js.Any])
    __obj.updateDynamic("Cast.startTabMirroring")(CastDotstartTabMirroring.asInstanceOf[js.Any])
    __obj.updateDynamic("Cast.stopCasting")(CastDotstopCasting.asInstanceOf[js.Any])
    __obj.updateDynamic("Console.clearMessages")(ConsoleDotclearMessages.asInstanceOf[js.Any])
    __obj.updateDynamic("Console.disable")(ConsoleDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("Console.enable")(ConsoleDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMDebugger.getEventListeners")(DOMDebuggerDotgetEventListeners.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMDebugger.removeDOMBreakpoint")(DOMDebuggerDotremoveDOMBreakpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMDebugger.removeEventListenerBreakpoint")(DOMDebuggerDotremoveEventListenerBreakpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMDebugger.removeInstrumentationBreakpoint")(DOMDebuggerDotremoveInstrumentationBreakpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMDebugger.removeXHRBreakpoint")(DOMDebuggerDotremoveXHRBreakpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMDebugger.setDOMBreakpoint")(DOMDebuggerDotsetDOMBreakpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMDebugger.setEventListenerBreakpoint")(DOMDebuggerDotsetEventListenerBreakpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMDebugger.setInstrumentationBreakpoint")(DOMDebuggerDotsetInstrumentationBreakpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMDebugger.setXHRBreakpoint")(DOMDebuggerDotsetXHRBreakpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.collectClassNamesFromSubtree")(DOMDotcollectClassNamesFromSubtree.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.copyTo")(DOMDotcopyTo.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.describeNode")(DOMDotdescribeNode.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.disable")(DOMDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.discardSearchResults")(DOMDotdiscardSearchResults.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.enable")(DOMDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.focus")(DOMDotfocus.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getAttributes")(DOMDotgetAttributes.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getBoxModel")(DOMDotgetBoxModel.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getContentQuads")(DOMDotgetContentQuads.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getDocument")(DOMDotgetDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getFileInfo")(DOMDotgetFileInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getFlattenedDocument")(DOMDotgetFlattenedDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getFrameOwner")(DOMDotgetFrameOwner.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getNodeForLocation")(DOMDotgetNodeForLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getNodeStackTraces")(DOMDotgetNodeStackTraces.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getOuterHTML")(DOMDotgetOuterHTML.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getRelayoutBoundary")(DOMDotgetRelayoutBoundary.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.getSearchResults")(DOMDotgetSearchResults.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.hideHighlight")(DOMDothideHighlight.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.highlightNode")(DOMDothighlightNode.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.highlightRect")(DOMDothighlightRect.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.markUndoableState")(DOMDotmarkUndoableState.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.moveTo")(DOMDotmoveTo.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.performSearch")(DOMDotperformSearch.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.pushNodeByPathToFrontend")(DOMDotpushNodeByPathToFrontend.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.pushNodesByBackendIdsToFrontend")(DOMDotpushNodesByBackendIdsToFrontend.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.querySelector")(DOMDotquerySelector.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.querySelectorAll")(DOMDotquerySelectorAll.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.redo")(DOMDotredo.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.removeAttribute")(DOMDotremoveAttribute.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.removeNode")(DOMDotremoveNode.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.requestChildNodes")(DOMDotrequestChildNodes.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.requestNode")(DOMDotrequestNode.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.resolveNode")(DOMDotresolveNode.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.scrollIntoViewIfNeeded")(DOMDotscrollIntoViewIfNeeded.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.setAttributeValue")(DOMDotsetAttributeValue.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.setAttributesAsText")(DOMDotsetAttributesAsText.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.setFileInputFiles")(DOMDotsetFileInputFiles.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.setInspectedNode")(DOMDotsetInspectedNode.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.setNodeName")(DOMDotsetNodeName.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.setNodeStackTracesEnabled")(DOMDotsetNodeStackTracesEnabled.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.setNodeValue")(DOMDotsetNodeValue.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.setOuterHTML")(DOMDotsetOuterHTML.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.undo")(DOMDotundo.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMSnapshot.captureSnapshot")(DOMSnapshotDotcaptureSnapshot.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMSnapshot.disable")(DOMSnapshotDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMSnapshot.enable")(DOMSnapshotDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMSnapshot.getSnapshot")(DOMSnapshotDotgetSnapshot.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMStorage.clear")(DOMStorageDotclear.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMStorage.disable")(DOMStorageDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMStorage.enable")(DOMStorageDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMStorage.getDOMStorageItems")(DOMStorageDotgetDOMStorageItems.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMStorage.removeDOMStorageItem")(DOMStorageDotremoveDOMStorageItem.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMStorage.setDOMStorageItem")(DOMStorageDotsetDOMStorageItem.asInstanceOf[js.Any])
    __obj.updateDynamic("Database.disable")(DatabaseDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("Database.enable")(DatabaseDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("Database.executeSQL")(DatabaseDotexecuteSQL.asInstanceOf[js.Any])
    __obj.updateDynamic("Database.getDatabaseTableNames")(DatabaseDotgetDatabaseTableNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.continueToLocation")(DebuggerDotcontinueToLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.disable")(DebuggerDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.enable")(DebuggerDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.evaluateOnCallFrame")(DebuggerDotevaluateOnCallFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.executeWasmEvaluator")(DebuggerDotexecuteWasmEvaluator.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.getPossibleBreakpoints")(DebuggerDotgetPossibleBreakpoints.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.getScriptSource")(DebuggerDotgetScriptSource.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.getStackTrace")(DebuggerDotgetStackTrace.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.getWasmBytecode")(DebuggerDotgetWasmBytecode.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.pause")(DebuggerDotpause.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.pauseOnAsyncCall")(DebuggerDotpauseOnAsyncCall.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.removeBreakpoint")(DebuggerDotremoveBreakpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.restartFrame")(DebuggerDotrestartFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.resume")(DebuggerDotresume.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.searchInContent")(DebuggerDotsearchInContent.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setAsyncCallStackDepth")(DebuggerDotsetAsyncCallStackDepth.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setBlackboxPatterns")(DebuggerDotsetBlackboxPatterns.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setBlackboxedRanges")(DebuggerDotsetBlackboxedRanges.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setBreakpoint")(DebuggerDotsetBreakpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setBreakpointByUrl")(DebuggerDotsetBreakpointByUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setBreakpointOnFunctionCall")(DebuggerDotsetBreakpointOnFunctionCall.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setBreakpointsActive")(DebuggerDotsetBreakpointsActive.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setInstrumentationBreakpoint")(DebuggerDotsetInstrumentationBreakpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setPauseOnExceptions")(DebuggerDotsetPauseOnExceptions.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setReturnValue")(DebuggerDotsetReturnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setScriptSource")(DebuggerDotsetScriptSource.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setSkipAllPauses")(DebuggerDotsetSkipAllPauses.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.setVariableValue")(DebuggerDotsetVariableValue.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.stepInto")(DebuggerDotstepInto.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.stepOut")(DebuggerDotstepOut.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.stepOver")(DebuggerDotstepOver.asInstanceOf[js.Any])
    __obj.updateDynamic("DeviceOrientation.clearDeviceOrientationOverride")(DeviceOrientationDotclearDeviceOrientationOverride.asInstanceOf[js.Any])
    __obj.updateDynamic("DeviceOrientation.setDeviceOrientationOverride")(DeviceOrientationDotsetDeviceOrientationOverride.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.canEmulate")(EmulationDotcanEmulate.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.clearDeviceMetricsOverride")(EmulationDotclearDeviceMetricsOverride.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.clearGeolocationOverride")(EmulationDotclearGeolocationOverride.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.resetPageScaleFactor")(EmulationDotresetPageScaleFactor.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setCPUThrottlingRate")(EmulationDotsetCPUThrottlingRate.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setDefaultBackgroundColorOverride")(EmulationDotsetDefaultBackgroundColorOverride.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setDeviceMetricsOverride")(EmulationDotsetDeviceMetricsOverride.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setDocumentCookieDisabled")(EmulationDotsetDocumentCookieDisabled.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setEmitTouchEventsForMouse")(EmulationDotsetEmitTouchEventsForMouse.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setEmulatedMedia")(EmulationDotsetEmulatedMedia.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setEmulatedVisionDeficiency")(EmulationDotsetEmulatedVisionDeficiency.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setFocusEmulationEnabled")(EmulationDotsetFocusEmulationEnabled.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setGeolocationOverride")(EmulationDotsetGeolocationOverride.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setLocaleOverride")(EmulationDotsetLocaleOverride.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setNavigatorOverrides")(EmulationDotsetNavigatorOverrides.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setPageScaleFactor")(EmulationDotsetPageScaleFactor.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setScriptExecutionDisabled")(EmulationDotsetScriptExecutionDisabled.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setScrollbarsHidden")(EmulationDotsetScrollbarsHidden.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setTimezoneOverride")(EmulationDotsetTimezoneOverride.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setTouchEmulationEnabled")(EmulationDotsetTouchEmulationEnabled.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setUserAgentOverride")(EmulationDotsetUserAgentOverride.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setVirtualTimePolicy")(EmulationDotsetVirtualTimePolicy.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.setVisibleSize")(EmulationDotsetVisibleSize.asInstanceOf[js.Any])
    __obj.updateDynamic("Fetch.continueRequest")(FetchDotcontinueRequest.asInstanceOf[js.Any])
    __obj.updateDynamic("Fetch.continueWithAuth")(FetchDotcontinueWithAuth.asInstanceOf[js.Any])
    __obj.updateDynamic("Fetch.disable")(FetchDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("Fetch.enable")(FetchDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("Fetch.failRequest")(FetchDotfailRequest.asInstanceOf[js.Any])
    __obj.updateDynamic("Fetch.fulfillRequest")(FetchDotfulfillRequest.asInstanceOf[js.Any])
    __obj.updateDynamic("Fetch.getResponseBody")(FetchDotgetResponseBody.asInstanceOf[js.Any])
    __obj.updateDynamic("Fetch.takeResponseBodyAsStream")(FetchDottakeResponseBodyAsStream.asInstanceOf[js.Any])
    __obj.updateDynamic("HeadlessExperimental.beginFrame")(HeadlessExperimentalDotbeginFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("HeadlessExperimental.disable")(HeadlessExperimentalDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("HeadlessExperimental.enable")(HeadlessExperimentalDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.addInspectedHeapObject")(HeapProfilerDotaddInspectedHeapObject.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.collectGarbage")(HeapProfilerDotcollectGarbage.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.disable")(HeapProfilerDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.enable")(HeapProfilerDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.getHeapObjectId")(HeapProfilerDotgetHeapObjectId.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.getObjectByHeapObjectId")(HeapProfilerDotgetObjectByHeapObjectId.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.getSamplingProfile")(HeapProfilerDotgetSamplingProfile.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.startSampling")(HeapProfilerDotstartSampling.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.startTrackingHeapObjects")(HeapProfilerDotstartTrackingHeapObjects.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.stopSampling")(HeapProfilerDotstopSampling.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.stopTrackingHeapObjects")(HeapProfilerDotstopTrackingHeapObjects.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.takeHeapSnapshot")(HeapProfilerDottakeHeapSnapshot.asInstanceOf[js.Any])
    __obj.updateDynamic("IO.close")(IODotclose.asInstanceOf[js.Any])
    __obj.updateDynamic("IO.read")(IODotread.asInstanceOf[js.Any])
    __obj.updateDynamic("IO.resolveBlob")(IODotresolveBlob.asInstanceOf[js.Any])
    __obj.updateDynamic("IndexedDB.clearObjectStore")(IndexedDBDotclearObjectStore.asInstanceOf[js.Any])
    __obj.updateDynamic("IndexedDB.deleteDatabase")(IndexedDBDotdeleteDatabase.asInstanceOf[js.Any])
    __obj.updateDynamic("IndexedDB.deleteObjectStoreEntries")(IndexedDBDotdeleteObjectStoreEntries.asInstanceOf[js.Any])
    __obj.updateDynamic("IndexedDB.disable")(IndexedDBDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("IndexedDB.enable")(IndexedDBDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("IndexedDB.getMetadata")(IndexedDBDotgetMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("IndexedDB.requestData")(IndexedDBDotrequestData.asInstanceOf[js.Any])
    __obj.updateDynamic("IndexedDB.requestDatabase")(IndexedDBDotrequestDatabase.asInstanceOf[js.Any])
    __obj.updateDynamic("IndexedDB.requestDatabaseNames")(IndexedDBDotrequestDatabaseNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Input.dispatchKeyEvent")(InputDotdispatchKeyEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("Input.dispatchMouseEvent")(InputDotdispatchMouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("Input.dispatchTouchEvent")(InputDotdispatchTouchEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("Input.emulateTouchFromMouseEvent")(InputDotemulateTouchFromMouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("Input.insertText")(InputDotinsertText.asInstanceOf[js.Any])
    __obj.updateDynamic("Input.setIgnoreInputEvents")(InputDotsetIgnoreInputEvents.asInstanceOf[js.Any])
    __obj.updateDynamic("Input.synthesizePinchGesture")(InputDotsynthesizePinchGesture.asInstanceOf[js.Any])
    __obj.updateDynamic("Input.synthesizeScrollGesture")(InputDotsynthesizeScrollGesture.asInstanceOf[js.Any])
    __obj.updateDynamic("Input.synthesizeTapGesture")(InputDotsynthesizeTapGesture.asInstanceOf[js.Any])
    __obj.updateDynamic("Inspector.disable")(InspectorDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("Inspector.enable")(InspectorDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("LayerTree.compositingReasons")(LayerTreeDotcompositingReasons.asInstanceOf[js.Any])
    __obj.updateDynamic("LayerTree.disable")(LayerTreeDotdisable.asInstanceOf[js.Any])
    __obj.updateDynamic("LayerTree.enable")(LayerTreeDotenable.asInstanceOf[js.Any])
    __obj.updateDynamic("LayerTree.loadSnapshot")(LayerTreeDotloadSnapshot.asInstanceOf[js.Any])
    __obj.updateDynamic("LayerTree.makeSnapshot")(LayerTreeDotmakeSnapshot.asInstanceOf[js.Any])
    __obj.updateDynamic("LayerTree.profileSnapshot")(LayerTreeDotprofileSnapshot.asInstanceOf[js.Any])
    __obj.updateDynamic("LayerTree.releaseSnapshot")(LayerTreeDotreleaseSnapshot.asInstanceOf[js.Any])
    __obj.updateDynamic("LayerTree.replaySnapshot")(LayerTreeDotreplaySnapshot.asInstanceOf[js.Any])
    __obj.updateDynamic("LayerTree.snapshotCommandLog")(LayerTreeDotsnapshotCommandLog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commands]
  }
  
  @scala.inline
  implicit class CommandsOps[Self <: Commands] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessibilityDotdisable(value: ParamsType): Self = this.set("Accessibility.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityDotenable(value: ParamsType): Self = this.set("Accessibility.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityDotgetFullAXTree(value: ReturnTypeGetFullAXTreeResponse): Self = this.set("Accessibility.getFullAXTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityDotgetPartialAXTree(value: ReturnTypeGetPartialAXTreeResponse): Self = this.set("Accessibility.getPartialAXTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDotdisable(value: ParamsType): Self = this.set("Animation.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDotenable(value: ParamsType): Self = this.set("Animation.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDotgetCurrentTime(value: ReturnTypeGetCurrentTimeResponse): Self = this.set("Animation.getCurrentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDotgetPlaybackRate(value: ReturnTypeGetPlaybackRateResponse): Self = this.set("Animation.getPlaybackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDotreleaseAnimations(value: `23`): Self = this.set("Animation.releaseAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDotresolveAnimation(value: ReturnTypeResolveAnimationResponse): Self = this.set("Animation.resolveAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDotseekAnimations(value: `24`): Self = this.set("Animation.seekAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDotsetPaused(value: `25`): Self = this.set("Animation.setPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDotsetPlaybackRate(value: `26`): Self = this.set("Animation.setPlaybackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDotsetTiming(value: `27`): Self = this.set("Animation.setTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCacheDotenable(value: ParamsType): Self = this.set("ApplicationCache.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCacheDotgetApplicationCacheForFrame(value: ReturnTypeGetApplicationCacheForFrameResponse): Self = this.set("ApplicationCache.getApplicationCacheForFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCacheDotgetFramesWithManifests(value: ReturnTypeGetFramesWithManifestsResponse): Self = this.set("ApplicationCache.getFramesWithManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCacheDotgetManifestForFrame(value: ReturnTypeGetManifestForFrameResponse): Self = this.set("ApplicationCache.getManifestForFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditsDotdisable(value: ParamsType): Self = this.set("Audits.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditsDotenable(value: ParamsType): Self = this.set("Audits.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditsDotgetEncodedResponse(value: ReturnTypeGetEncodedResponseResponse): Self = this.set("Audits.getEncodedResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundServiceDotclearEvents(value: `31`): Self = this.set("BackgroundService.clearEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundServiceDotsetRecording(value: `30`): Self = this.set("BackgroundService.setRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundServiceDotstartObserving(value: `28`): Self = this.set("BackgroundService.startObserving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundServiceDotstopObserving(value: `29`): Self = this.set("BackgroundService.stopObserving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotclose(value: ParamsType): Self = this.set("Browser.close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotcrash(value: ParamsType): Self = this.set("Browser.crash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotcrashGpuProcess(value: ParamsType): Self = this.set("Browser.crashGpuProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotgetBrowserCommandLine(value: ReturnTypeGetBrowserCommandLineResponse): Self = this.set("Browser.getBrowserCommandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotgetHistogram(value: ReturnTypeGetHistogramResponse): Self = this.set("Browser.getHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotgetHistograms(value: ReturnTypeGetHistogramsResponse): Self = this.set("Browser.getHistograms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotgetVersion(value: ReturnTypeGetVersionResponse): Self = this.set("Browser.getVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotgetWindowBounds(value: ReturnTypeGetWindowBoundsResponse): Self = this.set("Browser.getWindowBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotgetWindowForTarget(value: ReturnTypeGetWindowForTargetResponse): Self = this.set("Browser.getWindowForTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotgrantPermissions(value: `33`): Self = this.set("Browser.grantPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotresetPermissions(value: `34`): Self = this.set("Browser.resetPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotsetDockTile(value: `37`): Self = this.set("Browser.setDockTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotsetDownloadBehavior(value: `35`): Self = this.set("Browser.setDownloadBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotsetPermission(value: `32`): Self = this.set("Browser.setPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDotsetWindowBounds(value: `36`): Self = this.set("Browser.setWindowBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotaddRule(value: ReturnTypeAddRuleResponse): Self = this.set("CSS.addRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotcollectClassNames(value: ReturnTypeCollectClassNamesResponse): Self = this.set("CSS.collectClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotcreateStyleSheet(value: ReturnTypeCreateStyleSheetResponse): Self = this.set("CSS.createStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotdisable(value: ParamsType): Self = this.set("CSS.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotenable(value: ParamsType): Self = this.set("CSS.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotforcePseudoState(value: `38`): Self = this.set("CSS.forcePseudoState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotgetBackgroundColors(value: ReturnTypeGetBackgroundColorsResponse): Self = this.set("CSS.getBackgroundColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotgetComputedStyleForNode(value: ReturnTypeGetComputedStyleForNodeResponse): Self = this.set("CSS.getComputedStyleForNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotgetInlineStylesForNode(value: ReturnTypeGetInlineStylesForNodeResponse): Self = this.set("CSS.getInlineStylesForNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotgetMatchedStylesForNode(value: ReturnTypeGetMatchedStylesForNodeResponse): Self = this.set("CSS.getMatchedStylesForNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotgetMediaQueries(value: ReturnTypeGetMediaQueriesResponse): Self = this.set("CSS.getMediaQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotgetPlatformFontsForNode(value: ReturnTypeGetPlatformFontsForNodeResponse): Self = this.set("CSS.getPlatformFontsForNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotgetStyleSheetText(value: ReturnTypeGetStyleSheetTextResponse): Self = this.set("CSS.getStyleSheetText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotsetEffectivePropertyValueForNode(value: `39`): Self = this.set("CSS.setEffectivePropertyValueForNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotsetKeyframeKey(value: ReturnTypeSetKeyframeKeyResponse): Self = this.set("CSS.setKeyframeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotsetMediaText(value: ReturnTypeSetMediaTextResponse): Self = this.set("CSS.setMediaText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotsetRuleSelector(value: ReturnTypeSetRuleSelectorResponse): Self = this.set("CSS.setRuleSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotsetStyleSheetText(value: ReturnTypeSetStyleSheetTextResponse): Self = this.set("CSS.setStyleSheetText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotsetStyleTexts(value: ReturnTypeSetStyleTextsResponse): Self = this.set("CSS.setStyleTexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotstartRuleUsageTracking(value: ParamsType): Self = this.set("CSS.startRuleUsageTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDotstopRuleUsageTracking(value: ReturnTypeStopRuleUsageTrackingResponse): Self = this.set("CSS.stopRuleUsageTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSDottakeCoverageDelta(value: ReturnTypeTakeCoverageDeltaResponse): Self = this.set("CSS.takeCoverageDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheStorageDotdeleteCache(value: `40`): Self = this.set("CacheStorage.deleteCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheStorageDotdeleteEntry(value: `41`): Self = this.set("CacheStorage.deleteEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheStorageDotrequestCacheNames(value: ReturnTypeRequestCacheNamesResponse): Self = this.set("CacheStorage.requestCacheNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheStorageDotrequestCachedResponse(value: ReturnTypeRequestCachedResponseResponse): Self = this.set("CacheStorage.requestCachedResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheStorageDotrequestEntries(value: ReturnTypeRequestEntriesResponse): Self = this.set("CacheStorage.requestEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastDotdisable(value: ParamsType): Self = this.set("Cast.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastDotenable(value: `42`): Self = this.set("Cast.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastDotsetSinkToUse(value: `43`): Self = this.set("Cast.setSinkToUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastDotstartTabMirroring(value: `44`): Self = this.set("Cast.startTabMirroring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastDotstopCasting(value: `45`): Self = this.set("Cast.stopCasting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleDotclearMessages(value: ParamsType): Self = this.set("Console.clearMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleDotdisable(value: ParamsType): Self = this.set("Console.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleDotenable(value: ParamsType): Self = this.set("Console.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDebuggerDotgetEventListeners(value: ReturnTypeGetEventListenersResponse): Self = this.set("DOMDebugger.getEventListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDebuggerDotremoveDOMBreakpoint(value: `59`): Self = this.set("DOMDebugger.removeDOMBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDebuggerDotremoveEventListenerBreakpoint(value: `60`): Self = this.set("DOMDebugger.removeEventListenerBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDebuggerDotremoveInstrumentationBreakpoint(value: `61`): Self = this.set("DOMDebugger.removeInstrumentationBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDebuggerDotremoveXHRBreakpoint(value: `62`): Self = this.set("DOMDebugger.removeXHRBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDebuggerDotsetDOMBreakpoint(value: `63`): Self = this.set("DOMDebugger.setDOMBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDebuggerDotsetEventListenerBreakpoint(value: `64`): Self = this.set("DOMDebugger.setEventListenerBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDebuggerDotsetInstrumentationBreakpoint(value: `65`): Self = this.set("DOMDebugger.setInstrumentationBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDebuggerDotsetXHRBreakpoint(value: `66`): Self = this.set("DOMDebugger.setXHRBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotcollectClassNamesFromSubtree(value: ReturnTypeCollectClassNamesFromSubtreeResponse): Self = this.set("DOM.collectClassNamesFromSubtree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotcopyTo(value: ReturnTypeCopyToResponse): Self = this.set("DOM.copyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotdescribeNode(value: ReturnTypeDescribeNodeResponse): Self = this.set("DOM.describeNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotdisable(value: ParamsType): Self = this.set("DOM.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotdiscardSearchResults(value: `47`): Self = this.set("DOM.discardSearchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotenable(value: ParamsType): Self = this.set("DOM.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotfocus(value: `48`): Self = this.set("DOM.focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetAttributes(value: ReturnTypeGetAttributesResponse): Self = this.set("DOM.getAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetBoxModel(value: ReturnTypeGetBoxModelResponse): Self = this.set("DOM.getBoxModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetContentQuads(value: ReturnTypeGetContentQuadsResponse): Self = this.set("DOM.getContentQuads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetDocument(value: ReturnTypeGetDocumentResponse): Self = this.set("DOM.getDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetFileInfo(value: ReturnTypeGetFileInfoResponse): Self = this.set("DOM.getFileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetFlattenedDocument(value: ReturnTypeGetFlattenedDocumentResponse): Self = this.set("DOM.getFlattenedDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetFrameOwner(value: ReturnTypeGetFrameOwnerResponse): Self = this.set("DOM.getFrameOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetNodeForLocation(value: ReturnTypeGetNodeForLocationResponse): Self = this.set("DOM.getNodeForLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetNodeStackTraces(value: ReturnTypeGetNodeStackTracesResponse): Self = this.set("DOM.getNodeStackTraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetOuterHTML(value: ReturnTypeGetOuterHTMLResponse): Self = this.set("DOM.getOuterHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetRelayoutBoundary(value: ReturnTypeGetRelayoutBoundaryResponse): Self = this.set("DOM.getRelayoutBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotgetSearchResults(value: ReturnTypeGetSearchResultsResponse): Self = this.set("DOM.getSearchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDothideHighlight(value: ParamsType): Self = this.set("DOM.hideHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDothighlightNode(value: ParamsType): Self = this.set("DOM.highlightNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDothighlightRect(value: ParamsType): Self = this.set("DOM.highlightRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotmarkUndoableState(value: ParamsType): Self = this.set("DOM.markUndoableState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotmoveTo(value: ReturnTypeMoveToResponse): Self = this.set("DOM.moveTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotperformSearch(value: ReturnTypePerformSearchResponse): Self = this.set("DOM.performSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotpushNodeByPathToFrontend(value: ReturnTypePushNodeByPathToFrontendResponse): Self = this.set("DOM.pushNodeByPathToFrontend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotpushNodesByBackendIdsToFrontend(value: ReturnTypePushNodesByBackendIdsToFrontendResponse): Self = this.set("DOM.pushNodesByBackendIdsToFrontend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotquerySelector(value: ReturnTypeQuerySelectorResponse): Self = this.set("DOM.querySelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotquerySelectorAll(value: ReturnTypeQuerySelectorAllResponse): Self = this.set("DOM.querySelectorAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotredo(value: ParamsType): Self = this.set("DOM.redo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotremoveAttribute(value: `49`): Self = this.set("DOM.removeAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotremoveNode(value: `50`): Self = this.set("DOM.removeNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotrequestChildNodes(value: `51`): Self = this.set("DOM.requestChildNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotrequestNode(value: ReturnTypeRequestNodeResponse): Self = this.set("DOM.requestNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotresolveNode(value: ReturnTypeResolveNodeResponse): Self = this.set("DOM.resolveNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotscrollIntoViewIfNeeded(value: `46`): Self = this.set("DOM.scrollIntoViewIfNeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotsetAttributeValue(value: `52`): Self = this.set("DOM.setAttributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotsetAttributesAsText(value: `53`): Self = this.set("DOM.setAttributesAsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotsetFileInputFiles(value: `54`): Self = this.set("DOM.setFileInputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotsetInspectedNode(value: `56`): Self = this.set("DOM.setInspectedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotsetNodeName(value: ReturnTypeSetNodeNameResponse): Self = this.set("DOM.setNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotsetNodeStackTracesEnabled(value: `55`): Self = this.set("DOM.setNodeStackTracesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotsetNodeValue(value: `57`): Self = this.set("DOM.setNodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotsetOuterHTML(value: `58`): Self = this.set("DOM.setOuterHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMDotundo(value: ParamsType): Self = this.set("DOM.undo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMSnapshotDotcaptureSnapshot(value: ReturnTypeCaptureSnapshotResponse): Self = this.set("DOMSnapshot.captureSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMSnapshotDotdisable(value: ParamsType): Self = this.set("DOMSnapshot.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMSnapshotDotenable(value: ParamsType): Self = this.set("DOMSnapshot.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMSnapshotDotgetSnapshot(value: ReturnTypeGetSnapshotResponse): Self = this.set("DOMSnapshot.getSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMStorageDotclear(value: `67`): Self = this.set("DOMStorage.clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMStorageDotdisable(value: ParamsType): Self = this.set("DOMStorage.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMStorageDotenable(value: ParamsType): Self = this.set("DOMStorage.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMStorageDotgetDOMStorageItems(value: ReturnTypeGetDOMStorageItemsResponse): Self = this.set("DOMStorage.getDOMStorageItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMStorageDotremoveDOMStorageItem(value: `68`): Self = this.set("DOMStorage.removeDOMStorageItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMStorageDotsetDOMStorageItem(value: `69`): Self = this.set("DOMStorage.setDOMStorageItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseDotdisable(value: ParamsType): Self = this.set("Database.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseDotenable(value: ParamsType): Self = this.set("Database.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseDotexecuteSQL(value: ReturnTypeExecuteSQLResponse): Self = this.set("Database.executeSQL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseDotgetDatabaseTableNames(value: ReturnTypeGetDatabaseTableNamesResponse): Self = this.set("Database.getDatabaseTableNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotcontinueToLocation(value: ReturnType): Self = this.set("Debugger.continueToLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotdisable(value: ParamsType): Self = this.set("Debugger.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotenable(value: ParamsTypeReturnType): Self = this.set("Debugger.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotevaluateOnCallFrame(value: ReturnTypeEvaluateOnCallFrameResponse): Self = this.set("Debugger.evaluateOnCallFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotexecuteWasmEvaluator(value: ReturnTypeExecuteWasmEvaluatorResponse): Self = this.set("Debugger.executeWasmEvaluator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotgetPossibleBreakpoints(value: ReturnTypeGetPossibleBreakpointsResponse): Self = this.set("Debugger.getPossibleBreakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotgetScriptSource(value: ReturnTypeGetScriptSourceResponse): Self = this.set("Debugger.getScriptSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotgetStackTrace(value: ReturnTypeGetStackTraceResponse): Self = this.set("Debugger.getStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotgetWasmBytecode(value: ReturnTypeGetWasmBytecodeResponse): Self = this.set("Debugger.getWasmBytecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotpause(value: ParamsType): Self = this.set("Debugger.pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotpauseOnAsyncCall(value: ReturnTypeVoid): Self = this.set("Debugger.pauseOnAsyncCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotremoveBreakpoint(value: ParamsTypeReturnTypeVoid): Self = this.set("Debugger.removeBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotrestartFrame(value: ReturnTypeRestartFrameResponse): Self = this.set("Debugger.restartFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotresume(value: `0`): Self = this.set("Debugger.resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsearchInContent(value: ReturnTypeSearchInContentResponse): Self = this.set("Debugger.searchInContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetAsyncCallStackDepth(value: `1`): Self = this.set("Debugger.setAsyncCallStackDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetBlackboxPatterns(value: `2`): Self = this.set("Debugger.setBlackboxPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetBlackboxedRanges(value: `3`): Self = this.set("Debugger.setBlackboxedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetBreakpoint(value: ReturnTypeSetBreakpointResponse): Self = this.set("Debugger.setBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetBreakpointByUrl(value: ReturnTypeSetBreakpointByUrlResponse): Self = this.set("Debugger.setBreakpointByUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetBreakpointOnFunctionCall(value: ReturnTypeSetBreakpointOnFunctionCallResponse): Self = this.set("Debugger.setBreakpointOnFunctionCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetBreakpointsActive(value: `4`): Self = this.set("Debugger.setBreakpointsActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetInstrumentationBreakpoint(value: ReturnTypeSetInstrumentationBreakpointResponse): Self = this.set("Debugger.setInstrumentationBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetPauseOnExceptions(value: `5`): Self = this.set("Debugger.setPauseOnExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetReturnValue(value: `6`): Self = this.set("Debugger.setReturnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetScriptSource(value: ReturnTypeSetScriptSourceResponse): Self = this.set("Debugger.setScriptSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetSkipAllPauses(value: `7`): Self = this.set("Debugger.setSkipAllPauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotsetVariableValue(value: `8`): Self = this.set("Debugger.setVariableValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotstepInto(value: `9`): Self = this.set("Debugger.stepInto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotstepOut(value: ParamsType): Self = this.set("Debugger.stepOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerDotstepOver(value: ParamsType): Self = this.set("Debugger.stepOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceOrientationDotclearDeviceOrientationOverride(value: ParamsType): Self = this.set("DeviceOrientation.clearDeviceOrientationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceOrientationDotsetDeviceOrientationOverride(value: `70`): Self = this.set("DeviceOrientation.setDeviceOrientationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotcanEmulate(value: ReturnTypeCanEmulateResponse): Self = this.set("Emulation.canEmulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotclearDeviceMetricsOverride(value: ParamsType): Self = this.set("Emulation.clearDeviceMetricsOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotclearGeolocationOverride(value: ParamsType): Self = this.set("Emulation.clearGeolocationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotresetPageScaleFactor(value: ParamsType): Self = this.set("Emulation.resetPageScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetCPUThrottlingRate(value: `72`): Self = this.set("Emulation.setCPUThrottlingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetDefaultBackgroundColorOverride(value: `73`): Self = this.set("Emulation.setDefaultBackgroundColorOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetDeviceMetricsOverride(value: `74`): Self = this.set("Emulation.setDeviceMetricsOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetDocumentCookieDisabled(value: `76`): Self = this.set("Emulation.setDocumentCookieDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetEmitTouchEventsForMouse(value: `77`): Self = this.set("Emulation.setEmitTouchEventsForMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetEmulatedMedia(value: `78`): Self = this.set("Emulation.setEmulatedMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetEmulatedVisionDeficiency(value: `79`): Self = this.set("Emulation.setEmulatedVisionDeficiency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetFocusEmulationEnabled(value: `71`): Self = this.set("Emulation.setFocusEmulationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetGeolocationOverride(value: `80`): Self = this.set("Emulation.setGeolocationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetLocaleOverride(value: `85`): Self = this.set("Emulation.setLocaleOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetNavigatorOverrides(value: `81`): Self = this.set("Emulation.setNavigatorOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetPageScaleFactor(value: `82`): Self = this.set("Emulation.setPageScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetScriptExecutionDisabled(value: `83`): Self = this.set("Emulation.setScriptExecutionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetScrollbarsHidden(value: `75`): Self = this.set("Emulation.setScrollbarsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetTimezoneOverride(value: `86`): Self = this.set("Emulation.setTimezoneOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetTouchEmulationEnabled(value: `84`): Self = this.set("Emulation.setTouchEmulationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetUserAgentOverride(value: `88`): Self = this.set("Emulation.setUserAgentOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetVirtualTimePolicy(value: ReturnTypeSetVirtualTimePolicyResponse): Self = this.set("Emulation.setVirtualTimePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulationDotsetVisibleSize(value: `87`): Self = this.set("Emulation.setVisibleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchDotcontinueRequest(value: `197`): Self = this.set("Fetch.continueRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchDotcontinueWithAuth(value: `198`): Self = this.set("Fetch.continueWithAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchDotdisable(value: ParamsType): Self = this.set("Fetch.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchDotenable(value: `194`): Self = this.set("Fetch.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchDotfailRequest(value: `195`): Self = this.set("Fetch.failRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchDotfulfillRequest(value: `196`): Self = this.set("Fetch.fulfillRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchDotgetResponseBody(value: ParamsTypeReturnTypeGetResponseBodyResponse): Self = this.set("Fetch.getResponseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchDottakeResponseBodyAsStream(value: ReturnTypeTakeResponseBodyAsStreamResponse): Self = this.set("Fetch.takeResponseBodyAsStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlessExperimentalDotbeginFrame(value: ReturnTypeBeginFrameResponse): Self = this.set("HeadlessExperimental.beginFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlessExperimentalDotdisable(value: ParamsType): Self = this.set("HeadlessExperimental.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlessExperimentalDotenable(value: ParamsType): Self = this.set("HeadlessExperimental.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDotaddInspectedHeapObject(value: `10`): Self = this.set("HeapProfiler.addInspectedHeapObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDotcollectGarbage(value: ParamsType): Self = this.set("HeapProfiler.collectGarbage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDotdisable(value: ParamsType): Self = this.set("HeapProfiler.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDotenable(value: ParamsType): Self = this.set("HeapProfiler.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDotgetHeapObjectId(value: ReturnTypeGetHeapObjectIdResponse): Self = this.set("HeapProfiler.getHeapObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDotgetObjectByHeapObjectId(value: ReturnTypeGetObjectByHeapObjectIdResponse): Self = this.set("HeapProfiler.getObjectByHeapObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDotgetSamplingProfile(value: ReturnTypeGetSamplingProfileResponse): Self = this.set("HeapProfiler.getSamplingProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDotstartSampling(value: `11`): Self = this.set("HeapProfiler.startSampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDotstartTrackingHeapObjects(value: `12`): Self = this.set("HeapProfiler.startTrackingHeapObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDotstopSampling(value: ReturnTypeStopSamplingResponse): Self = this.set("HeapProfiler.stopSampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDotstopTrackingHeapObjects(value: `13`): Self = this.set("HeapProfiler.stopTrackingHeapObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapProfilerDottakeHeapSnapshot(value: `14`): Self = this.set("HeapProfiler.takeHeapSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIODotclose(value: `89`): Self = this.set("IO.close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIODotread(value: ReturnTypeReadResponse): Self = this.set("IO.read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIODotresolveBlob(value: ReturnTypeResolveBlobResponse): Self = this.set("IO.resolveBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedDBDotclearObjectStore(value: `90`): Self = this.set("IndexedDB.clearObjectStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedDBDotdeleteDatabase(value: `91`): Self = this.set("IndexedDB.deleteDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedDBDotdeleteObjectStoreEntries(value: `92`): Self = this.set("IndexedDB.deleteObjectStoreEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedDBDotdisable(value: ParamsType): Self = this.set("IndexedDB.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedDBDotenable(value: ParamsType): Self = this.set("IndexedDB.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedDBDotgetMetadata(value: ReturnTypeGetMetadataResponse): Self = this.set("IndexedDB.getMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedDBDotrequestData(value: ReturnTypeRequestDataResponse): Self = this.set("IndexedDB.requestData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedDBDotrequestDatabase(value: ReturnTypeRequestDatabaseResponse): Self = this.set("IndexedDB.requestDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedDBDotrequestDatabaseNames(value: ReturnTypeRequestDatabaseNamesResponse): Self = this.set("IndexedDB.requestDatabaseNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDotdispatchKeyEvent(value: `93`): Self = this.set("Input.dispatchKeyEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDotdispatchMouseEvent(value: `95`): Self = this.set("Input.dispatchMouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDotdispatchTouchEvent(value: `96`): Self = this.set("Input.dispatchTouchEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDotemulateTouchFromMouseEvent(value: `97`): Self = this.set("Input.emulateTouchFromMouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDotinsertText(value: `94`): Self = this.set("Input.insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDotsetIgnoreInputEvents(value: `98`): Self = this.set("Input.setIgnoreInputEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDotsynthesizePinchGesture(value: `99`): Self = this.set("Input.synthesizePinchGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDotsynthesizeScrollGesture(value: `100`): Self = this.set("Input.synthesizeScrollGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDotsynthesizeTapGesture(value: `101`): Self = this.set("Input.synthesizeTapGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectorDotdisable(value: ParamsType): Self = this.set("Inspector.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectorDotenable(value: ParamsType): Self = this.set("Inspector.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTreeDotcompositingReasons(value: ReturnTypeCompositingReasonsResponse): Self = this.set("LayerTree.compositingReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTreeDotdisable(value: ParamsType): Self = this.set("LayerTree.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTreeDotenable(value: ParamsType): Self = this.set("LayerTree.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTreeDotloadSnapshot(value: ReturnTypeLoadSnapshotResponse): Self = this.set("LayerTree.loadSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTreeDotmakeSnapshot(value: ReturnTypeMakeSnapshotResponse): Self = this.set("LayerTree.makeSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTreeDotprofileSnapshot(value: ReturnTypeProfileSnapshotResponse): Self = this.set("LayerTree.profileSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTreeDotreleaseSnapshot(value: `102`): Self = this.set("LayerTree.releaseSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTreeDotreplaySnapshot(value: ReturnTypeReplaySnapshotResponse): Self = this.set("LayerTree.replaySnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTreeDotsnapshotCommandLog(value: ReturnTypeSnapshotCommandLogResponse): Self = this.set("LayerTree.snapshotCommandLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDotclear(value: ParamsType): Self = this.set("Log.clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDotdisable(value: ParamsType): Self = this.set("Log.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDotenable(value: ParamsType): Self = this.set("Log.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDotstartViolationsReport(value: `103`): Self = this.set("Log.startViolationsReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDotstopViolationsReport(value: ParamsType): Self = this.set("Log.stopViolationsReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaDotdisable(value: ParamsType): Self = this.set("Media.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaDotenable(value: ParamsType): Self = this.set("Media.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryDotforciblyPurgeJavaScriptMemory(value: ParamsType): Self = this.set("Memory.forciblyPurgeJavaScriptMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryDotgetAllTimeSamplingProfile(value: ReturnTypeGetAllTimeSamplingProfileResponse): Self = this.set("Memory.getAllTimeSamplingProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryDotgetBrowserSamplingProfile(value: ReturnTypeGetBrowserSamplingProfileResponse): Self = this.set("Memory.getBrowserSamplingProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryDotgetDOMCounters(value: ReturnTypeGetDOMCountersResponse): Self = this.set("Memory.getDOMCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryDotgetSamplingProfile(value: ParamsTypeReturnTypeGetSamplingProfileResponse): Self = this.set("Memory.getSamplingProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryDotprepareForLeakDetection(value: ParamsType): Self = this.set("Memory.prepareForLeakDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryDotsetPressureNotificationsSuppressed(value: `104`): Self = this.set("Memory.setPressureNotificationsSuppressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryDotsimulatePressureNotification(value: `105`): Self = this.set("Memory.simulatePressureNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryDotstartSampling(value: `106`): Self = this.set("Memory.startSampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryDotstopSampling(value: ParamsType): Self = this.set("Memory.stopSampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotcanClearBrowserCache(value: ReturnTypeCanClearBrowserCacheResponse): Self = this.set("Network.canClearBrowserCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotcanClearBrowserCookies(value: ReturnTypeCanClearBrowserCookiesResponse): Self = this.set("Network.canClearBrowserCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotcanEmulateNetworkConditions(value: ReturnTypeCanEmulateNetworkConditionsResponse): Self = this.set("Network.canEmulateNetworkConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotclearBrowserCache(value: ParamsType): Self = this.set("Network.clearBrowserCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotclearBrowserCookies(value: ParamsType): Self = this.set("Network.clearBrowserCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotcontinueInterceptedRequest(value: `107`): Self = this.set("Network.continueInterceptedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotdeleteCookies(value: `108`): Self = this.set("Network.deleteCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotdisable(value: ParamsType): Self = this.set("Network.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotemulateNetworkConditions(value: `109`): Self = this.set("Network.emulateNetworkConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotenable(value: `110`): Self = this.set("Network.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotgetAllCookies(value: ReturnTypeGetAllCookiesResponse): Self = this.set("Network.getAllCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotgetCertificate(value: ReturnTypeGetCertificateResponse): Self = this.set("Network.getCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotgetCookies(value: ReturnTypeGetCookiesResponse): Self = this.set("Network.getCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotgetRequestPostData(value: ReturnTypeGetRequestPostDataResponse): Self = this.set("Network.getRequestPostData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotgetResponseBody(value: ReturnTypeGetResponseBodyResponse): Self = this.set("Network.getResponseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotgetResponseBodyForInterception(value: ReturnTypeGetResponseBodyForInterceptionResponse): Self = this.set("Network.getResponseBodyForInterception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotreplayXHR(value: `111`): Self = this.set("Network.replayXHR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotsearchInResponseBody(value: ReturnTypeSearchInResponseBodyResponse): Self = this.set("Network.searchInResponseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotsetBlockedURLs(value: `112`): Self = this.set("Network.setBlockedURLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotsetBypassServiceWorker(value: `113`): Self = this.set("Network.setBypassServiceWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotsetCacheDisabled(value: `114`): Self = this.set("Network.setCacheDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotsetCookie(value: ReturnTypeSetCookieResponse): Self = this.set("Network.setCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotsetCookies(value: `115`): Self = this.set("Network.setCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotsetDataSizeLimitsForTest(value: `116`): Self = this.set("Network.setDataSizeLimitsForTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotsetExtraHTTPHeaders(value: `117`): Self = this.set("Network.setExtraHTTPHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotsetRequestInterception(value: `118`): Self = this.set("Network.setRequestInterception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDotsetUserAgentOverride(value: `119`): Self = this.set("Network.setUserAgentOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDottakeResponseBodyForInterceptionAsStream(value: ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse): Self = this.set("Network.takeResponseBodyForInterceptionAsStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotdisable(value: ParamsType): Self = this.set("Overlay.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotenable(value: ParamsType): Self = this.set("Overlay.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotgetHighlightObjectForTest(value: ReturnTypeGetHighlightObjectForTestResponse): Self = this.set("Overlay.getHighlightObjectForTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDothideHighlight(value: ParamsType): Self = this.set("Overlay.hideHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDothighlightFrame(value: `120`): Self = this.set("Overlay.highlightFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDothighlightNode(value: `121`): Self = this.set("Overlay.highlightNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDothighlightQuad(value: `122`): Self = this.set("Overlay.highlightQuad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDothighlightRect(value: `123`): Self = this.set("Overlay.highlightRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotsetInspectMode(value: `124`): Self = this.set("Overlay.setInspectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotsetPausedInDebuggerMessage(value: `126`): Self = this.set("Overlay.setPausedInDebuggerMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotsetShowAdHighlights(value: `125`): Self = this.set("Overlay.setShowAdHighlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotsetShowDebugBorders(value: `127`): Self = this.set("Overlay.setShowDebugBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotsetShowFPSCounter(value: `128`): Self = this.set("Overlay.setShowFPSCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotsetShowHinge(value: `134`): Self = this.set("Overlay.setShowHinge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotsetShowHitTestBorders(value: `132`): Self = this.set("Overlay.setShowHitTestBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotsetShowLayoutShiftRegions(value: `130`): Self = this.set("Overlay.setShowLayoutShiftRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotsetShowPaintRects(value: `129`): Self = this.set("Overlay.setShowPaintRects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotsetShowScrollBottleneckRects(value: `131`): Self = this.set("Overlay.setShowScrollBottleneckRects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayDotsetShowViewportSizeOnResize(value: `133`): Self = this.set("Overlay.setShowViewportSizeOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotaddCompilationCache(value: `156`): Self = this.set("Page.addCompilationCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotaddScriptToEvaluateOnLoad(value: ReturnTypeAddScriptToEvaluateOnLoadResponse): Self = this.set("Page.addScriptToEvaluateOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotaddScriptToEvaluateOnNewDocument(value: ReturnTypeAddScriptToEvaluateOnNewDocumentResponse): Self = this.set("Page.addScriptToEvaluateOnNewDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotbringToFront(value: ParamsType): Self = this.set("Page.bringToFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotcaptureScreenshot(value: ReturnTypeCaptureScreenshotResponse): Self = this.set("Page.captureScreenshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotcaptureSnapshot(value: ParamsTypeReturnTypeCaptureSnapshotResponse): Self = this.set("Page.captureSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotclearCompilationCache(value: ParamsType): Self = this.set("Page.clearCompilationCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotclearDeviceMetricsOverride(value: ParamsType): Self = this.set("Page.clearDeviceMetricsOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotclearDeviceOrientationOverride(value: ParamsType): Self = this.set("Page.clearDeviceOrientationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotclearGeolocationOverride(value: ParamsType): Self = this.set("Page.clearGeolocationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotclose(value: ParamsType): Self = this.set("Page.close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotcrash(value: ParamsType): Self = this.set("Page.crash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotcreateIsolatedWorld(value: ReturnTypeCreateIsolatedWorldResponse): Self = this.set("Page.createIsolatedWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotdeleteCookie(value: `135`): Self = this.set("Page.deleteCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotdisable(value: ParamsType): Self = this.set("Page.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotenable(value: ParamsType): Self = this.set("Page.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotgenerateTestReport(value: `157`): Self = this.set("Page.generateTestReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotgetAppManifest(value: ReturnTypeGetAppManifestResponse): Self = this.set("Page.getAppManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotgetCookies(value: ParamsTypeReturnTypeGetCookiesResponse): Self = this.set("Page.getCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotgetFrameTree(value: ReturnTypeGetFrameTreeResponse): Self = this.set("Page.getFrameTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotgetInstallabilityErrors(value: ReturnTypeGetInstallabilityErrorsResponse): Self = this.set("Page.getInstallabilityErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotgetLayoutMetrics(value: ReturnTypeGetLayoutMetricsResponse): Self = this.set("Page.getLayoutMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotgetManifestIcons(value: ReturnTypeGetManifestIconsResponse): Self = this.set("Page.getManifestIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotgetNavigationHistory(value: ReturnTypeGetNavigationHistoryResponse): Self = this.set("Page.getNavigationHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotgetResourceContent(value: ReturnTypeGetResourceContentResponse): Self = this.set("Page.getResourceContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotgetResourceTree(value: ReturnTypeGetResourceTreeResponse): Self = this.set("Page.getResourceTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDothandleJavaScriptDialog(value: `136`): Self = this.set("Page.handleJavaScriptDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotnavigate(value: ReturnTypeNavigateResponse): Self = this.set("Page.navigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotnavigateToHistoryEntry(value: `137`): Self = this.set("Page.navigateToHistoryEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotprintToPDF(value: ReturnTypePrintToPDFResponse): Self = this.set("Page.printToPDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotreload(value: `138`): Self = this.set("Page.reload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotremoveScriptToEvaluateOnLoad(value: `139`): Self = this.set("Page.removeScriptToEvaluateOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotremoveScriptToEvaluateOnNewDocument(value: `140`): Self = this.set("Page.removeScriptToEvaluateOnNewDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotresetNavigationHistory(value: ParamsType): Self = this.set("Page.resetNavigationHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotscreencastFrameAck(value: `141`): Self = this.set("Page.screencastFrameAck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsearchInResource(value: ReturnTypeSearchInResourceResponse): Self = this.set("Page.searchInResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetAdBlockingEnabled(value: `142`): Self = this.set("Page.setAdBlockingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetBypassCSP(value: `143`): Self = this.set("Page.setBypassCSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetDeviceMetricsOverride(value: `144`): Self = this.set("Page.setDeviceMetricsOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetDeviceOrientationOverride(value: `145`): Self = this.set("Page.setDeviceOrientationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetDocumentContent(value: `148`): Self = this.set("Page.setDocumentContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetDownloadBehavior(value: `149`): Self = this.set("Page.setDownloadBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetFontFamilies(value: `146`): Self = this.set("Page.setFontFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetFontSizes(value: `147`): Self = this.set("Page.setFontSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetGeolocationOverride(value: `150`): Self = this.set("Page.setGeolocationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetInterceptFileChooserDialog(value: `158`): Self = this.set("Page.setInterceptFileChooserDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetLifecycleEventsEnabled(value: `151`): Self = this.set("Page.setLifecycleEventsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetProduceCompilationCache(value: `155`): Self = this.set("Page.setProduceCompilationCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetTouchEmulationEnabled(value: `152`): Self = this.set("Page.setTouchEmulationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotsetWebLifecycleState(value: `154`): Self = this.set("Page.setWebLifecycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotstartScreencast(value: `153`): Self = this.set("Page.startScreencast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotstopLoading(value: ParamsType): Self = this.set("Page.stopLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotstopScreencast(value: ParamsType): Self = this.set("Page.stopScreencast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDotwaitForDebugger(value: ParamsType): Self = this.set("Page.waitForDebugger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceDotdisable(value: ParamsType): Self = this.set("Performance.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceDotenable(value: `159`): Self = this.set("Performance.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceDotgetMetrics(value: ReturnTypeGetMetricsResponse): Self = this.set("Performance.getMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceDotsetTimeDomain(value: `160`): Self = this.set("Performance.setTimeDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotdisable(value: ParamsType): Self = this.set("Profiler.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotdisableRuntimeCallStats(value: ParamsType): Self = this.set("Profiler.disableRuntimeCallStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotenable(value: ParamsType): Self = this.set("Profiler.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotenableRuntimeCallStats(value: ParamsType): Self = this.set("Profiler.enableRuntimeCallStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotgetBestEffortCoverage(value: ReturnTypeGetBestEffortCoverageResponse): Self = this.set("Profiler.getBestEffortCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotgetRuntimeCallStats(value: ReturnTypeGetRuntimeCallStatsResponse): Self = this.set("Profiler.getRuntimeCallStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotsetSamplingInterval(value: `15`): Self = this.set("Profiler.setSamplingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotstart(value: ParamsType): Self = this.set("Profiler.start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotstartPreciseCoverage(value: ReturnTypeStartPreciseCoverageResponse): Self = this.set("Profiler.startPreciseCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotstartTypeProfile(value: ParamsType): Self = this.set("Profiler.startTypeProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotstop(value: ReturnTypeStopResponse): Self = this.set("Profiler.stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotstopPreciseCoverage(value: ParamsType): Self = this.set("Profiler.stopPreciseCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDotstopTypeProfile(value: ParamsType): Self = this.set("Profiler.stopTypeProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDottakePreciseCoverage(value: ReturnTypeTakePreciseCoverageResponse): Self = this.set("Profiler.takePreciseCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerDottakeTypeProfile(value: ReturnTypeTakeTypeProfileResponse): Self = this.set("Profiler.takeTypeProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotaddBinding(value: `21`): Self = this.set("Runtime.addBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotawaitPromise(value: ReturnTypeAwaitPromiseResponse): Self = this.set("Runtime.awaitPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotcallFunctionOn(value: ReturnTypeCallFunctionOnResponse): Self = this.set("Runtime.callFunctionOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotcompileScript(value: ReturnTypeCompileScriptResponse): Self = this.set("Runtime.compileScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotdisable(value: ParamsType): Self = this.set("Runtime.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotdiscardConsoleEntries(value: ParamsType): Self = this.set("Runtime.discardConsoleEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotenable(value: ParamsType): Self = this.set("Runtime.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotevaluate(value: ReturnTypeEvaluateResponse): Self = this.set("Runtime.evaluate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotgetHeapUsage(value: ReturnTypeGetHeapUsageResponse): Self = this.set("Runtime.getHeapUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotgetIsolateId(value: ReturnTypeGetIsolateIdResponse): Self = this.set("Runtime.getIsolateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotgetProperties(value: ReturnTypeGetPropertiesResponse): Self = this.set("Runtime.getProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotglobalLexicalScopeNames(value: ReturnTypeGlobalLexicalScopeNamesResponse): Self = this.set("Runtime.globalLexicalScopeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotqueryObjects(value: ReturnTypeQueryObjectsResponse): Self = this.set("Runtime.queryObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotreleaseObject(value: `16`): Self = this.set("Runtime.releaseObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotreleaseObjectGroup(value: `17`): Self = this.set("Runtime.releaseObjectGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotremoveBinding(value: `22`): Self = this.set("Runtime.removeBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotrunIfWaitingForDebugger(value: ParamsType): Self = this.set("Runtime.runIfWaitingForDebugger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotrunScript(value: ReturnTypeRunScriptResponse): Self = this.set("Runtime.runScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotsetAsyncCallStackDepth(value: `18`): Self = this.set("Runtime.setAsyncCallStackDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotsetCustomObjectFormatterEnabled(value: `19`): Self = this.set("Runtime.setCustomObjectFormatterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotsetMaxCallStackSizeToCapture(value: `20`): Self = this.set("Runtime.setMaxCallStackSizeToCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeDotterminateExecution(value: ParamsType): Self = this.set("Runtime.terminateExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaDotgetDomains(value: ReturnTypeGetDomainsResponse): Self = this.set("Schema.getDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDotdisable(value: ParamsType): Self = this.set("Security.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDotenable(value: ParamsType): Self = this.set("Security.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDothandleCertificateError(value: `162`): Self = this.set("Security.handleCertificateError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDotsetIgnoreCertificateErrors(value: `161`): Self = this.set("Security.setIgnoreCertificateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDotsetOverrideCertificateErrors(value: `163`): Self = this.set("Security.setOverrideCertificateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotdeliverPushMessage(value: `164`): Self = this.set("ServiceWorker.deliverPushMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotdisable(value: ParamsType): Self = this.set("ServiceWorker.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotdispatchPeriodicSyncEvent(value: `166`): Self = this.set("ServiceWorker.dispatchPeriodicSyncEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotdispatchSyncEvent(value: `165`): Self = this.set("ServiceWorker.dispatchSyncEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotenable(value: ParamsType): Self = this.set("ServiceWorker.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotinspectWorker(value: `167`): Self = this.set("ServiceWorker.inspectWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotsetForceUpdateOnPageLoad(value: `168`): Self = this.set("ServiceWorker.setForceUpdateOnPageLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotskipWaiting(value: `169`): Self = this.set("ServiceWorker.skipWaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotstartWorker(value: `170`): Self = this.set("ServiceWorker.startWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotstopAllWorkers(value: ParamsType): Self = this.set("ServiceWorker.stopAllWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotstopWorker(value: `171`): Self = this.set("ServiceWorker.stopWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotunregister(value: `172`): Self = this.set("ServiceWorker.unregister", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerDotupdateRegistration(value: `173`): Self = this.set("ServiceWorker.updateRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDotclearCookies(value: `177`): Self = this.set("Storage.clearCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDotclearDataForOrigin(value: `174`): Self = this.set("Storage.clearDataForOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDotgetCookies(value: `175`): Self = this.set("Storage.getCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDotgetUsageAndQuota(value: ReturnTypeGetUsageAndQuotaResponse): Self = this.set("Storage.getUsageAndQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDotsetCookies(value: `176`): Self = this.set("Storage.setCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDottrackCacheStorageForOrigin(value: `178`): Self = this.set("Storage.trackCacheStorageForOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDottrackIndexedDBForOrigin(value: `179`): Self = this.set("Storage.trackIndexedDBForOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDotuntrackCacheStorageForOrigin(value: `180`): Self = this.set("Storage.untrackCacheStorageForOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDotuntrackIndexedDBForOrigin(value: `181`): Self = this.set("Storage.untrackIndexedDBForOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemInfoDotgetInfo(value: ReturnTypeGetInfoResponse): Self = this.set("SystemInfo.getInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemInfoDotgetProcessInfo(value: ReturnTypeGetProcessInfoResponse): Self = this.set("SystemInfo.getProcessInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotactivateTarget(value: `182`): Self = this.set("Target.activateTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotattachToBrowserTarget(value: ReturnTypeAttachToBrowserTargetResponse): Self = this.set("Target.attachToBrowserTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotattachToTarget(value: ReturnTypeAttachToTargetResponse): Self = this.set("Target.attachToTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotcloseTarget(value: ReturnTypeCloseTargetResponse): Self = this.set("Target.closeTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotcreateBrowserContext(value: ReturnTypeCreateBrowserContextResponse): Self = this.set("Target.createBrowserContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotcreateTarget(value: ReturnTypeCreateTargetResponse): Self = this.set("Target.createTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotdetachFromTarget(value: `184`): Self = this.set("Target.detachFromTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotdisposeBrowserContext(value: `185`): Self = this.set("Target.disposeBrowserContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotexposeDevToolsProtocol(value: `183`): Self = this.set("Target.exposeDevToolsProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotgetBrowserContexts(value: ReturnTypeGetBrowserContextsResponse): Self = this.set("Target.getBrowserContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotgetTargetInfo(value: ReturnTypeGetTargetInfoResponse): Self = this.set("Target.getTargetInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotgetTargets(value: ReturnTypeGetTargetsResponse): Self = this.set("Target.getTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotsendMessageToTarget(value: `186`): Self = this.set("Target.sendMessageToTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotsetAutoAttach(value: `187`): Self = this.set("Target.setAutoAttach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotsetDiscoverTargets(value: `188`): Self = this.set("Target.setDiscoverTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDotsetRemoteLocations(value: `189`): Self = this.set("Target.setRemoteLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTetheringDotbind(value: `190`): Self = this.set("Tethering.bind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTetheringDotunbind(value: `191`): Self = this.set("Tethering.unbind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingDotend(value: ParamsType): Self = this.set("Tracing.end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingDotgetCategories(value: ReturnTypeGetCategoriesResponse): Self = this.set("Tracing.getCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingDotrecordClockSyncMarker(value: `192`): Self = this.set("Tracing.recordClockSyncMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingDotrequestMemoryDump(value: ReturnTypeRequestMemoryDumpResponse): Self = this.set("Tracing.requestMemoryDump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingDotstart(value: `193`): Self = this.set("Tracing.start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAudioDotdisable(value: ParamsType): Self = this.set("WebAudio.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAudioDotenable(value: ParamsType): Self = this.set("WebAudio.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAudioDotgetRealtimeData(value: ReturnTypeGetRealtimeDataResponse): Self = this.set("WebAudio.getRealtimeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAuthnDotaddCredential(value: `200`): Self = this.set("WebAuthn.addCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAuthnDotaddVirtualAuthenticator(value: ReturnTypeAddVirtualAuthenticatorResponse): Self = this.set("WebAuthn.addVirtualAuthenticator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAuthnDotclearCredentials(value: `202`): Self = this.set("WebAuthn.clearCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAuthnDotdisable(value: ParamsType): Self = this.set("WebAuthn.disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAuthnDotenable(value: ParamsType): Self = this.set("WebAuthn.enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAuthnDotgetCredential(value: ReturnTypeGetCredentialResponse): Self = this.set("WebAuthn.getCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAuthnDotgetCredentials(value: ReturnTypeGetCredentialsResponse): Self = this.set("WebAuthn.getCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAuthnDotremoveCredential(value: `201`): Self = this.set("WebAuthn.removeCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAuthnDotremoveVirtualAuthenticator(value: `199`): Self = this.set("WebAuthn.removeVirtualAuthenticator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAuthnDotsetUserVerified(value: `203`): Self = this.set("WebAuthn.setUserVerified", value.asInstanceOf[js.Any])
  }
}
