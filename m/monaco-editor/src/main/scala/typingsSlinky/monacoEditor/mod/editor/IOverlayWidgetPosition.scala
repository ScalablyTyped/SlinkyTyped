package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverlayWidgetPosition extends js.Object {
  /**
    * The position preference for the overlay widget.
    */
  var preference: OverlayWidgetPositionPreference | Null = js.native
}

object IOverlayWidgetPosition {
  @scala.inline
  def apply(): IOverlayWidgetPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverlayWidgetPosition]
  }
  @scala.inline
  implicit class IOverlayWidgetPositionOps[Self <: IOverlayWidgetPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreference(value: OverlayWidgetPositionPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(null)
        ret
    }
  }
  
}

