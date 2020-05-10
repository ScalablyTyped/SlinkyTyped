package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSettings extends js.Object {
  /**
    * Control case-sensitive filtering option. Since: 1.10
    */
  var caseInsensitive: js.UndefOr[Boolean] = js.native
  /**
    * Enable / disable escaping of regular expression characters in the search term. Since: 1.10
    */
  var regex: js.UndefOr[Boolean] = js.native
  /**
    * Set an initial filtering condition on the table. Since: 1.10
    */
  var search: js.UndefOr[String] = js.native
  /**
    * Set a placeholder attribute for input type="text" tag elements. Since: 1.10.1
    */
  var searchPlaceholder: js.UndefOr[String] = js.native
  /**
    * Enable / disable DataTables' smart filtering. Since: 1.10
    */
  var smart: js.UndefOr[Boolean] = js.native
}

object SearchSettings {
  @scala.inline
  def apply(): SearchSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSettings]
  }
  @scala.inline
  implicit class SearchSettingsOps[Self <: SearchSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseInsensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseInsensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseInsensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseInsensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSmart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart")(js.undefined)
        ret
    }
  }
  
}

