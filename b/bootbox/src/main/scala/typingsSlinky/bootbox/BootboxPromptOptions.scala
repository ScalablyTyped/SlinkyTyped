package typingsSlinky.bootbox

import typingsSlinky.bootbox.bootboxStrings.checkbox
import typingsSlinky.bootbox.bootboxStrings.date
import typingsSlinky.bootbox.bootboxStrings.email
import typingsSlinky.bootbox.bootboxStrings.number
import typingsSlinky.bootbox.bootboxStrings.password
import typingsSlinky.bootbox.bootboxStrings.radio
import typingsSlinky.bootbox.bootboxStrings.range
import typingsSlinky.bootbox.bootboxStrings.select
import typingsSlinky.bootbox.bootboxStrings.text
import typingsSlinky.bootbox.bootboxStrings.textarea
import typingsSlinky.bootbox.bootboxStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for prompt modals */
@js.native
trait BootboxPromptOptions extends BootboxBaseOptions[String] {
  @JSName("buttons")
  var buttons_BootboxPromptOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.native
  var inputOptions: js.UndefOr[js.Array[AnonGroup]] = js.native
  var inputType: js.UndefOr[
    text | textarea | email | select | checkbox | date | time | number | password | radio | range
  ] = js.native
  @JSName("title")
  var title_BootboxPromptOptions: String = js.native
  var value: js.UndefOr[String] = js.native
  @JSName("callback")
  def callback_MBootboxPromptOptions(result: String): js.Any = js.native
}

object BootboxPromptOptions {
  @scala.inline
  def apply(callback: String => js.Any, title: String): BootboxPromptOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxPromptOptions]
  }
  @scala.inline
  implicit class BootboxPromptOptionsOps[Self <: BootboxPromptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: BootboxConfirmPromptButtonMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withInputOptions(value: js.Array[AnonGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withInputType(
      value: text | textarea | email | select | checkbox | date | time | number | password | radio | range
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

