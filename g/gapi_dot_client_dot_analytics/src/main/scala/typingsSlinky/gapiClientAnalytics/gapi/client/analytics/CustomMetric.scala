package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClientAnalytics.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMetric extends js.Object {
  /** Account ID. */
  var accountId: js.UndefOr[String] = js.native
  /** Boolean indicating whether the custom metric is active. */
  var active: js.UndefOr[Boolean] = js.native
  /** Time the custom metric was created. */
  var created: js.UndefOr[String] = js.native
  /** Custom metric ID. */
  var id: js.UndefOr[String] = js.native
  /** Index of the custom metric. */
  var index: js.UndefOr[Double] = js.native
  /** Kind value for a custom metric. Set to "analytics#customMetric". It is a read-only field. */
  var kind: js.UndefOr[String] = js.native
  /** Max value of custom metric. */
  var max_value: js.UndefOr[String] = js.native
  /** Min value of custom metric. */
  var min_value: js.UndefOr[String] = js.native
  /** Name of the custom metric. */
  var name: js.UndefOr[String] = js.native
  /** Parent link for the custom metric. Points to the property to which the custom metric belongs. */
  var parentLink: js.UndefOr[Href] = js.native
  /** Scope of the custom metric: HIT or PRODUCT. */
  var scope: js.UndefOr[String] = js.native
  /** Link for the custom metric */
  var selfLink: js.UndefOr[String] = js.native
  /** Data type of custom metric. */
  var `type`: js.UndefOr[String] = js.native
  /** Time the custom metric was last modified. */
  var updated: js.UndefOr[String] = js.native
  /** Property ID. */
  var webPropertyId: js.UndefOr[String] = js.native
}

object CustomMetric {
  @scala.inline
  def apply(): CustomMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMetric]
  }
  @scala.inline
  implicit class CustomMetricOps[Self <: CustomMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_value(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_value")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_value(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_value")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParentLink(value: Href): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(js.undefined)
        ret
    }
  }
  
}

