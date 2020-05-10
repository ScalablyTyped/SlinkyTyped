package typingsSlinky.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchProjectParams extends js.Object {
  var archived: js.UndefOr[Boolean] = js.native
  var chartEnabled: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.native
  var subtaskingEnabled: js.UndefOr[Boolean] = js.native
  var textFormattingRule: js.UndefOr[TextFormattingRule] = js.native
}

object PatchProjectParams {
  @scala.inline
  def apply(): PatchProjectParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchProjectParams]
  }
  @scala.inline
  implicit class PatchProjectParamsOps[Self <: PatchProjectParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(js.undefined)
        ret
    }
    @scala.inline
    def withChartEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
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
    @scala.inline
    def withSubtaskingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtaskingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtaskingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtaskingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFormattingRule(value: TextFormattingRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormattingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFormattingRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormattingRule")(js.undefined)
        ret
    }
  }
  
}

