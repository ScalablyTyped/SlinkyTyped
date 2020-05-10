package typingsSlinky.pickadate.Pickadate

import typingsSlinky.pickadate.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options shared between date and time pickers
@js.native
trait Options extends js.Object {
  /**
    * Set the clear button text.
    * Defaults to 'Clear'
    */
  var clear: js.UndefOr[String] = js.native
  /**
    * Whether or not to close the picker when the "clear" button is pressed.
    * Defaults to `true`.
    */
  var closeOnClear: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to close the picker when a date is selected.
    * Defaults to `true`.
    */
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  /**
    * Specify where to insert the picker's root element by passing any
    * valid CSS selector to this option. Defaults to undefined.
    */
  var container: js.UndefOr[String | JQuery] = js.native
  /**
    * The hidden input container.
    * Defaults to undefined.
    */
  var containerHidden: js.UndefOr[String] = js.native
  /**
    * By default, typing into the input is disabled by giving it a readOnly
    * attribute. Setting the editable option to true allows the input field
    * to be edited directly.
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * The human-friendly display format.
    * Escape any "rule" characters with an exclamation mark (!).
    * Defaults to 'd mmmm, yyyy'
    */
  var format: js.UndefOr[String] = js.native
  /**
    * An alternate format to submit to the server.
    * Defaults to undefined.
    */
  var formatSubmit: js.UndefOr[String] = js.native
  /**
    * A majority of the time, the value that needs to be sent to the server
    * is just the hidden value and not the visible one. To make this happen,
    * use the hiddenName option. This essentially nullifies the hiddenPrefix
    * and hiddenSuffix, strips the name attribute from the source input, and
    * then sets it as the name of the hidden input. Defaults to undefined.
    */
  var hiddenName: js.UndefOr[Boolean] = js.native
  /**
    * An optional name prefix for the new hidden input element used
    * when a custom human-friendly display format is specified.
    * Defaults to undefined.
    */
  var hiddenPrefix: js.UndefOr[String] = js.native
  /**
    * An optional name suffix for the new hidden input element used
    * when a custom human-friendly display format is specified.
    * Defaults to '_submit'
    */
  var hiddenSuffix: js.UndefOr[String] = js.native
  var onClose: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onRender: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onSet: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  // Events
  var onStart: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onStop: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClear")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerHidden(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatSubmit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenName")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRender(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSet(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStop(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.undefined)
        ret
    }
  }
  
}

