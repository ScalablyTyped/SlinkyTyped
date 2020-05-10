package typingsSlinky.phosphorWidgets.tabpanelMod.TabPanel

import typingsSlinky.phosphorWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `currentChanged` signal.
  */
@js.native
trait ICurrentChangedArgs extends js.Object {
  /**
    * The currently selected index.
    */
  var currentIndex: Double = js.native
  /**
    * The currently selected widget.
    */
  var currentWidget: Widget | Null = js.native
  /**
    * The previously selected index.
    */
  var previousIndex: Double = js.native
  /**
    * The previously selected widget.
    */
  var previousWidget: Widget | Null = js.native
}

object ICurrentChangedArgs {
  @scala.inline
  def apply(currentIndex: Double, previousIndex: Double): ICurrentChangedArgs = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentChangedArgs]
  }
  @scala.inline
  implicit class ICurrentChangedArgsOps[Self <: ICurrentChangedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentWidget(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentWidget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentWidgetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentWidget")(null)
        ret
    }
    @scala.inline
    def withPreviousWidget(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousWidget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousWidgetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousWidget")(null)
        ret
    }
  }
  
}

