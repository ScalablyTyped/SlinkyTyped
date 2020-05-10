package typingsSlinky.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocale extends js.Object {
  /**
    * The locale of the formattedResults, such as en_US.
    */
  var locale: String = js.native
  /**
    * Dictionary of formatted rule results, with one entry for each PageSpeed rule instantiated and run by the server.
    */
  var ruleResults: AnonAvoidBadRequests = js.native
}

object AnonLocale {
  @scala.inline
  def apply(locale: String, ruleResults: AnonAvoidBadRequests): AnonLocale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], ruleResults = ruleResults.asInstanceOf[js.Any])
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
    def withRuleResults(value: AnonAvoidBadRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

