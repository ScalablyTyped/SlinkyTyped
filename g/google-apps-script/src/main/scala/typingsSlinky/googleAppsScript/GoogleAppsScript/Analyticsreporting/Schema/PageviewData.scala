package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageviewData extends js.Object {
  var pagePath: js.UndefOr[String] = js.native
  var pageTitle: js.UndefOr[String] = js.native
}

object PageviewData {
  @scala.inline
  def apply(): PageviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageviewData]
  }
  @scala.inline
  implicit class PageviewDataOps[Self <: PageviewData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPagePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagePath")(js.undefined)
        ret
    }
    @scala.inline
    def withPageTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTitle")(js.undefined)
        ret
    }
  }
  
}

