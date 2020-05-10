package typingsSlinky.mailcheck.MailcheckModule

import typingsSlinky.mailcheck.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsynchronousOptions extends js.Object {
  var distanceFunction: js.UndefOr[IDistanceFunction] = js.native
  var domains: js.UndefOr[js.Array[String]] = js.native
  var email: String = js.native
  var empty: js.UndefOr[IEmpty | IJQueryEmpty] = js.native
  var secondLevelDomains: js.UndefOr[js.Array[String]] = js.native
  var suggested: ISuggested | IJQuerySuggested = js.native
  var topLevelDomains: js.UndefOr[js.Array[String]] = js.native
}

object IAsynchronousOptions {
  @scala.inline
  def apply(email: String, suggested: ISuggested | IJQuerySuggested): IAsynchronousOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], suggested = suggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsynchronousOptions]
  }
  @scala.inline
  implicit class IAsynchronousOptionsOps[Self <: IAsynchronousOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedFunction2(value: (/* element */ JQuery, /* suggested */ ISuggestion) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggested")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSuggestedFunction1(value: /* suggested */ ISuggestion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggested")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuggested(value: ISuggested | IJQuerySuggested): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceFunction(value: (/* s1 */ String, /* s2 */ String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDistanceFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyFunction1(value: /* element */ JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmptyFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmpty(value: IEmpty | IJQueryEmpty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondLevelDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondLevelDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondLevelDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondLevelDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLevelDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevelDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLevelDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevelDomains")(js.undefined)
        ret
    }
  }
  
}

