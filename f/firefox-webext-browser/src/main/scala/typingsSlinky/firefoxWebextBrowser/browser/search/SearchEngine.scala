package typingsSlinky.firefoxWebextBrowser.browser.search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* search types */
/** An object encapsulating a search engine */
@js.native
trait SearchEngine extends js.Object {
  var alias: js.UndefOr[String] = js.native
  var favIconUrl: js.UndefOr[String] = js.native
  var isDefault: Boolean = js.native
  var name: String = js.native
}

object SearchEngine {
  @scala.inline
  def apply(isDefault: Boolean, name: String): SearchEngine = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEngine]
  }
  @scala.inline
  implicit class SearchEngineOps[Self <: SearchEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withFavIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favIconUrl")(js.undefined)
        ret
    }
  }
  
}

