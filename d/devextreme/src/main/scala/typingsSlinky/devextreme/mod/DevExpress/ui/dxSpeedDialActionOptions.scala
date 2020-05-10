package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonActionElement
import typingsSlinky.devextreme.AnonActionElementComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSpeedDialActionOptions extends WidgetOptions[dxSpeedDialAction] {
  /** Specifies the icon the FAB or speed dial action button displays. */
  var icon: js.UndefOr[String] = js.native
  /** Allows you to reorder action buttons in the speed dial menu. */
  var index: js.UndefOr[Double] = js.native
  /** Specifies the text label displayed inside the FAB or near the speed dial action button. */
  var label: js.UndefOr[String] = js.native
  /** A function that is executed when the FAB or speed dial action button is clicked or tapped. */
  var onClick: js.UndefOr[js.Function1[/* e */ AnonActionElement, _]] = js.native
  /** A function that is executed when the widget's content is ready and each time the content is changed. */
  @JSName("onContentReady")
  var onContentReady_dxSpeedDialActionOptions: js.UndefOr[js.Function1[/* e */ AnonActionElementComponent, _]] = js.native
}

object dxSpeedDialActionOptions {
  @scala.inline
  def apply(): dxSpeedDialActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSpeedDialActionOptions]
  }
  @scala.inline
  implicit class dxSpeedDialActionOptionsOps[Self <: dxSpeedDialActionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
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
    def withOnClick(value: /* e */ AnonActionElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentReady(value: /* e */ AnonActionElementComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContentReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentReady")(js.undefined)
        ret
    }
  }
  
}

