package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Step/Step.StepClasskey>> */
@js.native
trait PartialClassNameMapStepCl extends js.Object {
  var alternativeLabel: js.UndefOr[String] = js.native
  var horizontal: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var vertical: js.UndefOr[String] = js.native
}

object PartialClassNameMapStepCl {
  @scala.inline
  def apply(): PartialClassNameMapStepCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapStepCl]
  }
  @scala.inline
  implicit class PartialClassNameMapStepClOps[Self <: PartialClassNameMapStepCl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternativeLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternativeLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
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

