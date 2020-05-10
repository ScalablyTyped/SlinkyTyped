package typingsSlinky.angularToastr.mod.angularAugmentingMod.toastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastContainerConfig extends js.Object {
  var autoDismiss: js.UndefOr[Boolean] = js.native
  var containerId: js.UndefOr[String] = js.native
  var maxOpened: js.UndefOr[Double] = js.native
  var newestOnTop: js.UndefOr[Boolean] = js.native
  var positionClass: js.UndefOr[String] = js.native
  var preventDuplicates: js.UndefOr[Boolean] = js.native
  var preventOpenDuplicates: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[String] = js.native
}

object IToastContainerConfig {
  @scala.inline
  def apply(): IToastContainerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToastContainerConfig]
  }
  @scala.inline
  implicit class IToastContainerConfigOps[Self <: IToastContainerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOpened(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOpened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withNewestOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newestOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewestOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newestOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDuplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDuplicates")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventOpenDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventOpenDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventOpenDuplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventOpenDuplicates")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

