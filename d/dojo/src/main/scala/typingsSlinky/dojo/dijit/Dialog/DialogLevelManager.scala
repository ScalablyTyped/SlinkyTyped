package typingsSlinky.dojo.dijit.Dialog

import typingsSlinky.dojo.dijit.WidgetBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Dialog._DialogLevelManager.html
  *
  * Controls the various active "levels" on the page, starting with the
  * stuff initially visible on the page (at z-index 0), and then having an entry for
  * each Dialog shown.
  * 
  */
@js.native
trait DialogLevelManager extends js.Object {
  /**
    * Called when the specified dialog is hidden/destroyed, after the fade-out
    * animation ends, in order to reset page focus, fix the underlay, etc.
    * If the specified dialog isn't open then does nothing.
    * 
    * Caller is responsible for either setting display:none on the dialog domNode,
    * or calling dijit/popup.hide(), or removing it from the page DOM.
    * 
    * @param dialog             
    */
  def hide(dialog: WidgetBase): Unit = js.native
  /**
    * Returns true if specified Dialog is the top in the task
    * 
    * @param dialog             
    */
  def isTop(dialog: WidgetBase): Boolean = js.native
  /**
    * Call right before fade-in animation for new dialog.
    * Saves current focus, displays/adjusts underlay for new dialog,
    * and sets the z-index of the dialog itself.
    * 
    * New dialog will be displayed on top of all currently displayed dialogs.
    * 
    * Caller is responsible for setting focus in new dialog after the fade-in
    * animation completes.
    * 
    * @param dialog             
    * @param underlayAttrs             
    */
  def show(dialog: WidgetBase, underlayAttrs: js.Object): Unit = js.native
}

object DialogLevelManager {
  @scala.inline
  def apply(hide: WidgetBase => Unit, isTop: WidgetBase => Boolean, show: (WidgetBase, js.Object) => Unit): DialogLevelManager = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), isTop = js.Any.fromFunction1(isTop), show = js.Any.fromFunction2(show))
    __obj.asInstanceOf[DialogLevelManager]
  }
  @scala.inline
  implicit class DialogLevelManagerOps[Self <: DialogLevelManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: WidgetBase => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsTop(value: WidgetBase => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: (WidgetBase, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

