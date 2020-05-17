package typingsSlinky.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceHolder extends js.Object {
  /**
    * PlaceHolder.cancel()
    * TODO
    **/
  def cancel(): Unit = js.native
  /**
    * PlaceHolder.detach()
    * TODO
    **/
  def detach(): Unit = js.native
  /**
    * PlaceHolder.hideOtherMarkers()
    * Hides all over markers in the [[EditSession `EditSession`]] that are not the currently selected one.
    **/
  def hideOtherMarkers(): Unit = js.native
  def on(event: String, fn: js.Function1[/* e */ js.Any, _]): Unit = js.native
  /**
    * PlaceHolder@onCursorChange(e)
    * Emitted when the cursor changes.
    **/
  def onCursorChange(): Unit = js.native
  /**
    * PlaceHolder@onUpdate(e)
    * Emitted when the place holder updates.
    **/
  def onUpdate(): Unit = js.native
  /**
    * PlaceHolder.setup()
    * TODO
    **/
  def setup(): Unit = js.native
  /**
    * PlaceHolder.showOtherMarkers()
    * TODO
    **/
  def showOtherMarkers(): Unit = js.native
}

object PlaceHolder {
  @scala.inline
  def apply(
    cancel: () => Unit,
    detach: () => Unit,
    hideOtherMarkers: () => Unit,
    on: (String, js.Function1[/* e */ js.Any, _]) => Unit,
    onCursorChange: () => Unit,
    onUpdate: () => Unit,
    setup: () => Unit,
    showOtherMarkers: () => Unit
  ): PlaceHolder = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), detach = js.Any.fromFunction0(detach), hideOtherMarkers = js.Any.fromFunction0(hideOtherMarkers), on = js.Any.fromFunction2(on), onCursorChange = js.Any.fromFunction0(onCursorChange), onUpdate = js.Any.fromFunction0(onUpdate), setup = js.Any.fromFunction0(setup), showOtherMarkers = js.Any.fromFunction0(showOtherMarkers))
    __obj.asInstanceOf[PlaceHolder]
  }
  @scala.inline
  implicit class PlaceHolderOps[Self <: PlaceHolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideOtherMarkers(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOtherMarkers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnCursorChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCursorChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowOtherMarkers(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOtherMarkers")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

