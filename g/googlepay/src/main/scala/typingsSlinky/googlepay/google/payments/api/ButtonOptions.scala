package typingsSlinky.googlepay.google.payments.api

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object allows you to configure a Google Pay payment button. For
  * more information about button types, colors, and display requirements,
  * see Google's [Brand
  * guidelines](https://developers.google.com/pay/api/web/guides/brand-guidelines).
  */
@js.native
trait ButtonOptions extends js.Object {
  /**
    * @default "default"
    */
  var buttonColor: js.UndefOr[ButtonColor] = js.native
  /**
    * @default "long"
    */
  var buttonType: js.UndefOr[ButtonType] = js.native
  /**
    * An [event listener
    * callback](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener#The_event_listener_callback)
    * to call when a click event is delivered to the `<button>` target.
    */
  def onClick(event: Event_): Unit = js.native
}

object ButtonOptions {
  @scala.inline
  def apply(onClick: Event_ => Unit): ButtonOptions = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ButtonOptions]
  }
  @scala.inline
  implicit class ButtonOptionsOps[Self <: ButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withButtonColor(value: ButtonColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonColor")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonType(value: ButtonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(js.undefined)
        ret
    }
  }
  
}

