package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom Viewability Metric
  */
@js.native
trait SchemaCustomViewabilityMetric extends js.Object {
  /**
    * Configuration of the custom viewability metric.
    */
  var configuration: js.UndefOr[SchemaCustomViewabilityMetricConfiguration] = js.native
  /**
    * ID of the custom viewability metric.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the custom viewability metric.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaCustomViewabilityMetric {
  @scala.inline
  def apply(): SchemaCustomViewabilityMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomViewabilityMetric]
  }
  @scala.inline
  implicit class SchemaCustomViewabilityMetricOps[Self <: SchemaCustomViewabilityMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: SchemaCustomViewabilityMetricConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
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
  }
  
}

