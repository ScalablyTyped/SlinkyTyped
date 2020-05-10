package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.scriptBadge.AttentionDetails
import typingsSlinky.chrome.chrome.scriptBadge.GetPopupDetails
import typingsSlinky.chrome.chrome.scriptBadge.ScriptBadgeClickedEvent
import typingsSlinky.chrome.chrome.scriptBadge.SetPopupDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofscriptBadge extends js.Object {
  var onClicked: ScriptBadgeClickedEvent = js.native
  def getAttention(details: AttentionDetails): Unit = js.native
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit = js.native
  def setPopup(details: SetPopupDetails): Unit = js.native
}

object TypeofscriptBadge {
  @scala.inline
  def apply(
    getAttention: AttentionDetails => Unit,
    getPopup: (GetPopupDetails, js.Function) => Unit,
    onClicked: ScriptBadgeClickedEvent,
    setPopup: SetPopupDetails => Unit
  ): TypeofscriptBadge = {
    val __obj = js.Dynamic.literal(getAttention = js.Any.fromFunction1(getAttention), getPopup = js.Any.fromFunction2(getPopup), onClicked = onClicked.asInstanceOf[js.Any], setPopup = js.Any.fromFunction1(setPopup))
    __obj.asInstanceOf[TypeofscriptBadge]
  }
  @scala.inline
  implicit class TypeofscriptBadgeOps[Self <: TypeofscriptBadge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAttention(value: AttentionDetails => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttention")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPopup(value: (GetPopupDetails, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnClicked(value: ScriptBadgeClickedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetPopup(value: SetPopupDetails => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPopup")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

