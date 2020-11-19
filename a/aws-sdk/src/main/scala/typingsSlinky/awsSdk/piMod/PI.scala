package typingsSlinky.awsSdk.piMod

import typingsSlinky.awsSdk.configMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PI extends Service {
  
  @JSName("config")
  var config_PI: ConfigBase with ClientConfiguration = js.native
  
  /**
    * For a specific time period, retrieve the top N dimension keys for a metric.
    */
  def describeDimensionKeys(): Request[DescribeDimensionKeysResponse, AWSError] = js.native
  def describeDimensionKeys(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDimensionKeysResponse, Unit]): Request[DescribeDimensionKeysResponse, AWSError] = js.native
  /**
    * For a specific time period, retrieve the top N dimension keys for a metric.
    */
  def describeDimensionKeys(params: DescribeDimensionKeysRequest): Request[DescribeDimensionKeysResponse, AWSError] = js.native
  def describeDimensionKeys(
    params: DescribeDimensionKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDimensionKeysResponse, Unit]
  ): Request[DescribeDimensionKeysResponse, AWSError] = js.native
  
  /**
    * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
    */
  def getResourceMetrics(): Request[GetResourceMetricsResponse, AWSError] = js.native
  def getResourceMetrics(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceMetricsResponse, Unit]): Request[GetResourceMetricsResponse, AWSError] = js.native
  /**
    * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
    */
  def getResourceMetrics(params: GetResourceMetricsRequest): Request[GetResourceMetricsResponse, AWSError] = js.native
  def getResourceMetrics(
    params: GetResourceMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceMetricsResponse, Unit]
  ): Request[GetResourceMetricsResponse, AWSError] = js.native
}
