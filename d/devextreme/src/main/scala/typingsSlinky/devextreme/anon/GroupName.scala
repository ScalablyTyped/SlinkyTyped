package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.smallValueThreshold
import typingsSlinky.devextreme.devextremeStrings.topN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupName extends js.Object {
  var groupName: js.UndefOr[String] = js.native
  var mode: js.UndefOr[none | smallValueThreshold | topN] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var topCount: js.UndefOr[Double] = js.native
}

object GroupName {
  @scala.inline
  def apply(): GroupName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupName]
  }
  @scala.inline
  implicit class GroupNameOps[Self <: GroupName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: none | smallValueThreshold | topN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTopCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCount")(js.undefined)
        ret
    }
  }
  
}

