package typingsSlinky.jqueryTimeentry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeEntryRegionalOptions extends js.Object {
  /**
    * The AM and PM display text. This is one of the regional settings fields.
    *
    * default: ['AM','PM']
    */
  var ampmNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The text that separates the time from the AM and PM indicators. This is one of the regional settings fields.
    *
    * default: ''
    */
  var ampmPrefix: js.UndefOr[String] = js.native
  /**
    * The separator between time portions. This is one of the regional settings fields.
    *
    * default: ':'
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Indicate whether to use 12-hour (false) or 24-hour (true) time. This is one of the regional settings fields.
    *
    * default: False
    */
  var show24Hours: js.UndefOr[Boolean] = js.native
  /**
    * The tooltip text for the spinner buttons. This is one of the regional settings fields.
    *
    * default: ['Now', 'Previous field', 'Next field', 'Increment', 'Decrement']
    */
  var spinnerTexts: js.UndefOr[js.Array[String]] = js.native
}

object ITimeEntryRegionalOptions {
  @scala.inline
  def apply(): ITimeEntryRegionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeEntryRegionalOptions]
  }
  @scala.inline
  implicit class ITimeEntryRegionalOptionsOps[Self <: ITimeEntryRegionalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmpmNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampmNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpmNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampmNames")(js.undefined)
        ret
    }
    @scala.inline
    def withAmpmPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampmPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpmPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampmPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withShow24Hours(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show24Hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow24Hours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show24Hours")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerTexts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerTexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerTexts")(js.undefined)
        ret
    }
  }
  
}

