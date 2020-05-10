package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHomepage extends js.Object {
  var homepage: js.UndefOr[String] = js.native
  var search_provider: js.UndefOr[AnonAlternateurls] = js.native
}

object AnonHomepage {
  @scala.inline
  def apply(): AnonHomepage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHomepage]
  }
  @scala.inline
  implicit class AnonHomepageOps[Self <: AnonHomepage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHomepage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomepage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch_provider(value: AnonAlternateurls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_provider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_provider")(js.undefined)
        ret
    }
  }
  
}

