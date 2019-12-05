package typingsSlinky.gapiDotClientDotAnalytics.gapi.client.analytics

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotAnalytics.Anon_AccountIdAltCustomMetricId
import typingsSlinky.gapiDotClientDotAnalytics.Anon_AccountIdAltCustomMetricIdFields
import typingsSlinky.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresults
import typingsSlinky.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetricsResource extends js.Object {
  /** Get a custom metric to which the user has access. */
  def get(request: Anon_AccountIdAltCustomMetricId): Request[CustomMetric]
  /** Create a new custom metric. */
  def insert(request: Anon_AccountIdAltFieldsKeyOauthtoken): Request[CustomMetric]
  /** Lists custom metrics to which the user has access. */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresults): Request[CustomMetrics]
  /** Updates an existing custom metric. This method supports patch semantics. */
  def patch(request: Anon_AccountIdAltCustomMetricIdFields): Request[CustomMetric]
  /** Updates an existing custom metric. */
  def update(request: Anon_AccountIdAltCustomMetricIdFields): Request[CustomMetric]
}

object CustomMetricsResource {
  @scala.inline
  def apply(
    get: Anon_AccountIdAltCustomMetricId => Request[CustomMetric],
    insert: Anon_AccountIdAltFieldsKeyOauthtoken => Request[CustomMetric],
    list: Anon_AccountIdAltFieldsKeyMaxresults => Request[CustomMetrics],
    patch: Anon_AccountIdAltCustomMetricIdFields => Request[CustomMetric],
    update: Anon_AccountIdAltCustomMetricIdFields => Request[CustomMetric]
  ): CustomMetricsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomMetricsResource]
  }
}

