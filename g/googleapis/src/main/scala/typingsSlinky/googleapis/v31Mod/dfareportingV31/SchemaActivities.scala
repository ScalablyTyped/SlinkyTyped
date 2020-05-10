package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an activity group.
  */
@js.native
trait SchemaActivities extends js.Object {
  /**
    * List of activity filters. The dimension values need to be all either of
    * type &quot;dfa:activity&quot; or &quot;dfa:activityGroup&quot;.
    */
  var filters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#activities.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * List of names of floodlight activity metrics.
    */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaActivities {
  @scala.inline
  def apply(): SchemaActivities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivities]
  }
  @scala.inline
  implicit class SchemaActivitiesOps[Self <: SchemaActivities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[SchemaDimensionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
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
    def withMetricNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricNames")(js.undefined)
        ret
    }
  }
  
}

