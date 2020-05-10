package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlClassification extends js.Object {
  /** First party classification flags if the request has been classified. */
  var firstParty: UrlClassificationParty = js.native
  /** Third party classification flags if the request has been classified. */
  var thirdParty: UrlClassificationParty = js.native
}

object UrlClassification {
  @scala.inline
  def apply(firstParty: UrlClassificationParty, thirdParty: UrlClassificationParty): UrlClassification = {
    val __obj = js.Dynamic.literal(firstParty = firstParty.asInstanceOf[js.Any], thirdParty = thirdParty.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlClassification]
  }
  @scala.inline
  implicit class UrlClassificationOps[Self <: UrlClassification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstParty(value: UrlClassificationParty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstParty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThirdParty(value: UrlClassificationParty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdParty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

