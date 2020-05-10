package typingsSlinky.cloudflareApps.CloudflareApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudflareAppsProxy extends js.Object {
  var embedSiteId: String = js.native
  var hasRocketEmbed: Boolean = js.native
  var originalURL: OriginalURL = js.native
}

object CloudflareAppsProxy {
  @scala.inline
  def apply(embedSiteId: String, hasRocketEmbed: Boolean, originalURL: OriginalURL): CloudflareAppsProxy = {
    val __obj = js.Dynamic.literal(embedSiteId = embedSiteId.asInstanceOf[js.Any], hasRocketEmbed = hasRocketEmbed.asInstanceOf[js.Any], originalURL = originalURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudflareAppsProxy]
  }
  @scala.inline
  implicit class CloudflareAppsProxyOps[Self <: CloudflareAppsProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbedSiteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedSiteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasRocketEmbed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRocketEmbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalURL(value: OriginalURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalURL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

