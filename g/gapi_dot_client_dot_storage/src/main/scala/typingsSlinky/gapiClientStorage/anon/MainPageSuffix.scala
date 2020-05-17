package typingsSlinky.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MainPageSuffix extends js.Object {
  /**
    * If the requested object path is missing, the service will ensure the path has a trailing '/', append this suffix, and attempt to retrieve the resulting
    * object. This allows the creation of index.html objects to represent directory pages.
    */
  var mainPageSuffix: js.UndefOr[String] = js.native
  /**
    * If the requested object path is missing, and any mainPageSuffix object is missing, if applicable, the service will return the named object from this
    * bucket as the content for a 404 Not Found result.
    */
  var notFoundPage: js.UndefOr[String] = js.native
}

object MainPageSuffix {
  @scala.inline
  def apply(): MainPageSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MainPageSuffix]
  }
  @scala.inline
  implicit class MainPageSuffixOps[Self <: MainPageSuffix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMainPageSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainPageSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainPageSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainPageSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFoundPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundPage")(js.undefined)
        ret
    }
  }
  
}

