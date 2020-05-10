package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTaskbarInfoEventArgs extends js.Object {
  /** Returns the baseline background of current item.
    */
  var baselineBackground: js.UndefOr[String] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the data of the record.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the milestone background of current item.
    */
  var milestoneBackground: js.UndefOr[String] = js.native
  /** Returns the parent progressbar background of current item.
    */
  var parentProgressbarBackground: js.UndefOr[String] = js.native
  /** Returns the parent progressbar border color of current item.
    */
  var parentProgressbarBorder: js.UndefOr[String] = js.native
  /** Returns the parent taskbar background of current item.
    */
  var parentTaskbarBackground: js.UndefOr[String] = js.native
  /** Returns the parent taskbar border color of current item.
    */
  var parentTaskbarBorder: js.UndefOr[String] = js.native
  /** Returns the progressbar background of current item.
    */
  var progressbarBackground: js.UndefOr[String] = js.native
  /** Returns the progressbar border color of current item.
    */
  var progressbarBorder: js.UndefOr[String] = js.native
  /** Returns the taskbar background of current item.
    */
  var taskbarBackground: js.UndefOr[String] = js.native
  /** Returns the taskbar border color of current item.
    */
  var taskbarBorder: js.UndefOr[String] = js.native
  /** Returns the taskbar text color of current item.
    */
  var taskbarTextColor: js.UndefOr[String] = js.native
}

object QueryTaskbarInfoEventArgs {
  @scala.inline
  def apply(): QueryTaskbarInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTaskbarInfoEventArgs]
  }
  @scala.inline
  implicit class QueryTaskbarInfoEventArgsOps[Self <: QueryTaskbarInfoEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaselineBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withMilestoneBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestoneBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMilestoneBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestoneBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withParentProgressbarBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProgressbarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentProgressbarBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProgressbarBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withParentProgressbarBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProgressbarBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentProgressbarBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProgressbarBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withParentTaskbarBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTaskbarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentTaskbarBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTaskbarBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withParentTaskbarBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTaskbarBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentTaskbarBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTaskbarBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressbarBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressbarBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressbarBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressbarBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbarBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskbarBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskbarBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskbarTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskbarTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskbarTextColor")(js.undefined)
        ret
    }
  }
  
}

