package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative optimization activity.
  */
@js.native
trait SchemaOptimizationActivity extends js.Object {
  /**
    * Floodlight activity ID of this optimization activity. This is a required
    * field.
    */
  var floodlightActivityId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the floodlight activity. This is a
    * read-only, auto-generated field.
    */
  var floodlightActivityIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Weight associated with this optimization. The weight assigned will be
    * understood in proportion to the weights assigned to the other
    * optimization activities. Value must be greater than or equal to 1.
    */
  var weight: js.UndefOr[Double] = js.native
}

object SchemaOptimizationActivity {
  @scala.inline
  def apply(): SchemaOptimizationActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptimizationActivity]
  }
  @scala.inline
  implicit class SchemaOptimizationActivityOps[Self <: SchemaOptimizationActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloodlightActivityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityId")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightActivityIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

