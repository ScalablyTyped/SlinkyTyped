package typingsSlinky.autolinker.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlsConfigObj extends js.Object {
  var schemeMatches: js.UndefOr[Boolean] = js.native
  var tldMatches: js.UndefOr[Boolean] = js.native
  var wwwMatches: js.UndefOr[Boolean] = js.native
}

object UrlsConfigObj {
  @scala.inline
  def apply(): UrlsConfigObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlsConfigObj]
  }
  @scala.inline
  implicit class UrlsConfigObjOps[Self <: UrlsConfigObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchemeMatches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemeMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemeMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemeMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withTldMatches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tldMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTldMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tldMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withWwwMatches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wwwMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWwwMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wwwMatches")(js.undefined)
        ret
    }
  }
  
}

