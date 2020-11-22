package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlCloseJob
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlDeleteCalendar
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlDeleteCalendarEvent
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlDeleteCalendarJob
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlDeleteDataFrameAnalytics
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlDeleteDatafeed
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlDeleteExpiredData
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlDeleteFilter
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlDeleteForecast
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlDeleteJob
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlDeleteModelSnapshot
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlDeleteTrainedModel
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlEstimateModelMemory
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlEvaluateDataFrame
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlExplainDataFrameAnalytics
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlFindFileStructure
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlFlushJob
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlForecast
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetBuckets
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetCalendarEvents
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetCalendars
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetCategories
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetDataFrameAnalytics
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetDataFrameAnalyticsStats
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetDatafeedStats
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetDatafeeds
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetFilters
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetInfluencers
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetJobStats
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetJobs
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetModelSnapshots
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetOverallBuckets
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetRecords
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetTrainedModels
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlGetTrainedModelsStats
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlInfo
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlOpenJob
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlPostCalendarEvents
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlPostData
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlPreviewDatafeed
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlPutCalendar
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlPutCalendarJob
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlPutDataFrameAnalytics
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlPutDatafeed
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlPutFilter
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlPutJob
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlPutTrainedModel
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlRevertModelSnapshot
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlSetUpgradeMode
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlStartDataFrameAnalytics
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlStartDatafeed
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlStopDataFrameAnalytics
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlStopDatafeed
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlUpdateDataFrameAnalytics
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlUpdateDatafeed
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlUpdateFilter
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlUpdateJob
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlUpdateModelSnapshot
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlValidate
import typingsSlinky.elasticElasticsearch.requestParamsMod.MlValidateDetector
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.RequestNDBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Closejob extends js.Object {
  
  def closeJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def closeJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def closeJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def closeJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlCloseJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def closeJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlCloseJob[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def closeJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlCloseJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def closeJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlCloseJob[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def close_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def close_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def close_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def close_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlCloseJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def close_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlCloseJob[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def close_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlCloseJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def close_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlCloseJob[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteCalendar[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendar[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteCalendar[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendar[TResponse, TContext](params: MlDeleteCalendar): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendar[TResponse, TContext](params: MlDeleteCalendar, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteCalendar[TResponse, TContext](params: MlDeleteCalendar, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendar[TResponse, TContext](
    params: MlDeleteCalendar,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteCalendarEvent[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendarEvent[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteCalendarEvent[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendarEvent[TResponse, TContext](params: MlDeleteCalendarEvent): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendarEvent[TResponse, TContext](params: MlDeleteCalendarEvent, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteCalendarEvent[TResponse, TContext](params: MlDeleteCalendarEvent, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendarEvent[TResponse, TContext](
    params: MlDeleteCalendarEvent,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteCalendarJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendarJob[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteCalendarJob[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendarJob[TResponse, TContext](params: MlDeleteCalendarJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendarJob[TResponse, TContext](params: MlDeleteCalendarJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteCalendarJob[TResponse, TContext](params: MlDeleteCalendarJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteCalendarJob[TResponse, TContext](
    params: MlDeleteCalendarJob,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteDataFrameAnalytics[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDataFrameAnalytics[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteDataFrameAnalytics[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDataFrameAnalytics[TResponse, TContext](params: MlDeleteDataFrameAnalytics): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDataFrameAnalytics[TResponse, TContext](params: MlDeleteDataFrameAnalytics, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteDataFrameAnalytics[TResponse, TContext](params: MlDeleteDataFrameAnalytics, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDataFrameAnalytics[TResponse, TContext](
    params: MlDeleteDataFrameAnalytics,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteDatafeed[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDatafeed[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteDatafeed[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDatafeed[TResponse, TContext](params: MlDeleteDatafeed): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDatafeed[TResponse, TContext](params: MlDeleteDatafeed, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteDatafeed[TResponse, TContext](params: MlDeleteDatafeed, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDatafeed[TResponse, TContext](
    params: MlDeleteDatafeed,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteExpiredData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteExpiredData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteExpiredData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteExpiredData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlDeleteExpiredData[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteExpiredData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlDeleteExpiredData[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteExpiredData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlDeleteExpiredData[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteExpiredData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlDeleteExpiredData[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteFilter[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteFilter[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteFilter[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteFilter[TResponse, TContext](params: MlDeleteFilter): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteFilter[TResponse, TContext](params: MlDeleteFilter, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteFilter[TResponse, TContext](params: MlDeleteFilter, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteFilter[TResponse, TContext](
    params: MlDeleteFilter,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteForecast[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteForecast[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteForecast[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteForecast[TResponse, TContext](params: MlDeleteForecast): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteForecast[TResponse, TContext](params: MlDeleteForecast, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteForecast[TResponse, TContext](params: MlDeleteForecast, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteForecast[TResponse, TContext](
    params: MlDeleteForecast,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteJob[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](params: MlDeleteJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](params: MlDeleteJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteJob[TResponse, TContext](params: MlDeleteJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](params: MlDeleteJob, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def deleteModelSnapshot[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteModelSnapshot[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteModelSnapshot[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteModelSnapshot[TResponse, TContext](params: MlDeleteModelSnapshot): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteModelSnapshot[TResponse, TContext](params: MlDeleteModelSnapshot, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteModelSnapshot[TResponse, TContext](params: MlDeleteModelSnapshot, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteModelSnapshot[TResponse, TContext](
    params: MlDeleteModelSnapshot,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteTrainedModel[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTrainedModel[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteTrainedModel[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTrainedModel[TResponse, TContext](params: MlDeleteTrainedModel): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTrainedModel[TResponse, TContext](params: MlDeleteTrainedModel, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteTrainedModel[TResponse, TContext](params: MlDeleteTrainedModel, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTrainedModel[TResponse, TContext](
    params: MlDeleteTrainedModel,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_calendar[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_calendar[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar[TResponse, TContext](params: MlDeleteCalendar): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar[TResponse, TContext](params: MlDeleteCalendar, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_calendar[TResponse, TContext](params: MlDeleteCalendar, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar[TResponse, TContext](
    params: MlDeleteCalendar,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_calendar_event[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar_event[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_calendar_event[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar_event[TResponse, TContext](params: MlDeleteCalendarEvent): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar_event[TResponse, TContext](params: MlDeleteCalendarEvent, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_calendar_event[TResponse, TContext](params: MlDeleteCalendarEvent, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar_event[TResponse, TContext](
    params: MlDeleteCalendarEvent,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_calendar_job[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar_job[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_calendar_job[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar_job[TResponse, TContext](params: MlDeleteCalendarJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar_job[TResponse, TContext](params: MlDeleteCalendarJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_calendar_job[TResponse, TContext](params: MlDeleteCalendarJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_calendar_job[TResponse, TContext](
    params: MlDeleteCalendarJob,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_data_frame_analytics[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_data_frame_analytics[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_data_frame_analytics[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_data_frame_analytics[TResponse, TContext](params: MlDeleteDataFrameAnalytics): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_data_frame_analytics[TResponse, TContext](params: MlDeleteDataFrameAnalytics, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_data_frame_analytics[TResponse, TContext](params: MlDeleteDataFrameAnalytics, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_data_frame_analytics[TResponse, TContext](
    params: MlDeleteDataFrameAnalytics,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_datafeed[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_datafeed[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_datafeed[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_datafeed[TResponse, TContext](params: MlDeleteDatafeed): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_datafeed[TResponse, TContext](params: MlDeleteDatafeed, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_datafeed[TResponse, TContext](params: MlDeleteDatafeed, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_datafeed[TResponse, TContext](
    params: MlDeleteDatafeed,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_expired_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_expired_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_expired_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_expired_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlDeleteExpiredData[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_expired_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlDeleteExpiredData[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_expired_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlDeleteExpiredData[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_expired_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlDeleteExpiredData[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_filter[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_filter[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_filter[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_filter[TResponse, TContext](params: MlDeleteFilter): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_filter[TResponse, TContext](params: MlDeleteFilter, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_filter[TResponse, TContext](params: MlDeleteFilter, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_filter[TResponse, TContext](
    params: MlDeleteFilter,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_forecast[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_forecast[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_forecast[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_forecast[TResponse, TContext](params: MlDeleteForecast): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_forecast[TResponse, TContext](params: MlDeleteForecast, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_forecast[TResponse, TContext](params: MlDeleteForecast, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_forecast[TResponse, TContext](
    params: MlDeleteForecast,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_job[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_job[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_job[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_job[TResponse, TContext](params: MlDeleteJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_job[TResponse, TContext](params: MlDeleteJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_job[TResponse, TContext](params: MlDeleteJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_job[TResponse, TContext](params: MlDeleteJob, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def delete_model_snapshot[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_model_snapshot[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_model_snapshot[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_model_snapshot[TResponse, TContext](params: MlDeleteModelSnapshot): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_model_snapshot[TResponse, TContext](params: MlDeleteModelSnapshot, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_model_snapshot[TResponse, TContext](params: MlDeleteModelSnapshot, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_model_snapshot[TResponse, TContext](
    params: MlDeleteModelSnapshot,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_trained_model[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_trained_model[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_trained_model[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_trained_model[TResponse, TContext](params: MlDeleteTrainedModel): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_trained_model[TResponse, TContext](params: MlDeleteTrainedModel, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_trained_model[TResponse, TContext](params: MlDeleteTrainedModel, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_trained_model[TResponse, TContext](
    params: MlDeleteTrainedModel,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def estimateModelMemory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def estimateModelMemory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def estimateModelMemory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def estimateModelMemory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEstimateModelMemory[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def estimateModelMemory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEstimateModelMemory[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def estimateModelMemory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEstimateModelMemory[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def estimateModelMemory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlEstimateModelMemory[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def estimate_model_memory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def estimate_model_memory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def estimate_model_memory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def estimate_model_memory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEstimateModelMemory[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def estimate_model_memory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEstimateModelMemory[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def estimate_model_memory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEstimateModelMemory[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def estimate_model_memory[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlEstimateModelMemory[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def evaluateDataFrame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def evaluateDataFrame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def evaluateDataFrame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def evaluateDataFrame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEvaluateDataFrame[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def evaluateDataFrame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEvaluateDataFrame[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def evaluateDataFrame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEvaluateDataFrame[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def evaluateDataFrame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlEvaluateDataFrame[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def evaluate_data_frame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def evaluate_data_frame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def evaluate_data_frame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def evaluate_data_frame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEvaluateDataFrame[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def evaluate_data_frame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEvaluateDataFrame[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def evaluate_data_frame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlEvaluateDataFrame[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def evaluate_data_frame[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlEvaluateDataFrame[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def explainDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explainDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explainDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explainDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlExplainDataFrameAnalytics[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explainDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlExplainDataFrameAnalytics[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explainDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlExplainDataFrameAnalytics[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explainDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlExplainDataFrameAnalytics[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def explain_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explain_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlExplainDataFrameAnalytics[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlExplainDataFrameAnalytics[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explain_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlExplainDataFrameAnalytics[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlExplainDataFrameAnalytics[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def findFileStructure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def findFileStructure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def findFileStructure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def findFileStructure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MlFindFileStructure[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def findFileStructure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MlFindFileStructure[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def findFileStructure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MlFindFileStructure[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def findFileStructure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: MlFindFileStructure[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def find_file_structure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def find_file_structure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def find_file_structure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def find_file_structure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MlFindFileStructure[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def find_file_structure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MlFindFileStructure[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def find_file_structure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MlFindFileStructure[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def find_file_structure[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: MlFindFileStructure[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def flushJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flushJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def flushJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flushJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlFlushJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flushJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlFlushJob[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def flushJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlFlushJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flushJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlFlushJob[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def flush_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flush_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def flush_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flush_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlFlushJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flush_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlFlushJob[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def flush_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlFlushJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def flush_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlFlushJob[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def forecast[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forecast[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def forecast[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forecast[TResponse, TContext](params: MlForecast): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forecast[TResponse, TContext](params: MlForecast, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def forecast[TResponse, TContext](params: MlForecast, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forecast[TResponse, TContext](params: MlForecast, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def getBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetBuckets[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetBuckets[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetBuckets[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetBuckets[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getCalendarEvents[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCalendarEvents[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getCalendarEvents[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCalendarEvents[TResponse, TContext](params: MlGetCalendarEvents): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCalendarEvents[TResponse, TContext](params: MlGetCalendarEvents, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getCalendarEvents[TResponse, TContext](params: MlGetCalendarEvents, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCalendarEvents[TResponse, TContext](
    params: MlGetCalendarEvents,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getCalendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCalendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getCalendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCalendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCalendars[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCalendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCalendars[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getCalendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCalendars[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCalendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetCalendars[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getCategories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCategories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getCategories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCategories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCategories[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCategories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCategories[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getCategories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCategories[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getCategories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetCategories[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getDataFrameAnalytics[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDataFrameAnalytics[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getDataFrameAnalytics[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDataFrameAnalytics[TResponse, TContext](params: MlGetDataFrameAnalytics): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDataFrameAnalytics[TResponse, TContext](params: MlGetDataFrameAnalytics, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getDataFrameAnalytics[TResponse, TContext](params: MlGetDataFrameAnalytics, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDataFrameAnalytics[TResponse, TContext](
    params: MlGetDataFrameAnalytics,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getDataFrameAnalyticsStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDataFrameAnalyticsStats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getDataFrameAnalyticsStats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDataFrameAnalyticsStats[TResponse, TContext](params: MlGetDataFrameAnalyticsStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDataFrameAnalyticsStats[TResponse, TContext](params: MlGetDataFrameAnalyticsStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getDataFrameAnalyticsStats[TResponse, TContext](params: MlGetDataFrameAnalyticsStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDataFrameAnalyticsStats[TResponse, TContext](
    params: MlGetDataFrameAnalyticsStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getDatafeedStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDatafeedStats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getDatafeedStats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDatafeedStats[TResponse, TContext](params: MlGetDatafeedStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDatafeedStats[TResponse, TContext](params: MlGetDatafeedStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getDatafeedStats[TResponse, TContext](params: MlGetDatafeedStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDatafeedStats[TResponse, TContext](
    params: MlGetDatafeedStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getDatafeeds[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDatafeeds[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getDatafeeds[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDatafeeds[TResponse, TContext](params: MlGetDatafeeds): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDatafeeds[TResponse, TContext](params: MlGetDatafeeds, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getDatafeeds[TResponse, TContext](params: MlGetDatafeeds, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getDatafeeds[TResponse, TContext](
    params: MlGetDatafeeds,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getFilters[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getFilters[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getFilters[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getFilters[TResponse, TContext](params: MlGetFilters): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getFilters[TResponse, TContext](params: MlGetFilters, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getFilters[TResponse, TContext](params: MlGetFilters, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getFilters[TResponse, TContext](params: MlGetFilters, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def getInfluencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getInfluencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getInfluencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getInfluencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetInfluencers[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getInfluencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetInfluencers[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getInfluencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetInfluencers[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getInfluencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetInfluencers[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getJobStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobStats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getJobStats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobStats[TResponse, TContext](params: MlGetJobStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobStats[TResponse, TContext](params: MlGetJobStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getJobStats[TResponse, TContext](params: MlGetJobStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobStats[TResponse, TContext](params: MlGetJobStats, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def getJobs[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getJobs[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](params: MlGetJobs): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](params: MlGetJobs, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getJobs[TResponse, TContext](params: MlGetJobs, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](params: MlGetJobs, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def getModelSnapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getModelSnapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getModelSnapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getModelSnapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetModelSnapshots[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getModelSnapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetModelSnapshots[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getModelSnapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetModelSnapshots[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getModelSnapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetModelSnapshots[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getOverallBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getOverallBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getOverallBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getOverallBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetOverallBuckets[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getOverallBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetOverallBuckets[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getOverallBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetOverallBuckets[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getOverallBuckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetOverallBuckets[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getRecords[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRecords[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRecords[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRecords[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetRecords[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRecords[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetRecords[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRecords[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetRecords[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRecords[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetRecords[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getTrainedModels[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrainedModels[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getTrainedModels[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrainedModels[TResponse, TContext](params: MlGetTrainedModels): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrainedModels[TResponse, TContext](params: MlGetTrainedModels, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getTrainedModels[TResponse, TContext](params: MlGetTrainedModels, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrainedModels[TResponse, TContext](
    params: MlGetTrainedModels,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getTrainedModelsStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrainedModelsStats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getTrainedModelsStats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrainedModelsStats[TResponse, TContext](params: MlGetTrainedModelsStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrainedModelsStats[TResponse, TContext](params: MlGetTrainedModelsStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getTrainedModelsStats[TResponse, TContext](params: MlGetTrainedModelsStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrainedModelsStats[TResponse, TContext](
    params: MlGetTrainedModelsStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetBuckets[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetBuckets[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetBuckets[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetBuckets[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_calendar_events[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_calendar_events[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_calendar_events[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_calendar_events[TResponse, TContext](params: MlGetCalendarEvents): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_calendar_events[TResponse, TContext](params: MlGetCalendarEvents, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_calendar_events[TResponse, TContext](params: MlGetCalendarEvents, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_calendar_events[TResponse, TContext](
    params: MlGetCalendarEvents,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_calendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_calendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_calendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_calendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCalendars[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_calendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCalendars[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_calendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCalendars[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_calendars[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetCalendars[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_categories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_categories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_categories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_categories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCategories[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_categories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCategories[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_categories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetCategories[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_categories[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetCategories[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_data_frame_analytics[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_data_frame_analytics[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_data_frame_analytics[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_data_frame_analytics[TResponse, TContext](params: MlGetDataFrameAnalytics): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_data_frame_analytics[TResponse, TContext](params: MlGetDataFrameAnalytics, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_data_frame_analytics[TResponse, TContext](params: MlGetDataFrameAnalytics, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_data_frame_analytics[TResponse, TContext](
    params: MlGetDataFrameAnalytics,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_data_frame_analytics_stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_data_frame_analytics_stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_data_frame_analytics_stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_data_frame_analytics_stats[TResponse, TContext](params: MlGetDataFrameAnalyticsStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_data_frame_analytics_stats[TResponse, TContext](params: MlGetDataFrameAnalyticsStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_data_frame_analytics_stats[TResponse, TContext](params: MlGetDataFrameAnalyticsStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_data_frame_analytics_stats[TResponse, TContext](
    params: MlGetDataFrameAnalyticsStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_datafeed_stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_datafeed_stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_datafeed_stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_datafeed_stats[TResponse, TContext](params: MlGetDatafeedStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_datafeed_stats[TResponse, TContext](params: MlGetDatafeedStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_datafeed_stats[TResponse, TContext](params: MlGetDatafeedStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_datafeed_stats[TResponse, TContext](
    params: MlGetDatafeedStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_datafeeds[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_datafeeds[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_datafeeds[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_datafeeds[TResponse, TContext](params: MlGetDatafeeds): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_datafeeds[TResponse, TContext](params: MlGetDatafeeds, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_datafeeds[TResponse, TContext](params: MlGetDatafeeds, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_datafeeds[TResponse, TContext](
    params: MlGetDatafeeds,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_filters[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_filters[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_filters[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_filters[TResponse, TContext](params: MlGetFilters): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_filters[TResponse, TContext](params: MlGetFilters, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_filters[TResponse, TContext](params: MlGetFilters, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_filters[TResponse, TContext](params: MlGetFilters, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def get_influencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_influencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_influencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_influencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetInfluencers[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_influencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetInfluencers[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_influencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetInfluencers[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_influencers[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetInfluencers[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_job_stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_job_stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_job_stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_job_stats[TResponse, TContext](params: MlGetJobStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_job_stats[TResponse, TContext](params: MlGetJobStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_job_stats[TResponse, TContext](params: MlGetJobStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_job_stats[TResponse, TContext](params: MlGetJobStats, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def get_jobs[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_jobs[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_jobs[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_jobs[TResponse, TContext](params: MlGetJobs): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_jobs[TResponse, TContext](params: MlGetJobs, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_jobs[TResponse, TContext](params: MlGetJobs, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_jobs[TResponse, TContext](params: MlGetJobs, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def get_model_snapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_model_snapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_model_snapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_model_snapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetModelSnapshots[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_model_snapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetModelSnapshots[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_model_snapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetModelSnapshots[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_model_snapshots[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetModelSnapshots[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_overall_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_overall_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_overall_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_overall_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetOverallBuckets[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_overall_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetOverallBuckets[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_overall_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetOverallBuckets[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_overall_buckets[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetOverallBuckets[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_records[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_records[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_records[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_records[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetRecords[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_records[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetRecords[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_records[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlGetRecords[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_records[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlGetRecords[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_trained_models[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trained_models[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_trained_models[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trained_models[TResponse, TContext](params: MlGetTrainedModels): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trained_models[TResponse, TContext](params: MlGetTrainedModels, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_trained_models[TResponse, TContext](params: MlGetTrainedModels, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trained_models[TResponse, TContext](
    params: MlGetTrainedModels,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_trained_models_stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trained_models_stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_trained_models_stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trained_models_stats[TResponse, TContext](params: MlGetTrainedModelsStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trained_models_stats[TResponse, TContext](params: MlGetTrainedModelsStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_trained_models_stats[TResponse, TContext](params: MlGetTrainedModelsStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trained_models_stats[TResponse, TContext](
    params: MlGetTrainedModelsStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def info[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: MlInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: MlInfo, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def info[TResponse, TContext](params: MlInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: MlInfo, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def openJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def openJob[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def openJob[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def openJob[TResponse, TContext](params: MlOpenJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def openJob[TResponse, TContext](params: MlOpenJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def openJob[TResponse, TContext](params: MlOpenJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def openJob[TResponse, TContext](params: MlOpenJob, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def open_job[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def open_job[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def open_job[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def open_job[TResponse, TContext](params: MlOpenJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def open_job[TResponse, TContext](params: MlOpenJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def open_job[TResponse, TContext](params: MlOpenJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def open_job[TResponse, TContext](params: MlOpenJob, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def postCalendarEvents[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postCalendarEvents[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postCalendarEvents[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postCalendarEvents[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostCalendarEvents[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postCalendarEvents[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostCalendarEvents[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postCalendarEvents[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostCalendarEvents[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postCalendarEvents[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPostCalendarEvents[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def postData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostData[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostData[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostData[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postData[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPostData[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def post_calendar_events[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_calendar_events[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_calendar_events[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_calendar_events[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostCalendarEvents[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_calendar_events[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostCalendarEvents[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_calendar_events[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostCalendarEvents[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_calendar_events[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPostCalendarEvents[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def post_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostData[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostData[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPostData[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_data[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPostData[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def previewDatafeed[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def previewDatafeed[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def previewDatafeed[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def previewDatafeed[TResponse, TContext](params: MlPreviewDatafeed): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def previewDatafeed[TResponse, TContext](params: MlPreviewDatafeed, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def previewDatafeed[TResponse, TContext](params: MlPreviewDatafeed, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def previewDatafeed[TResponse, TContext](
    params: MlPreviewDatafeed,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def preview_datafeed[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def preview_datafeed[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def preview_datafeed[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def preview_datafeed[TResponse, TContext](params: MlPreviewDatafeed): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def preview_datafeed[TResponse, TContext](params: MlPreviewDatafeed, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def preview_datafeed[TResponse, TContext](params: MlPreviewDatafeed, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def preview_datafeed[TResponse, TContext](
    params: MlPreviewDatafeed,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putCalendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putCalendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putCalendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putCalendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutCalendar[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putCalendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutCalendar[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putCalendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutCalendar[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putCalendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutCalendar[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putCalendarJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putCalendarJob[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putCalendarJob[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putCalendarJob[TResponse, TContext](params: MlPutCalendarJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putCalendarJob[TResponse, TContext](params: MlPutCalendarJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putCalendarJob[TResponse, TContext](params: MlPutCalendarJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putCalendarJob[TResponse, TContext](
    params: MlPutCalendarJob,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDataFrameAnalytics[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDataFrameAnalytics[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDataFrameAnalytics[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutDataFrameAnalytics[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDatafeed[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDatafeed[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDatafeed[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutDatafeed[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutFilter[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutFilter[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutFilter[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutFilter[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutJob[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutJob[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putTrainedModel[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTrainedModel[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putTrainedModel[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTrainedModel[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutTrainedModel[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTrainedModel[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutTrainedModel[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putTrainedModel[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutTrainedModel[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTrainedModel[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutTrainedModel[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_calendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_calendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_calendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_calendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutCalendar[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_calendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutCalendar[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_calendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutCalendar[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_calendar[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutCalendar[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_calendar_job[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_calendar_job[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_calendar_job[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_calendar_job[TResponse, TContext](params: MlPutCalendarJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_calendar_job[TResponse, TContext](params: MlPutCalendarJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_calendar_job[TResponse, TContext](params: MlPutCalendarJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_calendar_job[TResponse, TContext](
    params: MlPutCalendarJob,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDataFrameAnalytics[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDataFrameAnalytics[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDataFrameAnalytics[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutDataFrameAnalytics[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDatafeed[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDatafeed[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutDatafeed[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutDatafeed[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutFilter[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutFilter[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutFilter[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutFilter[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutJob[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutJob[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_trained_model[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_trained_model[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_trained_model[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_trained_model[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutTrainedModel[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_trained_model[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutTrainedModel[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_trained_model[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlPutTrainedModel[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_trained_model[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlPutTrainedModel[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def revertModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def revertModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def revertModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def revertModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlRevertModelSnapshot[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def revertModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlRevertModelSnapshot[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def revertModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlRevertModelSnapshot[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def revertModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlRevertModelSnapshot[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def revert_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def revert_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def revert_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def revert_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlRevertModelSnapshot[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def revert_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlRevertModelSnapshot[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def revert_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlRevertModelSnapshot[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def revert_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlRevertModelSnapshot[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def setUpgradeMode[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def setUpgradeMode[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def setUpgradeMode[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def setUpgradeMode[TResponse, TContext](params: MlSetUpgradeMode): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def setUpgradeMode[TResponse, TContext](params: MlSetUpgradeMode, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def setUpgradeMode[TResponse, TContext](params: MlSetUpgradeMode, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def setUpgradeMode[TResponse, TContext](
    params: MlSetUpgradeMode,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def set_upgrade_mode[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def set_upgrade_mode[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def set_upgrade_mode[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def set_upgrade_mode[TResponse, TContext](params: MlSetUpgradeMode): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def set_upgrade_mode[TResponse, TContext](params: MlSetUpgradeMode, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def set_upgrade_mode[TResponse, TContext](params: MlSetUpgradeMode, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def set_upgrade_mode[TResponse, TContext](
    params: MlSetUpgradeMode,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def startDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def startDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDataFrameAnalytics[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDataFrameAnalytics[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def startDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDataFrameAnalytics[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlStartDataFrameAnalytics[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def startDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def startDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDatafeed[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDatafeed[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def startDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDatafeed[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlStartDatafeed[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def start_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDataFrameAnalytics[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDataFrameAnalytics[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDataFrameAnalytics[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlStartDataFrameAnalytics[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def start_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDatafeed[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDatafeed[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStartDatafeed[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlStartDatafeed[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def stopDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stopDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDataFrameAnalytics[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDataFrameAnalytics[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stopDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDataFrameAnalytics[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlStopDataFrameAnalytics[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def stopDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stopDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDatafeed[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDatafeed[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stopDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDatafeed[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlStopDatafeed[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def stop_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDataFrameAnalytics[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDataFrameAnalytics[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDataFrameAnalytics[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlStopDataFrameAnalytics[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def stop_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDatafeed[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDatafeed[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlStopDatafeed[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlStopDatafeed[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def updateDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDataFrameAnalytics[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDataFrameAnalytics[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDataFrameAnalytics[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateDataFrameAnalytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlUpdateDataFrameAnalytics[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def updateDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDatafeed[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDatafeed[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDatafeed[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateDatafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlUpdateDatafeed[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def updateFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateFilter[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateFilter[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateFilter[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateFilter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlUpdateFilter[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def updateJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateJob[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlUpdateJob[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def updateModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateModelSnapshot[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateModelSnapshot[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateModelSnapshot[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateModelSnapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlUpdateModelSnapshot[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def update_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDataFrameAnalytics[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDataFrameAnalytics[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDataFrameAnalytics[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_data_frame_analytics[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlUpdateDataFrameAnalytics[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def update_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDatafeed[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDatafeed[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateDatafeed[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_datafeed[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlUpdateDatafeed[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def update_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateFilter[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateFilter[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateFilter[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_filter[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlUpdateFilter[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def update_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateJob[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlUpdateJob[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def update_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateModelSnapshot[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateModelSnapshot[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlUpdateModelSnapshot[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_model_snapshot[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlUpdateModelSnapshot[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def validate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def validate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlValidate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlValidate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def validate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlValidate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlValidate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def validateDetector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validateDetector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def validateDetector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validateDetector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlValidateDetector[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validateDetector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlValidateDetector[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def validateDetector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlValidateDetector[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validateDetector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlValidateDetector[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def validate_detector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validate_detector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def validate_detector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validate_detector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlValidateDetector[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validate_detector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlValidateDetector[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def validate_detector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: MlValidateDetector[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def validate_detector[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: MlValidateDetector[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}
