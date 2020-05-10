package typingsSlinky.jqueryWindow.JQueryWindow

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jqueryWindow.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Static options
@js.native
trait StaticOptions extends js.Object {
  /**
    the speed of animations: maximize, minimize, restore, shift, in milliseconds
    **/
  var animationSpeed: js.UndefOr[Double] = js.native
  /**
    the direction of minimized window dock at. the available values are [left, right, top, bottom]
    **/
  var dock: js.UndefOr[String] = js.native
  /**
    the area which the windows will dock at
    **/
  var dockArea: js.UndefOr[JQuery | HTMLElement] = js.native
  /**
    to handle browser scrollbar when window status changed(maximize, minimize, cascade)
    **/
  var handleScrollbar: js.UndefOr[Boolean] = js.native
  /**
    the long dimension of minimized window
    **/
  var minWinLong: js.UndefOr[Double] = js.native
  /**
    the narrow dimension of minimized window
    **/
  var minWinNarrow: js.UndefOr[Double] = js.native
  /**
    to decide show log in firebug, IE8, chrome console
    **/
  var showLog: js.UndefOr[Boolean] = js.native
}

object StaticOptions {
  @scala.inline
  def apply(): StaticOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticOptions]
  }
  @scala.inline
  implicit class StaticOptionsOps[Self <: StaticOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withDock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(js.undefined)
        ret
    }
    @scala.inline
    def withDockAreaHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDockArea(value: JQuery | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockArea")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWinLong(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWinLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWinLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWinLong")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWinNarrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWinNarrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWinNarrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWinNarrow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLog")(js.undefined)
        ret
    }
  }
  
}

