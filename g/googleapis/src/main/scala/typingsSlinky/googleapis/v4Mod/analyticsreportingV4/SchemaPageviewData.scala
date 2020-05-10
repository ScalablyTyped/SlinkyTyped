package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents details collected when the visitor views a page.
  */
@js.native
trait SchemaPageviewData extends js.Object {
  /**
    * The URL of the page that the visitor viewed.
    */
  var pagePath: js.UndefOr[String] = js.native
  /**
    * The title of the page that the visitor viewed.
    */
  var pageTitle: js.UndefOr[String] = js.native
}

object SchemaPageviewData {
  @scala.inline
  def apply(): SchemaPageviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageviewData]
  }
  @scala.inline
  implicit class SchemaPageviewDataOps[Self <: SchemaPageviewData] (val x: Self) extends AnyVal {
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

