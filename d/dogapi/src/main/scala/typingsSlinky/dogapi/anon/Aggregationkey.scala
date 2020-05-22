package typingsSlinky.dogapi.anon

import typingsSlinky.dogapi.dogapiStrings.`my apps`
import typingsSlinky.dogapi.dogapiStrings.bitbucket
import typingsSlinky.dogapi.dogapiStrings.capistrano
import typingsSlinky.dogapi.dogapiStrings.chef
import typingsSlinky.dogapi.dogapiStrings.error
import typingsSlinky.dogapi.dogapiStrings.fabric
import typingsSlinky.dogapi.dogapiStrings.feed
import typingsSlinky.dogapi.dogapiStrings.git
import typingsSlinky.dogapi.dogapiStrings.hudson
import typingsSlinky.dogapi.dogapiStrings.info
import typingsSlinky.dogapi.dogapiStrings.jenkins
import typingsSlinky.dogapi.dogapiStrings.low
import typingsSlinky.dogapi.dogapiStrings.nagios
import typingsSlinky.dogapi.dogapiStrings.normal
import typingsSlinky.dogapi.dogapiStrings.puppet
import typingsSlinky.dogapi.dogapiStrings.success
import typingsSlinky.dogapi.dogapiStrings.user
import typingsSlinky.dogapi.dogapiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregationkey extends js.Object {
  var aggregation_key: js.UndefOr[String] = js.undefined
  var alert_type: js.UndefOr[error | warning | info | success] = js.undefined
  var date_happened: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[normal | low] = js.undefined
  var source_type_name: js.UndefOr[
    nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano
  ] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Aggregationkey {
  @scala.inline
  def apply(
    aggregation_key: String = null,
    alert_type: error | warning | info | success = null,
    date_happened: js.UndefOr[Double] = js.undefined,
    host: String = null,
    priority: normal | low = null,
    source_type_name: nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano = null,
    tags: js.Array[String] = null
  ): Aggregationkey = {
    val __obj = js.Dynamic.literal()
    if (aggregation_key != null) __obj.updateDynamic("aggregation_key")(aggregation_key.asInstanceOf[js.Any])
    if (alert_type != null) __obj.updateDynamic("alert_type")(alert_type.asInstanceOf[js.Any])
    if (!js.isUndefined(date_happened)) __obj.updateDynamic("date_happened")(date_happened.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (source_type_name != null) __obj.updateDynamic("source_type_name")(source_type_name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregationkey]
  }
}

