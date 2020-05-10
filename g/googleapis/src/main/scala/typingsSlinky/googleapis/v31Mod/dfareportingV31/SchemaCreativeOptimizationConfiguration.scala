package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative optimization settings.
  */
@js.native
trait SchemaCreativeOptimizationConfiguration extends js.Object {
  /**
    * ID of this creative optimization config. This field is auto-generated
    * when the campaign is inserted or updated. It can be null for existing
    * campaigns.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of this creative optimization config. This is a required field and
    * must be less than 129 characters long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * List of optimization activities associated with this configuration.
    */
  var optimizationActivitys: js.UndefOr[js.Array[SchemaOptimizationActivity]] = js.native
  /**
    * Optimization model for this configuration.
    */
  var optimizationModel: js.UndefOr[String] = js.native
}

object SchemaCreativeOptimizationConfiguration {
  @scala.inline
  def apply(): SchemaCreativeOptimizationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeOptimizationConfiguration]
  }
  @scala.inline
  implicit class SchemaCreativeOptimizationConfigurationOps[Self <: SchemaCreativeOptimizationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withOptimizationActivitys(value: js.Array[SchemaOptimizationActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizationActivitys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizationActivitys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizationActivitys")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizationModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizationModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizationModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizationModel")(js.undefined)
        ret
    }
  }
  
}

