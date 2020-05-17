package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHint's window.
  */
@js.native
trait ASPxClientHintWindow extends js.Object {
  /**
    * Sets the hint's content.
    * @param html An object that specifies the hint content.
    * @param options An  object that specifies the hint's options.
    */
  def SetContent(html: js.Any, options: ASPxClientHintOptions): Unit = js.native
  /**
    * Set the hint's loading animation
    */
  def SetContentLoading(): Unit = js.native
  /**
    * Forces the ASPxClientHint's window to recalculate its position.
    */
  def UpdatePosition(): Unit = js.native
}

object ASPxClientHintWindow {
  @scala.inline
  def apply(
    SetContent: (js.Any, ASPxClientHintOptions) => Unit,
    SetContentLoading: () => Unit,
    UpdatePosition: () => Unit
  ): ASPxClientHintWindow = {
    val __obj = js.Dynamic.literal(SetContent = js.Any.fromFunction2(SetContent), SetContentLoading = js.Any.fromFunction0(SetContentLoading), UpdatePosition = js.Any.fromFunction0(UpdatePosition))
    __obj.asInstanceOf[ASPxClientHintWindow]
  }
  @scala.inline
  implicit class ASPxClientHintWindowOps[Self <: ASPxClientHintWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetContent(value: (js.Any, ASPxClientHintOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetContentLoading(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetContentLoading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdatePosition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatePosition")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

