package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.runtime.SearchProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Homepage extends js.Object {
  var homepage: js.UndefOr[String] = js.native
  var search_provider: js.UndefOr[SearchProvider] = js.native
  var startup_pages: js.UndefOr[js.Array[String]] = js.native
}

object Homepage {
  @scala.inline
  def apply(): Homepage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Homepage]
  }
  @scala.inline
  implicit class HomepageOps[Self <: Homepage] (val x: Self) extends AnyVal {
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
    def withSearch_provider(value: SearchProvider): Self = {
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
    @scala.inline
    def withStartup_pages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startup_pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartup_pages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startup_pages")(js.undefined)
        ret
    }
  }
  
}

