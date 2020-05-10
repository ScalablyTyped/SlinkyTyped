package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of sites with access level information.
  */
@js.native
trait SchemaSitesListResponse extends js.Object {
  /**
    * Contains permission level information about a Search Console site. For
    * more information, see Permissions in Search Console.
    */
  var siteEntry: js.UndefOr[js.Array[SchemaWmxSite]] = js.native
}

object SchemaSitesListResponse {
  @scala.inline
  def apply(): SchemaSitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSitesListResponse]
  }
  @scala.inline
  implicit class SchemaSitesListResponseOps[Self <: SchemaSitesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSiteEntry(value: js.Array[SchemaWmxSite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteEntry")(js.undefined)
        ret
    }
  }
  
}

