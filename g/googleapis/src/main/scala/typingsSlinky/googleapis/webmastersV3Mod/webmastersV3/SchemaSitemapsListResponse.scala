package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of sitemaps.
  */
@js.native
trait SchemaSitemapsListResponse extends js.Object {
  /**
    * Contains detailed information about a specific URL submitted as a
    * sitemap.
    */
  var sitemap: js.UndefOr[js.Array[SchemaWmxSitemap]] = js.native
}

object SchemaSitemapsListResponse {
  @scala.inline
  def apply(): SchemaSitemapsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSitemapsListResponse]
  }
  @scala.inline
  implicit class SchemaSitemapsListResponseOps[Self <: SchemaSitemapsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSitemap(value: js.Array[SchemaWmxSitemap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sitemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSitemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sitemap")(js.undefined)
        ret
    }
  }
  
}

