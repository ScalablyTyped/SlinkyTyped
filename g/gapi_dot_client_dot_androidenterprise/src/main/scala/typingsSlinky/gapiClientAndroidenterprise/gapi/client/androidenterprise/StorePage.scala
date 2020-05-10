package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorePage extends js.Object {
  /** Unique ID of this page. Assigned by the server. Immutable once assigned. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storePage". */
  var kind: js.UndefOr[String] = js.native
  /**
    * Ordered list of pages a user should be able to reach from this page. The pages must exist, must not be this page, and once a link is created the page
    * linked to cannot be deleted until all links to it are removed. It is recommended that the basic pages are created first, before adding the links
    * between pages.
    *
    * No attempt is made to verify that all pages are reachable from the homepage.
    */
  var link: js.UndefOr[js.Array[String]] = js.native
  /**
    * Ordered list of localized strings giving the name of this page. The text displayed is the one that best matches the user locale, or the first entry if
    * there is no good match. There needs to be at least one entry.
    */
  var name: js.UndefOr[js.Array[LocalizedText]] = js.native
}

object StorePage {
  @scala.inline
  def apply(): StorePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorePage]
  }
  @scala.inline
  implicit class StorePageOps[Self <: StorePage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: js.Array[LocalizedText]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

