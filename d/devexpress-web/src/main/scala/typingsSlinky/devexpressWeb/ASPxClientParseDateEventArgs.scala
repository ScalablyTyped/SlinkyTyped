package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateEdit.ParseDate client-side event that parses a string entered into a date editor.
  */
@js.native
trait ASPxClientParseDateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets the edit value of the date editor.
    */
  var date: js.Date = js.native
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
  /**
    * Gets the value entered into the date editor by an end user.
    */
  var value: String = js.native
}

object ASPxClientParseDateEventArgs {
  @scala.inline
  def apply(date: js.Date, handled: Boolean, value: String): ASPxClientParseDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParseDateEventArgs]
  }
  @scala.inline
  implicit class ASPxClientParseDateEventArgsOps[Self <: ASPxClientParseDateEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

