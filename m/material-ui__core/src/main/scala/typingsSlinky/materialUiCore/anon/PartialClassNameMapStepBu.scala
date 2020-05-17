package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepButton/StepButton.StepButtonClasskey>> */
@js.native
trait PartialClassNameMapStepBu extends js.Object {
  var root: js.UndefOr[String] = js.native
  var touchRipple: js.UndefOr[String] = js.native
  var vertical: js.UndefOr[String] = js.native
}

object PartialClassNameMapStepBu {
  @scala.inline
  def apply(): PartialClassNameMapStepBu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapStepBu]
  }
  @scala.inline
  implicit class PartialClassNameMapStepBuOps[Self <: PartialClassNameMapStepBu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchRipple(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchRipple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchRipple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchRipple")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

