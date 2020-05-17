package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/MobileStepper/MobileStepper.MobileStepperClassKey>> */
@js.native
trait PartialClassNameMapMobile extends js.Object {
  var dot: js.UndefOr[String] = js.native
  var dotActive: js.UndefOr[String] = js.native
  var dots: js.UndefOr[String] = js.native
  var positionBottom: js.UndefOr[String] = js.native
  var positionStatic: js.UndefOr[String] = js.native
  var positionTop: js.UndefOr[String] = js.native
  var progress: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapMobile {
  @scala.inline
  def apply(): PartialClassNameMapMobile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapMobile]
  }
  @scala.inline
  implicit class PartialClassNameMapMobileOps[Self <: PartialClassNameMapMobile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.undefined)
        ret
    }
    @scala.inline
    def withDotActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotActive")(js.undefined)
        ret
    }
    @scala.inline
    def withDots(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionStatic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionStatic")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionTop")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
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
  }
  
}

