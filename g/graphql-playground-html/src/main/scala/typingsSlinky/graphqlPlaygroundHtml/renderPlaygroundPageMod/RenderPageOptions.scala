package typingsSlinky.graphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderPageOptions extends MiddlewareOptions {
  var cdnUrl: js.UndefOr[String] = js.native
  var faviconUrl: js.UndefOr[String | Null] = js.native
  var title: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object RenderPageOptions {
  @scala.inline
  def apply(): RenderPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderPageOptions]
  }
  @scala.inline
  implicit class RenderPageOptionsOps[Self <: RenderPageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCdnUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdnUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdnUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdnUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFaviconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faviconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaviconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faviconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFaviconUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faviconUrl")(null)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

