package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapBinaryImageEventMap extends BootstrapClientEditEventMap {
  var beginCallback: BeginCallbackEventArgs = js.native
  var callbackError: CallbackErrorEventArgs = js.native
  var click: EditClickEventArgs = js.native
  var endCallback: EndCallbackEventArgs = js.native
}

object BootstrapBinaryImageEventMap {
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    click: EditClickEventArgs,
    endCallback: EndCallbackEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapBinaryImageEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapBinaryImageEventMap]
  }
  @scala.inline
  implicit class BootstrapBinaryImageEventMapOps[Self <: BootstrapBinaryImageEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginCallback(value: BeginCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackError(value: CallbackErrorEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: EditClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCallback(value: EndCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCallback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

