package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapClientEditEventMap extends ControlEventMap {
  var gotFocus: EventArgs = js.native
  var lostFocus: EventArgs = js.native
  var validation: EditValidationEventArgs = js.native
  var valueChanged: ProcessingModeEventArgs = js.native
}

object BootstrapClientEditEventMap {
  @scala.inline
  def apply(
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapClientEditEventMap = {
    val __obj = js.Dynamic.literal(gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientEditEventMap]
  }
  @scala.inline
  implicit class BootstrapClientEditEventMapOps[Self <: BootstrapClientEditEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGotFocus(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLostFocus(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lostFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidation(value: EditValidationEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueChanged(value: ProcessingModeEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

