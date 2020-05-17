package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the loading panel functionality.
  */
@js.native
trait LoadingPanel extends js.Object {
  /**
    * Allows you to provide a custom loading panel.
    */
  var customPanel: js.UndefOr[ICustomLoadingPanel] = js.native
  /**
    * Specifies whether the loading panel is enabled in the control.
    */
  var enabled: Boolean = js.native
  /**
    * Hides the loading panel.
    */
  def hide(): Unit = js.native
  /**
    * Shows the loading panel.
    */
  def show(): Unit = js.native
}

object LoadingPanel {
  @scala.inline
  def apply(enabled: Boolean, hide: () => Unit, show: () => Unit): LoadingPanel = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[LoadingPanel]
  }
  @scala.inline
  implicit class LoadingPanelOps[Self <: LoadingPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCustomPanel(value: ICustomLoadingPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPanel")(js.undefined)
        ret
    }
  }
  
}

