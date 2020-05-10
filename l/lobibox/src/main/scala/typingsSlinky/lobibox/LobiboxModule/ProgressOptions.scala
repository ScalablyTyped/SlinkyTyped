package typingsSlinky.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressOptions
  extends MessageBoxesOptions
     with ProgressMethods
     with ProgressEvents {
    // Show percentage of progress
  var label: js.UndefOr[String] = js.native
  var progressCompleted: js.UndefOr[js.Any] = js.native
    // Show progress label
  var progressTpl: js.UndefOr[Boolean] = js.native
    //Template of progress bar
  //Events
  @JSName("progressUpdated")
  var progressUpdated_ProgressOptions: js.UndefOr[js.Any] = js.native
  var showProgressLabel: js.UndefOr[Boolean] = js.native
}

object ProgressOptions {
  @scala.inline
  def apply(): ProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressOptions]
  }
  @scala.inline
  implicit class ProgressOptionsOps[Self <: ProgressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressCompleted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressTpl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressUpdated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withShowProgressLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProgressLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowProgressLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProgressLabel")(js.undefined)
        ret
    }
  }
  
}

