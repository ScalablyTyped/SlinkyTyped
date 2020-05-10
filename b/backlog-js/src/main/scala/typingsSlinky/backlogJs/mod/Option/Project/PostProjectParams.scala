package typingsSlinky.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostProjectParams extends js.Object {
  var chartEnabled: Boolean = js.native
  var key: String = js.native
  var name: String = js.native
  var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.native
  var subtaskingEnabled: Boolean = js.native
  var textFormattingRule: TextFormattingRule = js.native
}

object PostProjectParams {
  @scala.inline
  def apply(
    chartEnabled: Boolean,
    key: String,
    name: String,
    subtaskingEnabled: Boolean,
    textFormattingRule: TextFormattingRule
  ): PostProjectParams = {
    val __obj = js.Dynamic.literal(chartEnabled = chartEnabled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtaskingEnabled = subtaskingEnabled.asInstanceOf[js.Any], textFormattingRule = textFormattingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProjectParams]
  }
  @scala.inline
  implicit class PostProjectParamsOps[Self <: PostProjectParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtaskingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtaskingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextFormattingRule(value: TextFormattingRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormattingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectLeaderCanEditProjectLeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectLeaderCanEditProjectLeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectLeaderCanEditProjectLeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectLeaderCanEditProjectLeader")(js.undefined)
        ret
    }
  }
  
}

