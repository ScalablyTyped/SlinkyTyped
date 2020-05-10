package typingsSlinky.gapiClientPagespeedonline

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocale extends js.Object {
  /** The locale of the formattedResults, e.g. "en_US". */
  var locale: js.UndefOr[String] = js.native
  /** Dictionary of formatted rule results, with one entry for each PageSpeed rule instantiated and run by the server. */
  var ruleResults: js.UndefOr[Record[String, AnonGroups]] = js.native
}

object AnonLocale {
  @scala.inline
  def apply(): AnonLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLocale]
  }
  @scala.inline
  implicit class AnonLocaleOps[Self <: AnonLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleResults(value: Record[String, AnonGroups]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleResults")(js.undefined)
        ret
    }
  }
  
}

