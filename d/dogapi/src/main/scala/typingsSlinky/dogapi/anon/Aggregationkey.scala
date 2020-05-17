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

@js.native
trait Aggregationkey extends js.Object {
  var aggregation_key: js.UndefOr[String] = js.native
  var alert_type: js.UndefOr[error | warning | info | success] = js.native
  var date_happened: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var priority: js.UndefOr[normal | low] = js.native
  var source_type_name: js.UndefOr[
    nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano
  ] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object Aggregationkey {
  @scala.inline
  def apply(): Aggregationkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregationkey]
  }
  @scala.inline
  implicit class AggregationkeyOps[Self <: Aggregationkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregation_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregation_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation_key")(js.undefined)
        ret
    }
    @scala.inline
    def withAlert_type(value: error | warning | info | success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlert_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert_type")(js.undefined)
        ret
    }
    @scala.inline
    def withDate_happened(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_happened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate_happened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_happened")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: normal | low): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_type_name(
      value: nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_type_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_type_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_type_name")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

