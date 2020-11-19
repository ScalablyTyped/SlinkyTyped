package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomMetric
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMetricsCollection extends js.Object {
  
  // Get a custom metric to which the user has access.
  def get(accountId: String, webPropertyId: String, customMetricId: String): CustomMetric = js.native
  
  // Create a new custom metric.
  def insert(resource: CustomMetric, accountId: String, webPropertyId: String): CustomMetric = js.native
  
  // Lists custom metrics to which the user has access.
  def list(accountId: String, webPropertyId: String): CustomMetrics = js.native
  // Lists custom metrics to which the user has access.
  def list(accountId: String, webPropertyId: String, optionalArgs: js.Object): CustomMetrics = js.native
  
  // Updates an existing custom metric. This method supports patch semantics.
  def patch(resource: CustomMetric, accountId: String, webPropertyId: String, customMetricId: String): CustomMetric = js.native
  // Updates an existing custom metric. This method supports patch semantics.
  def patch(
    resource: CustomMetric,
    accountId: String,
    webPropertyId: String,
    customMetricId: String,
    optionalArgs: js.Object
  ): CustomMetric = js.native
  
  // Updates an existing custom metric.
  def update(resource: CustomMetric, accountId: String, webPropertyId: String, customMetricId: String): CustomMetric = js.native
  // Updates an existing custom metric.
  def update(
    resource: CustomMetric,
    accountId: String,
    webPropertyId: String,
    customMetricId: String,
    optionalArgs: js.Object
  ): CustomMetric = js.native
}
