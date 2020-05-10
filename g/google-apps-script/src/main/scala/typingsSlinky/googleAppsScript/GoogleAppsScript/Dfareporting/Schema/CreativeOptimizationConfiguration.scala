package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeOptimizationConfiguration extends js.Object {
  var id: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var optimizationActivitys: js.UndefOr[js.Array[OptimizationActivity]] = js.native
  var optimizationModel: js.UndefOr[String] = js.native
}

object CreativeOptimizationConfiguration {
  @scala.inline
  def apply(): CreativeOptimizationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeOptimizationConfiguration]
  }
  @scala.inline
  implicit class CreativeOptimizationConfigurationOps[Self <: CreativeOptimizationConfiguration] (val x: Self) extends AnyVal {
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
    def withOptimizationActivitys(value: js.Array[OptimizationActivity]): Self = {
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

